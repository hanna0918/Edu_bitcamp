import java.util.Scanner;
public class AscEx {
	Scanner scan = new Scanner(System.in);
	char m;	
	int result;
	
	public AscEx() {
		AscExScan();
		AscCasting();
		AscPrint();
		
	}
	public void AscExScan() {
		System.out.print("문자입력=");
		this.m = scan.next().charAt(0);
	}
	public void AscCasting() {
		if (this.m>=65 && this.m<=90) {
			result = m+32;
		}else if(this.m>=97 && this.m<=122) {
			result = m-32;
		}
	}
	public void AscPrint() {
		char k = (char)result;
		System.out.println(k);
	}

	public static void main(String[] args) {
		new AscEx();

	}

}
