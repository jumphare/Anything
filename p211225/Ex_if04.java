package org.opentuto.javatuto.eclipse;

import java.util.Scanner;

public class Ex_if04 {

	public static void main(String[] args) {
		//알람시계
		//입력으로 주어진 시간(24h)에서 45분 앞서는 시간으로 바꿔 출력하는 프로그램
		
		Scanner sc=new Scanner(System.in);
		int H=sc.nextInt();
		int M=sc.nextInt();
		
		if(45<=M&&M<60) {
			System.out.println(H+" "+(M-45)); //45분~59분 사이 설정이면 H 바꿀 필요 없음
		} else if(M<45&&H==0) {
			System.out.println("23 "+(15+M)); //0시 45분 아래면 23시로 떨어지니까
		} else {
			System.out.println((H-1)+" "+(M+15)); //M 45 미만인 경우
		}

	}

}
