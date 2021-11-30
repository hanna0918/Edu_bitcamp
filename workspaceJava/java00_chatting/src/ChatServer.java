import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ChatServer extends Thread{
	ServerSocket ss;
	//��� �����ڸ� CHatService ��ü�� ����� ������ �÷���
	List<ChatService> connList = new ArrayList<ChatService>();
	
	public ChatServer() {
		this.start();
		
	}
	
	// ������ ����ϴ� Thread
	public void run() {
		try {
			ss = new ServerSocket(13000);
			while(true) {
				System.out.println("���� ����� ....������");
				Socket s = ss.accept();
				
				//���� ������
				 ChatService service = new ChatService(s);
				 connList.add(service);
				 
				 service.allMessageSend("*MG$"+service.id+"���� �����Ͽ����ϴ�.");
				 service.allMessageSend("$CN#"+connList.size());	//������ �� 
				 service.allUserListSend(); //��ü ������ ����Ʈ ���
				 
				 service.start();
			}
		}catch(Exception e) {
			System.out.println("!! ServerSocket ��ü���� ���� �߻� !!");
			e.printStackTrace();
		}
	}
	
	
	//������ ������ ���� ��ü
	class ChatService extends Thread {
		Socket s;
		String id;
		BufferedReader br;
		PrintWriter pw;
		
		ChatService(){}
		ChatService(Socket s){
			this.s = s;
			id = s.getInetAddress().getHostAddress();//id
			try {
				//Ŭ���̾�Ʈ�� ���� ���ڸ� �޴� ��ü
				br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				
				//�������� Ŭ���̾�Ʈ ���� ������ ��ü
				pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
				
				
			}catch(Exception e) {
				System.out.println("!! ChatService������ �޼ҵ� ���� !!");
				e.printStackTrace();
			}
		}
		
		//Ŭ���̾�Ʈ�� ������ ������ ���� �ޱ�
		public void run() {
			while(true) {
				try {
					String msg = br.readLine();
					if(msg!=null && !msg.equals("")) {
						allMessageSend("*MG$"+id+"�� : "+msg);
					}
				}catch(Exception e) {
					
				}
			}
		}
		//�������� ��� �����ڿ��� ���� ������
		public void allMessageSend(String msg) {
			System.out.println(msg);
			for(int i=0; i<connList.size(); i++) {
				ChatService cs = connList.get(i);
				try {
					cs.pw.println(msg);
					cs.pw.flush();
				}catch(Exception e) {
					//Ŭ���̾�Ʈ���� Output�� ���ܰ� �߻��ϸ� �ش� Ŭ���̾�Ʈ�� ������ ����ȴ�.
					connList.remove(i);
					i--;
				}
			}
		}
		//�������� Ŭ���̾�Ʈ���� ��ü ������ ����Ʈ ������
		public void allUserListSend() {
			String user = "@LI*";
			for(int i=0; i<connList.size(); i++) {
				user += connList.get(i).id + "/";
			}
			allMessageSend(user);
		}
	}
	
	public static void main(String[] args) {
		new ChatServer();
	}
}
