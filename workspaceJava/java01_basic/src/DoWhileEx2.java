import java.util.Scanner;
class DoWhileEx2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		do{
			//�ݾ�
			System.out.print("�ݾ��� �Է��ϼ���.");
			int money = sc.nextInt();

			//ȭ��
			int won=50000, divide = 5;
			while(money>0){
				int cnt = money/won; //ȭ���� ����
				if(cnt>0){
					System.out.print(won+"��="+cnt);
					if(won>=10000){
						System.out.println("��");
					}else{
						System.out.println("��");
					}
					money = money - cnt*won;
				}
				won = won / divide;//���� ȭ�����
				//���� ȭ����� ������ �������� �ٲ����
				if(divide==5){
					divide=2;
				}else{
					divide=5;
				}//while
			}
			
			//����
			System.out.print("����Ͻðڽ��ϱ�(1.�� 2.�ƴϿ�)");
			int status = sc.nextInt();
			if(status==2) {
				break;
				}
			}while(true);
	}
}