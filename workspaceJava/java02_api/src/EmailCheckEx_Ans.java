import java.util.Scanner;

public class EmailCheckEx_Ans {
	Scanner scan = new Scanner(System.in);	
	String email;
	public EmailCheckEx_Ans() {
		emailCheckStart();
	}
	public void emailCheckStart() {
		//�̸��� �Է�
		String email = scan.nextLine();
		
		emailInput(email);
		
		//����
	}
	//�̸��� �Է� 
	public void emailInput(String email) {
		System.out.println("�̸��� �Է� = ");
	}
	
	//��������
	
	
	
	public static void main(String[] args) {
		new EmailCheckEx_Ans();

	}

}
/*
 
 ����
 �̸��� �Է� = gogo@nate
 �̸����� �߸��Է��Ͽ����ϴ�.
 
 �̸��� �Է� = gogo.com
 �̸����� �߸��Է��Ͽ����ϴ�.
 
 �̸��� �Է� = gogo@nate.com
 ���̵� = gogo
 ������ = nate.com
 
 �̸��� = 
 
*/