import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class A_Posters {

	Font fnt = new Font("나눔고딕",Font.BOLD, 12);
	ImageIcon Poster1 = new ImageIcon("C:\\Users\\KIMIN\\Desktop\\수업\\testFile\\moon2.jpg");
	ImageIcon Poster2 = new ImageIcon("C:\\Users\\KIMIN\\Desktop\\수업\\testFile\\bill2.png");
	ImageIcon Poster3 = new ImageIcon("C:\\Users\\KIMIN\\Desktop\\수업\\testFile\\black2.jpg");
	ImageIcon Poster4 = new ImageIcon("C:\\Users\\KIMIN\\Desktop\\수업\\testFile\\week2.jpg");
	
	
	public A_Posters() {
	
	}
	public JButton Poster1(ImageIcon ic, int x,int y,int w,int h) {
		JButton bt1= new JButton(ic);
		bt1.setBounds(x,y,w,h);
		return bt1;
	}
	public JButton Poster2(ImageIcon ic, int x,int y,int w,int h) {
		JButton bt1= new JButton(ic);
		bt1.setBounds(x,y,w,h);
		return bt1;
	}
	public JButton Poster3(ImageIcon ic, int x,int y,int w,int h) {
		JButton bt1= new JButton(ic);
		bt1.setBounds(x,y,w,h);
		return bt1;
	}
	public JButton Poster4(ImageIcon ic, int x,int y,int w,int h) {
		JButton bt1= new JButton(ic);
		bt1.setBounds(x,y,w,h);
		return bt1;
	}
	
//////////////////////////////////////하위 롤오버 포스터
	public JButton Poster1_1(ImageIcon ic, int x,int y,int w,int h) {
		
		JButton bt= new JButton(ic);
		bt.setBounds(x,y,w,h);
		bt.setRolloverIcon(Poster1);
		return bt;
	}
	public JLabel Poster1_2(ImageIcon ii,int x,int y,int w,int h) {
		JLabel bt= new JLabel();
		bt.setIcon(ii);
		bt.setBounds(x,y,w,h);
		
		return bt;
	}
	public JLabel Poster1_3(String ii, int x,int y,int w,int h) {
		JLabel jl= new JLabel();
		jl.setText(ii);
		jl.setFont(fnt);
		jl.setBounds(x,y,w,h);
	
		return jl;
	}
	public JButton Poster2_1(ImageIcon ic, int x,int y,int w,int h) {
		JButton bt= new JButton(ic);
		bt.setBounds(x,y,w,h);
		bt.setRolloverIcon(Poster2);
		return bt;
	}
	public JButton Poster3_1(ImageIcon ic, int x,int y,int w,int h) {
		JButton bt= new JButton(ic);
		bt.setBounds(x,y,w,h);
		bt.setRolloverIcon(Poster3);
		return bt;
	}
	public JButton Poster4_1(ImageIcon ic, int x,int y,int w,int h) {
		JButton bt= new JButton(ic);
		bt.setBounds(x,y,w,h);
		bt.setRolloverIcon(Poster4);
		return bt;
	}
	

}
