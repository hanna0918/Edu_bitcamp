import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketTest {

	public ServerSocketTest() {
		serverStart();
	}
	
	public void serverStart() {
		try {
			// 0 ~ ��65000 port
			ServerSocket ss = new ServerSocket(12000);
			System.out.println("Server Start.....");
			
			while(true) {
				System.out.println("���Ӵ���ߤ�����!");
				Socket s = ss.accept();	//Ŭ���̾�Ʈ�� ������ ��ٸ�����
				System.out.println("Ŭ���̾�Ʈ�� �����Ͽ����ϴ�.");
				InetAddress ia = s.getInetAddress();	//������ ����� ip����
				System.out.println("�������� ip --> "+ ia.getHostAddress());


				//�����ڿ��� ���ں�����		OutputStream�ʿ�
				OutputStream os = s.getOutputStream();	//byte
				OutputStreamWriter osw = new OutputStreamWriter(os);	//�ѱ���
				PrintWriter pw = new PrintWriter(osw);	//�� ��

				pw.println("welcome~~~~ �ȳ�!!");
				pw.flush();	//�ݱ�

				//Ŭ���̾�Ʈ�� ���� ���� �ޱ�
				InputStream is = s.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);

				String data = br.readLine();
				System.out.println("������ ���� ���� --> "+ data);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		new ServerSocketTest();

	}

}
