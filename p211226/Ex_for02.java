package org.opentuto.javatuto.eclipse;

import java.util.Scanner;

public class Ex_for02 {

	public static void main(String[] args) {
		//첫째 줄에는 별1개, 둘째줄에는 별2개.... N번째 줄에는 별 N개 찍기
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		
		for(int i=1;i<=N;i++) {
			for(int j=1;j<=i;j++) { //i=n일때 n만큼 별이 출력될 수 있게 for문을 한 번 더 쓴다
				System.out.print("*");
			}
			System.out.println(); //위의 이중for문이 끝나면 한줄 내려가야 하므로
		}
		
		
	}

}
