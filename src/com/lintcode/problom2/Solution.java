package com.lintcode.problom2;

public class Solution {
	 /*
     * @param n: An integer
     * @return: An integer, denote the number of trailing zeros in n!
     */
    public static long trailingZeros(long n) {
		// write your code here, try to do it without arithmetic operators.
		long sum = 0;
		while(n > 1) {
			sum = sum + n / 5;
			n = n/5;
		}
		return sum;
	}
    
    public static void main(String[] args) {
    	System.out.println(trailingZeros(11));
    }
}
