import java.util.Scanner;
class DoWhileEx2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		do{
			//금액
			System.out.print("금액을 입력하세요.");
			int money = sc.nextInt();

			//화폐
			int won=50000, divide = 5;
			while(money>0){
				int cnt = money/won; //화폐의 갯수
				if(cnt>0){
					System.out.print(won+"원="+cnt);
					if(won>=10000){
						System.out.println("장");
					}else{
						System.out.println("개");
					}
					money = money - cnt*won;
				}
				won = won / divide;//다음 화폐단위
				//다음 화폐단위 생성시 나눌값을 바꿔야함
				if(divide==5){
					divide=2;
				}else{
					divide=5;
				}//while
			}
			
			//질문
			System.out.print("계속하시겠습니까(1.예 2.아니오)");
			int status = sc.nextInt();
			if(status==2) {
				break;
				}
			}while(true);
	}
}