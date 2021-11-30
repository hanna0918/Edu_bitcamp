import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DecimalDateFormat {

	public DecimalDateFormat() {
		try {	
			//�����͸� ���ϴ� ����������� ����� �ִ� Ŭ����
			//���ڸ� ȭ����� �����
			int data = 51236851;
			DecimalFormat format = new DecimalFormat("#,###��");
			
			String dataFormat = format.format(data);
			System.out.println("dataFormat="+dataFormat);
			
			//�������� ��ȯ�� �����͸� ������� �ٲٱ�
			// 51,236,851�� -> 51236851
			NumberFormat nf = NumberFormat.getInstance();
			Number num = nf.parse(dataFormat);
			
			int dataParse = num.intValue();
			System.out.println("dataParse="+dataParse);
			
			//��¥ ����
			// 2021�� 6�� 4�� (��) 15:21
			Calendar now = Calendar.getInstance();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy�� MM�� d�� (E) hh:mm:ss a");
			String dateStr = dateFormat.format(now.getTime());//Date
			System.out.println("dateStr---->"+dateStr);
			
			
			
			
			
			
		}catch(Exception e) {}
	}
	public static void main(String[] args) {
		new DecimalDateFormat();
	}

}
