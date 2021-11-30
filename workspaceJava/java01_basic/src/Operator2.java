class Operator2 
{
	public static void main(String[] args) 
	{
		//7. 비트연산자 : &(and), |(or), ^(xor), ~	->2진수 데이터를 이용한 연산자
		int a = 12;
		int b = 4;

		int result =  a & b;	// 1 = true, 0 = false;
		System.out.println("result=" + result);

		int result2 = a | b;	// |(or) 두 값중 하나만 true여도 참
		System.out.println("result2=" + result2);

		int result3 = a ^ b;	// ^(XOR) 두 값이 다를때 참
		System.out.println("result3=" + result3);

		// ~(부정)
		// 음수인 데이터를 환산하는 방법 : 2보수 -> 1의 보수 + 1
		// 1의 보수는 0은 1, 1은 0으로 바꾸는 것.
		int result4 = ~a;	//	-13
		System.out.println("result4=" + result4);

		//8. 쉬프트연산자(비트의 이동)
		// << : 비트가 왼쪽으로 이동.	*기능
		// >>(부호로 채워짐), >>>(0으로 채워짐) : 비트가 오른쪽으로 이동.	/기능

		int result5 = a << 2; // 왼쪽으로 2bit 이동, 오른쪽은 0으로 채움	48	12*4
		System.out.println("result5=" + result5);

		int result6 = a >> 2; // 3	12/4	오른쪽으로 2bit 이동, 왼쪽 남는 자리는 부호로 채워짐 
		int result7 = result4 >> 2; // -4	
		System.out.println("result6=" + result6);
		System.out.println("result7=" + result7);

		int result8 = result4 >>> 2;
		System.out.println("result8=" + result8);



	}
}
