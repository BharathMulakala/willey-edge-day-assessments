package com.creatingThread;

public class ExtendingThreadClass extends Thread{
	private static String thread1;

	public void run() {
		System.out.println("Thread is running" +currentThread().getName());
		
		
		try {
			Thread.sleep(2000);
			System.out.println("Thread is running" +currentThread().getName());
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		ExtendingThreadClass t1= new ExtendingThreadClass();
		ExtendingThreadClass t2= new ExtendingThreadClass();
		ExtendingThreadClass t3= new ExtendingThreadClass();
		ExtendingThreadClass t4= new ExtendingThreadClass();
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		//t1.setName(thread1);
		
		

	}

}
