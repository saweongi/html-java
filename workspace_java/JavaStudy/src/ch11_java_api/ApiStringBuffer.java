package ch11_java_api;

public class ApiStringBuffer {

	public static void main(String[] args) {
	String a ="길동";
	System.out.println(a.hashCode());
	a = "팽수"; //동일한 a변수이지만 String 은 불변이기 때문에 주소가 다름
	System.out.println(a.hashCode());
	
	//String은 불변객체 (immutable object)
	//String을 계쏙 수정하게되면
	//힙 메모리 영역에 매번 새로운 String 객체가 만들어지고
	// 그로인해 가비지 컬렉터(메모리 관리자)가 할 일이 많아짐.(비효율적)
	
	// StringBuffer는 버퍼 공간을 가지고 문자열을 변경, 조작할 수 있는 기능제공  --> 한 공간을 사용하게해줌 원래는 그냥 문자열을 고치면 공간이 계속 생성되는것을 보안함
	
	StringBuffer strBuffer = new StringBuffer();
	System.out.println(strBuffer);
	
	//문자열 추가
	strBuffer.append("hi");
	System.out.println(strBuffer);
	strBuffer.append(" hello");
	
	
	//가진 문자열을 꺼내오기
	String str = strBuffer.toString();
	System.out.println(str);

	}

}
