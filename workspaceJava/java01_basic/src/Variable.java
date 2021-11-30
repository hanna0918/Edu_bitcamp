class Variable // 클래스는 대문자로 시작하고 합성어일때는 각 단어의 첫번째 문자를 대분자로 한다. 256자까지 가능.
{
	public static void main(String[] args) 
	{
		//변수란 : 값 또는 데이터를 보관하는 기능을 가진다.
		//		국어 50점, 영어 80점, 수학 70점
		
		//기본데이터형 정수형 -> byte(1byte), short(2byte), int(4byte), long(8byte)
		//			실수형 -> float(4byte), double(8byte) 
		//			논리형 -> boolean(1byte)
		//			문자형 -> char(2byte)
		//			레퍼런스형

		//byte kor = 50;	// 1byte
		int kor2 = 50;	// 4byte		정수형 상수는 int형이다.(기본데이터타입이다.)
		int eng = 80;
		int math = 70;
		
		//변수 생성 규칙
		//		첫번째글자는 영문 소문자로 시작 or _, $로 시작할수있다.
		//		합성어 일때는 두번째 이후 단어는 대문자로 시작한다.
		//		명령어(예약어)는 변수로 사용할수 없다.
		//		name, _name, $name				-> 가능
		//		9name, *name, if(예약어)...		-> 불가능

		//계산 
		//	연산자 : +, -, *, /, %(나머지)

		int sum = kor2 + eng + math;	//200
		//			정수, 정수 = 정수
		//			정수, 실수 = 실수
		//			실수, 정수 = 실수
		//			실수, 실수 = 실수
		double ave = sum / 3.0; // 실수의 기본 데이터 타입은 double형이다. 31.4
		
		System.out.println("총점 = " + sum);
		System.out.println("평균 = " + ave);


		boolean satat = true;	// true, fase (1byte)
		char lastName = '홍';
		String firstName = "길동";

		//형변환
		float data = (float)3562.3265;
		int data2 = (int)12.1;

		// 큰 데이터형의 데이터를 작은 데이터형의 변수에 대입할때는 형변환을 하면된다.
		// 작은 데이터형의 데이터를 큰 데이터형의 변수에 대입할때는 형변환을 하지않아도 된다.
		double data3 = 1234567;
		

	}
}
