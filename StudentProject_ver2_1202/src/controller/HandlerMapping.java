package controller;

public class HandlerMapping {
	private static HandlerMapping instance = new HandlerMapping();
	
	public HandlerMapping() {	
		
	}
	
	public static HandlerMapping getInstance() {
		if(instance == null)
			instance = new HandlerMapping();
		return instance;
	}
	
	public Controller createController(int no) {
		Controller controller = null;
		
		switch(no) {
		case 1: // 추가
			controller = new addStudent();
			break;
		case 2: // 검색
			controller = new searchStudent();
			break;
		case 3: // 수정
			controller = new changeStudent();
			break;
		case 4: // 삭제
			controller = new deleteStudent();
			break;
		case 5: // 전체 학생 조회
			controller = new printAllStudent();
			break;
		}
		
		return controller;
	}
}
