package practice.submult01;

import java.util.Scanner;

public class result03 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요");
		int kor = scanner.nextInt();
		System.out.println("영어 점수를 입력해주세요");
		int eng = scanner.nextInt();
		System.out.println("수학 점수를 입력해주세요");
		int math = scanner.nextInt();

		double sum = (kor + eng + math) / 3.0;
		System.out.println("평균:" + sum);

		if (sum >= 90) {
			System.out.println("등급: A등급");
		} else if (sum >= 80) {
			System.out.println("등급: B등급");
		} else if (sum >= 70) {
			System.out.println("등급: C등급");
		} else {
			System.out.println("등급: D등급");
		}

		int sum1 = 1;
		for (int i = 10; i >= 1; i--) {
			sum1 *= i;
			
		}
		System.out.println("결과:" + sum1);

		long sum2 = 1;
		for (int i = 15; i >= 1; i--) {
			sum2 *= i;

		}
		System.out.println("결과:" + sum2);

		
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		sum1=findWally.length();
		sum2=findWally.replace("월리","1").length();
		System.out.println(sum1-sum2);
		

		String star = "******";
		for (int i = 0; i <= 4; i++) {
			System.out.println(star.substring(i,star.length()-1));
		}
	}
}


