package practice.submult01;

import java.util.Random;
import java.util.Scanner;



public class result05 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		//		Random random = new Random();
//		int randoms = random.nextInt(51);
//			int i =5;
//			while(i>0) {
//			
//			
//			System.out.println("숫자를 입력해주세요 :");
//			int qwer = Integer.parseInt(scanner.nextLine());
//			if(i==1) {
//				System.out.println("실패하였습니다. 정답은"+randoms+"입니다.");
//				i=0;
//			}
//				else if(qwer<randoms) {
//				i--;
//				System.out.println("업!! 기회가"+i+" 남았습니다.");
//			}else if(qwer>randoms) {
//				i--;
//				System.out.println("다운!! 기회가" +i+" 남았습니다.");
//				
//			}
//			else {
//			System.out.println("정답입니다.");
//			i=0;
//		}
//		
//		
//			}
	
		String q="";
		while(!q.equals("q")||!q.equals("exit")||!q.equals("Q")||!q.equals("")) {
			 
			System.out.println("============ 엘리베이터 ============");
			
			System.out.println("승강기 A의 현재 위치:");
			int a = Integer.parseInt(scanner.nextLine());
			System.out.println("승강기 B의 현재 위치:");
			int b = Integer.parseInt(scanner.nextLine());
			System.out.println("몇층에 계시나요?[종료는 q또는 exit]:");
			
			 q = scanner.nextLine();
			 if(q.equals("q")) {
				 
			 }
			 
			 int q1 = Integer.parseInt(q);
			
			
			 int sum = Math.abs(a-q1);
			 int sum1 = Math.abs(b-q1);
			 
			 if(sum < sum1) {
				a = q1;
				System.out.println("엘리베이터 A가 " +a+"층으로 이동하였습니다.");
			 }else if(sum > sum1) {
				 b = q1;
				 System.out.println("엘리베이터 B가 " +b+"층으로 이동하였습니다.");
			 }else {
				 if(a >b){
					 a = q1;
					 System.out.println("엘리베이터 A가 " +a+"층으로 이동하였습니다.");
				 }else {
					 b = q1;
					 System.out.println("엘리베이터 B가 " +b+"층으로 이동하였습니다.");
				 }
				
			 }
			 
		
		
		
		
		
		
		
		
		}
	}
}
		
	
	
