import java.util.Scanner;
class ForTest04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է�=");
		int max = sc.nextInt();

		//��ü��, Ȧ����, ¦����
		int total = 0, oddTotal = 0, evenTotal=0;

		for(int i=1; i<=max; i++){
			total += 1;
			if(i%2==1){ //Ȧ��
				oddTotal +=i;	
			}else{ //¦��
				evenTotal +=i;		//�������� for�� �ȿ� ������ ������ ����
			}
		}
		
		//������
		System.out.printf("1~%d������ ���� %d\n", max, total);
		System.out.printf("1~%d������ Ȧ���� ���� %d\n", max, oddTotal);
		System.out.printf("1~%d������ ¦���� ���� %d\n", max, evenTotal);

		
	}
}
/*

���� 
�����Է� = 100
1~100������ ���� 5050
1~100������ Ȧ���� ���� 2500
1~100������ ¦���� ���� 2550

*/