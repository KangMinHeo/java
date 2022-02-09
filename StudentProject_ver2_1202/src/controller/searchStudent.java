package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class searchStudent extends Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("검색할 학생의 학번을 입력하세요.");
		System.out.print("학번 : ");
		String studentNo = sc.nextLine();
		
		StudentVO result = StudentService.getInstance().searchStudent(studentNo);
		if(result != null) {
			System.out.println("검색 결과");
			result.printStudentInfo();
		} else {
			System.out.println(studentNo + "에 대한 결과는 없습니다.");
		}
	}

}
