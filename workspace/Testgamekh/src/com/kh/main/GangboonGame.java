package com.kh.main;

import java.util.Scanner;

public class GangboonGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		boolean x = true;

		while ( x ) 

		{
			System.out.println(" ===== BaskinRobbins31 Game ===== ");
			System.out.println();
			System.out.println("1. 게임 시작하기");
			System.out.println("2. 게임 설명 보기");
			System.out.println("3. 게임 종료하기");
			System.out.println();
			System.out.print("선택 > ");

			int cho = sc.nextInt(); //선택 변수 유저한테서 입력 받기
			switch (cho)  			    
			{
			case 1:
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

			case 2:

				// 게임 설명 출력

				System.out.println("<< 게임 설명 >>");

				System.out.println();

				System.out.println("유저와 컴퓨터는 차례대로 1부터 31까지의 수를 순차적으로 입력한다." );

			         System.out.println( "한번에 1~3개까지 수를 연달아 입력할 수 있으며, 마지막 31을 부른 사람이 진다. ");

			         System.out.println();

				break;
				
			case 3:

				// 게임 종료
				x = false;

				System.out.println("게임이 종료되었습니다.");

				break;
			}  

		}	  
		
	}

}
