import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class SocketTest {

	public SocketTest() {
		
	}
	
	public void startClient() {
		//socket(InetAddress, port)
		//InetAddress : ������ǻ���� ip�� �̿��Ͽ� �����Ѵ�.
		//port : �������� open�� port��ȣ�� �̿��Ѵ�.
		try {
			InetAddress ia = InetAddress.getByName("192.168.7.8");
			Socket s = new Socket(ia, 12000);// ������ �����̵�
			
			
			//�������� ���� ���� ���� InputStream��ü�� ����
			
			InputStream is = s.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			String inData = br.readLine();
			
			System.out.println("�������� ���� ���� --> "+inData);
			
			//Ŭ���̾�Ʈ�� ������ ���� ������
			OutputStream os = s.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os);
			PrintWriter pw = new PrintWriter(osw);
			
			pw.println("�ȳ� �� Ŭ���̾�Ʈ �� ������ ������? ");
			pw.flush();
						
			

		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

	public static void main(String[] args) {
		new SocketTest().startClient();
		

	}

}
