package ch05_control;

public class Conditional {
	static String subject = "조건문";

	public static void main(String[] args) {

		int price = 30000;
		int myMoney = 10000;

		if (myMoney < price) {
			System.out.println(subject);
			System.out.println("돈이 부족합니다.");
		}
		String review = "음식이 맛있어요^^";
		String msg = "";
		if (review.length() < 12) {
			msg = "리뷰는 12자 이상 작성하세요!!";

		} else {
			msg = "통과";
		}

		System.out.println(msg);

		int score = 85;
		String grade = "";
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else {
			grade = "C";
		}
		System.out.println(grade);

		String name = "사원기";
		String phone = "01029187547";
		int age = 29;
		if (name.length() >= 1) {
			if (phone.length() == 10 || phone.length() == 11) {
				if (age >= 14) {

				} else {
					System.out.println("14살이상만 가입가능합니다");
				}
			} else {
				System.out.println("폰번호 10자리나 11자리 넣어주세요");
			}

		} else {
			System.out.println("한글자 이상 넣어주세요");
		}

	boolean isOkay = false;
	if (name.length() >= 1) {
		if (phone.length() == 10 || phone.length() == 11) {
			if (age >= 14) {
				isOkay =true;
			}
	if(isOkay == true) {
		System.out.println("회원가입 성공");
	}else {
		System.out.println("회원가입 실패");
	}
		
		
		
		
		}
	}
	int month = 3;
	
	switch(month){
	case 0:
		System.out.println("수강등록");
		break;
	case 1:
		System.out.println("프로그래밍 기초");
		break;
	case 2:
		System.out.println("DB");
		break;
	case 3:
		System.out.println("웹 프로그래밍");
		break;
	
	case 4:
	case 5:							//4또는 5일때 사용하는거
		System.out.println("머신러닝");
		break;
	default:
		System.out.println("프로젝트!!!");
	
	
	}
}
}

