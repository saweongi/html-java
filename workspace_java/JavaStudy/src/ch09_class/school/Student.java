package ch09_class.school;

import ch09_class.commons.UtilClass;

public class Student {
	private  String name;
	private  int kor;
	private  int eng;
	private  int math;
	private  double avg;
	
	
	// 2.생성자 만들기
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		setAvg();
	}
	public Student(String name, int kor, int eng, int math, double avg) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = avg;
		
	}
	
	//3.toString()추가 -->객체 필드를 꺼내와서 사용할때씀
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + "]";
	}
	
	//4. Getter and Setters..

	
	
	
	public static void main(String[] args) {
		

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
		setAvg();
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
		setAvg();
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
		setAvg();
	}

	private void setAvg() {
		//this.avg 동일함.
		avg = UtilClass.weRound((kor + eng + math)/3.0, 1);
	
	}
	public double getAvg() {
		return avg;
	}

	




	
	
	
	


}
