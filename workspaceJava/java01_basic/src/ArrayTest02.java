
public class ArrayTest02 {

	public static void main(String[] args) {
		// 2���� : ��� ���� ������.
		
		//�迭�� ����
		//		�� ��
		int data[][] = new int[5][5];	//5��5�� int 25���� ���� ������ ������ ������.
		
		data[0][3] = 100;
		data[1][2] = 85;
		data[1][4] = 77;
		data[3][3] = 99;
		
		//2�����迭 ���=================
		//						length:1�����迭�϶� ���� ����, 2�����迭�϶��� ���� ��
		for(int row=0; row<data.length; row++) {//���� ����ŭ
			for(int c=0; c<data[row].length; c++) {
							//row=0�϶� 0�� ĭ ��
				System.out.print(data[row][c]+"\t");
			}
			System.out.println();
		}//���߷��� for�� ��
	
	
		//2�����迭�� �ʱⰪ ����
		String[][] jusorok = {
									{"ȫ�浿","010-1234-4567","abcd@nate.com"},
									{"�̼���","010-9874-5632","susnsin@nate.com"},
									{"����","010-6543-5214","star@nate.com"}
								};
			
		for(int row=0; row<jusorok.length; row++) {
			for (int c=0; c<jusorok.length; c++) {
					System.out.print(jusorok[row][c]+"\t");
				}
			System.out.println();
		}
	}
}
