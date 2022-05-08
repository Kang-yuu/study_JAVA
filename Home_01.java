package home00;

import java.util.Scanner;

public class Home_01 {
	
	/*
	 *과제 : 사용자가 입력한 숫자를 사칙연산해준다
	 *
	 *딱히 어렵거나 하지는 않았음 
	 *숫자 입력하세요 다음에 입력코드 넣는걸 헷갈렸음.
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------<계산기>-------");
		
		System.out.println("두 수를 사칙연산하는 프로그램입니다.");
		
		System.out.println("첫번째 숫자를 입력하세요>>");
		
		int data1 = sc.nextInt();//사용자가 입력
		
		System.out.println("두번째 숫자를 입력하세요>>");
		
		int data2 = sc.nextInt();//사용자가 입력
		
		
		int result = data1+data2;
		int result1 = data1-data2;
		int result2 = data1*data2;
		int result3 = data1/data2;
		
		
		System.out.printf("%d + %d = %d\n",data1,data2,result);
		System.out.printf("%d - %d = %d\n",data1,data2,result1);
		System.out.printf("%d * %d = %d\n",data1,data2,result2);
		System.out.printf("%d / %d = %d\n",data1,data2,result3);
		
		
		
	}

}
