import java.util.Scanner;
class SwitchTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// ������ �Է¹޾� 1�̸� ����
		//			    2�̸� ���
		//				3�̸� �Ķ�
		//				4�̸� �ʷ�
		//�� ���� ���� �������� ����϶�.

		System.out.print("���� �Է� : ");
		int color = sc.nextInt();

		switch (color){
			case 1 :
				System.out.println("����");
				break;
			case 2 : 
				System.out.println("���");
				break;
			case 3 : 
				System.out.println("�Ķ�");
			case 4 :
				System.out.println("�ʷ�");
				break;
			default : 
				System.out.println("����");
		
		}
	}
}
/*
	������ ������ �� ���� ���ǹ�

			int������ ���� ������Ÿ��(byte, short, int, char, boolean), ���ڿ��� ����� �� ����.
	switch(���, ����, ����){
		case ���:
			���๮;
			���๮;
			break;
		case ��� : 
			���๮;
			���๮
			break;		//case ������ ���Ѿ���
		
		default:		//��������
			���๮;
			���๮;
	}


*/