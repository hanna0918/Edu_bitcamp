
public class ArrayEx04 {

	public static void main(String[] args) {
		
		/*
		int[] row = {1,2,3,4,5,6,7,8,9};
		int[] column = {1,2,3,4,5,6,7,8,9};
		
		
		for(int i=0; i<row.length; i++) {
			for (int a=0; a<row.length; a++) {
				for(int b=0; b<column.length; b++) {
					int result = row[a]*column[b];
					System.out.print(result+"\t");
				}
				
				System.out.println();
			}
			
			
		}
		*/
		
		int [][] data = new int[10][10];
		
		for(int row=0; row<data.length-1; row++) {//���ȣ	0~8����
			for(int col=0; col<data[row].length-1; col++) {//����ȣ 0~8���� 
				data[row][col] = (row+1) * (col+1);  //����
				data[row][9] += data[row][col];	//9�� ���� ��
				data[9][col] += data[row][col]; //9�� ���� �� 				
			}
		}
		//���
		for(int d[] : data){
			for(int r: d) {
				System.out.printf("%5d",r);
			}
			System.out.println();
		}
	}

}
