import java.util.Arrays;

public class ArraysTest {

	public ArraysTest() {
		//Arrays : 배열관련 처리 클래스
		int[] data = {15, 90, 44, 77, 56, 26, 78};
		//Arrays.sort(data);
		Arrays.sort(data, 2, 5);	//[15, 90, 44, 56, 77, 26, 78]
		//									   2--------4 2~5앞까지 자리만 정렬
		
		System.out.println(Arrays.toString(data));
	}

	public static void main(String[] args) {
		new ArraysTest();
		
	}

}
