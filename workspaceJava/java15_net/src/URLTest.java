import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {

	public URLTest() {
		try {
			// url�ּ� (protocol, host, port, filename ���� �̿��Ͽ� ��ü�� �����ϸ� 
			// �ش� ������ ���ҽ��� ���ü��ִ�.
		
			
			URL url = new URL("https://www.google.com/");
			
			String protocol = url.getProtocol();
			String host = url.getHost();
			int port = url.getPort();
			String file = url.getFile();
			String path = url.getPath();
			
			System.out.println("Protocol -> " + protocol);
			System.out.println("Host -> " + host);
			System.out.println("Port -> "+ port);
			System.out.println("File -> "+ file);
			System.out.println("Path -> "+ path);
			
			//URLConnection ��ü�� ���Ͽ� ��������� ���� �� �ִ�.			
			URLConnection connection = url.openConnection();
			connection.connect();//���ä���� Ȯ���Ͽ��� ��������� ���� �� �ִ�.
			
			String type = connection.getContentType();//������� ���ϱ�
			System.out.println("content-type --> "+type);
			
			//�ڵ� ������
			int idx = type.indexOf("charset=");
			String encode = type.substring(idx+8);
			
			System.out.println("encode = "+ encode);
			
			
			//url��ü���� resource ��������
			InputStream is = url.openStream();
			
			InputStreamReader isr = new InputStreamReader(is, encode);
			BufferedReader br = new BufferedReader(isr);
			
			while(true) {
				String readData = br.readLine();
				if(readData ==null) break;
				//System.out.println(readData);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		new URLTest();

	}

}
