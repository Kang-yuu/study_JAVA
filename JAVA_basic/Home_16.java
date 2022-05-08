package home00;

import java.util.Scanner;

public class Home_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("어떤도형의 넓이을 구하시겠어요?");
		System.out.println("1) 직각삼각형 2) 직사각형");

		int triangle1 = 0;
		int triangle2 = 0;
		int quadrangle1 = 0;
		int quadrangle2 = 0;

		if (sc.nextInt() == 1) {

			System.out.println("1) 직각삼각형의 넓이을 구합니다.");
			System.out.println("높이를 입력하세요.");
			triangle1 = sc.nextInt();
			System.out.println("밑변을 입력하세요.");
			triangle2 = sc.nextInt();

			System.out.println("직각삼각형의 넓이는 " + triangle(triangle1, triangle2) + "입니다.");

		} else if (sc.nextInt() == 2) {
			System.out.println("2) 직사각형의 넓이을 구합니다.");
			System.out.println("가로를 입력하세요.");
			quadrangle1 = sc.nextInt();
			System.out.println("세로을 입력하세요.");
			quadrangle2 = sc.nextInt();

			System.out.println("직사각형의 넓이는 " + quadrangle(quadrangle1, quadrangle2) + "입니다.");

		} else {
			System.out.println("1과 2사이에서 입력하세요.");
		}

	}

	public static int triangle(int a, int b) {

		int result = a * b / 2;

		return result;
	}

	public static int quadrangle(int a, int b) {
		int result = a * b;

		return result;

	}

}
