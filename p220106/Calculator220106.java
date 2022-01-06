package Repo;

import java.text.DecimalFormat;
import java.util.Scanner;

class Circle {

	double result;

	double circum(double r) { // 원주 계산
		result = 2 * Math.PI * r;
		return result;
	}

	double aOfCircle(double r) { // 원의 면적
		result = Math.PI * r * r;
		return result;
	}
}

class Sphere extends Circle { // 구 클래스가 원 클래스 상속

	double aOfSphere(double r) { // 구 표면적
		result = 4 * Math.PI * r * r;
		return result;
	}

	double volume(double r) { // 구의 부피
		result = (4 / 3) * Math.PI * r * r * r;
		return result;
	}
}

public class Calculator220106 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1: 원의 둘레\t\t 2: 원의 면적");
		System.out.println("3: 구의 표면적\t 4: 구의 체적");
		System.out.print("원하는 번호를 입력하세요: ");
		int num = sc.nextInt();

		Sphere sph = new Sphere(); // 객체 생성
		DecimalFormat df = new DecimalFormat("###.##"); // 소수점 둘째자리

		switch (num) {
		case 1:
			System.out.println(" 2 * PI * r= " + df.format(sph.circum(5)));
			break;
		case 2:
			System.out.println("PI * r * r= " + df.format(sph.aOfCircle(5)));
			break;
		case 3:
			System.out.println("4 * PI * r * r= " + df.format(sph.aOfSphere(5)));
			break;
		case 4:
			System.out.println("4/3 * PI * r * r * r= " + df.format(sph.volume(5)));
			break;
		}

	}

}
