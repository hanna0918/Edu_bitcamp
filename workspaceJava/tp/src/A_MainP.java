import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class A_MainP extends JFrame {
	
	 static A_Panels pl = new A_Panels();
	 static JPanel jp = new JPanel(); //기본패널
	 C_InfoDAO ci = new C_InfoDAO();
	 
	 
	public A_MainP() {
		ChangeP(true, false, false,false,false,false);
//		System.out.println(ci.nameList[0]);
//		System.out.println(ci.dayList[0]);
//		System.out.println(ci.synopList[0]);
		
		
		StartSetup();
		
	}
	public static JPanel ChangeP(boolean b, boolean b1,boolean b2,boolean b3,boolean b4, boolean b5) {
		jp.setLayout(null);
		jp.add(pl.BasePanel());
		jp.add(pl.MainBottomPanel(b));
		jp.add(pl.NowPBottomPanel(b1));
		jp.add(pl.UpComingPanel(b2));
		jp.add(pl.BookingPanel(b3));
		jp.add(pl.MyPagePanel(b4));
		jp.add(pl.Customer(b5));
		
		return jp;
	}
	public void StartSetup() {
		add(jp);
		setSize(1215,1000);
		setVisible(true);
		setResizable(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new C_InfoDAO();
		new C_InfoDAO2();
		new A_MainP();
	}

}
