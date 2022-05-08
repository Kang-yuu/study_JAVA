package home00;

public class Home_11 {

	public static void main(String[] args) {

		System.out.println("배열에서 최대값 최소값 구하기");

		int max = -1;
		int min = 100;

		int[] array = { 11, 2, 3, 4, 5, 6, 7, 0, 9, 10 };

		System.out.println("최대값구하기");

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) { // max랑 비교하는거니까 배열 길이만큼 돌려도 됨.
				max = array[i];
			}
		}
		System.out.println("최대값은 " + max + " 입니다.");

		System.out.println("최소값구하기");

		for (int i = 0; i < array.length; i++) {
			if (array[i] < min) {
				min = array[i];
			}
		}

		System.out.println("최소값은 " + min + " 입니다.");

	}

}
