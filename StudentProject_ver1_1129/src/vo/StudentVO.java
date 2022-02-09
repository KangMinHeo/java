package vo;

/*
 * 학생 클래스
 * 학번, 이름, 학과, 평점을 가지고 있음
 * 학생 정보를 출력하는 메서드
 * 생성자로 모든 필드 초기화, set/get method 작성
 */

public class StudentVO {
	// VO : value object : 나타내는 것들
	
	private String studentNo;
	private String name;
	private String dept;
	private double score;
	
	public void printStudentInfo() {
		System.out.println("학번 : " + studentNo + "\t" + "이름 : " + name + "\t" + "학과 : " + dept + "\t" + "평점 : " + score);
	}
	
	public StudentVO(String studentNo, String name, String dept, double score) {
		super();
		this.studentNo = studentNo;
		this.name = name;
		this.dept = dept;
		this.score = score;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public double getScore() {
		return score;
	}

	public void setScore(double score) {
		this.score = score;
	}

	
}
