
public class ForExtensionArray {

	public static void main(String[] args) {
		int arr[]= {21, 65, 84, 95, 25, 77, 37};
		// Ȯ��� for��
		//�迭�� �������� �������� : �迭��
		for(int data : arr) {
			System.out.print(data+"\t");
		}
		System.out.println();
		
		//2�����迭
		int arr2[][] = {
						{60, 80, 40, 60},
						{56, 76, 66, 86},
						{17, 27, 37, 36}
						};
		// 1�����迭���� : 2�����迭��
		for(int data[]:arr2) {
			// �迭�� ������������ : 1�����迭��
			for(int z:data) {
				System.out.print(z+"\t");
			}
			System.out.println();
		}
	}

}
