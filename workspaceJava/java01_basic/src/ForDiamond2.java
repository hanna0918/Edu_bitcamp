import java.util.Scanner;
class ForDiamond2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Ȧ��(1~49)�Է� =");
		int max = sc.nextInt();

		//¦���ϰ�� Ȧ���� ����
		if(max%2==0){
			max++;		//2�϶� 3���� ����
		}

		//����� ���� �ʱⰪ
		char txt = 'A';
		int step = 2;
		for(int row=1; row>0; row+=step){//�� 1,3,5,7,9....max
			//����
			for(int s=1; s<=(max-row)/2; s++){
				System.out.print(" ");
			}
			//1�� ����
			for(int cnt=1; cnt<=row; cnt++){// 1~1
				System.out.print(txt++);	
				if(txt>'Z'){// Z�� ����ϰ��� �ٽ� A�� �ǵ�����
					txt = 'A';
				}
			}
			//�ٹٲ�
			System.out.println();
			if(row>=max){
				step=-2;
			}
		}
			
	}
}
