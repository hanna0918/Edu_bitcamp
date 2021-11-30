import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class C_InfoImg extends C_DBCon{
	BufferedImage bi;
	JFrame jrm = new JFrame();
	JPanel jp = new JPanel();
	public C_InfoImg() {
		
	}
	public void getDBimage() {
		try {
			dbConn();
			pstmt = conn.prepareStatement("select s_img from show order by s_day");
			rs = pstmt.executeQuery();
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("이미지 빼내기 오류");
		}finally {
			
		}
	}
	public static void main(String[] args) {
		new C_InfoImg();
	}
	
}
