import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class FileTest {

	public FileTest() {
		//File : 파일경로와 파일명으로 객체를 생성하여 객체의 정보를 얻을 수 있다.
		File f1 = new File("C://Users/82108/Desktop/fileTest");
		File f2 = new File("C://");
		File f3 = new File("C://Users/82108/Desktop/fileTest/Gugudan.java");
		File f4 = new File("C://Users/82108/Desktop/fileTest", "Gugudan.java");
		File f5 = new File(f1, "Gugudan.java");
		
		File f6 = new File("C://Users/82108/Desktop/fileTest/createJava");
		try {
			//폴더생성하기
			if(!f6.exists()) {//폴더존재 유무 확인 있으면(true) 없으면(false)
				if(f6.mkdirs()) {//폴더 생서하기 생성됨(true) 생성실패(false)
					System.out.println("폴더가 생성되었습니다.");
				}else {
					System.out.println("폴더가 생성되지않았습니다.");
				}
			}
			
			//파일 생성하기
			File f7 = new File(f6, "abcd.txt");
			if(!f7.exists()) {
				if(f7.createNewFile()) {
					System.out.println("파일 생성 성공");
				}else {
					System.out.println("파일 생성 실패");
				}
			}
			
			//마지막 수정일 알아내기
			long lastDate = f3.lastModified();//밀리초
			System.out.println("lastDate : "+ lastDate);
			
			Calendar now = Calendar.getInstance();
			now.setTimeInMillis(lastDate);
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
			String modifiedDate = sdf.format(now.getTime());
			System.out.println("마지막 수정일 : " + modifiedDate);
			
			boolean exe = f5.canExecute();//실행형 파일유무확인
			boolean read = f5.canRead();//읽기가능
			boolean write = f5.canWrite();//쓰기가능
			System.out.println(exe + ":"+read+":"+write);
			
			//특정 드라이브 혹은 폴더에 있는 파일 및 폴더 얻어오기
			//	C://,	D://
			File f8 = new File("C://");
			File[] fileList = f8.listFiles();
			
			//getPath() : 폴더명 + 파일명
			//getName() : 파일명
			//getAbsolutePath() : 폴더명 + 파일명
			//getParent() : 폴더명
			for(File f:fileList) {
				if(f.isDirectory()) {//폴더인지 확인
					System.out.println(f.getPath());
					if(f.isHidden()) {
						System.out.println("[숨김폴더]");
					}else {
						System.out.println("[폴더]");
					}
					
				}else if(f.isFile()) {
					System.out.println(f.getPath());
					if(f.isHidden()) {
						System.out.println("[숨김파일]");
					}else {
						System.out.println("[파일]");
					}
				}
			}
			
			//현재 시스템의 드라이브를 구한다.
			File[] root = File.listRoots();
			for(File ff: root) {
				System.out.println(ff.getPath());
			}
			
			//파일크기 : byte
			long size = f3.length();
			System.out.println("size = " + size);
			
			//파일 삭제
			boolean result = f3.delete();
			if(result) {
				System.out.println("파일이 삭제되었습니다.");
			}else {
				System.out.println("파일 삭제 실패했습니다.");
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
