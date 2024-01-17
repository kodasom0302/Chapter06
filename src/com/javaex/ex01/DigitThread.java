package com.javaex.ex01;

public class DigitThread extends Thread {
	
	//필드
	
	//생성자 - 디폴트
	
	//메소드
	public void run() {
		for (int i=0; i<=30; i++) {
			System.out.println(i);
			
			//시간 두고 출력 되도록
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}

}
