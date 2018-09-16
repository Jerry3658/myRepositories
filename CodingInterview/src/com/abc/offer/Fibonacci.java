package com.abc.offer;

import java.util.Scanner;

/**
 * 面试题10：斐波那契数列
 * 题目：写一个函数，输入n，求斐波那契（Fibonacci）数列的第n项。
 * F(0)=0, F(1)=1, F(2)=1, F(n)=F(n-1)+F(n-2),n>=3
 * @author Jerry
 *
 */
public class Fibonacci {

	/**
	 * 方法一：递归
	 * @param n
	 * @return
	 */
	public static int Fibonacci(int n) {
		if(n <= 0)
			return 0;
		else if(n == 1 || n == 2)
			return 1;
		else
			return Fibonacci(n-1) + Fibonacci(n-2);
    }
	
	/**
	 * 方法二：循环
	 * @param n
	 * @return
	 */
	public static int Fibonacci2(int n) {
		int preNum = 1;
		int prePreNum = 0;
		int result = 0;
		if(n <= 0)
			return 0;
		if(n == 1)
			return 1;
		for(int i = 2; i <= n; i++) {
			result = preNum + prePreNum;
			prePreNum = preNum;
			preNum = result;
		}
		return result;
    }
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()) {
			System.out.println(Fibonacci(sc.nextInt()));
		}
	}

}
