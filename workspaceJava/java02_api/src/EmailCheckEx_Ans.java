import java.util.Scanner;

public class EmailCheckEx_Ans {
	Scanner scan = new Scanner(System.in);	
	String email;
	public EmailCheckEx_Ans() {
		emailCheckStart();
	}
	public void emailCheckStart() {
		//이메일 입력
		String email = scan.nextLine();
		
		emailInput(email);
		
		//오류
	}
	//이메일 입력 
	public void emailInput(String email) {
		System.out.println("이메일 입력 = ");
	}
	
	//오류추적
	
	
	
	public static void main(String[] args) {
		new EmailCheckEx_Ans();

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