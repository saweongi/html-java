package ch05_control;
import java.util.Scanner;
public class ch05_Ex02 {

	public static void main(String[] args) {
		int salePrice = 0;
		Scanner scanner =new Scanner(System.in);
		System.out.println("메뉴를 입력해주세요");
		String menu = scanner.nextLine();
		
		switch (menu) {
		case "아아":
		case "아이스아메리카노": {
			salePrice = 3000;
			System.out.println(menu +salePrice+"원 입니다.");
			break;
		}
			
		case "라떼": {
	salePrice = 4500;
	System.out.println(menu +salePrice+"원 입니다.");
	break;
}
	case "에스프레소": {
	salePrice = 2400;
	System.out.println(menu +salePrice+"원 입니다.");
	break;
}
		default:
			System.out.println(menu+"는 저희 메뉴는 매장에 없습니다.");
		}

	}

}
