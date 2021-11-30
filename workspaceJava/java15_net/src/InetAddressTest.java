import java.net.InetAddress;

public class InetAddressTest {

	public InetAddressTest() {
		//현재 내 컴퓨터의 ip를 이용한 InetAddress 객체 생성하기
		try {
			InetAddress ia1 = InetAddress.getLocalHost();// InetAddress 객체생성
			
			String hostAddr1 = ia1.getHostAddress();//ip 가져오기
			String hostName1 = ia1.getHostName();	//host이름 가져오기
			
			System.out.println("hostAddr1 -->" + hostAddr1);
			System.out.println("hostName1 -->" + hostName1);
			System.out.println(ia1);
			
			//url주소로 InetAddress객체를 생성하면 ip, url정보를 객체가 가지고 있다.
			InetAddress nate = InetAddress.getByName("www.nate.com");
			System.out.println("nate->Address-->"+nate.getHostAddress());		//nate의 Address 출력
			System.out.println("nate->Name -->" + nate.getHostName());			//도메인 이름 출력
			
			InetAddress nateIp = InetAddress.getByName("120.50.131.112");		//도메인 이름 
			System.out.println("nateIp->Address-->"+nateIp.getHostAddress());	//ip
			System.out.println("nateIp->Name-->"+nateIp.getHostName());			//ip
			
			//InetAddress 전체 객체 구하기
			System.out.println("---------------------------------------------");
			InetAddress[] ip = InetAddress.getAllByName("www.naver.com");
			for(InetAddress ia:ip) {
				System.out.println("address-->" + ia.getHostAddress());
				System.out.println("name-->" + ia.getHostName()+"\n=============================================");
			}
			
			
			
		}catch(Exception e) {
			System.out.println("InetAddress 오류 발생.....");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new InetAddressTest();

	}

}
