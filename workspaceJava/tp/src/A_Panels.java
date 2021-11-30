import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class A_Panels extends JPanel{
	A_Buttons bs =  new A_Buttons(); 
	A_Posters ps = new A_Posters();
	 B_Upcoming bbt = new B_Upcoming();
	 B_MyPageP bmp = new B_MyPageP();
	 B_NowP np = new B_NowP();
	 B_CustomerS bcsp = new B_CustomerS();
	 B_BookingP bbp = new B_BookingP();
	 
	 
	JPanel basePanel = new JPanel();
	JPanel mainPBottomPanel = new JPanel();
	JPanel nowPBottomPanel = new JPanel();
	JPanel upComingPanel = new JPanel();
	JPanel myPagePanel = new JPanel();
	JPanel customer = new JPanel();
	JPanel bookingPanel = new JPanel();
	
	Color color = new Color(255,255,255);
	
	ImageIcon Poster1 = new ImageIcon("img\\nn.jpg");
	 ImageIcon Poster2 = new ImageIcon("img\\yellow2.jpg");
	 ImageIcon Poster3 = new ImageIcon("img\\black22.png");
	 ImageIcon Poster4 = new ImageIcon("img\\week.jpg");
	 ImageIcon left = new ImageIcon("img\\left.png");
	 ImageIcon right = new ImageIcon("img\\right.png");
	 
	 ImageIcon actor1 = new ImageIcon("img\\moonlight.png");
	 String text1 = "<html>º MUSICAL 문라이트 º<br><br>2021.07.28 ~ 09.23. 장충체육관 1관<br> º 박기원, 원종환, 김유빈, 유종환, <br>김숙희, 이국종, 성유리, 옥주연, 신구 º</html>";
	 ImageIcon actor2 = new ImageIcon("img\\bill.png");
	 String text2 = "<html>º MUSICAL 문라이트 º<br><br>2021.07.28 ~ 09.23. 장충체육관 1관<br> º 박기원, 원종환, 김유빈, 유종환, <br>김숙희, 이국종, 성유리, 옥주연, 신구 º</html>";
	 ImageIcon actor3 = new ImageIcon("img\\cafe.png");
	 String text3 = "<html>º MUSICAL 문라이트 º<br><br>2021.07.28 ~ 09.23. 장충체육관 1관<br> º 박기원, 원종환, 김유빈, 유종환, <br>김숙희, 이국종, 성유리, 옥주연, 신구 º</html>";
	 ImageIcon actor4 = new ImageIcon("img\\moonlight.png");
	 
	 ImageIcon icon = new ImageIcon("img\\ccc.png");
	 JPanel backg = new JPanel() {
         public void paintComponent(Graphics g) {
             g.drawImage(icon.getImage(), 0, 0, 1200,750, null);
             setOpaque(false);
             super.paintComponent(g); }
     };
	public A_Panels() {
	}
	public JPanel BasePanel() {
		
		basePanel.setLayout(null);
		basePanel.add(bs.Logo(0,0,1200,200));//로고위치 크기
		basePanel.add(bs.Bt1(0,200,200,50));//현재 공연작
		basePanel.add(bs.Bt2(200,200,200,50));
		basePanel.add(bs.Bt3(400,200,200,50));
		basePanel.add(bs.Bt4(600,200,200,50));
		basePanel.add(bs.Bt5(800,200,200,50));
		basePanel.add(bs.LogoutB(1000,200,200,50));
		basePanel.setBounds(0,0,1215,250);
		return basePanel;
	}
	public JPanel MainBottomPanel(boolean no) {
		int x=75, y=800, w=100, h=100;
		Dimension xx = A_MainP.jp.getSize();
		Dimension xxx = A_MainP.pl.getSize();
//		System.out.println(xx.getHeight());
//		System.out.println(xx.getWidth());
//		System.out.println(xxx.getWidth());
//		System.out.println(xxx.getWidth());
		backg.setBounds(0,250,1200,750);
		mainPBottomPanel.setLayout(null);
//		mainPBottomPanel.setBackground(color);
//		mainPBottomPanel.add(ps.Poster1_1(Poster1, 75, 300, 323, 480));
//		mainPBottomPanel.add(ps.Poster2_1(Poster2, 440, 300, 323, 480));
//		mainPBottomPanel.add(ps.Poster3_1(Poster3, 805, 300, 323, 480));
//		mainPBottomPanel.add(ps.Poster4_1(Poster4, 1400, 300, 323, 480));
		mainPBottomPanel.add(bs.left(left, 5,580,45,45));
		mainPBottomPanel.add(bs.right(right, 1152,580,45,45));
//		mainPBottomPanel.add(ps.Poster1_2(actor1, x, y, w, h)); //75,800,100,100
//		mainPBottomPanel.add(ps.Poster1_3(text1,x+113,y,w+110, h));
//		mainPBottomPanel.add(ps.Poster1_2(actor2,x+365,y, w, h));
//		mainPBottomPanel.add(ps.Poster1_3(text2,x+478,y,w+110, h));
//		mainPBottomPanel.add(ps.Poster1_2(actor3,x+730, y, w, h));
//		mainPBottomPanel.add(ps.Poster1_3(text3,x+843,y,w+110, h));
		mainPBottomPanel.add(backg);
		mainPBottomPanel.setBounds(0,0,1200,1000);
		mainPBottomPanel.setVisible(no);
		return mainPBottomPanel;
	}
	public JPanel NowPBottomPanel(boolean no) {
		nowPBottomPanel.setLayout(null);
		nowPBottomPanel.add(np.jp);
		nowPBottomPanel.setBounds(0,0,1200,1000);
		nowPBottomPanel.setVisible(no);
		return nowPBottomPanel;
	}
	public JPanel UpComingPanel(boolean no) {
		upComingPanel.setLayout(null);
		upComingPanel.setVisible(no);
		upComingPanel.add(bbt.jp);
		upComingPanel.setBounds(0,0,1215,1000);
		return upComingPanel;
	}
	public JPanel BookingPanel(boolean no) {
		bookingPanel.setLayout(null);
		bookingPanel.setVisible(no);
		bookingPanel.add(bbp.jp);
		bookingPanel.setBounds(0,0,1215,1000);
		
		return bookingPanel;
	}
	public JPanel MyPagePanel(boolean no) {
		myPagePanel.setLayout(null);
		myPagePanel.setVisible(no);
		myPagePanel.add(bmp.jp);
		myPagePanel.setBounds(0,0,1215,1000);
		return myPagePanel ;
	}
	public JPanel Customer(boolean no) {
		customer.setLayout(null);
		customer.setVisible(no);
		customer.add(bcsp.jp);
		customer.setBounds(0,0,1215,1000);
		return customer;
	}
//	public JPanel background() {
//		JPanel backg = new JPanel() {
//	         public void paintComponent(Graphics g) {
//	        	 Dimension d = getSize();
//	             g.drawImage(icon.getImage(), 0, 0, d.width, d.height, null);
//	             setOpaque(false);
//	             super.paintComponent(g); }
//	     };
//	     return backg;
//	}
	
	}
	
	
	
	

