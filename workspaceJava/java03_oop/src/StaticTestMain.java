import java.util.Calendar;

public class StaticTestMain {

	public StaticTestMain() {
		
	}

	public static void main(String[] args) {
		StaticTest ss = new StaticTest();
		StaticTest ss2 = new StaticTest();
		
		ss.setAddr("영등포구");
		
		String address = ss2.getAddr();
		System.out.println("address = "+ address);
		
		//static 멤버변수는 객체를 새성하지않고 사용할수있다.
		System.out.println("name=" + StaticTest.addr);
		
		Calendar now = Calendar.getInstance();
		System.out.println(now.get(Calendar.YEAR));
	}

}
