import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DecimalDateFormat {

	public DecimalDateFormat() {
		try {	
			//데이터를 원하는 출력형식으로 만들수 있는 클래스
			//숫자를 화폐단위 만들기
			int data = 51236851;
			DecimalFormat format = new DecimalFormat("#,###원");
			
			String dataFormat = format.format(data);
			System.out.println("dataFormat="+dataFormat);
			
			//패턴으로 변환된 데이터를 원래대로 바꾸기
			// 51,236,851원 -> 51236851
			NumberFormat nf = NumberFormat.getInstance();
			Number num = nf.parse(dataFormat);
			
			int dataParse = num.intValue();
			System.out.println("dataParse="+dataParse);
			
			//날짜 포맷
			// 2021년 6월 4일 (금) 15:21
			Calendar now = Calendar.getInstance();
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 MM월 d일 (E) hh:mm:ss a");
			String dateStr = dateFormat.format(now.getTime());//Date
			System.out.println("dateStr---->"+dateStr);
			
			
			
			
			
			
		}catch(Exception e) {}
	}
	public static void main(String[] args) {
		new DecimalDateFormat();
	}

}
