package practice.submult01;

import java.util.ArrayList;
import java.util.Collections;
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
		for(int i=0; i<lotto.size(); i++) {
			for(int j=5; j>i; j--) {
				if (lotto.get(i) == lotto.get(j)){
					System.out.println("엿");
					lotto.set(j, rd.nextInt(45)+1);
					for(int x=0; x<lotto.size(); x++) {
						for(int y=5; y>x; y--) {
							if (lotto.get(i) == lotto.get(j)){
								System.out.println("엿");
								lotto.set(j, rd.nextInt(45)+1);
							
						}
					}
					}
						}
						
				
			}
		}
		Collections.sort(lotto);
		
		
	
			return lotto;
	}
	


}
