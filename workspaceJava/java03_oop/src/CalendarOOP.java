import java.util.Calendar;
import java.util.Scanner;

public class CalendarOOP {
	Scanner scan = new Scanner(System.in);
	Calendar now = Calendar.getInstance();
	
	//�������
	int year, month, week, eDay;//0
	
	//�����͹ޱ�
	int getConData(String msg) {
		System.out.print(msg+"=");
		return scan.nextInt();
	}
	void setData() {
		year = getConData("�⵵");
		month = getConData("��");
	}
	
	//���Ͼ˱�
	void getWeekData() {
		now.set(year, month-1, 1);
		week = now.get(Calendar.DAY_OF_WEEK);
		
	}
	
	//������ �� ���ϱ�
	void getEndDay() {
		eDay = now.getActualMaximum(Calendar.DAY_OF_MONTH);
	}
	
	//����
	void setSpaceWeek() {
		for(int s=1; s<week; s++);
		System.out.print("\t");
	}
	
	//���
	void calendarOutput() {
		System.out.println("\t\t"+year+"�� "+month+"��"+"\t\t");
		System.out.println("��	��	ȭ	��	��	��	��");
	}
	
	//��¥ä���
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
