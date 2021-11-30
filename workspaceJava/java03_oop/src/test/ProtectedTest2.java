package test;

public class ProtectedTest2 {
	protected String tel = "010-1234-1234";
	//객체생성 불가
	protected ProtectedTest2(){
		System.out.println("다른 패키지의 생성자메소드");
	}
	protected void telOutput() {
		System.out.println("전화번호="+tel);
	}
	
	public String getTel() {
		return tel;
	}
	public static ProtectedTest2 getInstance() {
		return new ProtectedTest2();
	}
	
}
