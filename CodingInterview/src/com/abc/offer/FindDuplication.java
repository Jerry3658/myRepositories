package com.abc.offer;
/**
 * 面试题3：找出数组中重复的数字
 * 题目：在一个长度为n的数组里的所有数字都在0到n-1的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，
 * 也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。例如，如果输入长度为7的数组{2, 3, 1, 0, 2, 5, 3}，
 * 那么对应的输出是重复的数字2或者3。
 * @author Jerry
 *
 */
public class FindDuplication {
	public static boolean duplicate(int numbers[], int length, int[] duplication) {
		StringBuilder sb = new StringBuilder();
		// 将数组转换成字符串
		for (int i = 0; i < length; i++) {
			sb.append(String.valueOf(numbers[i]));
		}
		// 查找数组中的元素出现的第一个位置和最后一个位置
		for (int j = 0; j < length; j++) {
			if (sb.indexOf(numbers[j] + "") != sb.lastIndexOf(numbers[j] + "")) {
				duplication[0] = numbers[j];
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 0, 2, 5, 3 };
		int[] duplication = new int[1];
		System.out.println(duplicate(arr, arr.length, duplication) ? duplication[0] : "没有重复的数字");
	}
}
