import java.io.IOException;
import java.io.InputStream;

public class InputStreamTest {

	public InputStreamTest() {
		try {
			//InputStream : byte단위 문자를 입력받는다.
			InputStream is = System.in;

			System.out.print("입력=");
			while(true) {
//				//read한 값이 없을경우 -1 반환.
//										//									(엔터값)	
//				int code = is.read();	//1byte읽어온다. ABCD입력시 65 66 67 68 13 10
//				if(code==-1)	{	
//					System.out.println(code);
//					break;
//				}
			
				//System.out.println((char)code);
				byte data[] = new byte[8];
				//	  cnt : read데이터수, data배열에 읽은 값이 있다.
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
