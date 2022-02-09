package main;

import java.util.*;

import controller.Controller;
import controller.HandlerMapping;
import service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		StudentService service = StudentService.getInstance();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 학생정보 추가");
			System.out.println("2. 학생정보 검색");
			System.out.println("3. 학생정보 수정");
			System.out.println("4. 학생정보 삭제");
			System.out.println("5. 전체 학생정보 조회");
			System.out.println("0. 프로그램 종료");
			System.out.println("원하시는 메뉴번호를 입력하세요.");
			int no = sc.nextInt();
			sc.nextLine(); // 줄바꿈 문자 제거 - 버퍼메모리에 숫자와 엔터키가 들어가 있고 숫자는 입력처리되고 엔터가 남아서 학번이 입력이 안되었던 것
			
			Controller controller = HandlerMapping.getInstance().createController(no);
			if(controller != null)	controller.execute(sc);
			
			if(no == 0) break;
		}
	}

}
