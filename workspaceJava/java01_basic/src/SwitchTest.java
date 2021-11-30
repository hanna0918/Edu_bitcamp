import java.util.Scanner;
class SwitchTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// 정수를 입력받아 1이면 빨강
		//			    2이면 노랑
		//				3이면 파랑
		//				4이면 초록
		//그 외의 값은 검정으로 출력하라.

		System.out.print("정수 입력 : ");
		int color = sc.nextInt();

		switch (color){
			case 1 :
				System.out.println("빨강");
				break;
			case 2 : 
				System.out.println("노랑");
				break;
			case 3 : 
				System.out.println("파랑");
			case 4 :
				System.out.println("초록");
				break;
			default : 
				System.out.println("검정");
		
		}
	}
}
/*
	범위를 지정할 수 없는 조건문

			int형보다 작은 데이터타입(byte, short, int, char, boolean), 문자열을 사용할 수 있음.
	switch(상수, 변수, 수식){
		case 상수:
			실행문;
			실행문;
			break;
		case 상수 : 
			실행문;
			실행문
			break;		//case 개수는 제한없음
		
		default:		//생략가능
			실행문;
			실행문;
	}


*/