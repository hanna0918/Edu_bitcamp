import java.io.File;
import java.io.FileOutputStream;
import java.util.Calendar;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/*
		POI다운로드
		jakarta.apache.org엣 왼쪽메뉴 POI를 선택한다.
		
		poi-bin-5.0.0-20210120.zip을 다운로드한다.
		
		압축을 푼 후
		poi-5.0.0.jar, commons-math3-3.6.1.jar build path를 설정한다.
		
	
	*/
public class ExcelWrite {
	
	public ExcelWrite() {
		
	}
	//엑셀로 저장하기
	public void start() {
		// 1. workbook객체를 생성
		HSSFWorkbook workbook = new HSSFWorkbook();
		
		// 2. sheet객체를 생성
		HSSFSheet sheet1 = workbook.createSheet();	//시트명이 없음
		HSSFSheet sheet2 = workbook.createSheet("회원목록");	//시트명을 회원목록으로 만듦.
		
		// 3. row객체를 생성
		HSSFRow row = sheet2.createRow(0);
		
		// 4. cell객체를 생성하고 값을 셋팅
		row.createCell(0).setCellValue("번호");
		row.createCell(1).setCellValue("이름");
		row.createCell(2).setCellValue("연락처");
		row.createCell(3).setCellValue("나이");
		row.createCell(4).setCellValue("등록일");
		
		//행 생성 셀을 생성하여 값대입
		HSSFRow row1 = sheet2.createRow(1);
		row1.createCell(0).setCellValue(100);
		row1.createCell(1).setCellValue("시원이");
		row1.createCell(2).setCellValue("010-1234-5678");
		row1.createCell(3).setCellValue(25);
		row1.createCell(4).setCellValue(Calendar.getInstance());
		
		HSSFRow row2 = sheet2.createRow(2);
		row2.createCell(0).setCellValue(200);
		row2.createCell(1).setCellValue("대선이");
		row2.createCell(2).setCellValue("010-2345-6789");
		row2.createCell(3).setCellValue(30);
		row2.createCell(4).setCellValue(Calendar.getInstance());
		
		HSSFRow row3 = sheet2.createRow(3);
		row3.createCell(0).setCellValue(300);
		row3.createCell(1).setCellValue("현식이");
		row3.createCell(2).setCellValue("010-9876-5432");
		row3.createCell(3).setCellValue(27);
		row3.createCell(4).setCellValue(Calendar.getInstance());
		
		// 5. 파일로 쓰기
		
		//파일 경로지정
		File f = new File("C://Users/82108/Desktop/fileTest", "member.xls");
				
		try {
			FileOutputStream fos = new FileOutputStream(f);
			
			//workbook의 write메소드를 호출하면 파일로 저장된다.
			workbook.write(fos);
			fos.close();
			workbook.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("엑셀로 쓰기 완료");
	}

	public static void main(String[] args) {
		new ExcelWrite().start();
	}

}
