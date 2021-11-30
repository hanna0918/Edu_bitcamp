class Gugudan 
{
	public static void main(String[] args) 
	{
		System.out.print("\t구구단\n");
		
		int i, j, k;
		j=1;

		for(k=1; k<=9; k+=3){
			System.out.printf("==%d단==\t==%d단==\t==%d단==\n",j,++j,++j);
			
			for(i=2; i<=9; i++){
				for(j=k; j<k+3; j++){
				System.out.printf("%dx%d=%2d\t", j, i, (i*j));
				}
				System.out.println();
			}
			//System.out.println();
		}
	}	
}
//제가 스스로 한건 아니지만 오늘 강사님 설명 잘 듣고 이해해보도록 하겠습니다.... !!
