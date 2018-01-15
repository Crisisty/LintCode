package com.lintcode.problom8;

public class Solution {
	/*
	 * @param str: An array of char
	 * 
	 * @param offset: An integer
	 * 
	 * @return: nothing
	 */
	public static char[] rotateString(char[] str, int offset) {
		if(str == null || str.length == 0)
            return str;
		int off = offset % str.length;
		reserve(str, 0, str.length - off -1);
		reserve(str, str.length - off, str.length - 1);
		reserve(str, 0, str.length - 1);
		return str;
	}
	
	public static void reserve(char[] str, int start, int end) {
		for (int i = start, j = end; i < j; i++, j--) {
			char temp = str[i];
			str[i] = str[j];
			str[j] = temp;
		}
	}
	
	public static void main(String[] args) {
		char[] str = { 'a', 'b', 'c', 'd', 'e', 'f', 'g' };
		System.out.println(new String(rotateString(str, 3)));
	}
}
