package home00;

import java.util.Scanner;

public class Home_03 {

	/*
	 * 사용자가 입력한 숫자가 양수인지 음수인지 출력한다.
	 */

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요>>>");

		int data1 = sc.nextInt();

		System.out.println(data1);

		if (data1 > 0) {
			System.out.println("양수입니다.");
		} else if (data1 < 0) {
			System.out.println("음수입니다.");

		} else {
			System.out.println("0입니다.");
		}

	}

}
