package practice.submult01.cafe;

import java.util.ArrayList;

public class Cafe {
	String name;
	ArrayList menuList=new ArrayList();

	public Cafe(String name){
		this.name =name;
	}
	
	public void showMenu() {
		if (this.name.equals("스타벅스")) {
		Coffee coffee = new Coffee("아메리카노",5000);
		Coffee coffee1 = new Coffee("카푸치노",6000);
		Coffee coffee2 = new Coffee("오곡라떼",7000);
		System.out.println("1. ["+coffee.name+": "+coffee.price+"]");
		System.out.println("2. ["+coffee1.name+": "+coffee1.price+"]");
		System.out.println("3. ["+coffee2.name+": "+coffee2.price+"]");
	}
		else if(this.name.equals("아카")) {
			Coffee coffee = new Coffee("아메리카노",2500);
			Coffee coffee1 = new Coffee("바닐라라떼",3000);
			Coffee coffee2 = new Coffee("아이스티",3500);
			System.out.println("1. ["+coffee.name+": "+coffee.price+"]");
			System.out.println("2. ["+coffee1.name+": "+coffee1.price+"]");
			System.out.println("3. ["+coffee2.name+": "+coffee2.price+"]");
		}
	}
	public void addCoffee() {
		
	}
	
	public Cafe(String name,ArrayList menList) {
		this.name =name;
		this.menuList =menuList;
	}
	public void buyCoffee() {
		
	}
}
