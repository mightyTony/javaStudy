package singleton;

public class Company {
	private static Company instance = new Company(); // ������ �ν��Ͻ�
	private Company() {} //�����ڸ� private�Ͽ� �� ��ü ������ �����Ѵ�.
	
	//static�� �ϸ� Ŭ���� �޼ҵ�� 
	public static Company getInstance() {
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
