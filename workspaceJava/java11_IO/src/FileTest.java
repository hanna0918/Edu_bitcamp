import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {

	public FileTest() {
		//File : ���ϰ�ο� ���ϸ����� ��ü�� �����Ͽ� ��ü�� ������ ���� �� �ִ�.
		File f1 = new File("C://Users/82108/Desktop/fileTest");
		File f2 = new File("C://");
		File f3 = new File("C://Users/82108/Desktop/fileTest/Gugudan.java");
		File f4 = new File("C://Users/82108/Desktop/fileTest", "Gugudan.java");
		File f5 = new File(f1, "Gugudan.java");
		
		File f6 = new File("C://Users/82108/Desktop/fileTest/createJava");
		try {
			//���������ϱ�
			if(!f6.exists()) {//�������� ���� Ȯ�� ������(true) ������(false)
				if(f6.mkdirs()) {//���� �����ϱ� ������(true) ��������(false)
					System.out.println("������ �����Ǿ����ϴ�.");
				}else {
					System.out.println("������ ���������ʾҽ��ϴ�.");
				}
			}
			
			//���� �����ϱ�
			File f7 = new File(f6, "abcd.txt");
			if(!f7.exists()) {
				if(f7.createNewFile()) {
					System.out.println("���� ���� ����");
				}else {
					System.out.println("���� ���� ����");
				}
			}
			
			//������ ������ �˾Ƴ���
			long lastDate = f3.lastModified();//�и���
			System.out.println("lastDate : "+ lastDate);
			
			Calendar now = Calendar.getInstance();
			now.setTimeInMillis(lastDate);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
			String modifiedDate = sdf.format(now.getTime());
			System.out.println("������ ������ : " + modifiedDate);
			
			boolean exe = f5.canExecute();//������ ��������Ȯ��
			boolean read = f5.canRead();//�бⰡ��
			boolean write = f5.canWrite();//���Ⱑ��
			System.out.println(exe + ":"+read+":"+write);
			
			//Ư�� ����̺� Ȥ�� ������ �ִ� ���� �� ���� ������
			//	C://,	D://
			File f8 = new File("C://");
			File[] fileList = f8.listFiles();
			
			//getPath() : ������ + ���ϸ�
			//getName() : ���ϸ�
			//getAbsolutePath() : ������ + ���ϸ�
			//getParent() : ������
			for(File f:fileList) {
				if(f.isDirectory()) {//�������� Ȯ��
					System.out.println(f.getPath());
					if(f.isHidden()) {
						System.out.println("[��������]");
					}else {
						System.out.println("[����]");
					}
					
				}else if(f.isFile()) {
					System.out.println(f.getPath());
					if(f.isHidden()) {
						System.out.println("[��������]");
					}else {
						System.out.println("[����]");
					}
				}
			}
			
			//���� �ý����� ����̺긦 ���Ѵ�.
			File[] root = File.listRoots();
			for(File ff: root) {
				System.out.println(ff.getPath());
			}
			
			//����ũ�� : byte
			long size = f3.length();
			System.out.println("size = " + size);
			
			//���� ����
			boolean result = f3.delete();
			if(result) {
				System.out.println("������ �����Ǿ����ϴ�.");
			}else {
				System.out.println("���� ���� �����߽��ϴ�.");
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		System.out.println("~~~~~~");
			
	}

	public static void main(String[] args) {
		new FileTest();
		
	}

}
