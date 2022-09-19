package com.practice;
class Overloding1{
	public void logging(int userId , String password ) {
		System.out.println("Welcome " +userId);
		
	}public void logging(int phoneNumber ) {
		System.out.println("Enter Otp");
		
	}public void logging(String googleMail,String password) {
		System.out.println("Hi User" +googleMail);
		
	}
}

public class OverlodingDemo {

	public static void main(String[] args) {
		Overloding1 o= new Overloding1();
		o.logging(1234);
		o.logging(147, "abvc");
		o.logging("abc@gmail.com", "xyz");
		

	}

}
