import java.util.Scanner;
class ForTest04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력=");
		int max = sc.nextInt();

		//전체합, 홀수합, 짝수합
		int total = 0, oddTotal = 0, evenTotal=0;

		for(int i=1; i<=max; i++){
			total += 1;
			if(i%2==1){ //홀수
				oddTotal +=i;	
			}else{ //짝수
				evenTotal +=i;		//결과출력이 for문 안에 있으면 여러번 찍힘
			}
		}
		
		//결과출력
		System.out.printf("1~%d까지의 합은 %d\n", max, total);
		System.out.printf("1~%d까지의 홀수의 합은 %d\n", max, oddTotal);
		System.out.printf("1~%d까지의 짝수의 합은 %d\n", max, evenTotal);

		
	}
}
/*

실행 
정수입력 = 100
1~100까지의 합은 5050
1~100까지의 홀수의 합은 2500
1~100까지의 짝수의 합은 2550

*/