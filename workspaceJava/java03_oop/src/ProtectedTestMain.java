import test.ProtectedTest2;

public class ProtectedTestMain extends ProtectedTest2{
	
	ProtectedTestMain(){
		//같은 패키지내의 다른 클래스는 default처럼 사용가능
		ProtectedTest pt = new ProtectedTest();
		System.out.println("pt.num="+pt.num);
		pt.print();
		
		//다른 패키지의 클래슨느 객체를 생성할수 없다.
		//ProtectedTest2 pt2 = new ProtectedTest2();
		
		//protected접근제한자는 다른 패키지일 경우 상속받아 사용한다.
		System.out.println("tel="+tel);
		telOutput();
	}
	public static void main(String[] args) {
		new ProtectedTestMain();
		
		
		
		ProtectedTest2 ppt = ProtectedTest2.getInstance();
		System.out.println(ppt.getTel());
	}

}
