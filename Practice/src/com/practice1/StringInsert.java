package com.practice1;

import java.util.Scanner;

public class StringInsert {

	public static void main(String[] args) {
		String s ="string";
		int l = s.length();
		char c[]= new char[l+1];
		//Scanner sc = new Scanner(System.in);
		int n =4;//sc.nextInt();
		char ch ='c';
		for(int i =0;i<=l;i++) {
			if(i>n) {
				c[i]=s.charAt(i-1);
				
			}
			else if(i==n) {
				c[i]=ch;
			}else {
				c[i]=s.charAt(i);
			}
		}
		String s3= String.valueOf(c);
		System.out.println(s3);
	

	}

}
