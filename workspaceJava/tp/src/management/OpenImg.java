package management;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class OpenImg extends DBCON{
	BufferedImage bi;
	JFrame frm = new JFrame();
	public OpenImg() {
		getDBImage();
	}
	private void getDBImage()
	{
		try {
			dbConn();
			String sql = "select s_img from show where s_title = '·»Æ®'";
			
			pstmt = conn.prepareStatement(sql);
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
	 
	 frm.setSize(500, 500);
	 MyCanvas mc  = new MyCanvas();
	 frm.add(mc);
	 frm.setVisible(true);
	    }
	class  MyCanvas extends Canvas{
		public void paint(Graphics g) {
			g.drawImage(bi, 0, 0, this);
		}
	}
	public static void main(String[] args) {
		new OpenImg();
	}

	}