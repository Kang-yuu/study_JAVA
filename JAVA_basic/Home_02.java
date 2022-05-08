package home00;

import java.util.Scanner;

public class Home_02 {

	/*
	 * 과제 : 입력한 숫자가 0인지 짝수인지 홀수인지 나타냅니다.
	 * 
	 * 음..0을 먼저 넣는걸 까먹어서 0을 넣었더니 짝수라고 나오는 오류가 나왔음.
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("숫자를 입력하세요>>>");

		int data1 = sc.nextInt();

		if (data1 == 0) {
			System.out.println("0입니다.");
		} else if (data1 % 2 == 0) {
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}

	}

}
