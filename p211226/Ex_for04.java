package org.opentuto.javatuto.eclipse;

import java.util.Scanner;

public class Ex_for04 {

	public static void main(String[] args) {
		// 뒤집어진 삼각형 별 찍기
		//1행 N개 2행 N-1개 ....... N행 1개
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		
		for(int i=1;i<=N;i++) { //행 개수 i
			for(int j=0;j<=N-i;j++) { //별 1행 N개 .... N행 1개
				System.out.print("*");
			}
			System.out.println(); //별 찍고 행 넘기기
		}
		
	

	}

}
