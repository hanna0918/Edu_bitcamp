
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
	//게임하나만들기 + 보너스 포함 + 중복검사
	public void lottoCreate(int i) {
		//중복제거, 정렬
		
		TreeSet<Integer> lotto = new TreeSet<Integer>();
		int num=0;
		while(lotto.size()<7) {
			//로또번호 생성
			num = random.nextInt(45)+1;
			lotto.add(num);
		}
		
		//		lotto TreeSet번호 7개가 있고, num에는 마지막으로 만든 번호가 있다.
		// bonus번호는 로또번호에서 지운다. TreeSet번호 6개가 있다.
		lotto.remove(num);
		lottoPrint(i,lotto.toString(), num);
	}
	
	
	//출력
	public void lottoPrint(int cnt, String lotto, int bonus) {
		System.out.print(cnt + "게임=");
		System.out.print(lotto);
		System.out.println(" bonus="+bonus);
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
				
				System.out.print("게임 수 : ");
				int game = Integer.parseInt(scan.nextLine());
				
				for(int i=1; i<=game; i++) {
					lottoCreate(i);
					
				}
				//반복여부
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
