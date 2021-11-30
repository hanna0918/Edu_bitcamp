import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Paint;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class B_Perform_Info_popup extends JFrame implements ActionListener{
	JPanel jp = new JPanel();
	 C_InfoDAO ci = new C_InfoDAO();
	A_Buttons bs =  new A_Buttons();
	Color color = new Color(255,255,255);
	JPanel jsp;
	JScrollPane jsp2;
	
	//목록
	JPanel tablePane = new JPanel();	
	DefaultTableModel model;
	JTable table;
	JScrollPane sp;				
	JLabel lbl = new JLabel();
	
	//버튼
	JButton me = new JButton();
	
	JLabel reser = new JLabel("공연 정보");
	JLabel reser1 = new JLabel("1.   제          목 :");
	JLabel reser2 = new JLabel("2.   캐   스   팅 :");
	JLabel reser3 = new JLabel("3.   공 연 기 간 :");
	JLabel reser4 = new JLabel("4.   관 람 시 간 :");
	JLabel reser5 = new JLabel("5.   등          급 :");
	JLabel reser6 = new JLabel("6.   줄   거   리 :");
	//JLabel reser7 = new JLabel("총 결제금액");
	
	
	//결제정보 내용
	JLabel reser1db;
	//JLabel reser2db;
	JLabel reser3db;
	JLabel reser4db;
	JLabel reser5db;
	//JLabel reser6db;
	JTextArea reser2db;
	JTextArea reser6db;
	//JLabel reser7db = new JLabel("DBDBDBDBDBDB");

	//체크박스
	JRadioButton homerBtn, mobilerBtn;
	ButtonGroup bg;
	JButton confirmBtn, cancleBtn;
	Font font = new Font("나눔고딕",Font.BOLD,20);
	Font font2 = new Font("나눔고딕",Font.BOLD,15);
	Font font3 = new Font("나눔고딕",Font.BOLD,10);
	
	
		public B_Perform_Info_popup(int q) {
			name(q);
			cast(q);
			date(q);
			time(q);
			grade(q);
			story(q);
			
					jp.setLayout(null);
					
					//내사진 버튼
					jp.add(me);
					me.setBounds(45,70,500,500);
					
					//내정보
					//jp.add(myInfo);	
					//myInfo.setBounds(185,10,400,150);
//////////////////////////////////////////////////////////////////

					//예매내역
					jp.add(reser);
					reser.setBounds(770,10,150,30);
					int x = 600, xx=130;
					//결제정보
					jp.add(reser1);//제목
					reser1.setBounds(x,100,150,30);					
					jp.add(reser2);//캐스팅
					reser2.setBounds(x,160,150,30);					
					jp.add(reser3);//공연기간
					reser3.setBounds(x,220,150,30);					
					jp.add(reser4);//관람시간
					reser4.setBounds(x,280,150,30);					
					jp.add(reser5);//등급
					reser5.setBounds(x,340,150,30);				
					jp.add(reser6);//줄거리
					reser6.setBounds(x,400,150,30);
					//jp.add(reser7);//총결제금액
					//reser7.setBounds(700,430,150,150);
					
					//예매내역 디비
					jp.add(reser1db); //제목디비
					reser1db.setBounds(x+xx,100,300,30);
					//예매내역
					jsp = new JPanel();
					reser2db.setLineWrap(true);
					reser2db.setBounds(0,0,290,90);
					jsp.add(reser2db);
					jsp.setBackground(color);
					jp.add(jsp); //캐스팅 디비
					jsp.setBounds(730,160,300,60);
					
				
					//reser2db.setBounds(x+xx,160,300,150);
					//예매내역
					jp.add(reser3db); // 공연 기간 디비
					reser3db.setBounds(x+xx,220,300,30);

					jp.add(reser4db); // 관람시간 디비
					reser4db.setBounds(x+xx,280,300,30);
					
					jp.add(reser5db); // 등급 디비
					reser5db.setBounds(x+xx,340,300,30);
					
					reser6db.setLineWrap(true);
					jsp2 = new JScrollPane(reser6db);
					jp.add(jsp2); // 줄거리 디비
					jsp2.setBounds(730,400,300,200);
					jsp2.getViewport().setBackground(color);
					
					
					//예매하기 버튼			
					confirmBtn = new JButton("예매하기");
					confirmBtn.setBounds(230, 610, 100, 50);
					jp.add(confirmBtn);
					confirmBtn.setFont(font3);
					confirmBtn.setBackground(color);
					
					
					
			//폰트 종류 설정
				
			
			//폰트생성
				
			
				reser.setFont(font);
				reser1.setFont(font2);
				reser2.setFont(font2);
				reser3.setFont(font2);
				reser4.setFont(font2);
				reser5.setFont(font2);
				reser6.setFont(font2);
				//reser7.setFont(font2);
			
				
				reser1db.setFont(font2);
				reser2db.setFont(font2);
				reser3db.setFont(font2);
				reser4db.setFont(font2);
				reser5db.setFont(font2);
				reser6db.setFont(font2);
				//reser7db.setFont(font2);
			//배경
			jp.setBackground(color);
			
			add(jp);
			setSize(1100,750);
			setVisible(true);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
		}
		public void name(int q) {
			this.reser1db = new JLabel(ci.nameList[q]);
		}public void cast(int q) {
			this.reser2db = new JTextArea(ci.castList[q]);
		}public void date(int q) {
			this.reser3db = new JLabel(ci.dayList[q]);
		}public void time(int q) {
			this.reser4db = new JLabel(ci.timeList[q]);
		}public void grade(int q) {
			this.reser5db = new JLabel(ci.gradeList[q]);
		}public void story(int q) {
			this.reser6db = new JTextArea(ci.synopList[q]);
		}
		
		
		
		
	public void actionPerformed(ActionEvent ae) {
		
	}

}
