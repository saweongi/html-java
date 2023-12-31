package ch07_array;

import java.util.Arrays;

public class ArrayMain {

	public static void main(String[] args) {
		String samjang = "삼장";
		String woogong = "오공";
		String saojeong = "사오정";
		String palgye = "저팔계";

		String[] seougi = new String[4];
		System.out.println(seougi.length);
		System.out.println(seougi[0]);
		int[] numbers = new int[3];
		System.out.println(numbers[0]);
		boolean[] bools = new boolean[5];
		System.out.println(bools[0]);

		seougi[0] = samjang;
		System.out.println(seougi[0]);
		seougi[1] = woogong;
		seougi[2] = saojeong;
		seougi[3] = palgye;
		System.out.println(seougi);

		printArr(seougi);
		for (int i = 0; i < seougi.length; i++) {
			seougi[i] = "서유기 " + seougi[i];

		}
		printArr(seougi);

		for (int i = 0; i < seougi.length; i++) {
			if (seougi[i].contains("오공")) {
				seougi[i] = seougi[i].replace("서유기", "드래곤볼");
			}
		}
		printArr(seougi);
		String[] student = { "팽수", "길동", "동길", "길수" };
		printArr(student);
		String subjects = "자바, SQL, 화면구현, JSP";
		String[] subArr = subjects.split(",");
		printArr(subArr);
		for (int i = 0; i < subArr.length; i++) {
			subArr[i] = subArr[i].trim();
		}
		printArr(subArr);
		String[] sinSeoyugi = seougi;
		printArr(sinSeoyugi);
		sinSeoyugi[0] = "강호동";
		sinSeoyugi[1] = "이수근";
		printArr(sinSeoyugi);
		printArr(seougi);
		System.out.println(sinSeoyugi);
		System.out.println(seougi);
		System.out.println(sinSeoyugi.hashCode());
		System.out.println(seougi.hashCode());
		String[] newSeoyugi = seougi.clone();
		newSeoyugi[2] = "은지원";
		printArr(newSeoyugi);
		printArr(seougi);

		String[] copy = new String[seougi.length]; // clone 까먹었을때 사용하는방법
		for (int i = 0; i < seougi.length; i++) {
			copy[i] = seougi[i];
		}
		System.out.println(seougi);
		System.out.println(copy);

		int[] numArr = { 23, 456, 213, 32, 464, 1, 2 };
		printArr(numArr);
		Arrays.sort(numArr);
		printArr(numArr);
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = numArr[i] * -1;
		}
		Arrays.sort(numArr);
		for (int i = 0; i < numArr.length; i++) {
			numArr[i] = numArr[i] * -1;
		}
		printArr(numArr);
		
		//버블정렬
		for(int k =0; k <numArr.length-1; k++) {
			for(int i =0; i < numArr.length-1; i++) {
				// i> i+1 하면 오름차순
				// i< i+1하면 내림차순
				if(numArr[i] > numArr[i +1]) {
					int t = numArr[i];
					numArr[i]=numArr[i+1];
					numArr[i+1] = t;
				}
			}
		}
		printArr(numArr);
	}

	public static void printArr(String[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			if (i == strArr.length - 1) {
				System.out.println(strArr[i]);
				break;
			}
			System.out.print(strArr[i] + ",");
		}
	}

	public static void printArr(int[] strArr) {
		for (int i = 0; i < strArr.length; i++) {
			if (i == strArr.length - 1) {
				System.out.println(strArr[i]);
				break;
			}
			System.out.print(strArr[i] + ",");
		}
	}

}
