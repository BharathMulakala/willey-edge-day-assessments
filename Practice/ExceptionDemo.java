package com.day5;

import java.util.ArrayList;
import java.util.List;

public class ExceptionDemo {

	public static void main(String[] args) {
		//String s =null;
		int a[] = new int[5];
		List<String> list = new ArrayList<>();
		//System.out.println(list.get(0));
		
		
		try {
			System.out.println(list.get(0));
			System.out.println(a[5]);
		}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("ArrayIndexOutOfBoundsException Catched");
		e.printStackTrace();
		//System.out.println(e.getStackTrace());
			
		}catch(Exception n){
			System.out.println("Exception is occured");
			n.printStackTrace();		}
		
		finally {
		
			System.out.println("Finally block excecuted");
		}
		

	}

}
