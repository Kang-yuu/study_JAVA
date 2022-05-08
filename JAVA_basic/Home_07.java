package home00;

import java.util.Arrays;
import java.util.Random;

public class home_07 {

	public static void main(String[] args) {

		System.out.println("배열에 1부터 10까지 들어가는 반복문");

		int[] array = new int[10];

		for (int i = 0; i < 10; i++) {// i를 10바퀴 돌릴거고 돌릴때마다 1씩 커질거에요
			array[i] = i + 1;
		}

		System.out.println(Arrays.toString(array));

		System.out.println("주사위를 100번 굴릴때 나온 각 눈의 횟수 출력");

		Random rd = new Random();

		int[] dicecount = new int[6];// 주사위를 담을 공간을 맹글었다!

		for (int i = 0; i < 100; i++) {
			int dice = rd.nextInt(6) + 1;// rd.nextInt(6)라면 0~5까지 나옴
			dicecount[dice - 1]++;// !해당조건이되면하나씩카운트할때!
		}

		for (int j = 0; j < 6; j++) {
			System.out.println(j + 1 + "나온횟수" + dicecount[j]);
		}

	}
}
