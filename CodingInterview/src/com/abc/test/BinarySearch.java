package com.abc.test;
/**
 * 折半查找
 * 前提：顺序结构，按照关键字有序排列
 * @author Jerry
 *
 */
public class BinarySearch {
	public static void main(String[] args) {
		// 给定数组
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		// 给定要查找的值
		int key = 10;
		// 进行折半查找
		int index = binarySearch1(array, key);
		// 输出结果
		if (index == -1)
			System.out.println("不存在");
		else
			System.out.println(key + "的索引是：" + index);
	}

	/**
	 * 不使用递归
	 * @param array
	 * @param key
	 * @return
	 */
	public static int binarySearch1(int[] array, int key) {
		// 指定low和high
		int low = 0;
		int high = array.length - 1;
		// 折半查找
		while (low <= high) {
			// 求得mid
			int mid = (low + high) / 2;
			// 判断是否等于
			if (key == array[mid])
				return mid;
			else if (key < array[mid]) {
				high = mid - 1;
			} else
				low = mid + 1;
		}
		return -1;
	}

	/**
	 * 使用递归
	 * @param array
	 * @param key
	 * @return
	 */
	public static int binarySearch2(int[] array, int key) {
		// 指定low和high
		int low = 0;
		int high = array.length - 1;
		return binarySearch(array, key, low, high);
	}

	public static int binarySearch(int[] array, int key, int low, int high) {
		// 递归的结束条件
		if (low > high)
			return -1;
		int mid = (low + high) / 2;
		if (key == array[mid])
			return mid;
		else if (key < array[mid])
			return binarySearch(array, key, low, mid - 1);
		else
			return binarySearch(array, key, mid + 1, high);
	}
}
