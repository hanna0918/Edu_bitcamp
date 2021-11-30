import java.util.Scanner;
class IfEx01 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		/*System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();

		if(num1>0 && num2 > 0){
			int plus  = num1+num2;
			int minus = num1-num2;
			int multiple = num1*num2;
			int divide = num1/num2;
			System.out.printf("더하기값 : %d\n빼기값 : %d\n곱하기값 : %d\n나누기값 : %d\n", plus, minus, multiple, divide);

		}else{
			System.out.printf("데이터를 잘못 입력하였습니다.\n");
		}
		*/

		int first=0, second=0, add=0, minus=0, mul=0, divide=0;
		//1. 데이터 입력
		System.out.print("첫번째 수 : ");
		first = sc.nextInt();
		System.out.print("두번째 수 : ");
		second = sc.nextInt();
		//2. 계산
		if(first>0 && second>0){//두 수가 모두 양수일때
				add = first + second;
				minus = first - second;
				mul = first * second;
				divide = first / second;
		//3. 출력
				System.out.printf("%5d + %5d = %5d\n", first, second, add);
				System.out.printf("%5d - %5d = %5d\n", first, second, minus);
				System.out.printf("%5d * %5d = %5d\n", first, second, mul);
				System.out.printf("%5d / %5d = %5d\n", first, second, divide);

		}else{//그외 
			System.out.println("데이터를 잘못 입력하였습니다.");
		}
	}
}
/*
	
	두수를 입력받아 입력받은 모든 수가 양수일때는 사칙연산을 한 결과를 출력하고
	두수 모두 양수가 아닐때는 "데이터를 잘못 입력하였습니다."라는 메세지를 출력하라. 
	
*/