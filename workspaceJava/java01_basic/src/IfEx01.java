import java.util.Scanner;
class IfEx01 
{	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		/*System.out.print("ù��° �� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� : ");
		int num2 = sc.nextInt();

		if(num1>0 && num2 > 0){
			int plus  = num1+num2;
			int minus = num1-num2;
			int multiple = num1*num2;
			int divide = num1/num2;
			System.out.printf("���ϱⰪ : %d\n���Ⱚ : %d\n���ϱⰪ : %d\n�����Ⱚ : %d\n", plus, minus, multiple, divide);

		}else{
			System.out.printf("�����͸� �߸� �Է��Ͽ����ϴ�.\n");
		}
		*/

		int first=0, second=0, add=0, minus=0, mul=0, divide=0;
		//1. ������ �Է�
		System.out.print("ù��° �� : ");
		first = sc.nextInt();
		System.out.print("�ι�° �� : ");
		second = sc.nextInt();
		//2. ���
		if(first>0 && second>0){//�� ���� ��� ����϶�
				add = first + second;
				minus = first - second;
				mul = first * second;
				divide = first / second;
		//3. ���
				System.out.printf("%5d + %5d = %5d\n", first, second, add);
				System.out.printf("%5d - %5d = %5d\n", first, second, minus);
				System.out.printf("%5d * %5d = %5d\n", first, second, mul);
				System.out.printf("%5d / %5d = %5d\n", first, second, divide);

		}else{//�׿� 
			System.out.println("�����͸� �߸� �Է��Ͽ����ϴ�.");
		}
	}
}
/*
	
	�μ��� �Է¹޾� �Է¹��� ��� ���� ����϶��� ��Ģ������ �� ����� ����ϰ�
	�μ� ��� ����� �ƴҶ��� "�����͸� �߸� �Է��Ͽ����ϴ�."��� �޼����� ����϶�. 
	
*/