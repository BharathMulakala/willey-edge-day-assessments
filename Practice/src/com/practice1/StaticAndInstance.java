package com.practice1;

public class StaticAndInstance {
	public static int a =1;
	public static int b=2;
	static {
		System.out.println("Static block1 executed");
	}
	static{
		System.out.println("Static block 3");
	}
	static{
		System.out.println("Static block 2");
	}
	{
		System.out.println("Instance block 1 executed");
	}
	{
		System.out.println("Instance block 2 executed");
	}
	static{
		System.out.println("Static block 3");
	}
	static void m1() {
		System.out.println("Static method called");
	}
	public void m2(int x, int y) {
		int z =x+y;
		System.out.println("Instance method called");
	}
	public StaticAndInstance(int x , int y) {
		int c =x+y;
		System.out.println(c);
		System.out.println("Constructor executed");
		
	}
	public StaticAndInstance() {
		
	}
	static class StaticClass{
		static void add() {
			int x = a+b;
			System.out.println(x);
			System.out.println("static class method executed");
			
			
		}
	}

	public static void main(String[] args) {
		
		StaticAndInstance si1=new StaticAndInstance();
		StaticAndInstance si2=new StaticAndInstance(10,5);
		StaticAndInstance.m1();
		si1.m2(1, 2);
		StaticClass sc1= new StaticClass();
		sc1.add();
		
		
		
	}

}
