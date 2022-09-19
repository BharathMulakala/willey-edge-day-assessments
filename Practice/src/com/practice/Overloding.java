package com.practice;
class OverloadingDemo{
	int i;
	public void add(int x,int y) {
		 i = x+y;
		 System.out.println("addition of x and y is" +i);
	}
	public void add(int x,int y,int z) {
		 i=x+y+z;
		 System.out.println("addition of x and y and z is" +i);
	}
	public void add(int x,int y,int z , int a) {
		 i= x+y+z+a;
		 System.out.println("addition of x and yand z and a is" +i);
	}
}

public class Overloding {

	public static void main(String[] args) {
		OverloadingDemo od= new OverloadingDemo();
		od.add(2,5);
		od.add(1, 2, 3, 4);

	}

}
