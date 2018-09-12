package com.abc.offer;
/**
 * 面试题5：替换空格
 * 题目：请实现一个函数，把字符串中的每个空格替换成"%20"。例如输入“We are happy.”，
 * 则输出“We%20are%20happy.”。
 * @author Jerry
 *
 */
public class ReplaceSpaces {

	/**
	 * 通过正则表达式的方式(包括空格、换行、tab缩进等所有的空白)
	 * @param str
	 * @return
	 */
	public static String replaceSpaces(StringBuffer str) {
		String s = String.valueOf(str);
		return s.replaceAll("\\s", "%20");
	}
	
	/**
	 * 通过字符串转换为字符数组的方式
	 * @param str
	 * @return
	 */
	public static String replaceSpaces2(StringBuffer str) {
		StringBuffer sb = new StringBuffer();
		String s = String.valueOf(str);
		char[] charArray = s.toCharArray();
		for(int i = 0; i < charArray.length; i++) {
			if(charArray[i] == ' ') {
				sb.append("%20");
			}else
				sb.append(charArray[i]);
		}
		return String.valueOf(sb);
	}
	
	/**
	 * 通过判断字符串中字符的前缀或后缀是否为空格的方式
	 * @param 
	 * @return
	 */
	public static String replaceSpaces3(StringBuffer str) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < str.toString().length(); i++) {
			if(String.valueOf(str.charAt(i)).endsWith(" ")) {
				sb.append("%20");
			}else
				sb.append(str.charAt(i));
		}
		return String.valueOf(sb);
	}
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("We are happy.");
		System.out.println(replaceSpaces(sb));
	}

}
