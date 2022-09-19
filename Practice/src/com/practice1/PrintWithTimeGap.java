package com.practice1;
class TimeGap extends Thread{
	public void run() {
		for(int i =0;i<=5;i++) {
			try {
				System.out.println(i);
				
				Thread.sleep(2000); 
				//System.out.println(i);
				//Thread.sleep(2000);
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class PrintWithTimeGap {

	public static void main(String[] args) {
		TimeGap a = new TimeGap();
		TimeGap b = new TimeGap();
		a.start();
		b.start();
		
	}

}
