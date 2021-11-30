class GuguDan003
{
	public static void main(String[] args) 
	{
		System.out.println("\t구구단\n");

		int k, i, j;
		j = 1;		//초기값

		for(k=1; k<=9; k+=3){
			System.out.printf("==%d단==\t==%d단==\t==%d단==\n", j, ++j, ++j);
			
			for(i=2; i<=9; i++){
				for(j=k; j<k+3; j++){
					System.out.printf("%dx%d=%d\t", j, i, j*i);
				}System.out.println();
			}
		}

	}
}
