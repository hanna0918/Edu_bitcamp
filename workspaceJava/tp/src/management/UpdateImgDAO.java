package management;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class UpdateImgDAO extends DBCON{
	BufferedImage bi;
	
	public UpdateImgDAO() {
	}
	
	//이미지 수정
	public void UpdateImg(File imgf, int sCode) {
		try {
			dbConn();

			String sql = "update show set s_img = ? where s_code =?";
			pstmt = conn.prepareStatement(sql);
	
			
			FileInputStream fis = new FileInputStream(imgf);
			pstmt.setBinaryStream(1, fis, fis.available());
			pstmt.setInt(2, sCode);
			int c = pstmt.executeUpdate();
			//System.out.println(c);
		}catch (Exception e) {
			System.out.println("뭐냐고~~~~");
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}
	
	public void UpdateImg(File imgf, String s_title) {
		try {
			dbConn();

			String sql = "update show set s_img = ? where s_title =?";
			pstmt = conn.prepareStatement(sql);
	
			
			FileInputStream fis = new FileInputStream(imgf);
			pstmt.setBinaryStream(1, fis, fis.available());
			pstmt.setString(2, s_title);
			int c = pstmt.executeUpdate();
			//System.out.println(c);
		}catch (Exception e) {
			System.out.println("뭐냐고~~~~");
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}
	
	
	
	//이미지불러오기
	public BufferedImage getDBImage(int s_code){
		try {
			dbConn();
			String sql = "select s_img from show where s_code = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, s_code);
			
			rs = pstmt.executeQuery();

			rs.next();

			InputStream is = rs.getBinaryStream(1);
			bi = ImageIO.read(is);

		}catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			dbClose();
		}
		return bi;
	}

}
