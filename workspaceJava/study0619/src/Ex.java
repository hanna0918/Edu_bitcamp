
public class Ex extends Test {

	public Ex() {
		
	}

	public static void main(String[] args) {
		Test t1 = new Test();
		Ex e1 = new Ex();
		Ex e2 = (Ex)t1;
		Object o1 = (Object)t1;
		//String s1 = String.valueOf(t1);
		Test t2 = (Test)e1;
		System.out.println(t2);
		

	}

}

