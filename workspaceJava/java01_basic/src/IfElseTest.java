import java.util.Scanner;
class IfElseTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		// ������ ���� ¦���� 100�� ���Ͽ� ���
		//			Ȧ���� 200�� ���Ͽ� ���
		System.out.print("���� ������ �Է� : ");
		int data = sc.nextInt();
		
		/*
		
			if(data%2==0){//¦��
			int result = data*100;
			System.out.printf("%d-->%d\n", data, result);
		}else{
			int result = data*200;
			System.out.printf("%d--->%d\n", data, result);
		}
		*/
		
		int result = 0;
		
		if(data%2==1){//Ȧ��
			result = data * 200;			
		}else{//¦��
			result = data * 100;					
		}
		
		System.out.printf("%d-->%d\n", data, result);

		
		
		
	}
}
/*

	if~else��

	if(���ǹ�){
		���ǹ��� ���϶� ����;
	}else{
		���ǹ��� �����϶� ����;
	}

*/