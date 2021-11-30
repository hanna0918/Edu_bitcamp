
public class MethodTest {
	//멤버영역
	int num = 12;
	String name="홍길동";
	String tel;
	
	//생성자 메소드 : 생략시 자동 추가(JVM)
	//				상속관계가 아닐때만 추가 해준다.
	//	매개변수는 데이터형이 다르거나 변수의 갯수가 달라야한다.
	MethodTest(){}
	MethodTest(String tel){
		System.out.println("연락처 : "+tel);
	}
	MethodTest(int num){
		
	}
	
	MethodTest(int num, String name){
		//this : 현재객체(현재 클래스)
		this.num = num;
		this.name = name;
		String tel = "12345";
		this.tel = "02-1234-1234";
	}
	MethodTest(String name, int num){
		//생성자 메소드에서 다른 생성자 메소드 호출하기
		//생성자 메소드에서 다른 생성자를 호출할때는 메소드명을 직접 표기할수 없다.
		//		this
		//MethodTest(num, name);	X
		//this()를 이용하여 다른 생성자 메소드를 호출할때는 반드시 첫번째 실행문이여야 한다.
		//System.out.println();
		this(num, name);
	}
}
