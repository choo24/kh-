package com.kh.main;

import java.util.Scanner;

public class MinKyuGame {
	Scanner sc = new Scanner(System.in);
	public void go() {
		System.out.println("-----------");
		System.out.println("||구구단 게임||");
		try {
			while(true) {
				int num1 = (int)(Math.random()*10);
				int num2 = (int)(Math.random()*10);
				int userNum;
				userNum = Integer.parseInt(sc.nextLine().trim());
				
				System.out.println("-----------");
				System.out.print(num1 + " * " + num2 + " = ");
				System.out.println("-----------");
				
				boolean result = (num1 * num2 == userNum);
				
				if(result ==true) {
					System.out.println("정답! 다음문제");
				}else {
					System.out.println("땡!");
					System.out.println("틀렸다 끝");
					System.out.println("-----------");
					return;
				}
			}
		}catch(Exception e) {
			System.out.println("-----------");
			System.out.println("값을 입력하세요");
			go();
		}
		
	}//class

}//main
