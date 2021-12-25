package org.opentuto.javatuto.eclipse;

import java.util.Scanner;

public class Ex_if02 {

	public static void main(String[] args) {
		//연도가 주어졌을때 윤년이면 1, 아니면 0 출력
		//윤년=1. 4의 배수이면서 100의 배수가 아닐 때 2. 400의 배수일 때
		
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		
		if(year%4==0&&year%100!=0) { //1. 4의 배수이면서 100의 배수가 아님
			System.out.println("1");
		} else if(year%400==0) { //2. 400의 배수
			System.out.println("1");
		} else 
			System.out.println("0"); //윤년 아님
		

	}

}
