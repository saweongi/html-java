package practice.submult01.cafe1;

import java.util.Scanner;

public class CafeMain1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cafe1 starBucks = new Cafe1("스타벅스", "starbuks");
		starBucks.addCoffee(new Coffee1("1.아메리카노", 5000));
		starBucks.addCoffee(new Coffee1("2.카푸치노", 6000));
		starBucks.addCoffee(new Coffee1("3.오곡라떼", 7000));
		
		
		Cafe1 aKaCafe = new Cafe1("아카", "Aka");
		aKaCafe.addCoffee(new Coffee1("1.아메리카노", 2500));
		aKaCafe.addCoffee(new Coffee1("2.바닐라라떼", 3000));
		aKaCafe.addCoffee(new Coffee1("3.아이스티", 3500));
		int choice;
		boolean flag = true;
		while(flag) {
			System.out.println("1.스타벅스 방문|2. 아카 방문 |3.사무실");
			choice =scanner.nextInt();
			switch(choice) {
			case 1:
				starBucks.ShowMenu();
				
				Scanner coffeChoicel = new Scanner(System.in);
		
				starBucks.buyCoffee(coffeChoicel);
				break;
				
			case 2:
				aKaCafe.ShowMenu();
				
				Scanner coffeChoicel2 =  new Scanner(System.in);
				
				aKaCafe.buyCoffee(coffeChoicel2);
				break;	
			
			case 3:
				System.out.println("사무실로 복귀합니다....");
				break;
		}
	}
	}
}
