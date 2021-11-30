import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class ExcelReader {

	public ExcelReader() {
		
	}
	public void start() {
		try {
			File file = new File("C://Users/82108/Desktop/fileTest", "member.xls");
			FileInputStream fis = new FileInputStream(file);
			
			//byteCode인 InputStream 엑셀파일로 변환하는 클래스
			POIFSFileSystem poi = new POIFSFileSystem(fis);
			
			// 1.workbook객체 얻어오기
			HSSFWorkbook workbook = new HSSFWorkbook(poi);
			
			//	시트의 수 구하기
			int sheetCnt = workbook.getNumberOfSheets();
			System.out.println("시트 수 = " + sheetCnt);
			
			// 2. sheet객체 얻어오기
			HSSFSheet sheet = workbook.getSheet("회원목록");
			
			//	행의 수 구하기
			int rowCnt = sheet.getPhysicalNumberOfRows();
			System.out.println("행의 수 = "+ rowCnt);
			
			// 제목
			System.out.println("번호\t이름\t연락처\t\t나이\t등록일");
			
			for(int rowIdx=1; rowIdx<rowCnt; rowIdx++) {//1,2,3
				//3. 행 객체 구하기
				HSSFRow row= sheet.getRow(rowIdx);
				
				//	셀 수 구하기
				int cellCnt = row.getPhysicalNumberOfCells();
				//System.out.println("셀의 수 = "+ cellCnt);
				for(int cellIdx=0; cellIdx<cellCnt; cellIdx++) {// 0, 1, 2, 3, 4
					
					HSSFCell cell = row.getCell(cellIdx);
					//번호, 나이
					if(cellIdx==0||cellIdx==3) {
						int data = (int)cell.getNumericCellValue();
						System.out.print(data + "\t");
					//이름,연락처
					}else if(cellIdx==1 || cellIdx==2) {
						String data = cell.getStringCellValue();
						System.out.print(data + "\t");
					//등록일
					}else if(cellIdx==4) {// 등록일
						Date data = cell.getDateCellValue();
						SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
						String dateStr = format.format(data);
						System.out.println(dateStr);
						
					}
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		new ExcelReader().start();
	}

}
