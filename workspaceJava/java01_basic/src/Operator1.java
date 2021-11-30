class  Operator1
{
	public static void main(String[] args) 
	{
		//연산자 : 산술연산자, 관계(비교)연산자, 논리연산자, 단항연산자, 대입연산자, 쉬프트연산자, 삼항연산자
		//1. 산술연산자 : +, -, *, /(몫, 실수), %(나며지)

		int num1 = 10;
		int num2 = 3;

		int result1 = num1 % num2;
		System.out.println("result1 = " + result1);

		//2. 단항연산자 : ++(1증가), --(1감소), 

		int a = 10;
		a = a + 1;	// 1증가하는 수식
		System.out.println("a=" + a);

		//a++;	// 1증가하는 수식
		++a;
		System.out.println("a=" + a);

		//--a;		a = a - 1;
		a--; // 1감소하는 수식
		System.out.println("a=" + a);

		int b = a++;	// 11, 12
		System.out.println("b=" + b + ", a=" + a);

		int c = ++a;	// 13, 13
		System.out.println("c=" + c + ", a=" + a);

		int result2 = b + c++;	// 11+13=24		c->14
		//int result2 = b + ++c;	// 11+14=25		c->14
		System.out.println("result2=" + result2 + ", c=" + c);

		//3. 대입연산자 
		//a = 13
		a += 4;		//a = a + 4;	17		a+=1; a=a+1;
		//b = 11
		b -= 3;		//a = a - 3;	8
		//c = 14
		c *= 2;		//c = c * 2;	28
		System.out.println("a=" + a + ", b=" + b + ", c=" + c);

		c += a + b;		// c = c + a + b;	53
		System.out.println("c=" + c);

		//4. 비교연산자 : >, >=, <, <=, ==, !=
		int x = 200;
		int y = 300;

		boolean boo = x > y; //false
		boolean boo2 = x < y; //true
		System.out.println("boo= " + boo);
		System.out.println("boo2= " + boo2);

		//5. 삼항연산자 결과=(조건식)?참일때:거짓일때
		//급여가 10000원 이상일때는 보너스를 50%
		//급여가 10000원 미만일때는 보너스를 90%를 받을 경우 보너스가 얼마인지 계산.
		int sal = 9000;	//급여
						
		double bonus = (sal >= 10000) ? sal*0.5 : sal*0.9 ;
		System.out.println("sal=" + sal + ", bonus=" + bonus);

		//6. 논리연산자 : &&(and), ||(or), !(not)
		int ave = 51;
		String grade = (ave>=70 && ave<80) ? "c" : "그 외";
		System.out.println("grade=" + grade);


		char ch = 'A';	// char는 연산이 가능하다.
		//ch++;	ch += 1;
		ch = (char)(ch + 1);
		System.out.println("ch=" + ch);

		char ch2 = (char)85;
		System.out.println("ch2=" + ch2);

	}
}
