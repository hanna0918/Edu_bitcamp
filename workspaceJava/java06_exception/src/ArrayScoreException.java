import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayScoreException {
	Scanner scan = new Scanner(System.in);
	String[] name;
	int[][]jumsu;
	String[] title = {"����", "����", "����"};
	
	public ArrayScoreException() {
		start();
	}
	
	public void start() {
		//�л� �� �ޱ�
		try {
			System.out.print("�л� ��=");
			int cnt = scan.nextInt();
		
			//�̸�,�����迭
			saveArray(cnt);
			
			titleSum(cnt);
			titleAvg(cnt);
			rank(cnt);
			sort(cnt);
			
			System.out.println("===================================================");
			System.out.println("�̸�	����	����	����	����	���	����");
			System.out.println("===================================================");
			
			nameGradePrint(cnt);
			titleSumAvgPrint(cnt);
		}catch(InputMismatchException ime) {
			System.out.println("������ �Է��ϼ���.");
		}catch(NumberFormatException nfe) {
			System.out.println("���ڸ� �Է��ϼ���.");
			System.out.println(nfe.getMessage());
		}
			
		
	}
	
	//�迭
	public void saveArray(int cnt) {
		name = new String[cnt];
		jumsu = new int[cnt+2][6];
		for (int i=0; i<cnt; i++) {
			scan.nextLine();
			System.out.print("�̸�=");
			name[i] = scan.nextLine();
				for (int j=0; j<title.length; j++) {
				System.out.print(title[j]+"=");
				jumsu[i][j] = Integer.parseInt(scan.nextLine());
				}
		}
	}
	//����, ���� ����
	public void titleSum(int cnt){
		for(int i=0; i<cnt; i++) {
			for(int j=0; j<3; j++) {
				jumsu[i][3] += jumsu[i][j];
				jumsu[cnt][j] += jumsu[i][j];
			}
		jumsu[i][4] = jumsu[i][3]/3;
		}	
	}
	
	//���� ���
	public void titleAvg(int cnt) {
		for(int i=0; i<3; i++) {
			jumsu[cnt+1][i] = jumsu[cnt][i]/cnt;
		}
	}
	
	//�������ϱ�
	public void rank(int cnt) {
		for(int i=0; i<cnt; i++) {
			for(int j=0; j<cnt; j++) {
				if(jumsu[i][3]<jumsu[j][3]) {jumsu[i][5]++;}
			}
		jumsu[i][5]++;
		}
	}
	
	public void sort(int cnt) {
		for(int i=0; i<cnt-1; i++) {//3�� ->0,1
			//				3-1-0
			for(int j=0; j<cnt-1-i; j++) {//3�� ->0,1
				if(jumsu[j][5]>jumsu[j+1][5]) {
					//��ȯ
					//�̸��ٲٱ�
					String nameTemp = name[j];
					name[j] = name[j+1];
					name[j+1] = nameTemp;
					
					for(int k=0; k<jumsu[j].length; k++) {//0,1,2,3,4,5
						int temp = jumsu[j][k];
						jumsu[j][k] = jumsu[j+1][k];
						jumsu[j+1][k] = temp;
					}
				}
			}
		}
	}
	
	public void nameGradePrint(int cnt) {
		for(int i=0; i<cnt; i++) {//i=0
			//�̸����
			System.out.print(name[i]+"\t");
			for (int j=0; j<jumsu[i].length; j++) {
				System.out.print(jumsu[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public void titleSumAvgPrint(int cnt) {
		System.out.print("����\t");
		for(int i=0; i<3; i++) {//0,1,2		3 ����->�����
			System.out.print(jumsu[cnt][i]+"\t");
		}
		System.out.println();
		//���� ���
		System.out.print("���\t");
		for(int i=0; i<3; i++) {
			System.out.print(jumsu[cnt+1][i]+"\t");
		}
		System.out.println();		

	}
	
	
	public static void main(String[] args) {
		new ArrayScoreException();

	}

}
