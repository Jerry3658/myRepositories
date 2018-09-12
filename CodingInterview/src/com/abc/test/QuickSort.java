package com.abc.test;

import java.util.Arrays;

/**
 * 快速排序
 * @author Jerry
 *
 */
public class QuickSort {

	public int partition(int[] arr, int low, int high) {
		int key = arr[low];
		while (low < high) {
			// 从high所指位置起向前搜索找到第一个小于key的数
			while (low < high && arr[high] >= key)
				--high;
			arr[low] = arr[high];
			// 从low所指位置起向后搜索找到第一个大于key的数
			while (low < high && arr[low] <= key)
				++low;
			arr[high] = arr[low];
		}
		// 终止循环while循环之后low和high一定是相等的
		arr[low] = key;
		return low;
	}

	public void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			// pivotloc:枢轴的位置
			int pivotloc = partition(arr, low, high);
			// 对key左边的数快排
			quickSort(arr, low, pivotloc - 1);
			// 对key右边的数快排
			quickSort(arr, pivotloc + 1, high);
		}
	}

	public static void main(String[] args) {
		int[] arr = { 1, 9, 3, 12, 7, 8, 3, 4, 65, 22 };
		System.out.println(Arrays.toString(arr));
		new QuickSort().quickSort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));
	}
}