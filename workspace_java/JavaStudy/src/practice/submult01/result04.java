package practice.submult01;

import java.io.InterruptedIOException;
import java.util.Scanner;



public class result04 {

	public static void main(String[] args) {
	
		int qwe = 5834;
		int q = 5834/360;
		int qw = 5834%360;
		if (qw<60) {
			System.out.println("사탕");
			System.out.println(q);
		}else if(qw<120) {
			System.out.println("초콜릿");
			System.out.println(q);
		}else if(qw<180) {
			System.out.println("쿠키");
			System.out.println(q);
		}else if(qw<240) {
			System.out.println("콜라");
			System.out.println(q);
	}else if(qw<300) {
		System.out.println("아이스크림");
		System.out.println(q);
}else {
	System.out.println("커피");
	System.out.println(q);
	}
		
Scanner scanner = new Scanner(System.in);
String s = scanner.nextLine();
String sum="";
int s1=s.length();
for(int i=1;i<s.length()+1; i++) {
char s2 =s.charAt(s1-i);
	sum +=String.valueOf(s2);
}
		System.out.println(sum);


		for(int i=1; i<=5; i++){
			for(int j=0; j<(5-i); j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println("\n");
			
		}
		
		for(int i=5; i>=1; i--) {
			for(int j=1; j<=(2*i)-1;j++) {
				System.out.print("*");
			}System.out.println("\n");
			for(int j=0; j<6-i; j++) {
				System.out.print(" ");
			}
			
			}

	
	
		}
	}
