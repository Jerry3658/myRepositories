package com.abc.test;

import java.util.Arrays;
/**
 * 题1：两数之和
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * @author Jerry
 *
 */
public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}
	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int[] twoSum = twoSum(arr, 9);
		/*打印数组的第一种方式
		System.out.print("[");
		for(int i = 0; i < twoSum.length; i++) {
			if(i != twoSum.length - 1)
				System.out.print(twoSum[i] + ", ");
			else
				System.out.println(twoSum[i] + "]");
		}
		*/
		/*打印数组的第二种方式
		if(twoSum.length == 0)
			System.out.println("[]");
		StringBuilder sb = new StringBuilder("[");
		for(int i = 0; i < twoSum.length; i++) {
			if(i != twoSum.length - 1)
				sb.append(twoSum[i] + ", ");
			else
				sb.append(twoSum[i] + "]");
		}
		System.out.println(sb.toString());
		*/
		// 打印数组的第二种方式：使用Arrays工具类的toString方法
		System.out.println(Arrays.toString(twoSum));
	}
}
