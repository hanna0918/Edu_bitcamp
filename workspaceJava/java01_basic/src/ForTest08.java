import java.util.Scanner;
class ForTest08 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	for(;;){
			System.out.print("메뉴[1.사각형의 넓이, 2.원의 넓이, 3.종료]?");
			int num = sc.nextInt();
	
			if(num==1){
				System.out.print("가로=");
				int width = sc.nextInt();
				System.out.print("세로=");
				int length = sc.nextInt();
				
				int sqArea = width*length;
				System.out.printf("사각형의 넓이=%d\n", sqArea);
			}else if (num==2){
				System.out.print("반지름=");
				int c = sc.nextInt();	
	
				double cirArea = c*c*3.141592;
				System.out.printf("원의 넓이=%.2f\n",cirArea);
			}else if(num==3){
				System.exit(0);			//무한루프 종료
			}else{
				System.out.println("메뉴를 다시 선택하세요!");
			}
			
		}	//for문
	}
}
/*
사각형의 넓이 = 가로 * 세로
원의 넓이 = 반지름 * 반지름 * 3.141592
실행
메뉴[1.사각형의 넓이, 2.원의 넓이, 3.종료]?1
가로=
세로=
사각형의 넓이=

메뉴[1.사각형의 넓이, 2.원의 넓이, 3.종료]?2
반지름 = 
원의 넓이 = 

메뉴[1.사각형의 넒이, 2.원의 넓이, 3.종료]?

*/