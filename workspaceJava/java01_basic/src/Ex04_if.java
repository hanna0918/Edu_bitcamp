import java.util.Scanner;
class Ex04_if 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		/*
		int kor=0, eng=0, math=0, add=0;
		double ave=0;

		System.out.println("=======����ǥ======");
		System.out.print("���� = ");
		kor = sc.nextInt();
		System.out.print("���� = ");
		eng = sc.nextInt();
		System.out.print("���� = ");
		math = sc.nextInt();
		
		System.out.println("===================");
		add = kor+eng+math;
		ave = (kor+eng+math)/3;
		
		System.out.printf("���� = %d\n", add);
		System.out.printf("��� = %-10.1f\n", ave);
		if (ave>=90 && ave<=100){
			System.out.println("���� = A");
		}else if (ave>=80 && ave<=89){
			System.out.println("���� = B");
		}else if (ave>=70 && ave<=79){
			System.out.println("���� = C");
		}else if (ave>=60 && ave<=69){
			System.out.println("���� = D");
		}else{
			System.out.println("���� = F");
		}
		*/

		//1. �����Է�
		System.out.print("����=");
		int kor = sc.nextInt();
		System.out.print("����=");
		int eng = sc.nextInt();
		System.out.print("����=");
		int math = sc.nextInt();
		//2. ���
		int total = kor + eng + math;
		double ave = total / 3;

		//String, char
		//  "a"	   'a'
		//String grade = "F"; // ""
		
		char grade = 'F'; //''
		if (ave>=90){
			grade = 'A';
		}else if (ave>=80){
			grade = 'B';
		}else if (ave>=70){
			grade = 'C';
		}else if (ave>=60){
			grade = 'D';
		}
		
		//3. ���
		System.out.printf("����=%d\n���=%.2f\n����=%c\n",total, ave, grade);


		




	}
}

/*
	����, ����, ���������� �Է¹޾� ����, ���, ������ ���Ͽ� ����϶�.
	�� ������ ������ 0~100�� ������ ��.
	����� �Ǽ��� ���Ѵ�.

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