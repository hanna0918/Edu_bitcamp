import java.net.InetAddress;

public class InetAddressTest {

	public InetAddressTest() {
		//���� �� ��ǻ���� ip�� �̿��� InetAddress ��ü �����ϱ�
		try {
			InetAddress ia1 = InetAddress.getLocalHost();// InetAddress ��ü����
			
			String hostAddr1 = ia1.getHostAddress();//ip ��������
			String hostName1 = ia1.getHostName();	//host�̸� ��������
			
			System.out.println("hostAddr1 -->" + hostAddr1);
			System.out.println("hostName1 -->" + hostName1);
			System.out.println(ia1);
			
			//url�ּҷ� InetAddress��ü�� �����ϸ� ip, url������ ��ü�� ������ �ִ�.
			InetAddress nate = InetAddress.getByName("www.nate.com");
			System.out.println("nate->Address-->"+nate.getHostAddress());		//nate�� Address ���
			System.out.println("nate->Name -->" + nate.getHostName());			//������ �̸� ���
			
			InetAddress nateIp = InetAddress.getByName("120.50.131.112");		//������ �̸� 
			System.out.println("nateIp->Address-->"+nateIp.getHostAddress());	//ip
			System.out.println("nateIp->Name-->"+nateIp.getHostName());			//ip
			
			//InetAddress ��ü ��ü ���ϱ�
			System.out.println("---------------------------------------------");
			InetAddress[] ip = InetAddress.getAllByName("www.naver.com");
			for(InetAddress ia:ip) {
				System.out.println("address-->" + ia.getHostAddress());
				System.out.println("name-->" + ia.getHostName()+"\n=============================================");
			}
			
			
			
		}catch(Exception e) {
			System.out.println("InetAddress ���� �߻�.....");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new InetAddressTest();

	}

}
