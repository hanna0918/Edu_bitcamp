import java.util.Scanner;
class IfTest 
{
	public static void main(String[] args) 
	{
		// ����� �Է¹޾� ¦���϶��� ����ϰ� ¦���� �ƴϸ� ������� �ʴ´�.
		Scanner sc = new Scanner(System.in);

		System.out.print("0���� ū ������ �Է��ϼ���. : ");
		int num = sc.nextInt();
		if(num%3==0){			// num/3==num/3.0
		//if(num/3 != num/3.0){
			System.out.printf("%d�� 3�� ����Դϴ�.\n", num);
		}
		System.out.println("End!!");

		
	}
}
/*
	if��
	���ǹ��� �ݵ�� ���� ��������Ѵ�.

	if(���ǹ� or ���� or ���� or ���){
		���϶� ������ ���๮;
		���๮;
		���๮;



*/