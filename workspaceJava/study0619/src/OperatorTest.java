import java.util.Scanner;

public class OperatorTest {
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		
		int i = a/100;
		int j = (i/10)*10;
		int result = (a/100)-j;
		System.out.println(result);

		
	}

}
