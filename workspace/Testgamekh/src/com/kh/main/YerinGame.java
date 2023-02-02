package com.kh.main;

import java.util.Scanner;

public class YerinGame {
	Scanner sc= new Scanner(System.in);
	
	public void playRSP() { //가위바위보게임
	       //알고리즘이 필요한 게임..
	       /*고리자료구조 한번 만들어보기
	       1.가위
	       2.바위
	       3.보
	        */

	        boolean isRun= true;

	        while(isRun){
	            int com = (int)(Math.random()*3);
	            System.out.print("가위, 바위, 보를 입력하세요.(9.:종료):");
	            String userStr = sc.nextLine();
	            int user=0;
	            


	            if (userStr.equals("가위"))
	                user=0;
	            else if(userStr.equals("바위"))
	                user=1;
	            else if(userStr.equals("보"))
	                user=2;
	            else if(userStr.equals("9"))
	                isRun =false;
	            else {
	                System.out.println("잘못입력하셨습니다.");
	                continue; //다른값 입력시 while문의 조건식으로 넘어가는지 확인 할 것.
	            }

	            //com의 패를 공개
	            switch (com){
	                case 0:
	                    System.out.println("가위"); break;
	                case 1:
	                    System.out.println("바위"); break;
	                case 2:
	                    System.out.println("보"); break;
	            }
	            //승패 결과 출력
	           if(user==0) {
	        	 if(com==0) {
	        		 System.out.println("무");
	        	 }else if(com==1) {
	        		 System.out.println("패");
	        	 }else if(com==2) {
	        		 System.out.println("승");
	        	 }  
	        	 
	           }else if(user==1) { //유저바위
	        	 if(com==0) {
	          		 System.out.println("승");
	          	 }else if(com==1) {
	          		 System.out.println("무");
	          	 }else if(com==2) {
	          		 System.out.println("패");
	          	 } 
	           }else if(user==2) { //보
	        	 if(com==0) {//가위
	        		  System.out.println("패");
	             }else if(com==1) {//바위
	            	 System.out.println("승");
	           	 }else if(com==2) {
	           		 System.out.println("무");
	            	 } 
	           }

	        }


	    }//class
}
