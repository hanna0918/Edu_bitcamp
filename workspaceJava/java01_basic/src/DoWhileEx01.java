import java.util.Scanner;
class DoWhileEx01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		do{
			//�ݾ�
			System.out.print("�ݾ��� �Է��ϼ���.");
			int money = sc.nextInt();
			//ȭ��
			int cnt = money/50000;	//5����
			if(cnt>0){
				System.out.println("50000��="+cnt+"��");
				money = money - cnt*50000;
			}
			cnt = money / 10000;//1����
			if(cnt>0){
				System.out.println("10000��="+cnt+"��");
				money = money -cnt*10000;
			}
			cnt = money / 5000;//5õ��			
			if(cnt>0){
				System.out.println("5000��="+cnt+"��");
				money = money -cnt*5000;
			}
			cnt = money / 1000;//1õ��
			if(cnt>0){
				System.out.println("1000��="+cnt+"��");
				money = money -cnt*1000;
			}
			cnt = money / 500;//500��
			if(cnt>0){
				System.out.println("500��="+cnt+"��");
				money = money -cnt*500;
			}
			cnt = money / 100;//1���
			if(cnt>0){
				System.out.println("100��="+cnt+"��");
				money = money -cnt*100;
			}
			cnt = money / 50;//50��
			if(cnt>0){
				System.out.println("50��="+cnt+"��");
				money = money -cnt*50;
			}
			cnt = money / 10;//10��
			if(cnt>0){
				System.out.println("10��="+cnt+"��");
				money = money -cnt*10;
			}
			cnt = money / 1;//1��
			if(cnt>0){
				System.out.println("1��="+cnt+"��");
				money = money -cnt*1;
			}
			//����
			System.out.print("����Ͻðڽ��ϱ�?(1.��, 2.�ƴϿ�)");
			int answer = sc.nextInt();
			if(answer==2){
				break;
			}
		}
		while (true);
		
		
		
		
		/*
		do{
			//�ݾ��Է�
			System.out.print("�ݾ��� �Է��ϼ���.");
			int tmp = sc.nextInt();
			//ȭ��
			int oman = money / 50000;
				tmp = money - oman * 50000;
				System.out.pirntln("50000��="+oman+"��");
			int man = tmp / 10000;
				tmp = tmp - man * 10000;
				System.out.pirntln("10000��="+man+"��");
			int ochun = tmp / 5000;
				tmp = tmp - ochun * 5000;
				System.out.pirntln("5000��="+ochun+"��");
 			int chun = tmp / 1000;
				tmp = tmp - chun * 1000;
				System.out.pirntln("1000��="+chun+"��"); 
			int obaek = tmp / 500;
				tmp = tmp - obaek * 500;
				System.out.pirntln("500��="+obaek+"��"); 
			int baek = tmp / 100;
				tmp =  tmp - baek * 100;
				System.out.pirntln("100��="+baek+"��");		
			int osip = tmp / 50;
				tmp = tmp - osip * 50;
				System.out.pirntln("50��="+osip+"��");
			int sip = tmp / 10;
				tmp = tmp - sip * 10;
				System.out.pirntln("10��="+sip+"��");
			int oh = tmp / 5 ;
				tmp = tmp - oh * 5;
				System.out.pirntln("5��="+oh+"��");
			int il = tmp / 1;
				tmp = tmp - il * 1;
				System.out.pirntln("1��="+il+"��");
			System.out.print("�ٽ��Ͻðڽ��ϱ�?(1.�� 2.�ƴϿ�)");
			
		} int num = nextInt();
		while (num==1);*/
	}
}
/*
����
�ݾ��� �Է��ϼ���. 123300
50000��=2��
10000��=2��
5000��=1��
1000��=1��
100��=3��
�ٽ��Ͻðڽ��ϱ�?(1.�� 2.�ƴϿ�)


*/