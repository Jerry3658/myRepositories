package com.abc.test;
/**
 * 直接插入排序
 * 从第一个元素开始，该元素可以认为已经被排序
 * 取出下一个元素，在已经排序的元素序列中从后向前扫描 
 * 如果该元素（已排序）大于新元素，将该元素移到下一位置
 * 重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
 * 将新元素插入到该位置中
 * 重复步骤2
 * @author Jerry
 *
 */
public class InsertSort {

	public static void main(String[] args) {
		int[] nums = { 34, 4, 56, 17, 90, 65 };
		insertSort1(nums);
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}
	}

	public static void insertSort1(int[] nums) {
		int j;
		for (int i = 1; i < nums.length; i++) {
			int temp = nums[i];
			for (j = i; j > 0 && nums[j - 1] > temp; j--) {
				nums[j] = nums[j - 1];
			}
			nums[j] = temp;
		}
	}
	
	public static void insertSort2(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int j;
			int temp = nums[i];
			for (j = i - 1; j >= 0; j--) {
				if (nums[j] > temp) {
					nums[j + 1] = nums[j];
				} else {
					break;
				}
			}
			if (nums[j + 1] != temp) {
				nums[j + 1] = temp;
			}
		}
	}
	
}
