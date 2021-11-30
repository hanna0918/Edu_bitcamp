import java.util.Arrays;
import java.util.Scanner;

public class ArrayLotto {
	Scanner scan = new Scanner(System.in);
	
	public ArrayLotto() {
		start();
	}
	public boolean start() {
		do {
			//콘솔 게임 수 입력
			int game = getData("게임수");
			
			for(int i=1; i<=game; i++) {
			//난수 만들기(1~45)
			int[]randomNum = new int[7];
			makeGameNum(game, randomNum);
			
			//정렬(Arrays)
			randomNumArrays(randomNum);
			
			//출력
			gamePrint(game,randomNum);
			}
			//반복물음
			int answer = 0;
			replayMessage(answer);
				
		}while(true);
		
	}
	
	//반복물음
	public boolean replayMessage(int answer) {
		System.out.print("계속하시겠습니까(1.예 2.아니오)?");
		answer = scan.nextInt();
		if(answer==1) {
			return true;
		}
		return false;
		
	}
	
	//게임 수 출력
	public void gameCount(int game) {
		for(int cnt=1; cnt<=game; cnt++) {
			System.out.print(cnt+"게임 ");
		}
	}
		
	//게임수만큼 출력하기
	public void gamePrint(int game, int[]randomNum) {
		
		for(int i=0; i<randomNum.length-1; i++) {
			System.out.print(randomNum[i]+" ");
			}
		System.out.println(" 보너스"+randomNum[6]);
	
	}
	
	//난수 정렬하기
	public void randomNumArrays(int[] randomNum) {
		Arrays.sort(randomNum);
	}

	
	//난수 만들기, 중복제거
	public void makeGameNum(int game, int[]randomNum) {
		for(int cnt=1; cnt<=game; cnt++) {
			for(int i=0; i<randomNum.length; i++) {
				randomNum[i] = (int)(Math.random()*45)+1;// 0<=Math.random()<1
				for (int o=0; o<i; o++) {
					if(randomNum[i]==randomNum[o]) {
						i--;
					}
				}
			}
		}
	}
		
	
	//콘솔 게임수 입력
	
	public int getData(String msg){
		System.out.print(msg+"->");
		return Integer.parseInt(scan.nextLine());
	}
	public static void main(String[] args) {
		new ArrayLotto();

	}

}
