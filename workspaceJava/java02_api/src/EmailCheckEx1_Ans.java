import java.util.Scanner;

public class EmailCheckEx1_Ans {
	Scanner scan = new Scanner(System.in);	
	String email;
	public EmailCheckEx1_Ans() {
		start();
	}
	public void start() {
		do {
			String email = inputEmail();
			if(emailCheck(email)) {//정상입력 이메일
				//아이디, 도메인 분리해서 출력
				emailPrint(email);
			}else {//false 잘못된 메일
				errorMailMessage(email);
			}
		}while(true);
	}
	
	//이메일 입력
	public String inputEmail() {
		System.out.println("이메일입력 = ");
		return scan.nextLine();
	}
	
	//아이디와 도메인 분리하여 출력하기
	public void emailPrint(String email) {
		/*
		String[] emailSplit= email.split("@");
		System.out.println("아이디 = "+emailSplit[0]);
		System.out.println("도메인 = "+emailSplit[1]);
		*/
		int atMark = email.indexOf("@");
		String id = email.substring(0, atMark);
		String domain = email.substring(atMark+1);
		System.out.println("아이디="+id);
		System.out.println("도메인="+domain);
	}
	
	
	//이메일이 정상,잘못 확인
	public boolean emailCheck(String email) {
		//정상 : true, 잘못 : false
		//@ : at mark
		int atMark = email.indexOf("@");	//0,1,2,3,4......	없을땐-1
		int point = email.indexOf(".");
		if(atMark==-1 || point==-1 || atMark>point || point-atMark<=2) {//잘못된 메일주소일때
			return false;
		}else {//정상 메일주소일때 
			return true;
		}
		
	}
	
	//잘못된 메일 메세지
	public void errorMailMessage(String email) {
		System.out.println(email+"은 잘못된 이메일 주소입니다.");
	}
	
	
	public static void main(String[] args) {
		new EmailCheckEx1_Ans().start();;

	}

}
/*
 
 실행
 이메일 입력 = gogo@nate
 이메일을 잘못입력하였습니다.
 
 이메일 입력 = gogo.com
 이메일을 잘못입력하였습니다.
 
 이메일 입력 = gogo@nate.com
 아이디 = gogo
 도메인 = nate.com
 
 이메일 = 
 
*/