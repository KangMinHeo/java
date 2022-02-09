package service;

import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();

	private StudentVO[] arr;

	private int idx;

	public StudentService() {
		arr = new StudentVO[5];
		arr[idx++] = new StudentVO("A001", "홍길동", "국문학과", 3.2);
		arr[idx++] = new StudentVO("B001", "김철수", "컴공과", 4.3);
		arr[idx++] = new StudentVO("C001", "이영희", "영어과", 2.8);
	}

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}

	// 학생 정보 추가
	public void insertStudent(StudentVO vo) {
		if (idx == arr.length) {
			// 배열을 재할당
			for (int i = 0; i < idx; i++) {
				StudentVO[] temp = new StudentVO[arr.length+3];
				arr = temp;
				System.out.println(arr.length);
			}
		}
		
		// 중복된 값 체크 ( 내 코드 )
		for (int i = 0; i < idx; i++) {
			if (arr[i].getStudentNo().equals(vo.getStudentNo())) {
				System.out.println("중복된 정보입니다.");
				return;
			}
		}

		/*
		// 중복 값 체크 ( 강사님 코드 ) - boolean형을 사용해서 원래는 return false; 이다.
		if(searchStudent(vo.getStudentNo()) != null) {
			System.out.println("중복된 정보입니다.");
			return;
		}
		*/
		
		arr[idx++] = vo; // 실제 등록 코드
		
		System.out.println("학생정보 등록 완료");
	}

	// 학생 정보 검색
	public StudentVO searchStudent(String studentNo) {
		for (int i = 0; i < idx; i++) {
			if (arr[i].getStudentNo().equals(studentNo)) {
				return arr[i];
			}
		}
		return null;
	}

	// 학생 정보 수정
	public void updateStudent(StudentVO vo) {
		for (int i = 0; i < idx; i++) {
			if (arr[i].getStudentNo().equals(vo.getStudentNo())) {
				arr[i] = vo;
			}
		}
		return;
	}

	// 학생 정보 삭제
	public boolean deleteStudent(String studentNo) {
		for (int i = 0; i < idx; i++) {
			if (arr[i].getStudentNo().equals(studentNo)) {
				for (int j = i; j < idx - 1; j++) {
					arr[j] = arr[j + 1];
				}
				idx--;
				System.out.println("학생 데이터 삭제 성공");
			}
		}
		return false;
	}

	// 전체 학생 정보 조회
	public void printAllStudent() {
		for (int i = 0; i < idx; i++) {
			arr[i].printStudentInfo();
		}
	}

}
