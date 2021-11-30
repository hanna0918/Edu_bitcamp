// 1. Thread클래스 상속
public class ThreadTest1 extends Thread {
	String msg;
	public ThreadTest1() {
		
	}
	public ThreadTest1(String msg) {
		this.msg = msg;
	}
	
	// 2. 스레드 구현코드를 run()에 오버라이딩
	public void run() {
		//무한루프1
		for(int i=1; ;i++) {
			System.out.println(msg+"="+i);
		}
		
	}
	public static void main(String[] args) {
		ThreadTest1 tt1 = new ThreadTest1("첫번째 스레드");
		// 3. 스레드 시작하기 위해서는 start()메소드 호출
		tt1.start();
		
		ThreadTest1 tt2 = new ThreadTest1("두번째 스레드");
		tt2.start();
		
		ThreadTest1 tt3 = new ThreadTest1("세번째 스레드");
		tt3.start();
	}

}

/*
무한루프가 두개일 경우 첫번째 무한루프가 끝나지않아서 내려올수 없으므로 두번째 무한루프에서 오류
시간차 두고 
*/