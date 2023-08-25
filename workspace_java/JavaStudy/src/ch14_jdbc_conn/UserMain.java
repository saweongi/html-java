package ch14_jdbc_conn;

import java.util.Scanner;

import ch14_jdbc_conn.model.UserVO;
import ch14_jdbc_conn.service.UserService;

public class UserMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		UserService userService = UserService.getInstance();
		System.out.println(userService.bbsList());
		while(true) {
			System.out.println("어던 작업을 원하시나요? ");
			System.out.println("1.로그인|2.회원가입|3.종료");
			System.out.println(">>>");
			int command =0;
			command = Integer.parseInt(sc.nextLine());
			if(command ==1) {
				System.out.println("id를 입력해주세요");
				System.out.println(">>>");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력해주세요 ^^");
				System.out.println(">>>");
				String pw = sc.nextLine();
				UserVO userVO = userService.loginUser(id);
				if(pw.equals(userVO.getUserPw())) {
					System.out.println(userVO.getUserNm() + "님 환영합니다.");
					// -- 게시글 출력
					//BbsVO, UserDao쪽에 select, UserService쪽에
					
				}else {
				System.out.println(userVO);
				}
				
			} else if (command == 2){
				//회원가입 선택
				System.out.println("아이디를 입력해주세요.");
				System.out.println(">>>");
				String id = sc.nextLine();
				System.out.println("비번을 입력해주세요");
				System.out.println(">>>");
				String pw = sc.nextLine();
				System.out.println("이름을 입력해주세요");
				System.out.println(">>>");
				String nm = sc.nextLine();
				UserVO userVO = new UserVO(id,nm,pw);
				userService.insertUser(userVO);
				System.out.println(nm +"님 가입되셨습니다 ^^");
			}
			else if (command == 3) {
				System.out.println("-----종료------");
				break;
				
			}
		}
	}
}
