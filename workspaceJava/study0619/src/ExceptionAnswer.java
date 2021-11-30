import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionAnswer{
		public ExceptionAnswer() {
			start();
		}
		public void start() {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.print("����1=");
				int a = scan.nextInt();
				System.out.print("����2=");
				int b = scan.nextInt();
				int c = a / b;
				System.out.println("c="+c);

				String names[] = {"�̼���", "�������"};
				for(int i=0; i<names.length; i++) {
					System.out.println("�̸� = "+names[i]);
				}
			}catch(InputMismatchException ime) {
				System.out.println("������ �Է����ּ���.");
				ime.printStackTrace();
			}catch(ArithmeticException ae) {
				System.out.println("0���� ������ �����ϴ�.");
				ae.printStackTrace();
			}
			
		}
	public static void main(String [] args) {
		new ExceptionAnswer();
	}
}