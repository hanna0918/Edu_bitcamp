
public class ArrayBubbleSort {

	public static void main(String[] args) {
		// 1~100사이의 난수를 10개 생성하여 배열에 대입 후 오름차순으로 정렬하여 출력하라.
		
		int num[] = new int[10];
		
		//난수 생성
		for(int i=0; i<num.length; i++) {//i=0, 1, 2, 3, 4, 5, 6, 7, 8, 9
			int random = (int)(Math.random()*(100-1+1))+1;
			num[i] = random;
			
		}
		
		//정렬전 데이터 출력
		System.out.println("정렬전 데이터 =======================");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+", ");
		}
		
		//정렬
		System.out.println();
		for(int j=0; j<num.length-1; j++) {//0,1,2,3,4,5,6,7,8
			for(int i=0; i<num.length-1-j; i++) {//0,1,2,3,4,5,6,7,8
				if(num[i] > num[i+1]) {
				   //교환하기  //임시보관용 변수생성
					int temp = num[i];
					num[i] = num[i+1];
					num[i+1] = temp;
				}
			}
		
		System.out.println("정렬후 =======================");
		for(int i=0; i<num.length; i++) {
			System.out.print(num[i]+", ");
		
		}
		
		System.out.println();
		
		}
	}

}
