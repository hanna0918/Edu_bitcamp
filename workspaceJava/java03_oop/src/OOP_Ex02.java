import java.util.Scanner;

public class OOP_Ex02 {
	int dan;//�Է¹��� ���� ������ ���� �ʱⰪ=0	//���������� heap�� ����
	String gugu="";//�������� ������ ��� ���� �ʱⰪ=null
	public OOP_Ex02() {
		
	}
	
	//�� �Է¹ޱ�
	int danInput() {
		Scanner scan = new Scanner(System.in);
		System.out.print("�� �Է�=");
		return scan.nextInt();
	}
	
	//������ �����
	void gugudan() {
		
		for(int i=2; i<=9; i++) {
			gugu=gugu+dan+"*"+i+"="+dan*i+"\n";
		}
	}
	
	
	void start() {
		dan = danInput();
		gugudan();
		System.out.println(gugu);//������ ���
	}
	
	
	public static void main(String[] args) {
		OOP_Ex02 oop = new OOP_Ex02();
		
		//System.out.println(oop.gugudan(oop.danInput()));
		oop.start();
	}

}
//�ֿܼ��� ���� �Է¹޾� �Է¹��� �������� ����϶�.