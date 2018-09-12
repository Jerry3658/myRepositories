package com.abc.offer;

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
