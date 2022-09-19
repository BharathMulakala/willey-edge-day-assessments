package com.practice1;

public class InsertString2 {

	public static void main(String[] args) {
		String s = "welcome";

		String s4 = "string";
		int i=5;
		if(i>0&&i<s4.length()) {

		String s5 = s4.substring(i, s4.length());
		String s6 = s4.substring(0, 3);

		String s7 = s6.concat(s);
		String s8 = s7.concat(s5);
		System.out.println(s8);
		}else if(i==0) {
			String s8 = s4.concat(s);
			System.out.println(s8);
		}else {
			String s8= s.concat(s4);
			System.out.println(s8);
		}

	}

}
