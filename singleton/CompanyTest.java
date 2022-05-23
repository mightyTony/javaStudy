package singleton;

public class CompanyTest {

	public static void main(String[] args) {
		Company myCompany1 = Company.getInstance(); // new로 새 객체 생성할 수 없으니
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1 == myCompany2);
	}

}
