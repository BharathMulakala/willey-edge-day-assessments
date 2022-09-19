package com.practice1;

import java.util.Scanner;

public class StringOperation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int l = s.length();
		

		int start = sc.nextInt();
		int end = sc.nextInt();
		int length = end - start;
		char[] c = new char[length + 1];
		if (start >= 0 && end < l) {
			int j = 0;
			for (int i = start; i <= end; i++) {

				c[j] = s.charAt(i);
				j = j + 1;
			}

		}else {
			System.out.println("not in the range");
		}
		String s2 = String.valueOf(c);
		System.out.println(s2);

	}

}
