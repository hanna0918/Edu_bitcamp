import java.util.Scanner;
class ForTest03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단입력=");
		int num = sc.nextInt();

		for(int i=2; i<=9; i++){ //i=2, 3, 4, ...9
			int result = num * i ;
			//System.out.println(num + " * " + i + " = " + result);
			System.out.println(num+"*"+ i+"="+ result);
		}
	}
}
/*

실행
단입력=5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
.
.
.
5 * 9 = 45

*/