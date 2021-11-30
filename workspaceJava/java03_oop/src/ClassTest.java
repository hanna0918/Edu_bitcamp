//package

//import 필요한 클래스의 위치(패키지명, 클래스명을 정의한다.)
//			필요한만큼 정의 할 수 있다.
import java.util.Scanner;
import java.lang.String;	//compiler가 컴파일 과정에서 자동으로 import해준다.
import java.util.Random;
import java.util.*;			//util안의 모든 클래스 호출


public class ClassTest {
	//멤버영역
	//멤버변수 = 전역변수		클래스 내에서 사용할수 있는 변수
	int a=100;
	String name = "홍길동";
	//멤버변수는 초기값이 자동으로 설정된다.
	// 정수(byte, short, int, long) : 0
	// 실수(float, double) : 0.0
	// 논리(boolean) : false
	// 문자(char) : 
	int b;		
	double c;	
	String nameStr;//null
	Scanner scan;//null
	Random ran;//null
	
	//객체생성  객체↓
	Scanner scanner = new Scanner(System.in);
	//실행문은 멤버에서 사용불가
	//System.out.println("콘솔문자 출력하기");
	int k=100 + 500;
	//int[] dd = new int[10];
	//dd[3] = 200;
	
	//생성자 메소드 : 객체를 생성할때 한번 실행되는 메소드
	//			  메소드명이 반드시 클래스명과 같아야 한다.
	//			  객체 생성시 객체의 데이터를 초기화할 수 있다. 
	//		생성자메소드를 구현하지않으면 컴파일시 컴파일러가
	//		매개변수가 없는 생성자메소드를 자동으로 추가 해준다.
	//
	//		ClassTest(){}
	
	ClassTest(){
		b = 1234;
		//실행문
		System.out.println("생성자 메소드가 실행됨!!!");
	}
	ClassTest(int a){
		System.out.println(a+"메소드 실행 ~~~~~~~~~~~~");
	}

	
	//메소드 : 하나의 실행단위
	//		클래스를 객체 생성 후 메소드를 호출하여야 실행됨.
	//	반환형 메소드명(매개변수){
	//	}
	//메소드명 생성 규칙 : 소문자로 시작한다. 
	//				 합성어일때는 두번째 단어부터는 첫글자는 대문자로
	void sum() {
		//실행부
		System.out.println("sum()메소드가 실행됨");
	}
	void total(int a, int b) {
		System.out.println("합은"+(a+b));
	}
}
