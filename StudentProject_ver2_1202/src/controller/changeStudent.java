package controller;

import java.util.Scanner;

import service.StudentService;
import vo.StudentVO;

public class changeStudent extends Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.print("수정할 학번 : ");
		String studentNo = sc.nextLine();
		
		StudentVO vo = StudentService.getInstance().searchStudent(studentNo);
		
		if(vo == null) {
			System.out.println("수정할 학번 정보가 없습니다.");
			return ;
		}
		
		System.out.print("수정할 이름 : ");
		String name = sc.nextLine();
		vo.setName(name);
		System.out.print("수정할 학과 : ");
		String dept = sc.nextLine();
		vo.setDept(dept);
		System.out.print("수정할 학점 : ");
		double score = sc.nextDouble();
		vo.setScore(score);
		sc.nextLine();
		
		StudentService.getInstance().updateStudent(vo);
	}

}
