import java.util.Scanner;
import java. util.Calendar;
class CalendarHomework 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Calendar now = Calendar.getInstance();
		
		//��,�� �����͹ޱ�
		System.out.print("�⵵=");
		int yearData = sc.nextInt();
		System.out.print("��=");
		int monthData = sc.nextInt();
		
		//������ 1�Ϸ� �ʱ�ȭ�ؼ� ���Ͼ˱�
		now.set(yearData, monthData-1, 1);
		

		int week = now.get(Calendar.DAY_OF_WEEK);
		System.out.print(week);
		//�������� 
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
		
		
		//������
		System.out.printf("\t\t%d�� %d��\t\t\n", yearData, monthData);
		//�������
		System.out.println("��	��	ȭ	��	��	��	��");
		
		//���� 
		for(int s=1; s<week; s++) {
			System.out.print("	");
		}
		//��¥ä���
		for(int day=1; day<=eDay; day++){
			System.out.print(day + "\t");
			if((day+week-1)%7==0) {
				System.out.println();
			}
		}
				
		
	}
}
//�� ��ȹ�� �����ͷ� ���� ��¥ 1���� ������ ���ؼ� �������� ���
//Ķ������ ä��°� ��ǥ�����ϴ٤Ф�