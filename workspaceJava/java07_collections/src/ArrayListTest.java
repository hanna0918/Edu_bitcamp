import java.util.List;

public class ArrayListTest {

	public ArrayListTest() {
		CollectionData data = new CollectionData();
		List<MemberVO> lst = data.getMember();
		
		MemberVO vo2 = new MemberVO("ZZZZ","��ȹ�Ѱ���","2021-08-30",5000);
		lst.add(2, vo2);
		
		lst.remove(1);	//�ε����� ����
		lst.remove(vo2);//��ü������ ����
		for(int i=0; i<lst.size(); i++) {
			MemberVO vo = lst.get(i);
			vo.memberPrint();
		}
		
		
	}

	public static void main(String[] args) {
		new ArrayListTest();

	}

}
