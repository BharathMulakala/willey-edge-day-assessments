package com.practice;
class Father{
	public void run() {
		System.out.println("Dont run Fastly");
	}
}
class Child extends Father{
	public void run() {
		System.out.println("I will run Fastly");
	}
}

public class Overriding {

	public static void main(String[] args) {
//		Father f = new Child();
//		f.run();
		Father f = new Father();
		f.run();
		

	}

}
