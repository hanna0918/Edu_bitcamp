import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UnicasteSend {
	DatagramSocket ds;
	DatagramPacket dp;
	InetAddress ia;
	
	public UnicasteSend() {
		String data = "�ڹ� ��� ���α׷� �׽�Ʈ(DatagramSocket, DatagramPacket)";
		
		try {
			ds = new DatagramSocket();
			// DatagramPacket(byte[] buf, int length, InetAddress address, int port)
			ia = InetAddress.getByName("192.168.0.28");
			dp = new DatagramPacket(data.getBytes(), data.getBytes().length, ia, 15000);
			
			ds.send(dp);
			System.out.println("********** ������ �Ϸ� **********");
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new UnicasteSend();

	}

}
