package home00;

import java.util.Scanner;

public class Home_04 {
	
	/*
	 *100점에 주의하세요
	 *스위치는 참일경우 끝까지 다 출력되니 브레이크를 걸자구요!
	 */
	 
	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수을 입력하세요>>>");
		
		int data1 = sc.nextInt();
		
		System.out.println(data1);
						
        switch(data1/10) {
        case 10 :
        case 9 : System.out.println("A학점입니다.");
        	break;
        case 8 : System.out.println("B학점입니다.");
        	break;
        case 7 : System.out.println("C학점입니다.");
        	break;
        case 6 : System.out.println("D학점입니다.");
        	break;
        default : System.out.println("F학점입니다.");
        	break;
        }
        
        	
        
    }

}
