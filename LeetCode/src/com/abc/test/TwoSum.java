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
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                	return new int[] {i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
	public static void main(String[] args) {
		int[] arr = {2,7,11,15};
		int[] twoSum = twoSum(arr,9);
		/*打印数组的另一种方式
		System.out.print("[");
		for(int i = 0; i < twoSum.length; i++) {
			if(i != twoSum.length -1)
				System.out.print(twoSum[i] + ", ");
			else
				System.out.println(twoSum[i] + "]");
		}
		*/
		System.out.println(Arrays.toString(twoSum));
	}
}
