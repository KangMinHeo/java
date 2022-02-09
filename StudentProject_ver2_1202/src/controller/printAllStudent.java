package controller;

import java.util.Scanner;

import service.StudentService;

public class printAllStudent extends Controller {

	@Override
	public void execute(Scanner sc) {
		StudentService.getInstance().printAllStudent();
	}

}
