import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public InputStreamTest() {
		try {
			//InputStream : byte���� ���ڸ� �Է¹޴´�.
			InputStream is = System.in;

			System.out.print("�Է�=");
			while(true) {
//				//read�� ���� ������� -1 ��ȯ.
//										//									(���Ͱ�)	
//				int code = is.read();	//1byte�о�´�. ABCD�Է½� 65 66 67 68 13 10
//				if(code==-1)	{	
//					System.out.println(code);
//					break;
//				}
			
				//System.out.println((char)code);
				byte data[] = new byte[8];
				//	  cnt : read�����ͼ�, data�迭�� ���� ���� �ִ�.
				//int cnt = is.read(data);
				int cnt = is.read(data, 2, 3);
				System.out.println(cnt+"-->"+new String(data));
			}
			
		}catch(IOException e) {}
		System.out.println("--------------------------");
	}
	
	public static void main(String[] args) {
		new InputStreamTest();
	}
}
