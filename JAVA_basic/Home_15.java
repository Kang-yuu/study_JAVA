package home00;

public class Home_15 {

	public static void main(String[] args) {

		System.out.println("더하기함수, 빼기함수 만들기");

		int plus = plus(3, 4);// 이 부분을 변수로 만들어도 됨
		System.out.println(plus);

		int minus = minus(10, 3);
		System.out.println(minus);

	}

	public static int plus(int a, int b) {// void로는 안만들어짐..

		int result = a + b;

		return result;
	}

	public static int minus(int a, int b) {

		int result = a - b;

		return result;

	}

}
