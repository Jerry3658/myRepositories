package com.abc.offer;
/**
 * 面试题4：二维数组中的查找
 * 题目：在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按
 * 照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个
 * 整数，判断数组中是否含有该整数。
 * @author Jerry
 *
 */
public class FindInPartiallySortedMatrix {
	/**
	 * 选取数组中右上角的元素和target比较
	 * @param target
	 * @param array
	 * @return
	 */
	public static boolean Find(int target, int[][] array) {
		int row = 0;
		int column = array.length - 1;
		while (row <= array.length - 1 && column > 0) {
			if (target == array[row][column])
				return true;
			else if (target < array[row][column])
				column--;
			else
				row++;
		}
		return false;
	}

	/**
	 * 选取数组中左下角的元素和target比较
	 * @param target
	 * @param array
	 * @return
	 */
	public static boolean find(int target, int[][] array) {
		int row = array.length - 1;
		int column = 0;
		while (row > 0 && column <= array.length - 1) {
			if (target == array[row][column])
				return true;
			else if (target > array[row][column])
				column++;
			else
				row--;
		}
		return false;
	}

	public static void main(String[] args) {
		int target = 7;
		int[][] arr = { { 1, 2, 8, 9 }, { 2, 4, 9, 12 }, { 4, 7, 10, 13 }, { 6, 8, 11, 15 } };
		System.out.println(Find(target, arr));
	}
}
