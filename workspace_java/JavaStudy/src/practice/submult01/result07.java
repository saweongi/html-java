package practice.submult01;

import java.util.ArrayList;
import java.util.Random;

public class result07 {

	public static void main(String[] args) {
		
	ArrayList<Integer> weekLotto = null;

	weekLotto = makeLotto();
	System.out.println(weekLotto);
	}
	
	public static ArrayList<Integer> makeLotto() {
		Random rd = new Random();
		int n = 0;
		ArrayList<Integer>lotto = new ArrayList<Integer>();
		for(int i=0; i<6; i++){
			
			 lotto.add(rd.nextInt(45)+1);
		}
	
			
		
		
		
		
		
		return lotto;
	}
	


}
