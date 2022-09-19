package com.practice;
abstract class AbstractDemo{
	abstract void run();
	
	public void walk() {
		System.out.println("Walk Slowly");
		
	}
	public AbstractDemo() {
		System.out.println("AbstractDemo Constructur Executed ");
		
	}
	
}
class B extends AbstractDemo{

	@Override
	void run() {
		System.out.println("Run Start");
		
	}
	public B() {
		super();
	}
	
}

public class AbstractClass {

	public static void main(String[] args) {
		
		B b = new B();
		b.run();
		b.walk();
		
		
		

	}

}
