package ch05_control;


import java.util.Scanner;

public class LoopWhile {
	public static void main(String[] args) {
//		int i = 1;
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
//
//		}
//		int j = 1;
//		while (true) {
//			System.out.println(j);
//			j++;
//			if (j == 10) {
//				break;
//			}
//
//		}
//		boolean flag = true;
//		while (flag) {
//			j++;
//			if (j == 20) {
//				flag = false;
//			}
//		}
//
//		Scanner scanner = new Scanner(System.in);
//		boolean isRun = true;
//		while (isRun) {
//			System.out.println("이름을 입력하세요(종료 q or Q");
//			System.out.println(">>>");
//			String input = scanner.nextLine();
//			if (input.equals("q") || input.equals("Q")) {
//				isRun = false;
//				System.out.println("종료 하겠습니다.");
//			} else {
//				System.out.println(input + "님 환영합니다.^^");
//
//			}
//			System.out.println("===========================");
//
//		}
		int dan = 2;
		while (dan <= 9) {
			int su = 1;
			System.out.println(dan + "단");
			while (su <= 9) {
				System.out.printf("%d x %d = %d \n", dan, su, (dan * su));
				su++;

			}
			dan++;
		}
		
		out1 : for(int i=0; i< 5; i++) {
			out2 : for(int j=0; j< 5; j++) {
				out3 : for(int k=0; k< 5; k++) {
					if( i * j * k > 10) {
						break out2;
					}
					System.out.println(i + " " +j+ " "+k);
				}	
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
