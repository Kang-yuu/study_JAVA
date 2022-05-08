package home00;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Home_08 {

	public static void main(String[] args) {

		System.out.println("C배열이 차례대로 넣겠습니다.");

		int[] a = { 1, 2, 3, 4, 5 };

		int[] b = { 10, 9, 8, 7, 6 };

		int[] c = new int[10];

		System.out.println("순서대로");
		for (int i = 0; i < a.length; i++) {
			c[i] = a[i];
		}

		System.out.println(Arrays.toString(c));

		System.out.println("역순으로");

		for (int i = 0, j = 4; i < b.length; i++, j--) {
			c[i + 5] = b[j];

		}

		// 하기처럼 해도 되지만 위처럼 하면 깔끔한듯....
//		int j = 4;
//		for(int i = 0; i < b.length; i++) {
//			c[i+5] = b[j];
//			j--;
//		}

		System.out.println(Arrays.toString(c));

	}

}
