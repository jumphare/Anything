package org.opentuto.javatuto.eclipse;

import java.util.Scanner;

public class Ex_if03 {

	public static void main(String[] args) {
		// 사분면 고르기
		//(x,y)좌표를 입력받아 그 점이 어느 사분면에 속하는지 알아내는 프로그램
		
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		if(x>0&&y>0) {
			System.out.println("1");
		}else if(x<0&&y>0) {
			System.out.println("2");
		}else if(x<0&&y<0) {
			System.out.println("3");
		}else {
			System.out.println("4");
		}

	}

}
