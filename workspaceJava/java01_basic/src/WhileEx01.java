import java.util.Scanner;
class WhileEx01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("�����Է�=");
		int num = sc.nextInt();

		int i=1;
		int sum=0, evenSum=0, oddSum=0, threeSum=0;
		while(i<=num){
			//��
			sum += i;
			//¦����
			if(i%2==0){
				evenSum += i;
			}else{
				oddSum += i;
			}
			//3�ǹ����
			if(i%3==0){
				threeSum += i;
			}
			i++;
		}
		System.out.printf("1~%d������ ���� %d\n", num, sum);
		System.out.printf("1~%d������ Ȧ���� ���� %d\n", num, oddSum);
		System.out.printf("1~%d������ ¦���� ���� %d\n", num, evenSum);
		System.out.printf("1~%d������ 3�� ����� ���� %d\n", num, threeSum);
		System.out.println("The End---------");
	}
}
/*
������ ��(����)�� �Է¹޾� �� ������ �հ�, ¦����, Ȧ����, 3�� ����� ���� ���Ͽ� ����϶�

����
�����Է�=*
1~*������ ���� ___
1~*������ Ȧ���� ���� ___
1~*������ ¦���� ���� ___
1~*������ 3�� ����� ���� ___

*/