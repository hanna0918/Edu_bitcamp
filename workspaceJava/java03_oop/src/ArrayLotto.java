import java.util.Arrays;
import java.util.Scanner;

public class ArrayLotto {
	Scanner scan = new Scanner(System.in);
	
	public ArrayLotto() {
		start();
	}
	public boolean start() {
		do {
			//�ܼ� ���� �� �Է�
			int game = getData("���Ӽ�");
			
			for(int i=1; i<=game; i++) {
			//���� �����(1~45)
			int[]randomNum = new int[7];
			makeGameNum(game, randomNum);
			
			//����(Arrays)
			randomNumArrays(randomNum);
			
			//���
			gamePrint(game,randomNum);
			}
			//�ݺ�����
			int answer = 0;
			replayMessage(answer);
				
		}while(true);
		
	}
	
	//�ݺ�����
	public boolean replayMessage(int answer) {
		System.out.print("����Ͻðڽ��ϱ�(1.�� 2.�ƴϿ�)?");
		answer = scan.nextInt();
		if(answer==1) {
			return true;
		}
		return false;
		
	}
	
	//���� �� ���
	public void gameCount(int game) {
		for(int cnt=1; cnt<=game; cnt++) {
			System.out.print(cnt+"���� ");
		}
	}
		
	//���Ӽ���ŭ ����ϱ�
	public void gamePrint(int game, int[]randomNum) {
		
		for(int i=0; i<randomNum.length-1; i++) {
			System.out.print(randomNum[i]+" ");
			}
		System.out.println(" ���ʽ�"+randomNum[6]);
	
	}
	
	//���� �����ϱ�
	public void randomNumArrays(int[] randomNum) {
		Arrays.sort(randomNum);
	}

	
	//���� �����, �ߺ�����
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
		
	
	//�ܼ� ���Ӽ� �Է�
	
	public int getData(String msg){
		System.out.print(msg+"->");
		return Integer.parseInt(scan.nextLine());
	}
	public static void main(String[] args) {
		new ArrayLotto();

	}

}
