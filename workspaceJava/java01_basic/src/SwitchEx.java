import java.util.Scanner;
class SwitchEx 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� = ");
		int kor = sc.nextInt();
		System.out.print("���� = ");
		int eng = sc.nextInt();
		System.out.print("���� = ");
		int math = sc.nextInt();
		System.out.println("==============");

		int total = kor + eng + math;
		double avg = total / 3;

		String grade = "";
		switch ((int)avg/10){// 10, 9, 8, ...., 1, 0
			case 10 : 
			case 9 : 
				grade = "A";
				break;
			case 8 : 
				grade = "B";
				break;
			case 7 : 
				grade = "C";
				break;
			case 6 :
				grade = "D";
				break;
			default : 
				grade = "F";		
		}
		System.out.printf("���� = %d\n��� = %.1f\n���� = %s\n", total, avg, grade);

		

	}
}
/*
	����, ����, ���������� �Է¹޾� ����, ���, ������ ���Ͽ� ����϶�.
	�� ������ ������ 0~100�� ������ ��.
	����� �Ǽ��� ���Ѵ�.
	������ switch������ �ۼ��Ѵ�.

	���� ����
	90~100	A
	80~89	B
	70~79	C
	60~69	D
	0~59	F

	����
	����=
	����=
	����=
	========================
	����=
	���=
	����=

*/