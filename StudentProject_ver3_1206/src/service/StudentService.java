package service;

import java.util.ArrayList;

import vo.StudentVO;

public class StudentService {
	private static StudentService instance = new StudentService();

	private ArrayList<StudentVO> list;
	private int idx;

	// 외부에서 list를 사용하게끔 get을 생성
	public ArrayList<StudentVO> getList() {
		return list;
	}

	public void setList(ArrayList<StudentVO> list) {
		this.list = list;
	}

	private StudentService() {
		list = new ArrayList<StudentVO>();
	}

	public static StudentService getInstance() {
		if (instance == null)
			instance = new StudentService();
		return instance;
	}

	public boolean insertStudent(StudentVO studentVO) {
		// 동일 객체 확인
		if(list.contains(studentVO))
			return false;
		
		list.add(studentVO);
		
		return true;
	}

	public StudentVO searchStudent(String studentNo) {
		StudentVO vo = new StudentVO(studentNo, null, null, 0);
		int no = list.indexOf(vo);
		if(no == -1)
			return null;
		return list.get(no);
	}

	public StudentVO deleteStudent(String no) {
		StudentVO vo = new StudentVO(no, null,null, 0);
		
		int num = list.indexOf(vo);
		if(num == -1)
		{
			System.out.println("해당 학번의 정보는 없습니다.");
		}
		else
		{
			list.remove(num);
			System.out.println("해당 학번의 정보가 삭제되었습니다.");
		}
		
		return null ;
	}

	/*
	public boolean deleteStudent(String no) {
		StudentVO vo = new StudentVO(no, null,null, 0);
		
		int num = list.indexOf(vo);
		
		if(num == -1)
			return false;
		
		if(list.remove(num) != null)
			return true;
		else
			return false;
	}
	 */

	public void updateStudent(StudentVO vo) {
		int no = list.indexOf(vo.getStudentNo());
		if(list.contains(vo.getStudentNo()))
		{
			list.set(no, vo);
		}
	}

	public void printAllStudent() {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
	
}
