package Repo;

public class Repo_211231_add {

	// 1~45사이의 숫자를 6개 추출 하는 프로그램
	// 단, 중복 없이

	class number {

		public static void random() {
			int[] num1 = new int[6]; // 숫자 6개 들어갈 배열
			int[] num2 = new int[6]; // 복사할 배열

			for (int i = 0; i < num1.length; i++) {
				num1[i] = (int) (Math.random() * 45) + 1; // 수 6개를 배열에 저장함
				num2[i] = num1[i]; // num2에 복사
			}

			// 무조건 출력 6개 되도록
			for (int i = 0; i < num1.length - 1; i++) {
				for (int j = i + 1; j < num2.length; j++) {
					if (num1[i] == num2[j]) {// 배열 비교해서 중복 있을 경우
						num2[j] = (int) (Math.random() * 45) + 1; // 해당 배열 값을 삭제하고 새로운 랜덤값 추가
						num1[j] = num2[j]; // 그 값을 배열에 복사해놓고
						i = 0; // 다시 i=0부터 for문을 돌린다
					}
				}
			}

			int m = 0;

			for (int i = 0; i < num2.length - 1; i++) {
				for (int j = i + 1; j < num2.length; j++) {
					if (num2[i] > num2[j]) { // num2[0] > num2[1] 인 경우
						m = num2[j]; // m=num2[1] 대입
						num2[j] = num2[i]; // num2[1]에 num2[0] 값 대입
						num2[i] = m; // num2[0]에 m=num2[1] 값 대입
						// 이 시점에서 num2[0]이랑 num2[1] 값 바뀌어있고 다음 루프에서 num2[0]이랑 num2[2] 비교하고.. 이렇게 나감
					}
				}
			}

			for (int i = 0; i < num2.length; i++) {
				System.out.print(num2[i] + " ");
			}

			// 중복값은 한 번만 출력되게-> 출력이 꼭 6개는 되지 않음
//			for (int i = 0; i < num1.length - 1; i++) {
//				for (int j = i + 1; j < num2.length; j++) {
//					if (num1[i] == num2[j]) // 배열 비교해서 중복 있을 경우
//						num2[j] = 0; // 해당 배열값을 0으로
//				}
//			}
//			for (int i = 0; i < num2.length; i++) {
//				if (num2[i] != 0)	//배열값이 0인 수 제외하고 출력
//					System.out.print(num2[i] + " ");
//			}
		}
	}

	public static void main(String[] args) {

		number.random();

		System.out.println();

	}

}
