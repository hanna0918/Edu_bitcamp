//추상메소드를 1개이상 포함하는 클래스는 추상클래스가 된다.
//추상클래스는 클래스 키워드 왼쪽에 abstract 표기를 해야한다.
//추상클래스는 반드시 상속받아 모든 추상메소드를 오버라이딩하여야 한다.
public abstract class AbstractTest {
	int num = 100;
	String name = "홍길동"
;
	public AbstractTest() {
		
	}
	
	public void numOutput() {
		System.out.println("num=" + num);
	}
	
	//실행부가 없는 메소드는 추상메소드.
	//추상메소드는 반환형 왼쪽에 abstract키워드를 표기해야함.
	public abstract void print();
	public abstract void setData(int num, String name);
}
