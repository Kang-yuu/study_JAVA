package home00;

public class Home_10 {

	public static void main(String[] args) {

		System.out.println("짝수만 더하는 반복문");

		int even = 0;

		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				even = even + i;
				System.out.println(i);
			}
		}

		System.out.println(even);

//		이건 수업때 들은건데 일단 적어놓음
//		int sum = 0;
//		int n = 0;
//
//		for (int i = 0; i <= 10; i++) { // 그냥 횟수
//			n++;
//			if (n % 2 == 0) { // 참이면 실행
//				sum = sum + n;
//				// n++; 참이 아니라서 실행이 안되무..
//			}
//
//		}
//		System.out.println(sum);
//
//		System.out.println("약간 바꿔진..");
//
//		int sum1 = 0; // 결과값
//		int n1 = 1;
//
//		for (int i = 0; i <= 10; i++) { // 0~10번이면 11번 돌아감
//
//			if (n1 % 2 == 0) {
//				sum1 = sum1 + n1;
//			}
//			n1++;
//
//		}
//		System.out.println(sum1);

	}

}
