
public class StringTest {

	public StringTest() {
		
	}
	public void start() {
		//			   012 3 456 7 8910
		String str1 = "����� ������ �ż���";
		String str2 = "����� ������ �ż���";	//�Ϲ� ������ �񱳿� ������
		String str3 = new String("����� ������ �ż���");	//��ü(==�񱳺Ұ�)�޼ҵ�� ��
		String data = str3;
		
		
		byte[] byteData = {65, 66, 67, 68}; //�ƽ�Ű�ڵ� �� -> ABCD
		String str4 = new String(byteData);	// "ABCD"�� �Է�
		
		char[] charData = {'X', 'Y', 'Z'}; //"XYZ
		String str5 = new String(charData);
		
		int[] intData = {65,66,67,68,69,70};
		String str6 = new String(intData,2, 3);// index 2���� 3���� ���ڷ� �����϶�
		
		System.out.println("byteData=" + str4);
		System.out.println("charData=" + str5);
		System.out.println("intData=" + str6);
		
		if(str1 == str2) {
			System.out.println("����");
		}else {
			System.out.println("�ٸ���");
		}
		if(str1 == str3) {
			System.out.println("����!!");
		}else {
			System.out.println("�ٸ���!!");
		}
		if(str1.equals(str3)) {//��ü�� ��ü�� �������� ���Ѵ�. //str3.equals(str1)
			System.out.println("����~~");
		}else {
			System.out.println("�ٸ���~~");
		}
		
		if(str3 == data) {
			System.out.println("����---");
		}else {
			System.out.println("�ٸ���---");
		}
		str3 = "����� ���α�";
		System.out.println(str3);		
		System.out.println(data);
		
		char c = str1.charAt(2);//index��ġ�� ���� 1���� ���´�.
		System.out.println("str1.charAt(2)-> "+c);
		
		String result = str1 + str2;
		String result2 = str1.concat(str2);
		System.out.println("result ="+result);
		System.out.println("result2 = "+result2);
		//			�ε���0123456789...
		String data2 = "Java String Test...";
		String data3 = "java string test...";
		if(data2.equals(data3)) {
			System.out.println("����***");
		}else {
			System.out.println("�ٸ���***");
		}
		
		if(data2.equalsIgnoreCase(data3)) {//��ҹ��� �������� ������ ��
			System.out.println("same");
		}else {
			System.out.println("not same");
		}
		
		byte[] byteCode = data2.getBytes();	// ���ڿ��� byte�迭�� ���Ѵ�.
		for (byte b : byteCode) {
			System.out.println((char)b+"-->"+b);
		}
		
		int idx = data2.indexOf("t");//Ư�������� index��ġ�� ���Ѵ�.	//���ڿ��� ������-1
		System.out.println("indexOf-> "+ idx);//���� ���� ������ t�� ����
		
		int idx2 = data2.indexOf("t", 10); //t�� ã�µ� 10��°���� ã�ƶ�.
		System.out.println("indexOf--> " + idx2);
		
		int idx3 = data2.lastIndexOf("t");//Ư�� ���ڸ� �ڿ��� �˻��Ͽ� index�� ���Ѵ�.
		System.out.println("lastIndexOf--> "+ idx3);
		
		System.out.println("length = "+data2.length());//������ ����(���ڼ�)
		
		//Ư�����ڸ� �ٸ����ڷ� �����Ѵ�.
		//String data2 = "Java String Test...";
		data2 =data2.replaceAll("a", "����");	//������ ���� �ʿ�
		System.out.println("replaceAll=> "+data2);
		
		String data4 = "010-1234-5678";
		String [] tel = data4.split("-");	// Ư�����ڷ� ���ڿ��� ��������.
		for(int i=0; i<tel.length; i++) {
			System.out.println("tel["+i+"]= "+tel[i]);
		}
		
		//substring : Ư�����ڿ����� �Ϻ� ���ڿ��� ���´�.
		// substring(a) a�� ������ġ
		// substring(a,b) start a end b 
		String tel1 = data4.substring(4);// 1234-5678
		String tel2 = data4.substring(4, 8);// 1234
		System.out.println(tel1 + ", " + tel2);
		
		//String data2 = "J����v���� String Test...";
		//toCharArray() : ���ڿ��� char�迭�� �����ش�.
		char[] charData2 = data2.toCharArray();
		for(char cc : charData2) {
			System.out.println(cc);
		}
		
		//toLowerCase : �ҹ��ڷ� ����, toUpperCase : �빮�ڷ� ����
		String toLower = data2.toLowerCase();		
		String toUpper = data2.toUpperCase();
		System.out.println(toLower+", "+toUpper);
		
		
		String data6 = "    Spring FrameWork	";
		//	trim : ���ڿ��� ���� ���鹮�ڸ� ����
		String dataTrim = data6.trim();
		System.out.println("AA" + dataTrim + "BB");
		
		int num = 1234;
		String s1 = num+"";//����ȭ
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
		int r1 = data7.compareTo(data8); //-32	����� ���� ��ü�� ũ��, ������ ������ ��ü�� ũ��.
		int r2 = data8.compareTo(data7); //32	0�� �� ��ü ũ�Ⱑ ����.
		System.out.println(r1+", "+r2);
		//compareToIgnoreCase�� ��ҹ��� ���о��� ��
		
	}

	public static void main(String[] args) {
		new StringTest().start();

	}

}