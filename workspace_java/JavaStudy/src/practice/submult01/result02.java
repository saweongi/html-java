package practice.submult01;

import java.util.Scanner;

public class result02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("이름을 입력해주세요:");
		String name = scan.nextLine();
		System.out.println("국어 점수를 입력해주세요:");
		int a = Integer.parseInt(scan.nextLine());
		System.out.println("영어 점수를 입력해주세요:");
		int b = Integer.parseInt(scan.nextLine());
		System.out.println("수학 점수를 입력해주세요:");
		int c = Integer.parseInt(scan.nextLine());
		
		System.out.println("====================");
		System.out.println("이름:" +name);
		System.out.println("국어:" +a);
		System.out.println("영어:" +b);
		System.out.println("수학:" +c);
		System.out.println("평균:"+(a+b+c)/3f);
	
		
	String idBack ="1231476";
	char idBack1= idBack.charAt(0);
	String s = (idBack1 == '1' || idBack1 == '3'||idBack1 == '9')? ("남자"):("여자");
	System.out.println(s);
		
		
		
		
		
		
		
		
		
		
		scan.close();
	}

}
