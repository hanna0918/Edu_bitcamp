import java.util.Scanner;
import java. util.Calendar;
class CalendarHomework 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		
		//년,월 데이터받기
		System.out.print("년도=");
		int yearData = sc.nextInt();
		System.out.print("월=");
		int monthData = sc.nextInt();
		
		//데이터 1일로 초기화해서 요일알기
		now.set(yearData, monthData-1, 1);
		

		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.print(week);
		//마지막날 
		//int eDay = now.getActualMaximum(Calendar.DAY_OF_MONTH);	
		int eDay = 31;
		switch(monthData){
			case 4:
			case 6:
			case 9:
			case 11:
				eDay = 30;
				break;
			case 2:
				if(monthData%4==0 && monthData%100!=0 || monthData%400==0) {
					eDay = 29;
				}else {
					eDay = 28;
				}
		}
		
		
		//년월출력
		System.out.printf("\t\t%d년 %d월\t\t\n", yearData, monthData);
		//요일출력
		System.out.println("일	월	화	수	목	금	토");
		
		//공백 
		for(int s=1; s<week; s++) {
			System.out.print("	");
		}
		//날짜채우기
		for(int day=1; day<=eDay; day++){
			System.out.print(day + "\t");
			if((day+week-1)%7==0) {
				System.out.println();
			}
		}
				
		
	}
}
//제 계획은 데이터로 받은 날짜 1일의 요일을 구해서 시작점을 잡고
//캘린더를 채우는게 목표였습니다ㅠㅠ