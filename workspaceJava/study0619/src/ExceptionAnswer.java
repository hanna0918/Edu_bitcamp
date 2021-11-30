import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionAnswer{
		public ExceptionAnswer() {
			start();
		}
		public void start() {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.print("숫자1=");
				int a = scan.nextInt();
				System.out.print("숫자2=");
				int b = scan.nextInt();
				int c = a / b;
				System.out.println("c="+c);

				String names[] = {"이순신", "세종대왕"};
				for(int i=0; i<names.length; i++) {
					System.out.println("이름 = "+names[i]);
				}
			}catch(InputMismatchException ime) {
				System.out.println("정수를 입력해주세요.");
				ime.printStackTrace();
			}catch(ArithmeticException ae) {
				System.out.println("0으로 나눌수 없습니다.");
				ae.printStackTrace();
			}
			
		}
	public static void main(String [] args) {
		new ExceptionAnswer();
	}
}