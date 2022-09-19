package com.interviewquestions;

import java.util.ArrayList;
import java.util.List;

public class PrimeBetweenTwoNumbers {

	public static void main(String[] args) {
		int a =24;
		int b=(int)Math.sqrt(a);
		List<Integer> list= new ArrayList<>();
		int count =0;
		for(int i=1;i<=b;i++) {
			if(a%i==0) {
			count =count +1;
			}
			
			
			
		}
		if(count==1) {
			System.out.println("prime");
		}else {
		System.out.println("Not prime");
		}
	}
			
}
