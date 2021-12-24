package p2021_12_23;

import java.util.Scanner;

public class Ind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//


//		


//		1 1~10숫자의 합		
		int result1=0;
		
		for(int i=1;i<=10;i++) {
			result1+=i;
		}
		System.out.println(result1);
		
//		2 1~10 홀수합		
		
		int result2=0;

		for(int j=1;j<=10;j++) {
			if(j%2==1)
			result2+=j;
		}
		System.out.println(result2);
		
//		3 1~10 짝수합
		
		int result3=0;

		for(int j=1;j<=10;j++) {
			if(j%2==0)
			result3+=j;
		}
		System.out.println(result3);
		
//		4 입력받은 값의 구구단 1~9까지
		
		System.out.println("1~9 입력");
		
		Scanner sc=new Scanner(System.in);
		
		int result4=sc.nextInt();
				
		for(int i=1; i<10;i++) {
			System.out.println(result4+"*"+i+"="+(result4*i));
		}
		
		
		
		
		
	}

}
