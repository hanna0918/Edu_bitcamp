import java.util.Scanner;
class StandardWeight 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("����=");
		int age = sc.nextInt();
		System.out.print("����(1:����, 2:����)=");
		int sex = sc.nextInt();
		System.out.print("Ű=");
		int height = sc.nextInt();
		System.out.print("����ü��=");
		int weight = sc.nextInt();

		double avgWeight = 0;	//ǥ��ü��
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
		System.out.printf("ǥ��ü��=%.0f\n",avgWeight);
		
		double stdWeight = (weight/avgWeight)*100;	//ǥ��ü������

		//ǥ��ü������ �򰡱���
		String standard = "������";
		if (stdWeight>=126){
			standard = "����";
		}else if(stdWeight>=116){
			standard = "���� ����";
		}else if(stdWeight>=96){
			standard = "ǥ����";
		}else if(stdWeight>=86){
			standard = "���� ������";
		}


		System.out.printf("����� ǥ��ü�������� %f���� %s�Դϴ�.\n", stdWeight, standard);


	}
}
