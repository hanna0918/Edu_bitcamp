
class ForTest05 
{
	public static void main(String[] args) 
	{	
		for (int i=1; i<=100; i++){
			if(i%3!=0 && i%5!=0){
				System.out.println(i);
			}
		}		
	}
}
/*
===========3의 배수와 5의 배수가 아닌 숫자를 출력
1~100까지의 값중 다음데이터를 출력하라.
실행
1
2
4
7
8
11
13
14
16
17
19
*/