
public class ArrayTest05 {

	public static void main(String[] args) {
		// 2차원배열의 행마다 다른 열의 수를 가질때----------------------
		
		int num[][] = new int[5][];	//5행 -열
		
		//열의 생성
		num[0] = new int[3];	//1행
		num[1] = new int[5];	//2행
		num[2] = new int[4];	//3행
		num[3] = new int[1];	//4행
		num[4] = new int[6];	//5행
		
		for(int r=0; r<num.length; r++) {//0,1,2,3,4
			for(int c=0; c<num[r].length; c++) {
				System.out.print(num[r][c]+"\t");
			}
			System.out.println();
		}
	}

}
