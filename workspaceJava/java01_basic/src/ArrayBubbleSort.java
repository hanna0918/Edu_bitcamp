
public class ArrayBubbleSort {

	public static void main(String[] args) {
		// 1~100������ ������ 10�� �����Ͽ� �迭�� ���� �� ������������ �����Ͽ� ����϶�.
		
		int num[] = new int[10];
		
		//���� ����
		for(int i=0; i<num.length; i++) {//i=0, 1, 2, 3, 4, 5, 6, 7, 8, 9
			int random = (int)(Math.random()*(100-1+1))+1;
			num[i] = random;
			
		}
		
		//������ ������ ���
		System.out.println("������ ������ =======================");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+", ");
		}
		
		//����
		System.out.println();
		for(int j=0; j<num.length-1; j++) {//0,1,2,3,4,5,6,7,8
			for(int i=0; i<num.length-1-j; i++) {//0,1,2,3,4,5,6,7,8
				if(num[i] > num[i+1]) {
				   //��ȯ�ϱ�  //�ӽú����� ��������
					int temp = num[i];
					num[i] = num[i+1];
					num[i+1] = temp;
				}
			}
		
		System.out.println("������ =======================");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+", ");
		
		}
		
		System.out.println();
		
		}
	}

}