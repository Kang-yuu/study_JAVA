package home00;

public class Home_05 {

	public static void main(String[] args) {

		System.out.println("1부터 10까지 출력하는 while문");
		int n1 = 1;

		while (n1 <= 10) {
			System.out.println(n1);
			n1++;
		}

		System.out.println("1부터 10까지 출력하는 for문");

		for (int n2 = 1; n2 <= 10; n2++) {
			System.out.println(n2);
		}

		System.out.println("0부터 9까지 홀수만 출력하는 while문");

		int data3 = 0;

		while (data3 < 10) {
			if (data3 % 2 != 0) {
				System.out.println(data3);
			}
			data3++;
		}

		System.out.println("0부터 20까지 짝수만 출력하는 for문");

		for (int n4 = 0; n4 <= 20; n4++) {
			if (n4 % 2 == 0) {
				System.out.println(n4);
			}
		}

		System.out.println("1부터 10까지 더한 결과를 출력하는 while문");

		int data5 = 0; // 출력하고싶은 데이터
		int n5 = 0; // 더하고 싶은 숫자, 반복숫자

		while (n5 <= 10) { // 참이 되면 반복문을 빠져나가라!
			// 중간이 내역이 보고싶으면 data5와 n5d의 출력문을 여기 각각 입력하면 된다.
			data5 = data5 + n5;
			n5++;
		}
		System.out.println(data5);

		System.out.println("1부터 10까지 다 더하는 for문");

		int data = 0; //

		for (int i = 1; i <= 10; i++) {// 더할 값
			data = data + i;
		}

		System.out.println(data);

		System.out.println("1부터 100까지 더할때 4000이 넘을때 멈추는 while문");

		int n6 = 0; // 더할 횟수랑 숫자
		int data6 = 0; // 출력값

		while (n6 <= 100) {
			data6 = data6 + n6;
			if (data6 >= 4000) {
				break; // 브레이크 안걸면 4000 넘길때 값부터 계속 출력 됨.
			}
			n6++;
		}
		System.out.println(data6); // if문 안에 있어도 결과는 같긴 함..

		System.out.println("for문");
		int data1 = 0;

		for (int a = 0; a <= 100; a++) {
			data1 = data1 + a;
			if (data1 > 3000) {
				break;
			}
		}
		System.out.println(data1);

	}
}
