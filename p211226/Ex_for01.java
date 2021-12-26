package org.opentuto.javatuto.eclipse;

import java.util.Scanner;

public class Ex_for01 {

	public static void main(String[] args) {
		// 두 정수 A와 B를 입력받아 A+B를 출력하는 프로그램
		// 처음에 테스트 케이스의 개수 T가 주어지고 그 회수만큼 입출력을 반복
		
		Scanner sc=new Scanner(System.in);
		
		for(int T=sc.nextInt();T>0;T--) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			System.out.println(A+B);
		}
		

	}

}
