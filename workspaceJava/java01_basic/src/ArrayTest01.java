
public class ArrayTest01 {

	public static void main(String[] args) {
		// 배열은 같은 데이터형의 변수를 여러개 선언할때 필요.
		// 배열은 한번 생성되면 크기를 변경할수 없다.
		
		//배열의 선언(1차원배열)
		int[] data;//메모리할당
		int num[] = new int [5];	//초기값 정수:0, 실수:0.0, 논리형:false 메모리가 할당됨.
		
		String name[] = new String[5];	//문자열의 초기값은 null
		
		num[2] = 100;
		name[1] = "홍길동";
		
		System.out.println("num[1]=>" + num[1]);
		System.out.println("name[1]=>" + name[1]);
		
		//num배열의 모든 값을 출력하라.
		//	num[0], num[1], num[2], num[3], num[4]
		//배열명.length ->배열의 갯수를 구하여준다.
		for(int idx=0; idx < num.length ; idx++) {//0
			System.out.println("num["+idx+"]="+ num[idx]);
		}
		
		//배열 생성시 초기값 설정하는 방법1
		int[] data2 = new int[]{20,65,74,5,87,2};
		for(int i=0; i<data2.length; i++){
			System.out.println("data2["+i+"]="+data2[i]);
		}
		
		//배열 생성시 초기값 설정하는 방법2
		int data3[] = {8,5,4,6,99};
		for(int i=0; i<data3.length; i++){
			System.out.println("data3["+i+"]="+data3[i]);
		}
		
	}

}
