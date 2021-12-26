package org.opentuto.javatuto.eclipse;

import java.util.Scanner;

public class Ex_for03 {

	public static void main(String[] args) {
		//별 오른쪽 정렬
		// 전체 N행일때 1행 띄어쓰기 N-1 후 * 1개
		// 2행 띄어쓰기 N-2 후 * 2개
		// .... N행 띄어쓰기 N-N 후 * N개

		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		for(int i=1; i<=N; i++) { //행 개수
			for(int j=1; j<=N-i;j++) { //띄어쓰기 N-i(행) 개
				System.out.print(" ");
			}
			for(int k=1; k<=i;k++) { //별 i개
				System.out.print("*");
			}
			//둘은 for문을 따로 넣어둬야 갯수만큼만 뜬다 띄어쓰기+별 갯수 더해서 N개 다 출력되면
			System.out.println(); //줄바꾸고 다음 행으로 넘어감
		}
		
		
		
	}//m

}//c

