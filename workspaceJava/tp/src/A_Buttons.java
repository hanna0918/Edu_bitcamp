
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class A_Buttons extends JFrame implements ActionListener{
	//화면전환
	
	Color color = new Color(255,255,255);
	Font fnt = new Font("나눔고딕",Font.BOLD, 13);
	Font fnt2 = new Font("나눔고딕",Font.BOLD, 10);
	
	ImageIcon  leftC = new ImageIcon("img\\leftC.png");
	ImageIcon  rightC = new ImageIcon("img\\rightC.png");
	ImageIcon logo = new ImageIcon("img\\logo5.png");
	ImageIcon LoginLogo = new ImageIcon("img\\LoginL.png");
	ImageIcon LoginLine = new ImageIcon("img\\LoginLine.png");
	JButton btLogo  = new JButton(logo);
	JButton barmenu1 = new JButton("현재 공연작");
	JButton barmenu2 = new JButton("공연 예정작");
	JButton barmenu3 = new JButton("예매 하기");
	JButton barmenu4 = new JButton("마이페이지");
	JButton barmenu5 = new JButton("고객센터");
	JButton barmenu6 = new JButton("로그인");
	JButton barmenu7 = new JButton("로그아웃");
	JButton Joinus = new JButton("회원가입");
	JButton firstLog = new JButton("로그인");
	JButton upComing = new JButton();
	
	JPanel jp = new JPanel();
	
	
	public A_Buttons() {
		Logo(0,0,1200,200);
		barmenu1.setFont(fnt);
		barmenu2.setFont(fnt);
		barmenu3.setFont(fnt);
		barmenu4.setFont(fnt);
		barmenu5.setFont(fnt);
		barmenu6.setFont(fnt);
		barmenu7.setFont(fnt);
		upComing.setFont(fnt);
		
		
		btLogo.addActionListener(this);
		barmenu1.addActionListener(this);
		barmenu2.addActionListener(this);
		barmenu3.addActionListener(this);
		barmenu4.addActionListener(this);
		barmenu5.addActionListener(this);
		barmenu6.addActionListener(this);
		barmenu7.addActionListener(this);
		Joinus.addActionListener(this);
		firstLog.addActionListener(this);
		upComing.addActionListener(this);
		
		
	}
	public JButton Logo(int x,int y,int w,int h) {
		btLogo.setBounds(x,y,w,h);
		btLogo.setBackground(color);
		return btLogo;
	}
	public JLabel LoginLogo(int x,int y,int w,int h) {
		JLabel bt= new JLabel();
		bt.setIcon(LoginLogo);
		bt.setBounds(x,y,w,h);
		return bt;
	}
	public JLabel LoginLine(int x,int y,int w, int h) {
		JLabel bt= new JLabel();
		bt.setIcon(LoginLine);
		bt.setBounds(x,y,w,h);
		return bt;
	}
	public JButton left(ImageIcon ic, int x,int y,int w,int h) {
		JButton bt= new JButton(ic);
		bt.setBounds(x,y,w,h);
		bt.setBackground(color);
		bt.setRolloverIcon(leftC);
		bt.setBorderPainted(false);
		return bt;
	}
	public JButton right(ImageIcon ic, int x,int y,int w,int h) {
		JButton bt= new JButton(ic);
		bt.setBounds(x,y,w,h);
		bt.setBackground(color);
		bt.setRolloverIcon(rightC);
		bt.setBorderPainted(false);
		return bt;
	}
	public JButton Bt1(int x,int y,int w,int h) {
		barmenu1.setBounds(x,y,w,h);
		barmenu1.setBackground(color);
		return barmenu1;
	}
	public JButton Bt2(int x,int y,int w,int h) {
		barmenu2.setBounds(x,y,w,h);
		barmenu2.setBackground(color);
		return barmenu2;
	}
	public JButton Bt3(int x,int y,int w,int h) {
		barmenu3.setBounds(x,y,w,h);
		barmenu3.setBackground(color);
		return barmenu3;
	}
	public JButton Bt4(int x,int y,int w,int h) {
		barmenu4.setBounds(x,y,w,h);
		barmenu4.setBackground(color);
		return barmenu4;
	}
	public JButton Bt5( int x,int y,int w,int h) {
		barmenu5.setBounds(x,y,w,h);
		barmenu5.setBackground(color);
		return barmenu5;
	}
	public JButton LoginB(int x,int y,int w,int h) {
		barmenu6.setBounds(x,y,w,h);
		barmenu6.setBackground(color);
		return barmenu6;
	}
	public JButton Login_FirstB(int x,int y,int w,int h) {
		firstLog.setBounds(x,y,w,h);
		firstLog.setBackground(color);
		firstLog.setFont(fnt2);
		return firstLog;
	}
	
	public JButton LogoutB(int x,int y,int w,int h) {
		barmenu7.setBounds(x,y,w,h);
		barmenu7.setBackground(color);
		
		return barmenu7;
	}
	public JButton JoinUs(int x, int y, int w, int h) {
		Joinus.setBounds(x,y,w,h);
		Joinus.setBackground(color);
		Joinus.setFont(fnt2);
		return Joinus;
	}
//	public JButton UpComingB(String name, int x, int y, int w, int h) {
//		upComing.setBounds(x,y,w,h);
//		upComing.setBackground(color);
//		upComing.setFont(fnt);
//		upComing.setText(name);
//		return upComing;
//	}
	
	
	public void actionPerformed(ActionEvent ae) {
		
		JButton event = (JButton)ae.getSource();
		if(event == btLogo) {//메인 홈으로
			A_MainP.ChangeP(true,false,false,false,false,false);
		}else if(event == barmenu1) { //현재 공연작
			A_MainP.ChangeP(false,true,false,false,false,false);
		}else if(event == barmenu2) { //공연 예정작
			A_MainP.ChangeP(false, false,true,false,false,false);
		}else if(event == barmenu3) { //예매하기
			A_MainP.ChangeP(false, false, false,true,false,false);
		}else if(event == barmenu4) { // 마이페이지
			A_MainP.ChangeP(false, false,false,false,true,false);
		}else if(event == barmenu5) { // 고객센터
			A_MainP.ChangeP(false, false, false,false,false,true);
		}else if(event == barmenu7) {// 로그아웃 
			new A_MainP().dispose();;
			new A_Login_first();
		}else if(event == Joinus) {
			
		}else if(event == firstLog) {
			 new A_MainP();
		}
		}
	
	
}
