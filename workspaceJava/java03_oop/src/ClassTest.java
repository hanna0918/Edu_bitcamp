//package

//import �ʿ��� Ŭ������ ��ġ(��Ű����, Ŭ�������� �����Ѵ�.)
//			�ʿ��Ѹ�ŭ ���� �� �� �ִ�.
import java.util.Scanner;
import java.lang.String;	//compiler�� ������ �������� �ڵ����� import���ش�.
import java.util.Random;
import java.util.*;			//util���� ��� Ŭ���� ȣ��


public class ClassTest {
	//�������
	//������� = ��������		Ŭ���� ������ ����Ҽ� �ִ� ����
	int a=100;
	String name = "ȫ�浿";
	//��������� �ʱⰪ�� �ڵ����� �����ȴ�.
	// ����(byte, short, int, long) : 0
	// �Ǽ�(float, double) : 0.0
	// ��(boolean) : false
	// ����(char) : 
	int b;		
	double c;	
	String nameStr;//null
	Scanner scan;//null
	Random ran;//null
	
	//��ü����  ��ü��
	Scanner scanner = new Scanner(System.in);
	//���๮�� ������� ���Ұ�
	//System.out.println("�ֹܼ��� ����ϱ�");
	int k=100 + 500;
	//int[] dd = new int[10];
	//dd[3] = 200;
	
	//������ �޼ҵ� : ��ü�� �����Ҷ� �ѹ� ����Ǵ� �޼ҵ�
	//			  �޼ҵ���� �ݵ�� Ŭ������� ���ƾ� �Ѵ�.
	//			  ��ü ������ ��ü�� �����͸� �ʱ�ȭ�� �� �ִ�. 
	//		�����ڸ޼ҵ带 �������������� �����Ͻ� �����Ϸ���
	//		�Ű������� ���� �����ڸ޼ҵ带 �ڵ����� �߰� ���ش�.
	//
	//		ClassTest(){}
	
	ClassTest(){
		b = 1234;
		//���๮
		System.out.println("������ �޼ҵ尡 �����!!!");
	}
	ClassTest(int a){
		System.out.println(a+"�޼ҵ� ���� ~~~~~~~~~~~~");
	}

	
	//�޼ҵ� : �ϳ��� �������
	//		Ŭ������ ��ü ���� �� �޼ҵ带 ȣ���Ͽ��� �����.
	//	��ȯ�� �޼ҵ��(�Ű�����){
	//	}
	//�޼ҵ�� ���� ��Ģ : �ҹ��ڷ� �����Ѵ�. 
	//				 �ռ����϶��� �ι�° �ܾ���ʹ� ù���ڴ� �빮�ڷ�
	void sum() {
		//�����
		System.out.println("sum()�޼ҵ尡 �����");
	}
	void total(int a, int b) {
		System.out.println("����"+(a+b));
	}
}
