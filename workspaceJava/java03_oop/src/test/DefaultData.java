package test;

public class DefaultData {
	String name = "홍길동";
	String tel = "010-1234-5678";
	
	public DefaultData() {
		
	}
	
	public DefaultData(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public static void sum() {
		int tot = 0;
		for(int i=1; i<=100; i++) {//지역변수는 sum이 실행될때 생성
			tot +=i;
			
		}
		System.out.println("tot="+tot);
	}
	public String getName() {
		return name;//new로 생성할때만 사용가능
	}//static을 사용할 경우 공통변수로 사용됨
}
