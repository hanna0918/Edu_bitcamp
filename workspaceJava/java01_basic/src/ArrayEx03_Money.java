import java.util.Scanner;
public class ArrayEx03_Money {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		do {
			System.out.print("금액을 입력하세요.");
			int money = scan.nextInt();
			
			//화폐단위
			//화폐단위와 갯수를 2차원배열에 초기화하여 생성한다.
			int don[][] = {{50000,0},{10000,0},{5000,0},{1000,0},
							{500,0},{100,0},{50,0},{10,0},{5,0},{1,0}};
			
			//화폐단위 계산			
			for(int row=0; row<don.length; row++) {//0,1,2,3,4,...9
				don[row][1] = money/don[row][0];	//화폐갯수
				money -= don[row][0]*don[row][1];//현재단위의 화폐금액만큼 차감
				
			}			
			//출력
			for(int row=0; row<don.length; row++) {
				if(don[row][1]>0) {
					System.out.print(don[row][0]+"="+don[row][1]);
					if(don[row][0]>=1000) {
						System.out.println("장");
					}else {
						System.out.println("개");
					}
				}
			}			
			//종료확인
			System.out.print("다시 하시겠습니까(1.예, 2.아니요)");
			int check = scan.nextInt();
				if(check==2)	break;		//if(scan.nextInt()==2) 변수를 안만들고 바로 번호데이터를 받는 경우
		}while(true);

	}

}
/*
실행
50000, 10000, 5000, 1000, 500, 100, 50, 10 5, 1

실행
금액을 입력하세요. 123300
50000원=2장
10000원=2장
5000원=1장
1000원=1장
100원=3개
다시하시겠습니까?(1.네 2.아니요)


*/
