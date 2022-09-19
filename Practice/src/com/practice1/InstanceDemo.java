package com.practice1;

public class InstanceDemo {
	int a =10;
	int b=20;
	{System.out.println("Instance block got executed");}
	public InstanceDemo() {
		System.out.println("constructor excecuted");
	}
	public void add() {
		int c = a+b;
		System.out.println(c);
		System.out.println("Instance method git executed");
	}
	
	

	public static void main(String[] args) {
		InstanceDemo d1 =new InstanceDemo();
		d1.add();
		
	}

}
