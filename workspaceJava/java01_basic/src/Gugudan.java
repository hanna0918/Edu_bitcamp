class Gugudan 
{
	public static void main(String[] args) 
	{
		System.out.print("\t������\n");
		
		int i, j, k;
		j=1;

		for(k=1; k<=9; k+=3){
			System.out.printf("==%d��==\t==%d��==\t==%d��==\n",j,++j,++j);
			
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
//���� ������ �Ѱ� �ƴ����� ���� ����� ���� �� ��� �����غ����� �ϰڽ��ϴ�.... !!
