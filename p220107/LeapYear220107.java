package Repo;

import java.util.Scanner;

interface A {
	boolean years();
}

class B implements A {
	int year;

	public B(int year) {
		this.year = year;
	}

	public boolean years() {
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
			return true;
		} else
			return false;
	}
}

public class LeapYear220107 {

	public static void main(String[] args) {

		System.out.print("연도를 입력하세요: ");

		Scanner sc = new Scanner(System.in);

		int year = sc.nextInt();

		B result = new B(year);

		if (result.years()) {
			System.out.println(year + "년은 윤년입니다.");
		} else
			System.out.println(year + "년은 평년입니다.");
	}

}
