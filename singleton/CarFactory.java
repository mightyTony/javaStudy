package singleton;

// getInstance(),createCar()
public class CarFactory {
	private static CarFactory factory = new CarFactory();
	
	private CarFactory() {
		
	}
	
	public static CarFactory getInstance() {
		if(factory == null) {
			factory = new CarFactory();
		}
		return factory;
	}
	
	public static Car creatCar() {
		Car car = new Car();
		return car;
	}
}
