import java.util.Random;
public class ArraySelectionSort {

	public static void main(String[] args) {
		//1~100������ ������ 10�� �����Ͽ� �迭�� ������ ������������ �����Ͽ� ����϶�.
		//��������(SelectionSort)�̿�
		
		/*int num[] = new int[10];
		
		//��������
		for(int i=0; i<num.length; i++) {// i=0,1,2,3,4,5,6,7,8,9 (�ε����� 0����) 
			int random = (int)(Math.random()*(100-1+1))+1;
			num[i] = random;
			
			//�ߺ��˻�
			for(int check=0; check<i; check++) {
				if(num[i]==num[check]) {
					i--;
				}
			}
		
		}
		//���� �� ������ ���
		System.out.println("���� �� ������================");
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i]+"\t");
		}
		System.out.println();
		
		//����
		for(int j=0; j<num.length-1; j++) {
			for(int i=j+1; j<num.length-1; i++) {
				//��
				if(num[j]>num[i]) {
					//��ȯ�ϱ�
					int temp = num[j];
					num[j]=num[i];
					num[i]=temp; //===========================================================������ �����ε�... ���Ŀ��� �������Ⱦ�� �Ф�
				}
			}
			
			//���� �� ������ ���
		System.out.println("���� �� ������================");
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i]+"\t");
		}
		
		System.out.println();
		
		}*/
		
		//1~100������ ������ 10�� �����Ͽ� �迭�� ������ ������������ �����Ͽ� ����϶�.
		//��������(SelectionSort)�̿�
				
		Random ran = new Random();
		
		int ranInt[] = new int[10];
		//��������
		for(int i=0; i<ranInt.length; i++) {
			ranInt[i] = ran.nextInt(100)+1; //0~99
		}
		
		//����
		for(int point=0; point<ranInt.length-1; point++) { //0,1,2,3,4,5,6,7,8(����ü)
			
			//���Ͽ� ��ȯ
			for(int i=point+1; i<ranInt.length; i++) {//0->1,2,3,4,5,6,7,8,9	
													  //1->2,3,4,5,6,7,8,9
				if(ranInt[point] > ranInt[i]) {
					int temp = ranInt[point];
					ranInt[point] = ranInt[i];
					ranInt[i] = temp;
				}
			}
		}
		//���
		for(int data : ranInt) {
			System.out.print(data+"\t");
		}
		System.out.println();
	}

}
