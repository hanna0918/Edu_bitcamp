import java.util.Scanner;
class ForTest08 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	for(;;){
			System.out.print("�޴�[1.�簢���� ����, 2.���� ����, 3.����]?");
			int num = sc.nextInt();
	
			if(num==1){
				System.out.print("����=");
				int width = sc.nextInt();
				System.out.print("����=");
				int length = sc.nextInt();
				
				int sqArea = width*length;
				System.out.printf("�簢���� ����=%d\n", sqArea);
			}else if (num==2){
				System.out.print("������=");
				int c = sc.nextInt();	
	
				double cirArea = c*c*3.141592;
				System.out.printf("���� ����=%.2f\n",cirArea);
			}else if(num==3){
				System.exit(0);			//���ѷ��� ����
			}else{
				System.out.println("�޴��� �ٽ� �����ϼ���!");
			}
			
		}	//for��
	}
}
/*
�簢���� ���� = ���� * ����
���� ���� = ������ * ������ * 3.141592
����
�޴�[1.�簢���� ����, 2.���� ����, 3.����]?1
����=
����=
�簢���� ����=

�޴�[1.�簢���� ����, 2.���� ����, 3.����]?2
������ = 
���� ���� = 

�޴�[1.�簢���� ����, 2.���� ����, 3.����]?

*/