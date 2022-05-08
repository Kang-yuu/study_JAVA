package home00;

import java.util.Arrays;
import java.util.Scanner;

public class Home_13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("입력받아서 좌석예매, 예약완료, 이미예약, 매진");

		int[] movie = new int[10];

		int count = 0;

		while (true) {

			System.out.println("예약할 자리번호를 입력하세요 (1~10)");

			int sit = sc.nextInt();

			if (movie[sit - 1] == 0) {

				movie[sit - 1] = 1;
				System.out.println(sit + "번자리가 예약되었습니다.\n");

				count++; // 자리 예약이 되면 카운트를 한다

				if (count >= movie.length) {
					System.out.println(Arrays.toString(movie));
					System.out.println("매진입니다.");
					break; // 매진이 되면 반복문을 끝낸다
				}
			} else if (movie[sit - 1] == 1) {
				System.out.println("이미 예약되었습니다. 다른자리를 입력하세요.\n");
			}

		}

	}

}
