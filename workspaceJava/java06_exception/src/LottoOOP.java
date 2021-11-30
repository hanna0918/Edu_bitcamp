
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class LottoOOP extends Exception{
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	public LottoOOP() {
		
	}
	//�����ϳ������ + ���ʽ� ���� + �ߺ��˻�
	public int[] lottoCreate() {
		int lotto[] = new int[7];
		for(int i=0; i<lotto.length; i++) {//0~6
			//�ζǹ�ȣ ����
			 lotto[i] = random.nextInt(45)+1;
			 
			 //�ߺ��˻�
			 i = doubleCheck(lotto, i);
		}
		return lotto;
	}
		
	//�ߺ��˻�
	public int doubleCheck(int lotto[], int i) {
		for (int j=0; j<i; j++) {
			if(lotto[j] == lotto[i]) {
				i--;
				break;
			}
		}
		return i;
	}
	
	//���
	public void lottoPrint(int cnt, int lotto[]) {
		System.out.print(cnt + "����=");
		System.out.print(Arrays.toString(Arrays.copyOfRange(lotto,0,6)));
		System.out.println(" bonus="+lotto[6]);
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
			try {	
				System.out.print("���� �� : ");
				int game = Integer.parseInt(scan.nextLine());//------------------->NumberFormatException
				
				for(int i=1; i<=game; i++) {
					int lotto[] = lottoCreate();
					//����
					Arrays.sort(lotto, 0,6);
					//���
					lottoPrint(i, lotto);
				}
				//�ݺ�����
				if(!yesNo()) {
					break;
				}
			}catch(NumberFormatException nfe) {
				System.out.println("����----->"+nfe.getMessage());
				System.out.println("���� ������ �Է��ϼ���.");
				
							}
		}while(true);
	}
	
	public static void main(String[] args) {
		LottoOOP oop = new LottoOOP();
		oop.lottoStart();
	}

}
