import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderTest {

	public BufferedReaderTest() {
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.print("입력=");
			String txt = br.readLine();	//enter까지의 문자열을 버퍼에 담은 후 한줄씩 String으로 변환하여 리턴함.
			System.out.println("txt="+txt);
		}catch(Exception e) {}
	}

	public static void main(String[] args) {
		new BufferedReaderTest();

	}

}
