package com.kh.main;

import java.util.Scanner;

public class GangboonGame {

	public void gamestart() {
		Scanner sc = new Scanner(System.in);
	
				// 게임 시작
				System.out.println("===== 게임 시작 =====");
				int count = 0;	 // count 값 초기화
				while (true)  	// 31이 될 때까지 무한반복

				{	// 유저 코드

					System.out.println("<< 유저 차례 >>");

					System.out.print("1~3까지의 수를 넣으세요 : ");

					int userN = sc.nextInt();     // userN :사용자가 입력하는 숫자 변수

					for (int i = 0; i < userN; i++)  

					{
						if(userN >3)						// 사용자가 3 넘는 수를 입력하면 안내문구와 함께 break 걸어줌

						{
							System.out.println("1부터 3까지만 넣을 수 있습니다!");
							break;
						}
						count++; 							// 사용자가 숫자 입력하면 하나씩 증가
						System.out.println((count) + "!");
						if (count == 31) 
						{
							System.out.println("패배");
							break;
						}
					}
					if (count >= 31) 
					{
						break;
					}
					//컴퓨터 코드
					System.out.print("<< 컴퓨터 차례 >>");

					System.out.println();
					int comN = (int)(Math.random() * 3) +1; // 랜덤 숫자 범위 1~3으로 정해줌.
					for (int i = 0; i < comN; i++) 
					{
						count++;

						System.out.println((count) + "!");

						if (count == 31) 
						{

							System.out.println("승리");
							break;
						}
					}

					if (count >= 31) 
					{
						break;
					}
			}
	}
}
		