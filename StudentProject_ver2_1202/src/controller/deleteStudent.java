package controller;

import java.util.Scanner;

import service.StudentService;

public class deleteStudent extends Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("삭제할 학생 정보 검색을 시작합니다.");
		System.out.print("검색할 학번 : ");
		String studentNo = sc.nextLine();
		
		boolean result = StudentService.getInstance().deleteStudent(studentNo);
		if(result) {
			System.out.println("해당 학생의 정보를 삭제했습니다.");
		} else {
			System.out.println("해당 학생에 대한 정보가 없습니다.");
		}
	}

}
