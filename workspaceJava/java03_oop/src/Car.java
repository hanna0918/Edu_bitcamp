
public class Car {
	int speed=0;
	final int SPEED_MAX = 180;
	final int SPEED_MIN = 0;
	String carName = "�׷���";
	
	public Car() {
		System.out.println("car()�����ڸ޼ҵ� ����");
	}
	
	public Car(String carName) {
		this.carName = carName;
		System.out.println("car(String)�����ڸ޼ҵ� ����");
	}
	
	//���� 
	public void speedUp() {
		speed++;
		if (speed>=SPEED_MAX) speed = SPEED_MAX;
		System.out.println("car.speedUp-> speed="+speed);
	}
	
	//�극��ũ
	public void speedDown() {
		speed--;
		if(speed<=SPEED_MIN) {
			speed =SPEED_MIN;
		}
		System.out.println("speedDown-> speed="+speed);
	}
}
