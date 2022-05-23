package singleton;

public class Company {
	private static Company instance = new Company(); // 유일한 인스턴스
	private Company() {} //생성자를 private하여 새 객체 생성을 제한한다.
	
	//static을 하면 클래스 메소드니 
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
