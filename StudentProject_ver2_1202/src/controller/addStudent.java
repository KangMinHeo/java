package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class addStudent extends Controller {

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
		
		StudentVO vo = new StudentVO(studentNo, name, dept, score);
		
		StudentService.getInstance().insertStudent(vo);
	}

}
