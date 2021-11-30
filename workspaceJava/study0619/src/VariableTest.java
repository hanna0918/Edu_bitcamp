
public class VariableTest {
	int a = 5;
	
	public VariableTest() {
		
	}
	
	public void Print() {
		int a = 6;
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		VariableTest vt = new VariableTest();
		vt.Print();

	}

}
