package ch05_control;

import java.util.Scanner;

public class LoopFor {
	public static void main(String[] args) throws InterruptedException {
//		System.out.println();

//		for (int i = 1; i < 11; i++) {
//			System.out.println(i);
//		}
//
//		int sum = 0;
//		for (int i = 1; i < 21; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//
//		int sum3 = 0;
//		for (int i = 1; i < 41; i++) {
//			if (i % 2 == 0) {
//				sum3 += i;
//			}
//		}
//		System.out.println(sum3);
//		
//		
//		Scanner scanner =new Scanner(System.in);
//		System.out.println("원하는 구구단을 수를 입력하세요.");
//		int e = scanner.nextInt();
//		int sum4 = 0;
//		
//		for (int i = 1; i < 10; i++) {
//			sum4 = e * i;
//			System.out.println(e + "x" + i + "=" + sum4);
//			
//		}
//		String star="";
//	
//		for (int i = 0; i < 6; i++) {
//		System.out.println(star +="*");
//		}
//		
//		for (int i =10; i >0; i--) {
//			System.out.println(i);
//		}
//		
//		for (int i =0; i<20; i++){
//			System.out.println("||||||||");
//			if(i==4|| i==9 ||i==14) { // if(i%5 ==4)
//				System.out.println("---------");
//			}
//		}
//		for (int i =0; i<30; i++){
//			
//			if( i % 2==0) {
//				System.out.println("///////");
//				if(i%6==5) {
//					System.out.println("---------");
//		  }
//			}else if(i %2==1) {
//				System.out.println("\\\\\\\\\\\\\\");
//				if(i%6==5) { 
//					System.out.println("---------");
//		  }
//			}
//			
//			Thread.sleep(400);
//			
//			
//		}
//		
//		//해당 숫자의 각자리의 수를 더한 값을 출력하시오.
//		int example = 478941533;
//		int result =0;
//		String strNum = example +"";
//		for(int i=0; i< strNum.length(); i++) {
//			result += Integer.parseInt(strNum.substring(i,i+1));
//			
//		}
//		System.out.println("각 자리를 더한 값:" + result);
//		
//		
		int sum = 0;
		for (int i = 1; i < 9999; i++) {
			sum += i;
			if (sum >= 100) {
				System.out.println("100 이상 되는 n:" + i);
				break;
			}
		}

		for (int i = 2; i < 10; i++) {
			if ((i == 5) || (i == 8)) {
				continue;
			}
			System.out.println(i + "단");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + i * j);

			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
