import java.util.Scanner;
public class ArrayEx03_Money {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("�ݾ��� �Է��ϼ���.");
			int money = scan.nextInt();
			
			//ȭ�����
			//ȭ������� ������ 2�����迭�� �ʱ�ȭ�Ͽ� �����Ѵ�.
			int don[][] = {{50000,0},{10000,0},{5000,0},{1000,0},
							{500,0},{100,0},{50,0},{10,0},{5,0},{1,0}};
			
			//ȭ����� ���			
			for(int row=0; row<don.length; row++) {//0,1,2,3,4,...9
				don[row][1] = money/don[row][0];	//ȭ�󰹼�
				money -= don[row][0]*don[row][1];//��������� ȭ��ݾ׸�ŭ ����
				
			}			
			//���
			for(int row=0; row<don.length; row++) {
				if(don[row][1]>0) {
					System.out.print(don[row][0]+"="+don[row][1]);
					if(don[row][0]>=1000) {
						System.out.println("��");
					}else {
						System.out.println("��");
					}
				}
			}			
			//����Ȯ��
			System.out.print("�ٽ� �Ͻðڽ��ϱ�(1.��, 2.�ƴϿ�)");
			int check = scan.nextInt();
				if(check==2)	break;		//if(scan.nextInt()==2) ������ �ȸ���� �ٷ� ��ȣ�����͸� �޴� ���
		}while(true);

	}

}
/*
����
50000, 10000, 5000, 1000, 500, 100, 50, 10 5, 1

����
�ݾ��� �Է��ϼ���. 123300
50000��=2��
10000��=2��
5000��=1��
1000��=1��
100��=3��
�ٽ��Ͻðڽ��ϱ�?(1.�� 2.�ƴϿ�)


*/
