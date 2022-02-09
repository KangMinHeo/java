package vo;

public class StudentVO {
	private String studentNo;
	private String name;
	private String dept;
	private double score;
	
	public StudentVO(String studentNo, String name, String dept, double score) {
		this.studentNo = studentNo;
		this.name = name;
		this.dept = dept;
		this.score = score;
	}

	@Override
	public String toString() {
		return "StudentVO [studentNo=" + studentNo + ", name=" + name + ", dept=" + dept + ", score=" + score + "]";
	}

	@Override
	public int hashCode() {
		return studentNo.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		
		if(obj instanceof String) {
			if(studentNo.equals(obj)) return true;
		} else if(obj instanceof StudentVO) {
			StudentVO vo = (StudentVO) obj;
			if(studentNo.equals(vo.studentNo))
				return true;
		}
		return false;
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