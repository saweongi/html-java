package practice.submult01;

import java.util.Arrays;

public class result06 {
	public static void main(String[] args) {
		names("사원기","010-2918-7547","wwdnjsrl2@naver.com");

	String[] nameList = {"김규영", "김동현", "김상준", "김성운", "김세준", "노윤기",
							 "박근혜", "사원기", "송현지", "신가희", "예준서", "윤가영",
							 "윤서준", "이규환", "이상희", "이영규", "이재우", "이호제",
							 "임지윤", "정민형", "조하은", "최민혁", "최성웅" };
	SearchName('이', nameList);
	
	int[] intArr = {23, 456, 213, 32, 464, 1, 2,4};
	
	MinMax(intArr);
	
	}
		
	
	

	
	public static void names(String name,String phone, String email  ) {
		
		System.out.println("==============");
		System.out.println("이름 :"+name);
		System.out.println("연락처 :"+phone);
		System.out.println("이메일 :"+email);
		System.out.println("==============");
		return ;
	
	
	
	
	
	}
	public static void SearchName(char sung, String[] names)
	{	int count =0;
		String name ="";
		for(int i=0; i<names.length;i++) {
			
			String name_Sung = names[i];
			char s;
			
			
			
			s=name_Sung.charAt(0);
			if(s == sung) {
				count +=1;
				
				 name +=name_Sung;
				 
			
				
				
			}
			
			
			
		}
		System.out.println(sung+"씨 성을 가진 동기분이 총"+count+"명 있습니다. \n"+name);
		
	
	return ;
	

}
public static void MinMax(int[] intArr) {
	Arrays.sort(intArr);
	int max=intArr.length;
	System.out.println("최댓값: "+intArr[max-1]);
	System.out.println("최솟값: "+intArr[0]);
}
	
	
	
	
	
	
	
}