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
			// 0 ~ 약65000 port
			ServerSocket ss = new ServerSocket(12000);
			System.out.println("Server Start.....");
			
			while(true) {
				System.out.println("접속대기중ㅇㅅㅇ!");
				Socket s = ss.accept();	//클라이언트의 접속을 기다리는중
				System.out.println("클라이언트가 접속하였습니다.");
				InetAddress ia = s.getInetAddress();	//접속한 사람의 ip보관
				System.out.println("접속자의 ip --> "+ ia.getHostAddress());


				//접속자에게 문자보내기		OutputStream필요
				OutputStream os = s.getOutputStream();	//byte
				OutputStreamWriter osw = new OutputStreamWriter(os);	//한글자
				PrintWriter pw = new PrintWriter(osw);	//한 줄

				pw.println("welcome~~~~ 안녕!!");
				pw.flush();	//닫기

				//클라이언트가 보낸 문자 받기
				InputStream is = s.getInputStream();
				InputStreamReader isr = new InputStreamReader(is);
				BufferedReader br = new BufferedReader(isr);

				String data = br.readLine();
				System.out.println("서버가 받은 문자 --> "+ data);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	

	public static void main(String[] args) {
		new ServerSocketTest();

	}

}
