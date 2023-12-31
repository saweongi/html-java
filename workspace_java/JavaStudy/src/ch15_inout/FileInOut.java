package ch15_inout;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInOut { //파일 생성동시에 내용쓰기
	public static void main(String[] args) {
		
		String path = System.getProperty("user.dir");
		String fileNm = "delay.txt";
		
		File textFile =new File(path + "/" + fileNm);
		//File textFile =new File(path +System.lineSeparator() + fileNm); // system.lineSeparator()는 각자 운영체제에 맞는 경로를 하게해줌.
		try {
		FileOutputStream fos = new FileOutputStream(textFile,true); 
		fos.write("팽수 늦음\n".getBytes()); //내용쓰기
		fos.write("동길 늦음\n".getBytes()); //내용쓰기
	} catch(FileNotFoundException e) {
		e.printStackTrace();
		
	}catch(IOException e) {
		e.printStackTrace();
	}
	
	
 //파일 읽기
	try { 
		 
	FileInputStream fis = new FileInputStream(textFile); 
	byte[] data = new byte[fis.available()]; //파일을 바이트단위로 가져오기
	while(true) {
		int x = fis.read(data);
		if(x == -1) {
			break; // 파일을 끝까지 읽었다는 뜻
		}
		String result = new String(data);
		System.out.println(result);
	
	}
	}catch(FileNotFoundException e) {
		e.printStackTrace();
		
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
}
	
