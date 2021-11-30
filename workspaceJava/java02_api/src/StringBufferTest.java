
public class StringBufferTest {

	public StringBufferTest() {
		start();
	}
	public void start() {
		StringBuffer sb1 = new StringBuffer();	//미설정시 16byte
		StringBuffer sb2 = new StringBuffer(100);//설정하는 만큼 확보
		
		//append() : 문자열 추가
		sb1.append("Buffer append Test...");
		sb1.append(123456);
		
		//insert() : index위치 문자 삽입
		sb1.insert(5, "(스트링버퍼)");
		sb1.insert(15, 23235.1234564);
		
		//deleteCharAt
		//0123456 7
		//Buffe(스트링버퍼)r a23235.1234564ppend Test...123456
		sb1.deleteCharAt(6);
		//Buffe(트링버퍼)r a23235.1234564ppend Test...123456
		
		sb1.delete(1, 4);// index 1~4앞까지 지우기
		//0123 4567
		//Be(트링버퍼)r a23235.1234564ppend Test...123456
		
		sb1.replace(1,  3, "(자바)");// index 1~앞까지를 "(자바)"로 치환
		//B(자바)트링버퍼)r a23235.1234564ppend Test...123456
		
		sb1.reverse();
		
		
		//확보된 공간 확인하기
		System.out.println("sb1.capacity= "+sb1.capacity());	//16byte
		System.out.println("sb2.capacity= "+sb2.capacity());	//100byte
		System.out.println(sb1);
	}
	
	
	public static void main(String[] args) {
		new StringBufferTest();

	}

}
