package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class SearchController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("검색할 학생의 학번을 입력하세요.");
		System.out.print("학번 : ");
		String studentNo = sc.nextLine();
		
		StudentVO vo = StudentService.getInstance().searchStudent(studentNo);

		if(vo == null)
			System.out.println("학번에 해당하는 학생 정보가 없습니다.");
		else
			System.out.println(vo);
	}

}
