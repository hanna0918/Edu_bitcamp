import java.util.Scanner;
class SwitchEx 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 = ");
		int kor = sc.nextInt();
		System.out.print("영어 = ");
		int eng = sc.nextInt();
		System.out.print("수학 = ");
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
		System.out.printf("총점 = %d\n평균 = %.1f\n학점 = %s\n", total, avg, grade);

		

	}
}
/*
	국어, 영어, 수학점수를 입력받아 총점, 평균, 학점을 구하여 출력하라.
	각 과목의 점수는 0~100점 사이의 값.
	평균은 실수를 구한다.
	학점은 switch문으로 작성한다.

	학점 기준
	90~100	A
	80~89	B
	70~79	C
	60~69	D
	0~59	F

	실행
	국어=
	영어=
	수학=
	========================
	총점=
	평균=
	학점=

*/