import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLTest {

	public URLTest() {
		try {
			// url주소 (protocol, host, port, filename 등을 이용하여 객체를 생성하면 
			// 해당 서버의 리소스를 얻어올수있다.
		
			
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
			
			//URLConnection 객체를 구하여 헤더정보를 얻어올 수 있다.			
			URLConnection connection = url.openConnection();
			connection.connect();//통신채널을 확보하여야 헤더정보를 얻어올 수 있다.
			
			String type = connection.getContentType();//헤더정보 구하기
			System.out.println("content-type --> "+type);
			
			//코드 얻어오기
			int idx = type.indexOf("charset=");
			String encode = type.substring(idx+8);
			
			System.out.println("encode = "+ encode);
			
			
			//url객체에서 resource 가져오기
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
