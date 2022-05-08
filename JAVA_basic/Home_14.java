package home00;

public class Home_14 {

	public static void main(String[] args) {

		int[] scores = { 83, 54, 62, 92, 49, 58, 77, 85, 36, 100 };

		System.out.println("점수대별 개수 구하기");

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int f = 0;

		for (int i = 0; i < scores.length; i++) {
			switch (scores[i] / 10) {
			case 10:
				a++; // 또는 case10에 아무것도 안적어도 됨
				break; // 물론 브레이드 안 걺 알아서 9까지 내려오니까ㅇㅇ
			case 9:
				a++;
				break;
			case 8:
				b++;
				break;
			case 7:
				c++;
				break;
			case 6:
				d++;
				break;
			default:
				f++;
				break;
			}
		}

		System.out.println("90점이상 : " + a);
		System.out.println("80점이상 : " + b);
		System.out.println("70점이상 : " + c);
		System.out.println("60점이상 : " + d);
		System.out.println("60점미만 : " + f);

	}

}
