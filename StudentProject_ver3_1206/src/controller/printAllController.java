package controller;

//import java.util.ArrayList;
import java.util.Scanner;

import service.StudentService;
//import vo.StudentVO;

public class printAllController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("전체 학생 정보를 출력합니다.");
		
		StudentService.getInstance().printAllStudent();
		/*
		ArrayList<StudentVO> list = StudentService.getInstance().getList();
		
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i)));
		}
		*/
	}

}
