package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class RegisterController implements Controller{

	@Override
	public void execute(Scanner sc) {
		String studentNo, name, dept;
		double score;
		
		System.out.println("학생정보를 추가합니다.");
		System.out.print("학번 : ");
		studentNo = sc.nextLine();
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.print("학과 : ");
		dept = sc.nextLine();
		System.out.print("평점 : ");
		score = sc.nextDouble();
		sc.nextLine();
		
		boolean result =StudentService.getInstance().insertStudent(new StudentVO(studentNo, name, dept, score));
		
		if(result)
			System.out.println("학생 정보 등록이 완료되었습니다.");
		else
			System.out.println("학생 정보 등록 실패되었습니다.");
	}
	
	
	
}
