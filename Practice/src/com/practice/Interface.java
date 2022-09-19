package com.practice;
class A implements InterfaceDemo{

	@Override
	public void run() {
		System.out.println("Run");
	}

	@Override
	public void walk() {
		System.out.println("Walk");
		
	}

	@Override
	public void sit() {
		System.out.println("Sit");
		
	}
	
}
class C extends A implements InterfaceDemo{
	public void walk() {
		System.out.println("Walk in Garden");
	}
}


public class Interface {

	public static void main(String[] args) {
		A a = new C();
		a.run();
		a.sit();
		a.walk();

	}

}
