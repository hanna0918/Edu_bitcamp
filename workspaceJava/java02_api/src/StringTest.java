
public class StringTest {

	public StringTest() {
		
	}
	public void start() {
		//			   012 3 456 7 8910
		String str1 = "서울시 마포구 신수동";
		String str2 = "서울시 마포구 신수동";	//일반 데이터 비교용 연산자
		String str3 = new String("서울시 마포구 신수동");	//객체(==비교불가)메소드로 비교
		String data = str3;
		
		
		byte[] byteData = {65, 66, 67, 68}; //아스키코드 값 -> ABCD
		String str4 = new String(byteData);	// "ABCD"로 입력
		
		char[] charData = {'X', 'Y', 'Z'}; //"XYZ
		String str5 = new String(charData);
		
		int[] intData = {65,66,67,68,69,70};
		String str6 = new String(intData,2, 3);// index 2부터 3개를 문자로 생성하라
		
		System.out.println("byteData=" + str4);
		System.out.println("charData=" + str5);
		System.out.println("intData=" + str6);
		
		if(str1 == str2) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		if(str1 == str3) {
			System.out.println("같다!!");
		}else {
			System.out.println("다르다!!");
		}
		if(str1.equals(str3)) {//객체와 객체가 같은지를 구한다. //str3.equals(str1)
			System.out.println("같다~~");
		}else {
			System.out.println("다르다~~");
		}
		
		if(str3 == data) {
			System.out.println("같다---");
		}else {
			System.out.println("다르다---");
		}
		str3 = "서울시 종로구";
		System.out.println(str3);		
		System.out.println(data);
		
		char c = str1.charAt(2);//index위치의 문자 1개를 얻어온다.
		System.out.println("str1.charAt(2)-> "+c);
		
		String result = str1 + str2;
		String result2 = str1.concat(str2);
		System.out.println("result ="+result);
		System.out.println("result2 = "+result2);
		//			인덱스0123456789...
		String data2 = "Java String Test...";
		String data3 = "java string test...";
		if(data2.equals(data3)) {
			System.out.println("같다***");
		}else {
			System.out.println("다르다***");
		}
		
		if(data2.equalsIgnoreCase(data3)) {//대소문자 구별없이 같은지 비교
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		byte[] byteCode = data2.getBytes();	// 문자열을 byte배열로 구한다.
		for (byte b : byteCode) {
			System.out.println((char)b+"-->"+b);
		}
		
		int idx = data2.indexOf("t");//특정문자의 index위치를 구한다.	//문자열이 없으면-1
		System.out.println("indexOf-> "+ idx);//가정 먼저 나오는 t를 구함
		
		int idx2 = data2.indexOf("t", 10); //t를 찾는데 10번째부터 찾아라.
		System.out.println("indexOf--> " + idx2);
		
		int idx3 = data2.lastIndexOf("t");//특정 문자를 뒤에서 검색하여 index를 구한다.
		System.out.println("lastIndexOf--> "+ idx3);
		
		System.out.println("length = "+data2.length());//문자의 길이(글자수)
		
		//특정문자를 다른문자로 변경한다.
		//String data2 = "Java String Test...";
		data2 =data2.replaceAll("a", "에이");	//변수에 대입 필요
		System.out.println("replaceAll=> "+data2);
		
		String data4 = "010-1234-5678";
		String [] tel = data4.split("-");	// 특정문자로 문자열을 조각낸다.
		for(int i=0; i<tel.length; i++) {
			System.out.println("tel["+i+"]= "+tel[i]);
		}
		
		//substring : 특정문자열에서 일부 문자열을 얻어온다.
		// substring(a) a는 시작위치
		// substring(a,b) start a end b 
		String tel1 = data4.substring(4);// 1234-5678
		String tel2 = data4.substring(4, 8);// 1234
		System.out.println(tel1 + ", " + tel2);
		
		//String data2 = "J에이v에이 String Test...";
		//toCharArray() : 문자열을 char배열로 구해준다.
		char[] charData2 = data2.toCharArray();
		for(char cc : charData2) {
			System.out.println(cc);
		}
		
		//toLowerCase : 소문자로 변경, toUpperCase : 대문자로 변경
		String toLower = data2.toLowerCase();		
		String toUpper = data2.toUpperCase();
		System.out.println(toLower+", "+toUpper);
		
		
		String data6 = "    Spring FrameWork	";
		//	trim : 문자열의 양쪽 공백문자를 제거
		String dataTrim = data6.trim();
		System.out.println("AA" + dataTrim + "BB");
		
		int num = 1234;
		String s1 = num+"";//문자화
		String s2 = String.valueOf(num);
		System.out.println(s1+1234);
		System.out.println(s2+5678);
		
		char[] aa = {'S','T','U'};
		String sss = new String(aa);
		String sss2 = String.valueOf(aa);
		
		System.out.println(sss);
		System.out.println(sss2);
		
		String data7 = "Apple";
		String data8 = "apple";
		int r1 = data7.compareTo(data8); //-32	양수는 왼쪽 객체가 크고, 음수는 오른쪽 객체가 크다.
		int r2 = data8.compareTo(data7); //32	0은 두 객체 크기가 같다.
		System.out.println(r1+", "+r2);
		//compareToIgnoreCase는 대소문자 구분없이 비교
		
	}

	public static void main(String[] args) {
		new StringTest().start();

	}

}
