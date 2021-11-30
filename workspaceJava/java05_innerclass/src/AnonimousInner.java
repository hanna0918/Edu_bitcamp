
public class AnonimousInner {

	public AnonimousInner() {
		
	}
	public void innerTest() {
		//익명의 내부클래스 : 클래스며이 존재하지 않는다.
		//				 다른 클래스를 객체화하는 과정에서 클래스 수정하여 새로 만든다.
		//				 클래스명이 존재하지 않으므로 변수 선언 불가.
		
		new Student() {//
			//실행부
			String tel = "010-1234-9876";
			//Student클래스의 print메소드를 오버라이딩
			public void print() {
				System.out.println("num="+num);
				System.out.println("name="+name);
				System.out.println("tel="+tel);
			}
		}.print();
	}

	public static void main(String[] args) {
		new AnonimousInner().innerTest();

	}

}
