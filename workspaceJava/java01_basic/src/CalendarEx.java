import java.util.Scanner;
import java.util.Calendar;

class CalendarEx 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//System.out.print("�⵵=");
		int year = sc.nextInt();
		
		//System.out.print("��=");
		int month = sc.nextInt();

		//�������
		System.out.printf("%t%t%d�� %d��%t%t%n", year, month);
		//�������
		System.out.println("��	��	ȭ	��	��	��	��");

		//���� ��¥ �ð� ��ü ���ϱ�
		Calendar today = Calendar.getInstance();
		//��¥����
		today.set(year, month-1, 1);	//��¥���� 1��->0,.....12��->11
		//���ϱ��ϱ�
		int week = today.get(Calendar.DAY_OF_WEEK);

		//���� ��������
		//1, 3, 5, 7, 8, 10, 12 -> 31��
		//4, 6, 9, 11			-> 30��
		//2		->	28��or29��
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
				//�⵵�� 4�� ���������� 100���� �ȳ������� ������ ����
				//400���� ���������� ����
				if(year%4==0 && year%100!=0 || year%400==0){
					lastDay = 29;
				}else{
					lastDay = 28;
				}
		}
		*/
		//��������


		int lastDay = today.getActualMaximum(Calendar.DAY_OF_MONTH);
		//�������
		for(int s=1; s<week; s++){
			System.out.print("	");
		}
		//��¥���
		for(int day=1; day<=lastDay; day++){
			System.out.print(day+"\t");
			if((day+week-1)%7==0){//����� ���ڰ� 7�� ��� ���̸� �ٹٲ�
				System.out.println();
			}
		}
		System.out.println();
	}
}
