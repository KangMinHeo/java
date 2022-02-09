package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class DeleteController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제하실 학생의 학번을 입력하세요.");
		System.out.print("학번 : ");
		String no = sc.nextLine();
		
		StudentVO vo = StudentService.getInstance().deleteStudent(no);
		
		/*
		boolean result = StudentService.getInstance().deleteStudent(no);
		
		if(result)
			System.out.println("학생 정보 삭제에 성공하였습니다.");
		else
			System.out.println("학번에 해당하는 학생이 없습니다.");
		*/
	}

}
