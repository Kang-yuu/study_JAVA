package home00;

import java.util.Arrays;

public class Home_12 {

	public static void main(String[] args) {

		System.out.println("순서가 없는 배열을 오름차순 또는 내림차순으로 조정");

		int[] array = { 11, 2, 17, 89, 5, 23, 7, 74, 9, 51 };

		System.out.println("배열 오름차순 정렬");

		int temp = 0;

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {// j가 1이 되어버리면 순서가 뒤섞임
				if (array[i] > array[j]) {// 앞에는 숫자가 작아야하니까 앞보다 작은게 나오면 앞으로 보냄
					temp = array[i]; // 앞자리를 비움
					array[i] = array[j];
					array[j] = temp;
				}

			}
		}

		System.out.println(Arrays.toString(array));

		System.out.println("배열 내림차순 정렬"); // 큰값이 앞으로

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] < array[j]) {// 앞에 숫자가 커야한다
					temp = array[i]; // 앞자리를 비움
					array[i] = array[j];
					array[j] = temp;
				}
			}

		}

		System.out.println(Arrays.toString(array));
	}
}