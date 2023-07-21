package ch06_Method;



/**
 * @프로젝트 : JavaStudy
 * @작성일  : 2023. 7. 21.
 * @작성자  : SA
 */
public class MethodMain {

	private static final String Public = null;

	public static void main(String[] args) {
		//method(메소드) 클래스에 종속된 함수.
		// java 는 모두 class에 작성되기 때문에 사용되는 함수를 메소드라고 부름.
		// function 은 클래스에 독립적인 함수
		// 1 ~ 100까지 더하면 결과는?
		//1 ~ 50 까지 더 하면 결과는?
		//1 ~25까지 더하면 결과는?
		//30 ~ 60 까지 더하면?
		int sum = 0;
	
		for(int i=1; i <=100; i++) {
			sum +=i;
			
		}
		System.out.println(sum);
		returnSum(1, 100);
		returnSum(1, 50);
		returnSum(30, 60);
		int hap =returnSum(1, 100);
		System.out.println("리턴 받음 " + hap);
		System.out.println(returnSum(30, 50));
		MakeTree(5);
		
		
		print(MyAbs(-10));
		
		
		
		
		
	}
	// 메소드 생성
	//[접근제어자 static] 리턴타입 메소드명(피라미터){
	public static int returnSum(int from, int to) {
		int sum=0;
		for(int i = from; i<= to; i++) {
			sum +=i;
		}
		return sum;
	}
	
	public static void MakeTree(int num) {
		for(int i=1; i<=num; i++){
			for(int j=0; j<(num-i); j++) {
				System.out.print(" ");
			}
			for(int j=0; j<(2*i-1);j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for(int i=num; i>=1; i--) {
			for(int j=1; j<=(2*i)-1;j++) {
				System.out.print("*");
			}System.out.println();
			for(int j=0; j<num-i; j++) {
				System.out.print(" ");
			}
			
			}
		
	
		
		
		
	}
	public static void print(int msg) {
		System.out.println(msg);
	}
	public static void print(String msg) {
		System.out.println(msg);
	}
	public static int MyAbs(int num) {
		if(num <0) {
			num *=1;
		}
		return num;
	}
	
	

}
