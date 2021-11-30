import java.util.Scanner;
class ForDiamond2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("홀수(1~49)입력 =");
		int max = sc.nextInt();

		//짝수일경우 홀수로 변경
		if(max%2==0){
			max++;		//2일때 3으로 변경
		}

		//출력할 문자 초기값
		char txt = 'A';
		int step = 2;
		for(int row=1; row>0; row+=step){//줄 1,3,5,7,9....max
			//공백
			for(int s=1; s<=(max-row)/2; s++){
				System.out.print(" ");
			}
			//1줄 문자
			for(int cnt=1; cnt<=row; cnt++){// 1~1
				System.out.print(txt++);	
				if(txt>'Z'){// Z를 출력하고나면 다시 A로 되돌리기
					txt = 'A';
				}
			}
			//줄바꿈
			System.out.println();
			if(row>=max){
				step=-2;
			}
		}
			
	}
}
