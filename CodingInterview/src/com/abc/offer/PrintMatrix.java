package com.abc.offer;

import java.util.ArrayList;
/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入
 * 如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 * @author Jerry
 *
 */
public class PrintMatrix {
	public ArrayList<Integer> printMatrix(int[][] matrix) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int n = matrix.length;
		int m = matrix[0].length;
		// 层数
		int layers = (Math.min(n, m) - 1) / 2 + 1;
		for (int i = 0; i < layers; i++) {
			// 从左往右
			for (int j = i; j < m - i; j++)
				result.add(matrix[i][j]);
			// 从右上往右下
			for (int k = i + 1; k < n - i; k++)
				result.add(matrix[k][m - i - 1]);
			// 从右下往左下
			for (int j = m - i - 2; (j >= i) && (n - i - 1 != i); j--)
				result.add(matrix[n - i - 1][j]);
			// 从左下往左上
			for (int k = n - i - 2; (k > i) && (m - i - 1 != i); k--)
				result.add(matrix[k][i]);
		}
		return result;
	}
}
