import java.util.Scanner;
class WhileEx01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("정수입력=");
		int num = sc.nextInt();

		int i=1;
		int sum=0, evenSum=0, oddSum=0, threeSum=0;
		while(i<=num){
			//합
			sum += i;
			//짝수합
			if(i%2==0){
				evenSum += i;
			}else{
				oddSum += i;
			}
			//3의배수합
			if(i%3==0){
				threeSum += i;
			}
			i++;
		}
		System.out.printf("1~%d까지의 합은 %d\n", num, sum);
		System.out.printf("1~%d까지의 홀수의 합은 %d\n", num, oddSum);
		System.out.printf("1~%d까지의 짝수의 합은 %d\n", num, evenSum);
		System.out.printf("1~%d까지의 3의 배수의 합은 %d\n", num, threeSum);
		System.out.println("The End---------");
	}
}
/*
임의의 수(정수)를 입력받아 그 수까지 합과, 짝수합, 홀수합, 3의 배수의 합을 구하여 출력하라

실행
정수입력=*
1~*까지의 합은 ___
1~*까지의 홀수의 합은 ___
1~*까지의 짝수의 합은 ___
1~*까지의 3의 배수의 합은 ___

*/