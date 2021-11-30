import java.util.Random;
public class ArraySelectionSort {

	public static void main(String[] args) {
		//1~100사이의 난수를 10개 생성하여 배열에 대입후 오름차순으로 정렬하여 출력하라.
		//선택정렬(SelectionSort)이용
		
		/*int num[] = new int[10];
		
		//난수생성
		for(int i=0; i<num.length; i++) {// i=0,1,2,3,4,5,6,7,8,9 (인덱스는 0부터) 
			int random = (int)(Math.random()*(100-1+1))+1;
			num[i] = random;
			
			//중복검사
			for(int check=0; check<i; check++) {
				if(num[i]==num[check]) {
					i--;
				}
			}
		
		}
		//정렬 전 데이터 출력
		System.out.println("정렬 전 데이터================");
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i]+"\t");
		}
		System.out.println();
		
		//정렬
		for(int j=0; j<num.length-1; j++) {
			for(int i=j+1; j<num.length-1; i++) {
				//비교
				if(num[j]>num[i]) {
					//교환하기
					int temp = num[j];
					num[j]=num[i];
					num[i]=temp; //===========================================================정렬이 과제인데... 정렬에서 막혀버렸어요 ㅠㅠ
				}
			}
			
			//정렬 전 데이터 출력
		System.out.println("정렬 후 데이터================");
		for (int i=0; i<num.length; i++) {
			System.out.print(num[i]+"\t");
		}
		
		System.out.println();
		
		}*/
		
		//1~100사이의 난수를 10개 생성하여 배열에 대입후 오름차순으로 정렬하여 출력하라.
		//선택정렬(SelectionSort)이용
				
		Random ran = new Random();
		
		int ranInt[] = new int[10];
		//난수생성
		for(int i=0; i<ranInt.length; i++) {
			ranInt[i] = ran.nextInt(100)+1; //0~99
		}
		
		//정렬
		for(int point=0; point<ranInt.length-1; point++) { //0,1,2,3,4,5,6,7,8(비교주체)
			
			//비교하여 교환
			for(int i=point+1; i<ranInt.length; i++) {//0->1,2,3,4,5,6,7,8,9	
													  //1->2,3,4,5,6,7,8,9
				if(ranInt[point] > ranInt[i]) {
					int temp = ranInt[point];
					ranInt[point] = ranInt[i];
					ranInt[i] = temp;
				}
			}
		}
		//출력
		for(int data : ranInt) {
			System.out.print(data+"\t");
		}
		System.out.println();
	}

}
