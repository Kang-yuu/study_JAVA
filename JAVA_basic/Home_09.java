package home00;

public class Home_09 {

	public static void main(String[] args) {

		System.out.println("0 외계인 1 사람 각각 몇명인가요");
		int[] a = { 1, 1, 0, 1, 0, 0, 1, 0, 0, 1 };

		int one = 0;
		int zero = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] == 1) {
				one++;
			} else if (a[i] == 0) {
				zero++;
			}
		}
		System.out.println("사람은" + one + "명");
		System.out.println("외계인은" + zero + "명");

		System.out.println("3번째 사람이 앉아있는 자리(배열)");
		int[] b = { 1, 0, 0, 1, 0, 0, 1, 1, 0, 1 };

		int man = 0;

		for (int i = 0; i < b.length; i++) {
			if (b[i] == 1) { // 사람이면
				man++; // 숫자를 카운트
				if (man == 3) {// 숫자를 세다가 사람수가 내가 알고싶은 숫자가 되면..
					// 여기를 변수로 만들어도 if(c == sit) 이렇게.
					System.out.println("자리는" + (i + 1) + "번 자리입니다.");
				}
			}

		}

	}
}
