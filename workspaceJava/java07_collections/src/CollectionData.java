import java.util.ArrayList;
import java.util.List;

public class CollectionData {

	public CollectionData() {
		
	}
	public List<MemberVO> getMember() {
		//ArrayList���� ��������� ��Ƽ� �����Ѵ�.
		//ArrayList <MemberVO> al = new ArrayList<MemberVO>();
		List<MemberVO> al2= new ArrayList<MemberVO>();
		
		al2.add(new MemberVO("AAAA","��ȹ��","2021-05-10",5000));
		al2.add(new MemberVO("BBBB","�ѹ���","2021-01-01",6000));
		al2.add(new MemberVO("CCCC","�λ��","2021-11-01",7000));
		al2.add(new MemberVO("DDDD","�ѹ���","2021-08-01",8500));
		al2.add(new MemberVO("EEEE","��ȹ��","2021-06-05",9000));
	
		return al2;
	
	}
}
