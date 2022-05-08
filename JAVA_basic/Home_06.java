package home00;

public class Home_06 {

	public static void main(String[] args) {

		System.out.println("구구단 2단");

		int n1 = 1;

		while (n1 < 10) {
			System.out.println("2 * " + n1 + " = " + 2 * n1);
			n1++;
		}

		System.out.println("2단부터 9단까지");

		int n2 = 1; // 곱하는 수
		int num2 = 2; // 단수 2단부터 필요하기때문에.

		while (num2 < 10) {
			System.out.println(num2 + "단");
			n2 = 1;
			while (n2 < 10) {
				System.out.println(num2 + " * " + n2 + " = " + num2 * n2);
				n2++;
			}
			num2++;
		}

		System.out.println("for문으로 구구단을 출력해보게씁니다!");

		for (int dan = 2; dan < 10; dan++) {
			System.out.println(dan + "단");
			for (int n3 = 1; n3 < 10; n3++) {
				System.out.println(dan + " * " + n3 + " = " + dan * n3);
			}
		}

	}

}
