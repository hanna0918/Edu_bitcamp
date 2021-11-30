import java.util.ArrayList;
import java.util.List;

public class CollectionData {

	public CollectionData() {
		
	}
	public List<MemberVO> getMember() {
		//ArrayList에서 사원정보를 담아서 리턴한다.
		//ArrayList <MemberVO> al = new ArrayList<MemberVO>();
		List<MemberVO> al2= new ArrayList<MemberVO>();
		
		al2.add(new MemberVO("AAAA","기획부","2021-05-10",5000));
		al2.add(new MemberVO("BBBB","총무부","2021-01-01",6000));
		al2.add(new MemberVO("CCCC","인사부","2021-11-01",7000));
		al2.add(new MemberVO("DDDD","총무부","2021-08-01",8500));
		al2.add(new MemberVO("EEEE","기획부","2021-06-05",9000));
	
		return al2;
	
	}
}
