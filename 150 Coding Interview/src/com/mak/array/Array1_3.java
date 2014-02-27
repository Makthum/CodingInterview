package com.mak.array;

public class Array1_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char str[]={'m','a','a','k','k','h','u','t'};
		removeDuplicates(str);
		System.out.println(str);
	}
	public static void removeDuplicates(char[] str) {
		 if (str == null) return;
		 int len = str.length;
		 if (len < 2) return;
		
		int tail = 1;
		
		for (int i = 1; i < len; ++i) {
		 int j;
		 for (j = 0; j < tail; ++j) {
		 if (str[i] == str[j]) break;
		 }
		 if (j == tail) {
		 str[tail] = str[i];
		 ++tail;
		 }
		 }
		 str[tail] = 0;
		 
		 }
	
}
