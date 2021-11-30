
public class ArrayTest02 {

	public static void main(String[] args) {
		// 2차원 : 행과 열을 가진다.
		
		//배열의 선언
		//		행 열
		int data[][] = new int[5][5];	//5행5열 int 25개를 저장 가능한 변수가 생성됨.
		
		data[0][3] = 100;
		data[1][2] = 85;
		data[1][4] = 77;
		data[3][3] = 99;
		
		//2차원배열 출력=================
		//						length:1차원배열일때 변의 갯수, 2차원배열일때는 행의 수
		for(int row=0; row<data.length; row++) {//행의 수만큼
			for(int c=0; c<data[row].length; c++) {
							//row=0일때 0의 칸 수
				System.out.print(data[row][c]+"\t");
			}
			System.out.println();
		}//이중루프 for문 끝
	
	
		//2차원배열의 초기값 설정
		String[][] jusorok = {
									{"홍길동","010-1234-4567","abcd@nate.com"},
									{"이순신","010-9874-5632","susnsin@nate.com"},
									{"스벅","010-6543-5214","star@nate.com"}
								};
			
		for(int row=0; row<jusorok.length; row++) {
			for (int c=0; c<jusorok.length; c++) {
					System.out.print(jusorok[row][c]+"\t");
				}
			System.out.println();
		}
	}
}
