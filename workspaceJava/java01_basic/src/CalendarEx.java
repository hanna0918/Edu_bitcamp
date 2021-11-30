import java.util.Scanner;
import java.util.Calendar;

class CalendarEx 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("년도=");
		int year = sc.nextInt();
		
		//System.out.print("월=");
		int month = sc.nextInt();

		//제목출력
		System.out.printf("%t%t%d년 %d월%t%t%n", year, month);
		//요일출력
		System.out.println("일	월	화	수	목	금	토");

		//현재 날짜 시간 객체 구하기
		Calendar today = Calendar.getInstance();
		//날짜변경
		today.set(year, month-1, 1);	//날짜변경 1월->0,.....12월->11
		//요일구하기
		int week = today.get(Calendar.DAY_OF_WEEK);

		//달의 마지막날
		//1, 3, 5, 7, 8, 10, 12 -> 31일
		//4, 6, 9, 11			-> 30일
		//2		->	28일or29일
		/*
		int lastDay = 31;
		 * switch(month){
			case 4: 
			case 6: 
			case 9: 
			case 11:
				lastDay = 30;
				break;
			case 2:
				//년도가 4로 나누어지고 100으로 안나눠지지 않으면 윤년
				//400으로 나누어지면 윤년
				if(year%4==0 && year%100!=0 || year%400==0){
					lastDay = 29;
				}else{
					lastDay = 28;
				}
		}
		*/
		//마지막날


		int lastDay = today.getActualMaximum(Calendar.DAY_OF_MONTH);
		//공백출력
		for(int s=1; s<week; s++){
			System.out.print("	");
		}
		//날짜출력
		for(int day=1; day<=lastDay; day++){
			System.out.print(day+"\t");
			if((day+week-1)%7==0){//출력한 문자가 7의 배수 개이면 줄바꿈
				System.out.println();
			}
		}
		System.out.println();
	}
}
