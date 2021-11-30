import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

public class FileInputStreamTest {

	public FileInputStreamTest() {
		try {
			//파일의 내용을 읽어서 다른 파일로 출력하기
			File srcFile = new File("C://Users/82108/JavaSrc/JavaApi/CalendarTest.java");
			File tarFile = new File("C://Users/82108/Desktop/fileTest/OutputTest.java");
			
			FileReader fr = new FileReader(srcFile);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter(tarFile);
			
			while(true) {
				String str = br.readLine();
				//읽은 데이터가 없으면 null
				if(str==null)break;
				fw.write(str+"\n");
				System.out.println(str);
				
			}
			fw.close();
			br.close();
			fr.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new FileInputStreamTest();

	}

}
