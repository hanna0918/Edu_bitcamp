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
			if(emailCheck(email)) {//�����Է� �̸���
				//���̵�, ������ �и��ؼ� ���
				emailPrint(email);
			}else {//false �߸��� ����
				errorMailMessage(email);
			}
		}while(true);
	}
	
	//�̸��� �Է�
	public String inputEmail() {
		System.out.println("�̸����Է� = ");
		return scan.nextLine();
	}
	
	//���̵�� ������ �и��Ͽ� ����ϱ�
	public void emailPrint(String email) {
		/*
		String[] emailSplit= email.split("@");
		System.out.println("���̵� = "+emailSplit[0]);
		System.out.println("������ = "+emailSplit[1]);
		*/
		int atMark = email.indexOf("@");
		String id = email.substring(0, atMark);
		String domain = email.substring(atMark+1);
		System.out.println("���̵�="+id);
		System.out.println("������="+domain);
	}
	
	
	//�̸����� ����,�߸� Ȯ��
	public boolean emailCheck(String email) {
		//���� : true, �߸� : false
		//@ : at mark
		int atMark = email.indexOf("@");	//0,1,2,3,4......	������-1
		int point = email.indexOf(".");
		if(atMark==-1 || point==-1 || atMark>point || point-atMark<=2) {//�߸��� �����ּ��϶�
			return false;
		}else {//���� �����ּ��϶� 
			return true;
		}
		
	}
	
	//�߸��� ���� �޼���
	public void errorMailMessage(String email) {
		System.out.println(email+"�� �߸��� �̸��� �ּ��Դϴ�.");
	}
	
	
	public static void main(String[] args) {
		new EmailCheckEx1_Ans().start();;

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