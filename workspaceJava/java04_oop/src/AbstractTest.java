//�߻�޼ҵ带 1���̻� �����ϴ� Ŭ������ �߻�Ŭ������ �ȴ�.
//�߻�Ŭ������ Ŭ���� Ű���� ���ʿ� abstract ǥ�⸦ �ؾ��Ѵ�.
//�߻�Ŭ������ �ݵ�� ��ӹ޾� ��� �߻�޼ҵ带 �������̵��Ͽ��� �Ѵ�.
public abstract class AbstractTest {
	int num = 100;
	String name = "ȫ�浿"
;
	public AbstractTest() {
		
	}
	
	public void numOutput() {
		System.out.println("num=" + num);
	}
	
	//����ΰ� ���� �޼ҵ�� �߻�޼ҵ�.
	//�߻�޼ҵ�� ��ȯ�� ���ʿ� abstractŰ���带 ǥ���ؾ���.
	public abstract void print();
	public abstract void setData(int num, String name);
}
