package com.practice1;

public class StaticDemo {
	public static int a =10;
	public static int b =20;
	int d =5;
	static {
		System.out.println("Static constructor got executed");
	}
	public StaticDemo(int a,int b) {
		int c =a+b;
		System.out.println(c + "constructor got executed");
	}
	public StaticDemo() {
		
	}
	static void m1() {
		System.out.println("Static method executed");
		
	}
	static class StaticClass {
		public void substraction(){
			System.out.println("static class method executed");
		}
		
	}

	public static void main(String[] args) {
		StaticDemo sd1= new StaticDemo();
		StaticDemo sd2= new StaticDemo(100,200);
		StaticDemo.m1();
		
		StaticClass sc = new StaticClass();
		sc.substraction();
		

	}

}
