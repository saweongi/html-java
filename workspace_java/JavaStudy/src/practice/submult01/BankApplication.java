package practice.submult01;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		
	System.out.println("----------------------------------------");
	System.out.println("1.계좌생성 |" +" 2.계좌생성 |"+" 3.예금 |"+" 4.출금 |"+"5.종료 |");
	System.out.println("----------------------------------------");
	System.out.print("선택>");
	Scanner scanner = new Scanner(System.in);
	String sc = scanner.nextLine();
	Account customer = new Account(sc, sc, 0);
	if(sc.equals("1")){
		System.out.println("-------------");
		System.out.println("계좌생성");
		System.out.println("-------------");
		
		System.out.print("계좌번호: ");
		String saccount = scanner.nextLine();
		System.out.print("계좌주: ");
		String sname =scanner.nextLine();
		System.out.print("초기입금액: ");
		String s = scanner.nextLine();
		int sfirst_Money =Integer.parseInt(s);

		
		System.out.println("결과: 계좌가 생성되었습니다.");
	
	}else if(sc.equals("2")){
		System.out.println("-------------");
		System.out.println("계좌 목록");
		System.out.println("-------------");
		customer.printAccount();
		
	}else if(sc.equals("3")){
		System.out.println("-------------");
		System.out.println("예금");
		System.out.println("-------------");
		
	}else if(sc.equals("4")){
		
	}else {
		
	}

	}

	
}