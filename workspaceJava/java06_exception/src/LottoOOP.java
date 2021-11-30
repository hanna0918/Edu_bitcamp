
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class LottoOOP extends Exception{
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	public LottoOOP() {
		
	}
	//게임하나만들기 + 보너스 포함 + 중복검사
	public int[] lottoCreate() {
		int lotto[] = new int[7];
		for(int i=0; i<lotto.length; i++) {//0~6
			//로또번호 생성
			 lotto[i] = random.nextInt(45)+1;
			 
			 //중복검사
			 i = doubleCheck(lotto, i);
		}
		return lotto;
	}
		
	//중복검사
	public int doubleCheck(int lotto[], int i) {
		for (int j=0; j<i; j++) {
			if(lotto[j] == lotto[i]) {
				i--;
				break;
			}
		}
		return i;
	}
	
	//출력
	public void lottoPrint(int cnt, int lotto[]) {
		System.out.print(cnt + "게임=");
		System.out.print(Arrays.toString(Arrays.copyOfRange(lotto,0,6)));
		System.out.println(" bonus="+lotto[6]);
	}
	
	//반복여부 확인하는 메소드
	public boolean yesNo() {
		do {
			System.out.print("계속하시겠습니까?(y:예, n:아니오)");
			String qa = scan.nextLine();
			// y:계속(true), n:종료(false), 그외 다시(질문 반복)
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
				System.out.print("게임 수 : ");
				int game = Integer.parseInt(scan.nextLine());//------------------->NumberFormatException
				
				for(int i=1; i<=game; i++) {
					int lotto[] = lottoCreate();
					//정렬
					Arrays.sort(lotto, 0,6);
					//출력
					lottoPrint(i, lotto);
				}
				//반복여부
				if(!yesNo()) {
					break;
				}
			}catch(NumberFormatException nfe) {
				System.out.println("에러----->"+nfe.getMessage());
				System.out.println("양의 정수를 입력하세요.");
				
							}
		}while(true);
	}
	
	public static void main(String[] args) {
		LottoOOP oop = new LottoOOP();
		oop.lottoStart();
	}

}
