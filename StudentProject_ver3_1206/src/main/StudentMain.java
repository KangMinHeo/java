package main;

import java.util.Scanner;

import controller.Controller;
import controller.HandlerMapping;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("원하시는 기능을 선택해주세요.");
			System.out.println("1. 학생 정보 조회");
			System.out.println("2. 학생 정보 검색");
			System.out.println("3. 학생 정보 수정");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 전체 학생 정보 조회");
			System.out.println("0. 시스템 종료");
			System.out.print("선택하신 기능 : ");
			int no = sc.nextInt();
			sc.nextLine();
			
			
			Controller controller = HandlerMapping.getInstance().createController(no);
			
			if(controller != null)
				controller.execute(sc);
			
			if(no == 0)
				break;
		}
		System.out.println("시스템을 종료합니다.");
	}

}
