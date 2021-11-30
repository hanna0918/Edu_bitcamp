import java.util.Scanner;
class Ex04_if 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		/*
		int kor=0, eng=0, math=0, add=0;
		double ave=0;

		System.out.println("=======성적표======");
		System.out.print("국어 = ");
		kor = sc.nextInt();
		System.out.print("영어 = ");
		eng = sc.nextInt();
		System.out.print("수학 = ");
		math = sc.nextInt();
		
		System.out.println("===================");
		add = kor+eng+math;
		ave = (kor+eng+math)/3;
		
		System.out.printf("총점 = %d\n", add);
		System.out.printf("평균 = %-10.1f\n", ave);
		if (ave>=90 && ave<=100){
			System.out.println("학점 = A");
		}else if (ave>=80 && ave<=89){
			System.out.println("학점 = B");
		}else if (ave>=70 && ave<=79){
			System.out.println("학점 = C");
		}else if (ave>=60 && ave<=69){
			System.out.println("학점 = D");
		}else{
			System.out.println("학점 = F");
		}
		*/

		//1. 점수입력
		System.out.print("국어=");
		int kor = sc.nextInt();
		System.out.print("영어=");
		int eng = sc.nextInt();
		System.out.print("수학=");
		int math = sc.nextInt();
		//2. 계산
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
		
		//3. 출력
		System.out.printf("총점=%d\n평균=%.2f\n학점=%c\n",total, ave, grade);


		




	}
}

/*
	국어, 영어, 수학점수를 입력받아 총점, 평균, 학점을 구하여 출력하라.
	각 과목의 점수는 0~100점 사이의 값.
	평균은 실수를 구한다.

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