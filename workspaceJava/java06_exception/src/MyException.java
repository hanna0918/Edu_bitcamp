// 1. ���� Ŭ���� ������ �ݵ�� ExceptionŬ������ ��ӹ޾� ����.
public class MyException extends Exception{

	public MyException() {
		super("1~100������ ���̿��� �մϴ�.");
	}
	public MyException(String message) {
		super(message);
	}

}
