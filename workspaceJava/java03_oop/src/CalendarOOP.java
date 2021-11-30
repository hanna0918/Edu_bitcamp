import java.util.Calendar;
import java.util.Scanner;

public class CalendarOOP {
	Scanner scan = new Scanner(System.in);
	Calendar now = Calendar.getInstance();
	
	//멤버변수
	int year, month, week, eDay;//0
	
	//데이터받기
	int getConData(String msg) {
		System.out.print(msg+"=");
		return scan.nextInt();
	}
	void setData() {
		year = getConData("년도");
		month = getConData("월");
	}
	
	//요일알기
	void getWeekData() {
		now.set(year, month-1, 1);
		week = now.get(Calendar.DAY_OF_WEEK);
		
	}
	
	//마지막 날 구하기
	void getEndDay() {
		eDay = now.getActualMaximum(Calendar.DAY_OF_MONTH);
	}
	
	//공백
	void setSpaceWeek() {
		for(int s=1; s<week; s++);
		System.out.print("\t");
	}
	
	//출력
	void calendarOutput() {
		System.out.println("\t\t"+year+"년 "+month+"월"+"\t\t");
		System.out.println("일	월	화	수	목	금	토");
	}
	
	//날짜채우기
	void setCalendarDay() {
		for (int day=1; day<=eDay; day++) {
			System.out.print(day+"\t");
			if((day+week-1)%7==0) {
				System.out.println();
			}
		}
	}
	
	void startCalendar() {
		setData();
		getWeekData();
		getEndDay();
		calendarOutput();
		setSpaceWeek();
		setCalendarDay();
		
		
	}

	public static void main(String[] args) {
	CalendarOOP oop = new CalendarOOP();
	oop.startCalendar();
	}

}
