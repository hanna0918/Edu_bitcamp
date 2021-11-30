import java.util.Scanner;

public class StandardWeightOOP {
	Scanner scan = new Scanner(System.in);
	
	//데이터입력값 저장
	int age, gender;//초기값 0
	double height, weight;//초기값 0.0
	double sWeight;//표준체중
	double sWeightIndex;//표준체중지수
	String sWeightMsg;
	StandardWeightOOP() {
		
	}
	//데이터 입력 메소드
	double getConData(String msg) {
		System.out.print(msg+"=");
		return scan.nextDouble();
	}
	
	void setData() {
		age = (int)getConData("나이");
		gender = (int)getConData("성별");
		height = getConData("키");
		weight = getConData("몸무게");
	}
	
	//표준체중 index구하기
	void setStandardWeight() {
		double index = 0.90;
		if(age<=35 && gender==2) {
			index = 0.85;
		}else if(age>=36 && gender==1) {
			index = 0.95;
		}
		sWeight = (height - 100)*index;
	}
	//평가기준
	void setStandardWeightMsg() {
		sWeightIndex = (weight/sWeight)*100;
		String sMsg = "";
		if (sWeightIndex>=126){
			sWeightMsg = "비만형";
		}else if(sWeightIndex>=116){
			sWeightMsg = "조금 비만형";
		}else if(sWeightIndex>=96){
			sWeightMsg = "표준형";
		}else if(sWeightIndex>=86){
			sWeightMsg = "조금 마른형";
		}else sWeightMsg = "마른형";
	}
	
	//출력
	void standardWeightOutput() {
		System.out.println("표준체중="+sWeight);
		System.out.println("당신의 표준체중지수는 "+sWeightIndex+"으로"+sWeightMsg+"입니다.");
	}
	
	void startStandard() {
		setData();
		setStandardWeight();
		setStandardWeightMsg();
		standardWeightOutput();
	}
	
	public static void main(String[] args) {
		StandardWeightOOP oop = new StandardWeightOOP();
		oop.startStandard();
	}
}
