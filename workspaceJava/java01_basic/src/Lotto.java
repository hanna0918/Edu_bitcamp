import java.util.Scanner;
public class Lotto {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/*
		//로또 번호 생성기
		System.out.print("게임수=");
		int game = scan.nextInt();
	
		for(int i=1; i<=game; i++) {
		
		System.out.print(i+"게임 : ");
		//배열 데이터
		int num[] = new int[6];
		int bonus[] = new int[1];
		
		//난수 생성(1~45)
			for(int a=0; a<num.length; a++) {//a=0,1,2,3,4,5
				int random = (int)(Math.random()*(45-1+1))+1;	//1~45까지의 수
				num[a] = random;
				System.out.print(num[a]+" ");
			}
	
			
			// 보너스 난수
			for(int b=0; b<bonus.length; b++) {//i=0
				int random = (int)(Math.random()*45)+1;
				bonus[b] = random;
				System.out.print(" 보너스"+bonus[b]+"\n");
			}
		}
		
		System.out.print("계속하시겠습니까(1.예, 2.아니요)?");
		int answer = scan.nextInt();
		if (answer==1) {
			
		}*/

		//강사님 코드
		do {
			//게임수
			System.out.print("게임수=");
			int cnt =  scan.nextInt();
			
			//입력받은 게임수만큼 게임 만들기
			for(int game=1; game<=cnt; game++) {
				//게임1개 만들기
				int lotto[] = new int[7];//로또번호+보너스	난수로 생성하여 저장할 배열
				for(int i=0; i<lotto.length; i++) {//0인 이유: 인덱스번호의 시작
					lotto[i] = (int)(Math.random()*45)+1;	// 1~45까지 번호 생성
					
					//중복검사
					for(int c=0; c<i; c++) {//
						if(lotto[i]==lotto[c]) {
							 //방금만든거   먼저만든거
							i--;	
						}
					}
				}
				
				//정렬
				for(int i=0; i<lotto.length-2; i
						++) {//0,1,2,3,4번째 졍렬
					for(int j=0; j<lotto.length-2-i; j++) {
						if(lotto[j]>lotto[j+1]) {
							int temp = lotto[j];
							lotto[j] = lotto[j+1];
							lotto[j+1] = temp;
						}
					}
					
				}
				
				
				//출력
				System.out.print(game+"게임=");
				for(int i=0; i<lotto.length-1; i++) {
					System.out.print(lotto[i]+", ");
				}
				System.out.println(" 보너스="+lotto[6]);
			}
			//===============================================================		
			System.out.print("계속하시겠습니까(1.예, 2.아니요)?");
			int check = scan.nextInt();
			if (check==2) break;
			
		}while(true);
		

	}

}
/*

로또 번호 : 1~45까지 번호 6개
		 보너스 1개

실행
게임수 = 3
1게임 = - - - - - - 보너스-
2게임 = - - - - - - 보너스-
3게임 = - - - - - - 보너스-
계속하시겠습니까(1.예, 2.아니요)?
*/