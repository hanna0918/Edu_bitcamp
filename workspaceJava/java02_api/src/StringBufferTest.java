
public class StringBufferTest {

	public StringBufferTest() {
		start();
	}
	public void start() {
		StringBuffer sb1 = new StringBuffer();	//�̼����� 16byte
		StringBuffer sb2 = new StringBuffer(100);//�����ϴ� ��ŭ Ȯ��
		
		//append() : ���ڿ� �߰�
		sb1.append("Buffer append Test...");
		sb1.append(123456);
		
		//insert() : index��ġ ���� ����
		sb1.insert(5, "(��Ʈ������)");
		sb1.insert(15, 23235.1234564);
		
		//deleteCharAt
		//0123456 7
		//Buffe(��Ʈ������)r a23235.1234564ppend Test...123456
		sb1.deleteCharAt(6);
		//Buffe(Ʈ������)r a23235.1234564ppend Test...123456
		
		sb1.delete(1, 4);// index 1~4�ձ��� �����
		//0123 4567
		//Be(Ʈ������)r a23235.1234564ppend Test...123456
		
		sb1.replace(1,  3, "(�ڹ�)");// index 1~�ձ����� "(�ڹ�)"�� ġȯ
		//B(�ڹ�)Ʈ������)r a23235.1234564ppend Test...123456
		
		sb1.reverse();
		
		
		//Ȯ���� ���� Ȯ���ϱ�
		System.out.println("sb1.capacity= "+sb1.capacity());	//16byte
		System.out.println("sb2.capacity= "+sb2.capacity());	//100byte
		System.out.println(sb1);
	}
	
	
	public static void main(String[] args) {
		new StringBufferTest();

	}

}