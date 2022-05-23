package singleton;

public class Car {
	private static int serialNum = 10000;
	private int carNum;
	
	Car(){
		serialNum++;
		carNum = serialNum;
	}
	
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int cNum) {
		this.carNum = cNum;
	}
}
