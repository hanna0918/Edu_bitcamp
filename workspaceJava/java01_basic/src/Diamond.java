class Diamond
{
	public static void main(String[] args) 
	{
		
		for(int i=1; i<=25; i+=2){
			//공백
			for(int s=1; s<=(25-i)/2; s++){
				System.out.print(" ");
			}
			//문자
			for(int j=1; j<=i; j++){
				System.out.print("A");
			}
			//줄바꿈
			System.out.println();
		}
		/*for(int a=1; a<=24; a-=2){
			//공백
			for(int ss=24; ss<=(24-a)/2; ss--){
				System.out.print(" ");
			}
			//문자
			for(int b=1; b<=a; b--){
				System.out.print("a");
			}
			//줄바꿈
			System.out.println();
		}*/
	}
}
