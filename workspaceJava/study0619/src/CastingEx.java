import java.util.Scanner;

public class CastingEx {
	Scanner scan = new Scanner(System.in);

	public CastingEx() {
		
	}
	public void Casting() {
		System.out.print("실수입력=");
		double i = scan.nextDouble();
		int j = (int) i;
		System.out.println(j);
		
	}
	public static void main(String[] args) {
		new CastingEx().Casting();
		
	}

}
