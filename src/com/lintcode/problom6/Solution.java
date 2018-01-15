package com.lintcode.problom6;

public class Solution {
	/*
     * @param A: sorted integer array A
     * @param B: sorted integer array B
     * @return: A new sorted integer array
     */
    public static int[] mergeSortedArray(int[] A, int[] B) {
        // write your code here
    	if(A == null || B == null) {
    		return A == null ? B : A;
        }
        int[] res = new int[A.length + B.length];
        int lenA = 0;
        int lenB = 0;
        int lenC = 0;
        while (lenA <= A.length - 1 && lenB <= B.length - 1) {
            if (A[lenA] <= B[lenB]) {
            	res[lenC++] = A[lenA++];
            } else {
            	res[lenC++] = B[lenB++];
            }
        }
        while(lenA <= A.length - 1) {
        	res[lenC++] = A[lenA++];
        }
        while(lenB <= B.length - 1) {
        	res[lenC++] = B[lenB++];
        }
        return res;
    }
    
    public static void main(String[] args) {
    	int[] A = {1,2,3,4};
    	int[] B = {2,4,5,6};
    	int[] C = mergeSortedArray(A, B);
    	for (int i = 0; i < C.length; i++) {
    		System.out.print(C[i] + " ");
		}
    	
    }
}
