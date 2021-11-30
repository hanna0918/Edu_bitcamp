
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class LottoOOPCollection extends Exception{
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	public LottoOOPCollection() {
		
	}
	//�����ϳ������ + ���ʽ� ���� + �ߺ��˻�
	public void lottoCreate(int i) {
		//�ߺ�����, ����
		
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		int num=0;
		while(lotto.size()<7) {
			//�ζǹ�ȣ ����
			num = random.nextInt(45)+1;
			lotto.add(num);
		}
		
		//		lotto TreeSet��ȣ 7���� �ְ�, num���� ���������� ���� ��ȣ�� �ִ�.
		// bonus��ȣ�� �ζǹ�ȣ���� �����. TreeSet��ȣ 6���� �ִ�.
		lotto.remove(num);
		lottoPrint(i,lotto.toString(), num);
	}
	
	
	//���
	public void lottoPrint(int cnt, String lotto, int bonus) {
		System.out.print(cnt + "����=");
		System.out.print(lotto);
		System.out.println(" bonus="+bonus);
	}
	
	//�ݺ����� Ȯ���ϴ� �޼ҵ�
	public boolean yesNo() {
		do {
			System.out.print("����Ͻðڽ��ϱ�?(y:��, n:�ƴϿ�)");
			String qa = scan.nextLine();
			// y:���(true), n:����(false), �׿� �ٽ�(���� �ݺ�)
			if(qa.equalsIgnoreCase("y")) {
				return true;
			}else if(qa.equalsIgnoreCase("n")) {
				return false;
			}
		}while(true);
	}
	public void lottoStart() {
		do {
				
				System.out.print("���� �� : ");
				int game = Integer.parseInt(scan.nextLine());
				
				for(int i=1; i<=game; i++) {
					lottoCreate(i);
					
				}
				//�ݺ�����
				if(!yesNo()) {
					break;
				}
			
		}while(true);
	}
	
	public static void main(String[] args) {
		LottoOOPCollection oop = new LottoOOPCollection();
		oop.lottoStart();
	}

}
