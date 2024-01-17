package com.javaex.ex02;

public class DigitThread extends Thread {
	
	public void run() {
		for (char ch='A'; ch<='Z'; ch++) {
			System.out.println(ch);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		
	}

}
