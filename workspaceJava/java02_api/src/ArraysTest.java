import java.util.Arrays;

public class ArraysTest {

	public ArraysTest() {
		//Arrays : �迭���� ó�� Ŭ����
		int[] data = {15, 90, 44, 77, 56, 26, 78};
		//Arrays.sort(data);
		Arrays.sort(data, 2, 5);	//[15, 90, 44, 56, 77, 26, 78]
		//									   2--------4 2~5�ձ��� �ڸ��� ����
		
		System.out.println(Arrays.toString(data));
	}

	public static void main(String[] args) {
		new ArraysTest();
		
	}

}
