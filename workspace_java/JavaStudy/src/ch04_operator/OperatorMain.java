package ch04_operator;

import java.util.Scanner;

public class OperatorMain {

	public static void main(String[] args) {

		int num = 10;
		System.out.println(num);
		num++;
		System.out.println(num);
		num--;
		System.out.println(num);
		++num;
		System.out.println(num);
		--num;
		System.out.println(num);
		++num;

		int a, b;
		a = num++;
		b = ++num;
		System.out.printf("a: %d 는 할당후 증가, b: %d 는 증가후 할당.", a, b);
		// 앞에 증감연산자가 있으면 수를 증가시키고 할당해주고
		// 뒤에 증감연산자가 있으면 할당을 시키고 수를 증가시켜준다

		System.out.println("\n======================== 대입 연산자========================\n");
		num = 10;
		num += 1;
		System.out.println(num);
		num -= 2;
		System.out.println(num);
		num *= 2;
		System.out.println(num);
		num /= 2;
		System.out.println(num);
		num %= 2;
		System.out.println(num);

		System.out.println("\n======================== 산술 연산자========================\n");

		int numA = 10;
		int numB = 3;
		numA = numA + 1;
		System.out.println(numA);
		System.out.printf("numA:%d numB:%d \n", numA, numB);
		System.out.println("더하기 :" + (numA + numB));
		System.out.println("빼기 :" + (numA - numB));
		System.out.println("곱하기 :" + (numA * numB));
		System.out.println("나누기 :" + (numA / numB));
		System.out.println("나머지 :" + (numA % numB));

		System.out.println("\n======================== 비교 연산자========================\n");
		
		int numFive = 15;
		double pi =3.14;
		int numOne = 1;
		System.out.println(numFive > numOne);
		boolean result = numFive < numOne;
		System.out.println(result);
		
		System.out.println(numFive != pi);
		System.out.println(numFive == 5);
		
		System.out.println("가 < 나");
		System.out.println('가' < '나');
		
		String stuA = "김길동";
		String stuB = "홍길동";
		System.out.println("김 > 홍");
		System.out.println(stuA.charAt(0)> stuB.charAt(0));
		
		String ship = "배"; //상수 영역에 저장
		String pear = "배";
		String bae = new String("배"); //힙 영역에 저장
		System.out.println(ship == pear);
		System.out.println(ship == bae);
		System.out.println(ship.equals(bae));
		
		String serverDataString = null;
		System.out.println(serverDataString != null);
		
		String inputData="";
		System.out.println(inputData == null);
		System.out.println(inputData.equals(""));
		System.out.println(inputData.length() == 0);
		System.out.println(inputData.isEmpty());
		
		System.out.println("\n======================== 삼항 연산자========================\n");
		String inputId ="nick1234";
		
		String check = (inputId.length() >= 7) ? ("통과") : ("재입력");
		System.out.println(check);
		
		int score =76;
		String grade = (score > 90) ? ("A") : (score > 80) ? ("B"): ("C");
		System.out.println(grade);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("======나이를 입력해주세요========\n");
		int age = Integer.parseInt(scan.nextLine());
		
		String s = (age >= 20) ? (age +"살 입니다.") : (age +"살 입장불가입니다"); 
		
		System.out.println(s);
		
		
		
		System.out.println("\n======================== 논리 연산자========================\n");
		
		int inputAge = 24;
		String inputPhone ="01096101000";
		System.out.println(inputAge >=14);
		System.out.println(inputPhone.length()==11);
		System.out.println(inputAge >=14&& inputPhone.length()==11);
		
		String name = scan.nextLine();
		int a2 = name.length();
		String s2 = (a2 >= 8 && a2<=14) ? ("사용가능한 아이디입니다"):("8~14자리로 입력해주세요");
		System.out.println(s2);
		
		
		
		
		
		
		scan.close();
		
	}

}
