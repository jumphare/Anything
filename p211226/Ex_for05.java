package org.opentuto.javatuto.eclipse;

import java.util.Scanner;

public class Ex_for05 {

	public static void main(String[] args) {
		// X보다 작은 수 구하기
		// 처음에 배열 갯수 N과 기준값 X를 입력받음
		// N만큼 수를 입력해서 그 중 X보다 작은 값만 출력되도록 함
		
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int X=sc.nextInt();
		
		
		int num[]=new int[N]; //N개의 배열 생성
		
		for(int i=0; i<N;i++) {  //배열은 0부터 있으니 0~N-1까지 범위로
			num[i]=sc.nextInt(); //배열에 정수를 한번에 입력받음
		}
		
		//다 입력받고 난 뒤에
		for(int j=0; j<N;j++) {
			if(num[j]<X) { //for문이 j로 돌아가고 있으니 num[j]로 두고(중요!) 배열 안의 값이 X보다 작을 경우 출력
				System.out.print(num[j]+" ");
			}
		}
			
		
	} //m

}//c
