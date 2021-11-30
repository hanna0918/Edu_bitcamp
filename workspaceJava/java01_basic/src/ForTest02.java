class ForTest02 
{
	public static void main(String[] args) 
	{
		int sum=0;	//누적 변수
		for(int i=1; i<=100; i++){
			sum += i;
			if(i%10==0){ // !!!!!!!!!10의 배수만 출력!!!!!!!!!!!!!!!!(기출변형ㅋㅋㅋ)
			System.out.println("1~"+ i +"까지의 합은"+sum);
			}
		}
		//System.out.println("1 ~ 100까지의 합은 "+sum);		
	}
}
// 1~100까지 합