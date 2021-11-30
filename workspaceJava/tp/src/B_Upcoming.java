import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class B_Upcoming extends JPanel implements ActionListener{
	JPanel jp = new JPanel();
	A_Buttons bs =  new A_Buttons();
	Color color = new Color(255,255,255);
	Font fnt = new Font("나눔고딕",Font.BOLD,20); //현재 상영작 표시 폰트
	Font fnt1 = new Font("나눔고딕",Font.BOLD, 13); // 영화 제목 폰트
	Font fnt2 = new Font("나눔고딕",Font.BOLD, 10); //버튼 폰트
	String deP = " 정보";
	ImageIcon ii = new ImageIcon("img\\yellow2.jpg");
	C_InfoDAO2 ci2 = new C_InfoDAO2();
	
///////////////////////////////////////////////////////////////////////////////////
		JLabel main = new JLabel("<html>상영 예정작<br>&ensp;&ensp;("+new C_InfoDAO2().titleLength()+")</html>");
		
		JLabel name1 = new JLabel(ci2.nameList[0]);
		JLabel name2 = new JLabel(ci2.nameList[1]);
		JLabel name3 = new JLabel(ci2.nameList[2]);
		JLabel name4 = new JLabel(ci2.nameList[3]);
		JLabel name5 = new JLabel(ci2.nameList[4]);
		JLabel name6 = new JLabel(ci2.nameList[5]);
		JLabel name7 = new JLabel(ci2.nameList[6]);
		JLabel name8 = new JLabel(ci2.nameList[7]);
		JLabel name9 = new JLabel(ci2.nameList[8]);
		JLabel name10 = new JLabel(ci2.nameList[9]);
		JLabel name11 = new JLabel(ci2.nameList[10]);
		JLabel name12 = new JLabel(ci2.nameList[11]);
		
		JButton btn = new JButton(ii);
		JButton btn1 = new JButton(ii);
		JButton btn2 = new JButton(ii);
		JButton btn3 = new JButton(ii);
		JButton btn4 = new JButton(ii);
		JButton btn5 = new JButton(ii);
		JButton btn6 = new JButton(ii);
		JButton btn7 = new JButton(ii);
		JButton btn8 = new JButton(ii);
		JButton btn9 = new JButton(ii);
		JButton btn10 = new JButton(ii);
		JButton btn11 = new JButton(ii);
		
		
		JButton btnre1 = new JButton(ci2.nameList[0]+deP);
		JButton btnre2 = new JButton(ci2.nameList[1]+deP);
		JButton btnre3 = new JButton(ci2.nameList[2]+deP);
		JButton btnre4 = new JButton(ci2.nameList[3]+deP);
		JButton btnre5 = new JButton(ci2.nameList[4]+deP);
		JButton btnre6 = new JButton(ci2.nameList[5]+deP);
		JButton btnre7 = new JButton(ci2.nameList[6]+deP);
		JButton btnre8 = new JButton(ci2.nameList[7]+deP);
		JButton btnre9 = new JButton(ci2.nameList[8]+deP);
		JButton btnre10 = new JButton(ci2.nameList[9]+deP);
		JButton btnre11 = new JButton(ci2.nameList[10]+deP);
		JButton btnre12 = new JButton(ci2.nameList[11]+deP);
		
		
	public B_Upcoming() {
		jp.setLayout(null);
		
		name1.setHorizontalAlignment(JLabel.CENTER);
		name2.setHorizontalAlignment(JLabel.CENTER);
		name3.setHorizontalAlignment(JLabel.CENTER);
		name4.setHorizontalAlignment(JLabel.CENTER);
		name5.setHorizontalAlignment(JLabel.CENTER);
		name6.setHorizontalAlignment(JLabel.CENTER);
		name7.setHorizontalAlignment(JLabel.CENTER);
		name8.setHorizontalAlignment(JLabel.CENTER);
		name9.setHorizontalAlignment(JLabel.CENTER);
		name10.setHorizontalAlignment(JLabel.CENTER);
		name11.setHorizontalAlignment(JLabel.CENTER);
		name12.setHorizontalAlignment(JLabel.CENTER);
		
		main.setFont(fnt);
		name1.setFont(fnt1);
		name2.setFont(fnt1);
		name3.setFont(fnt1);
		name4.setFont(fnt1);
		name5.setFont(fnt1);
		name6.setFont(fnt1);
		name7.setFont(fnt1);
		name8.setFont(fnt1);
		name9.setFont(fnt1);
		name10.setFont(fnt1);
		name11.setFont(fnt1);
		name12.setFont(fnt1);
		
		btnre1.setFont(fnt2);
		btnre2.setFont(fnt2);
		btnre3.setFont(fnt2);
		btnre4.setFont(fnt2);
		btnre5.setFont(fnt2);
		btnre6.setFont(fnt2);
		btnre7.setFont(fnt2);
		btnre8.setFont(fnt2);
		btnre9.setFont(fnt2);
		btnre10.setFont(fnt2);
		btnre11.setFont(fnt2);
		btnre12.setFont(fnt2);
		
		
		
		btnre1.setBackground(color);
		btnre2.setBackground(color);
		btnre3.setBackground(color);
		btnre4.setBackground(color);
		btnre5.setBackground(color);
		btnre6.setBackground(color);
		btnre7.setBackground(color);
		btnre8.setBackground(color);
		btnre9.setBackground(color);
		btnre10.setBackground(color);
		btnre11.setBackground(color);
		btnre12.setBackground(color);
		
		
		
		
		jp.add(main);
		main.setBounds(560,0,300,200);
		
		
		//공연포스터버튼
		jp.add(btn);
		btn.setBounds(40,160,150,150);
		
		jp.add(btn1);
		btn1.setBounds(234,160,150,150);
		
		jp.add(btn2);
		btn2.setBounds(424,160,150,150);
		
		jp.add(btn3);
		btn3.setBounds(614,160,150,150);
		
		jp.add(btn4);
		btn4.setBounds(806,160,150,150);
		
		jp.add(btn5);
		btn5.setBounds(1000,160,150,150);
		
		jp.add(btn6);
		btn6.setBounds(40,430,150,150);
		
		jp.add(btn7);
		btn7.setBounds(234,430,150,150);
		jp.add(btn8);
		btn8.setBounds(424,430,150,150);
		jp.add(btn9);
		btn9.setBounds(614,430,150,150);
		jp.add(btn10);
		btn10.setBounds(806,430,150,150);
		jp.add(btn11);
		btn11.setBounds(1000,430,150,150);
		
		//사전 예매하기 버튼
		int bx = 150;
		jp.add(btnre1);
		btnre1.setBounds(40,350,bx,30);
	
		jp.add(btnre2);
		btnre2.setBounds(234,350,bx,30);
		jp.add(btnre3);
		btnre3.setBounds(424,350,bx,30);
		jp.add(btnre4);
		btnre4.setBounds(614,350,bx,30);
		jp.add(btnre5);
		btnre5.setBounds(806,350,bx,30);
		jp.add(btnre6);
		btnre6.setBounds(1000,350,bx,30);
		
		
		jp.add(btnre7);
		btnre7.setBounds(40,620,bx,30);
		jp.add(btnre8);
		btnre8.setBounds(234,620,bx,30);
		jp.add(btnre9);
		btnre9.setBounds(424,620,bx,30);
		jp.add(btnre10);
		btnre10.setBounds(614,620,bx,30);
		jp.add(btnre11);
		btnre11.setBounds(806,620,bx,30);
		jp.add(btnre12);
		btnre12.setBounds(1000,620,bx,30);
		
		

		//공연이름
		int y= 255, y2=525, w= 150, h=150;
		jp.add(name1);
		name1.setBounds(40,y,w,150);//40,160,150,150
		jp.add(name2);
		name2.setBounds(234,y,w,h);
		jp.add(name3);
		name3.setBounds(424,y,w,h);
		jp.add(name4);
		name4.setBounds(614,y,w,h);
		jp.add(name5);
		name5.setBounds(806,y,w,h);
		jp.add(name6);
		name6.setBounds(1000,y,w,h);
		
		jp.add(name7);
		name7.setBounds(40,y2,w,h);
		jp.add(name8);
		name8.setBounds(234,y2,w,h);
		jp.add(name9);
		name9.setBounds(424,y2,w,h);
		jp.add(name10);
		name10.setBounds(614,y2,w,h);
		jp.add(name11);
		name11.setBounds(806,y2,w,h);
		jp.add(name12);
		name12.setBounds(1000,y2,w,h);
		
		
		jp.setBackground(color);
		jp.setBounds(0,200,1215,1000);
		jp.setVisible(true);
		
		
		
		btnre1.addActionListener(this);btnre2.addActionListener(this);btnre3.addActionListener(this);btnre4.addActionListener(this);
		btnre5.addActionListener(this);btnre6.addActionListener(this);btnre7.addActionListener(this);btnre8.addActionListener(this);
		btnre9.addActionListener(this);btnre10.addActionListener(this);btnre11.addActionListener(this);btnre12.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent ae) {
		JButton event = (JButton)ae.getSource();
		if(event == btnre1) {
			new B_Perform_Info_popup2(0);
		}else if(event == btnre2) {
			new B_Perform_Info_popup2(1);
		}else if(event == btnre3) {
			new B_Perform_Info_popup2(2);
		}else if(event == btnre4) {
			new B_Perform_Info_popup2(3);
		}else if(event == btnre5) {
			new B_Perform_Info_popup2(4);
		}else if(event == btnre6) {
			new B_Perform_Info_popup2(5);
		}else if(event == btnre7) {
			new B_Perform_Info_popup2(6);
		}else if(event == btnre8) {
			new B_Perform_Info_popup2(7);
		}else if(event == btnre9) {
			new B_Perform_Info_popup2(8);
		}else if(event == btnre10) {
			new B_Perform_Info_popup2(9);
		}else if(event == btnre11) {
			new B_Perform_Info_popup2(10);
		}else if(event == btnre12) {
			new B_Perform_Info_popup2(11);
		}

	}
	

}
