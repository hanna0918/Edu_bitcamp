import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public HashSetTest() {
		// Set�������̽��� ��ӹ��� Ŭ����
		//	1. �Է¼����� �������� �ʴ´�.
		//	2. �ߺ������͸� ������� �ʴ´�.
		
		double[] data = {11.1, 52.1, 5.1, 9.3, 11.1, 84.2, 52.9};
		//				{11.1, 52.1, 5.1, 9.3, 84.2, 52.9}
		
		HashSet<Double> hs = new HashSet<Double>();
		
		for(double d : data) {
			hs.add(d);
		}
		System.out.println("size="+hs.size());
		
		Iterator<Double> ii = hs.iterator();
		
		while(ii.hasNext()) {//��ü�� ������ true, ������ false
			Double iiData = ii.next();
			System.out.println(iiData);
		}
		
	}

	public static void main(String[] args) {
		new HashSetTest();

	}

}
