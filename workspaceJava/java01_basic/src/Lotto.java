import java.util.Scanner;
public class Lotto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		//�ζ� ��ȣ ������
		System.out.print("���Ӽ�=");
		int game = scan.nextInt();
	
		for(int i=1; i<=game; i++) {
		
		System.out.print(i+"���� : ");
		//�迭 ������
		int num[] = new int[6];
		int bonus[] = new int[1];
		
		//���� ����(1~45)
			for(int a=0; a<num.length; a++) {//a=0,1,2,3,4,5
				int random = (int)(Math.random()*(45-1+1))+1;	//1~45������ ��
				num[a] = random;
				System.out.print(num[a]+" ");
			}
	
			
			// ���ʽ� ����
			for(int b=0; b<bonus.length; b++) {//i=0
				int random = (int)(Math.random()*45)+1;
				bonus[b] = random;
				System.out.print(" ���ʽ�"+bonus[b]+"\n");
			}
		}
		
		System.out.print("����Ͻðڽ��ϱ�(1.��, 2.�ƴϿ�)?");
		int answer = scan.nextInt();
		if (answer==1) {
			
		}*/

		//����� �ڵ�
		do {
			//���Ӽ�
			System.out.print("���Ӽ�=");
			int cnt =  scan.nextInt();
			
			//�Է¹��� ���Ӽ���ŭ ���� �����
			for(int game=1; game<=cnt; game++) {
				//����1�� �����
				int lotto[] = new int[7];//�ζǹ�ȣ+���ʽ�	������ �����Ͽ� ������ �迭
				for(int i=0; i<lotto.length; i++) {//0�� ����: �ε�����ȣ�� ����
					lotto[i] = (int)(Math.random()*45)+1;	// 1~45���� ��ȣ ����
					
					//�ߺ��˻�
					for(int c=0; c<i; c++) {//
						if(lotto[i]==lotto[c]) {
							 //��ݸ����   ���������
							i--;	
						}
					}
				}
				
				//����
				for(int i=0; i<lotto.length-2; i
						++) {//0,1,2,3,4��° ����
					for(int j=0; j<lotto.length-2-i; j++) {
						if(lotto[j]>lotto[j+1]) {
							int temp = lotto[j];
							lotto[j] = lotto[j+1];
							lotto[j+1] = temp;
						}
					}
					
				}
				
				
				//���
				System.out.print(game+"����=");
				for(int i=0; i<lotto.length-1; i++) {
					System.out.print(lotto[i]+", ");
				}
				System.out.println(" ���ʽ�="+lotto[6]);
			}
			//===============================================================		
			System.out.print("����Ͻðڽ��ϱ�(1.��, 2.�ƴϿ�)?");
			int check = scan.nextInt();
			if (check==2) break;
			
		}while(true);
		

	}

}
/*

�ζ� ��ȣ : 1~45���� ��ȣ 6��
		 ���ʽ� 1��

����
���Ӽ� = 3
1���� = - - - - - - ���ʽ�-
2���� = - - - - - - ���ʽ�-
3���� = - - - - - - ���ʽ�-
����Ͻðڽ��ϱ�(1.��, 2.�ƴϿ�)?
*/