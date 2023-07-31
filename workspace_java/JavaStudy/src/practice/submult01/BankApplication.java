package practice.submult01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
	String[] account = new String[2];
	String plus= "";


	while(true) {
	System.out.println("----------------------------------------");
	System.out.println("1.계좌생성 |" +" 2.계좌생성 |"+" 3.예금 |"+" 4.출금 |"+"5.종료 |");
	System.out.println("----------------------------------------");
	System.out.print("선택>");
	Scanner scanner = new Scanner(System.in);
	String sc = scanner.nextLine();
	
	
	if(sc.equals("1")){
		System.out.println("-------------");
		System.out.println("계좌생성");
		System.out.println("-------------");
		System.out.print("계좌번호: ");
		String saccount= scanner.nextLine();
		System.out.print("계좌주: ");
		String sname =scanner.nextLine();
		System.out.print("초기입금액: ");
		String sfirst_Money = scanner.nextLine();
		Account customer = new Account(saccount,sname,sfirst_Money);
		plus= customer.account_Member + "   "+ customer.name+ "   " +customer.first_Money;
		for(int i=0; i<account.length;i++) {
			if(account[i] == null) {
			account[i] =plus;
			break;
			}
			
		}
	
		System.out.println("결과: 계좌가 생성되었습니다.");
	
	}else if(sc.equals("2")){
		System.out.println("-------------");
		System.out.println("계좌 목록");
		System.out.println("-------------");
		for(int i=0; i<account.length;i++) {
			if(account[i] != null) {
				System.out.println(account[i]);
			}
		}

	
		
	
		
		
	
		
	}else if(sc.equals("3")){
		System.out.println("-------------");
		System.out.println("예금");
		System.out.println("-------------");
		System.out.print("계좌번호: ");
		String saccount= scanner.nextLine();
		System.out.print("예금액:");
		int money =Integer.parseInt(scanner.nextLine());
		for(int i=0; i<account.length;i++) {
			if(account[i] != null) {
			
			if(account[i].contains(saccount)){
				int moneys=Integer.parseInt(account[i].substring(11).trim());
				int sum =moneys+money;
				String  sumstring=  account[i].substring(0,12);
				account[i] = sumstring+sum;
				System.out.println("예금후 잔액: "+sum);
			}
			}
		}
		
	}else if(sc.equals("4")){
		System.out.println("-------------");
		System.out.println("출금");
		System.out.println("-------------");
		System.out.print("계좌번호: ");
		String saccount= scanner.nextLine();
		System.out.print("출금액:");
		int money =Integer.parseInt(scanner.nextLine());
		for(int i=0; i<account.length;i++) {
			
			if(account[i] != null) {
			if(account[i].contains(saccount)){
				int moneys=Integer.parseInt(account[i].substring(11).trim());
				int sum =moneys-money;
				String  sumstring=  account[i].substring(0,12);
				account[i] = sumstring+sum;
				System.out.print("출금후 잔액: "+sum);
			}
		}
		}
		System.out.println("결과: 출금이 성공되었습니다.");
	}else {
		System.out.println("프로그램 종료");
		break;
		
	}

	}
	}
	}
	
