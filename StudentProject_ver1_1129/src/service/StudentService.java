package service;

import java.util.Scanner;

/*
 * 학적 정보를 추가, 삭제, 변경, 조회등의 작업을 하는 클래스
 */

import vo.StudentVO;

public class StudentService {
	// private static '클래스명' instance(변수명이며, 변경가능) = new '클래스명()';
	private static StudentService instance = new StudentService();
	private StudentVO[] arr;
	private int idx;

	private StudentService() {
		arr = new StudentVO[5]; // 클래스 배열
		// 임의로 선언 - 결과 확인을 위함, 삭제해도 상관없음
		arr[idx++] = new StudentVO("A001", "홍길동", "MES", 2.4);
		arr[idx++] = new StudentVO("A002", "김철수", "MES", 3.4);
		arr[idx++] = new StudentVO("A003", "이영희", "MES", 2.6);
	}

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}

	// 학생 데이터 추가
	public void insertStudent(Scanner sc) {
		// 1. 저장할 공간이 있는지 체크 - if, idx, arr.length
		// 배열길이(arr.length)가 인덱스(idx)와 같다면 공간이 없다는 것
		if (idx == arr.length) {
			System.out.println("저장할 공간이 없습니다.");
			return; // void는 되돌려주는 값이 없이 return이 사용 가능
		}
		System.out.println("학생정보를 추가합니다.");
		// 2. 학생 데이터 입력 후 StudentVO 생성
		// 학번, 이름, 학과, 평점 ---> 입력
		System.out.print("학번 : ");
		String studentNo = sc.nextLine(); // 문자열 입력받기
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("학과 : ");
		String dept = sc.nextLine();
		System.out.print("평점 : ");
		double score = sc.nextDouble();
		sc.nextLine(); // 숫자입력받은 후 써주는게 좋다
		StudentVO vo = new StudentVO(studentNo, name, dept, score);

		// 3. 배열에 추가 후 idx 증가
		arr[idx++] = vo;
		System.out.println("학생정보 등록 완료");

	}

	public void printAllStudent() {
		System.out.println("전체 학생정보 출력");
		for (int i = 0; i < idx; i++) {
			arr[i].printStudentInfo();
		}
	}

	public void selectStudent(Scanner sc) {
		if (idx == 0) {
			System.out.println("저장된 데이터가 없습니다.");
			return;
		}
		System.out.println("학생 정보 검색을 시작합니다.");
		System.out.print("검색할 학번 : ");
		String studentNo = sc.nextLine();

		for (int i = 0; i < idx; i++) {
			if (arr[i].getStudentNo().equals(studentNo)) {
				arr[i].printStudentInfo();
				return;
			}
		}
		System.out.println("조회 결과 해당 학생 정보가 없습니다.");
	}

	public void changeStudent(Scanner sc) {
		if (idx == 0) {
			System.out.println("저장된 데이터가 없습니다.");
			return;
		}

		System.out.println("수정할 학생 정보 검색을 시작합니다.");
		System.out.print("검색할 학번 : ");
		String studentNo = sc.nextLine();

		for (int i = 0; i < idx; i++) {
			if (arr[i].getStudentNo().equals(studentNo)) {
				System.out.println("변경할 학생의 이름을 입력하세요.");
				String name = sc.nextLine();
				arr[i].setName(name);
				System.out.println("변경할 학생의 학과를 입력하세요.");
				String dept = sc.nextLine();
				arr[i].setDept(dept);
				System.out.println("변경할 학생의 평점을 입력하세요.");
				double score = sc.nextDouble();
				arr[i].setScore(score);
				return;
			}
		}
		System.out.println("수정할 학생정보가 없습니다.");
	}

	public void deleteStudent(Scanner sc) {
		if (idx == 0) {
			System.out.println("저장된 데이터가 없습니다.");
			return;
		}

		System.out.println("삭제할 학생 정보 검색을 시작합니다.");
		System.out.print("검색할 학번 : ");
		String studentNo = sc.nextLine();

		for (int i = 0; i < idx; i++) {
			if (arr[i].getStudentNo().equals(studentNo)) {
				for (int j = i; j < idx - 1; j++) {
					arr[j] = arr[j + 1];
				}
				idx--;
				System.out.println("학생데이터 삭제 성공");
				return;
			}
		}
		System.out.println("삭제할 학생정보가 없습니다.");
	}
}