import java.util.Scanner;
class StandardWeight 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이=");
		int age = sc.nextInt();
		System.out.print("성별(1:남성, 2:여성)=");
		int sex = sc.nextInt();
		System.out.print("키=");
		int height = sc.nextInt();
		System.out.print("현재체중=");
		int weight = sc.nextInt();

		double avgWeight = 0;	//표준체중
		if (age>=36){
			if(sex==1){
				avgWeight = (height - 100)*0.95;
			}else{
				avgWeight = (height - 100)*0.90;
			}
		}else{
			if (sex==1){
				avgWeight = (height - 100)*0.90;
			}else {
				avgWeight = (height - 100)*0.85;
			}
		}
		System.out.printf("표준체중=%.0f\n",avgWeight);
		
		double stdWeight = (weight/avgWeight)*100;	//표준체중지수

		//표준체중지수 평가기준
		String standard = "마른형";
		if (stdWeight>=126){
			standard = "비만형";
		}else if(stdWeight>=116){
			standard = "조금 비만형";
		}else if(stdWeight>=96){
			standard = "표준형";
		}else if(stdWeight>=86){
			standard = "조금 마른형";
		}


		System.out.printf("당신의 표준체중지수는 %f으로 %s입니다.\n", stdWeight, standard);


	}
}
