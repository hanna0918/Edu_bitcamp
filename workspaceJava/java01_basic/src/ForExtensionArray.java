
public class ForExtensionArray {

	public static void main(String[] args) {
		int arr[]= {21, 65, 84, 95, 25, 77, 37};
		// 확장된 for문
		//배열의 데이터형 변수선언 : 배열명
		for(int data : arr) {
			System.out.print(data+"\t");
		}
		System.out.println();
		
		//2차원배열
		int arr2[][] = {
						{60, 80, 40, 60},
						{56, 76, 66, 86},
						{17, 27, 37, 36}
						};
		// 1차원배열변수 : 2차원배열명
		for(int data[]:arr2) {
			// 배열의 데이터형변수 : 1차원배열명
			for(int z:data) {
				System.out.print(z+"\t");
			}
			System.out.println();
		}
	}

}
