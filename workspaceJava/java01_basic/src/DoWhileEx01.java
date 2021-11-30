import java.util.Scanner;
class DoWhileEx01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		do{
			//금액
			System.out.print("금액을 입력하세요.");
			int money = sc.nextInt();
			//화폐
			int cnt = money/50000;	//5만원
			if(cnt>0){
				System.out.println("50000원="+cnt+"장");
				money = money - cnt*50000;
			}
			cnt = money / 10000;//1만원
			if(cnt>0){
				System.out.println("10000원="+cnt+"장");
				money = money -cnt*10000;
			}
			cnt = money / 5000;//5천원			
			if(cnt>0){
				System.out.println("5000원="+cnt+"장");
				money = money -cnt*5000;
			}
			cnt = money / 1000;//1천원
			if(cnt>0){
				System.out.println("1000원="+cnt+"장");
				money = money -cnt*1000;
			}
			cnt = money / 500;//500원
			if(cnt>0){
				System.out.println("500원="+cnt+"개");
				money = money -cnt*500;
			}
			cnt = money / 100;//1백원
			if(cnt>0){
				System.out.println("100원="+cnt+"개");
				money = money -cnt*100;
			}
			cnt = money / 50;//50원
			if(cnt>0){
				System.out.println("50원="+cnt+"개");
				money = money -cnt*50;
			}
			cnt = money / 10;//10원
			if(cnt>0){
				System.out.println("10원="+cnt+"개");
				money = money -cnt*10;
			}
			cnt = money / 1;//1원
			if(cnt>0){
				System.out.println("1원="+cnt+"개");
				money = money -cnt*1;
			}
			//질문
			System.out.print("계속하시겠습니까?(1.예, 2.아니오)");
			int answer = sc.nextInt();
			if(answer==2){
				break;
			}
		}
		while (true);
		
		
		
		
		/*
		do{
			//금액입력
			System.out.print("금액을 입력하세요.");
			int tmp = sc.nextInt();
			//화폐
			int oman = money / 50000;
				tmp = money - oman * 50000;
				System.out.pirntln("50000원="+oman+"장");
			int man = tmp / 10000;
				tmp = tmp - man * 10000;
				System.out.pirntln("10000원="+man+"장");
			int ochun = tmp / 5000;
				tmp = tmp - ochun * 5000;
				System.out.pirntln("5000원="+ochun+"장");
 			int chun = tmp / 1000;
				tmp = tmp - chun * 1000;
				System.out.pirntln("1000원="+chun+"장"); 
			int obaek = tmp / 500;
				tmp = tmp - obaek * 500;
				System.out.pirntln("500원="+obaek+"개"); 
			int baek = tmp / 100;
				tmp =  tmp - baek * 100;
				System.out.pirntln("100원="+baek+"개");		
			int osip = tmp / 50;
				tmp = tmp - osip * 50;
				System.out.pirntln("50원="+osip+"개");
			int sip = tmp / 10;
				tmp = tmp - sip * 10;
				System.out.pirntln("10원="+sip+"개");
			int oh = tmp / 5 ;
				tmp = tmp - oh * 5;
				System.out.pirntln("5원="+oh+"개");
			int il = tmp / 1;
				tmp = tmp - il * 1;
				System.out.pirntln("1원="+il+"개");
			System.out.print("다시하시겠습니까?(1.네 2.아니요)");
			
		} int num = nextInt();
		while (num==1);*/
	}
}
/*
실행
금액을 입력하세요. 123300
50000원=2장
10000원=2장
5000원=1장
1000원=1장
100원=3개
다시하시겠습니까?(1.네 2.아니요)


*/