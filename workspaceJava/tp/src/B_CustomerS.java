import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Paint;
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

public class B_CustomerS extends JPanel implements ActionListener{
	//화면전환
		public void actionPerformed(ActionEvent a){
			if (a.getSource() == cs1) {
				 new map1();
			}else if (a.getSource() == cs2) {
				new map2();
			}else if (a.getSource() == cs3) {
				new map7();
			}else if (a.getSource() == cs4) {
				new map4();
			}else if (a.getSource() == cs5) {
				new map5();
			}else if (a.getSource() == cs6) {
				new map6();
			}else if (a.getSource() == cs7) {
				new map3();
			}
		}
	JTextArea ja = new JTextArea();
	JPanel main = new JPanel();
	JPanel jp = new JPanel();
	
	A_Buttons bs =  new A_Buttons();
	Color color = new Color(255,255,255);
	
	//목록
	JPanel tablePane = new JPanel();	
	DefaultTableModel model;
	JTable table;
	JScrollPane sp;				
	JLabel lbl = new JLabel();
	
	//버튼
	JButton cs1 = new JButton("세종문화회관");
	JButton cs2 = new JButton("블루스퀘어");
	JButton cs3 = new JButton("샤롯데씨어터");
	JButton cs4 = new JButton("디큐브아트센터");
	JButton cs5 = new JButton("홍익대학교 대학로 아트센터");
	JButton cs6 = new JButton("LG아트센터");
	JButton cs7 = new JButton("충무아트센터");
	
	
	//라벨
	 //JLabel myInfo = new JLabel("  공  연  정  보  ");
//	JLabel tel1 = new JLabel("Tel.  02 - 399 - 1000");
//	JLabel tel2 = new JLabel("Tel.  1544 - 1591");
//	JLabel tel3 = new JLabel("Tel.  1599 - 6336");
//	JLabel tel4 = new JLabel("Tel.  02 - 2211 - 3000");
//	JLabel tel5 = new JLabel("Tel.  02 - 742 - 0300");
//	JLabel tel6 = new JLabel("Tel.  02 - 2005 - 0114");
//	JLabel tel7 = new JLabel("Tel.  02 - 2230 - 6600");
	//JLabel addr = new JLabel("주        소");
	//JLabel date = new JLabel("가  입  일");
	//JLabel date2 = new JLabel("2020-07-27(디비연결)");
	
	//상영관 명
	JLabel reser = new JLabel("고   객   센   터");
	JLabel reser1 = new JLabel("세종문화회관 :");
	JLabel reser2 = new JLabel("블루스퀘어 :");
	JLabel reser3 = new JLabel("샤롯데씨어터 :");
	JLabel reser4 = new JLabel("디큐브아트센터 :");
	JLabel reser5 = new JLabel("<html>&nbsp;&nbsp; 홍익대학교 <br>대학로 아트센터 :</html>");
	JLabel reser6 = new JLabel("LG 아트센터 :");
	JLabel reser7 = new JLabel("충무아트센터 :");
	
	
	// 상영관 전번,주소
	JLabel reser1db = new JLabel("서울특별시 종로구 세종대로175 세종문화회관"+"  Tel.  02 - 399 - 1000");
	JLabel reser2db = new JLabel("서울특별시 용산구 이태원로294 블루스퀘어"+"  Tel.  1544 - 1591");
	JLabel reser3db = new JLabel("서울특별시 송파구 올림픽로240 샤롯데씨어터"+"  Tel.  1599 - 6336");
	JLabel reser4db = new JLabel("서울특별시 구로구 경인로662 디큐브아트센터"+"  Tel.  02 - 2211 - 3000");
	JLabel reser5db = new JLabel("서울특별시 구로구 경인로662 디큐브아트센터"+"  Tel.  02 - 742 - 0300");
	JLabel reser6db = new JLabel("서울특별시 강남구 역삼동 논현로508 LG아트센터"+"  Tel.  02 - 2005 - 0114");
	JLabel reser7db = new JLabel("서울특별시 중구 흥인동 퇴계로387 충무아트센터"+"  Tel.  02 - 2230 - 6600");

	//체크박스
	JRadioButton homerBtn, mobilerBtn;
	ButtonGroup bg;
	JButton confirmBtn, cancleBtn;
	Font font = new Font("나눔고딕",Font.BOLD,20);// 고객센터 폰트
	Font font1 = new Font("나눔고딕",Font.BOLD, 15);// 나머지
	
	//Font font = new Font("나눔고딕",Font.BOLD,20); //내정보  글자 폰트
	//Font font1 = new Font("나눔고딕",Font.BOLD, 13);// 나머지
	//Font font2 = new Font("나눔고딕",Font.BOLD, 10);//아직 사용 안함

	
	
		public B_CustomerS() {
			StartSetup();
		}
		
		
		
		public void StartSetup() {
			add(main);
			main.setLayout(null);
			sp = new JScrollPane(table);
			
			
			//lbl
					main.add(jp);
					jp.setLayout(null);
					jp.setBounds(0,220,1215,1000);
					jp.setBackground(new Color(245,245,245));
					
					int tt= 250, yy=40,x=150, xx= 850, xxx=280;
					jp.add(cs1);
					cs1.setBounds(xx,tt,230,50);
					jp.add(cs2);
					cs2.setBounds(xx,tt+yy,230,50);
					jp.add(cs3);
					cs3.setBounds(xx,tt+yy*2,230,50);
					jp.add(cs4);
					cs4.setBounds(xx,tt+yy*3,230,50);
					jp.add(cs5);
					cs5.setBounds(xx,tt+yy*4,230,50);
					jp.add(cs6);
					cs6.setBounds(xx,tt+yy*5,230,50);
					jp.add(cs7);
					cs7.setBounds(xx,tt+yy*6,230,50);
					
					reser1.setBounds(x,tt,230,50);
					reser2.setBounds(x,tt+yy,230,50);
					reser3.setBounds(x,tt+yy*2,230,50);
					reser4.setBounds(x,tt+yy*3,230,50);
					reser5.setBounds(x,tt+yy*4,230,50);
					reser6.setBounds(x,tt+yy*5,230,50);
					reser7.setBounds(x,tt+yy*6,230,50);
					
					reser1db.setBounds(xxx,tt,530,50);
					reser2db.setBounds(xxx,tt+yy,530,50);
					reser3db.setBounds(xxx,tt+yy*2,530,50);
					reser4db.setBounds(xxx,tt+yy*3,530,50);
					reser5db.setBounds(xxx,tt+yy*4,530,50);
					reser6db.setBounds(xxx,tt+yy*5,530,50);
					reser7db.setBounds(xxx,tt+yy*6,530,50);
					
					cs1.setBackground(color);
					cs2.setBackground(color);
					cs3.setBackground(color);
					cs4.setBackground(color);
					cs5.setBackground(color);
					cs6.setBackground(color);
					cs7.setBackground(color);
					cs1.setFont(font1);
					cs2.setFont(font1);
					cs3.setFont(font1);
					cs4.setFont(font1);
					cs5.setFont(font1);
					cs6.setFont(font1);
					cs7.setFont(font1);
					
					reser.setFont(font);
					reser1.setFont(font1);
					reser2.setFont(font1);
					reser3.setFont(font1);
					reser4.setFont(font1);
					reser5.setFont(font1);
					reser6.setFont(font1);
					reser7.setFont(font1);
				
					
					reser1db.setFont(font1);
					reser2db.setFont(font1);
					reser3db.setFont(font1);
					reser4db.setFont(font1);
					reser5db.setFont(font1);
					reser6db.setFont(font1);
					reser7db.setFont(font1);
					
//					tel1.setFont(font3);
//					tel2.setFont(font3);
//					tel3.setFont(font3);
//					tel4.setFont(font3);
//					tel5.setFont(font3);
//					tel6.setFont(font3);
//					tel7.setFont(font3);
					
					
					//내정보
					//jp.add(myInfo);	
					//myInfo.setBounds(185,10,400,150);
//////////////////////////////////////////////////////////////////

					//고객센터 제목
					jp.add(reser);
					reser.setBounds(535,5,300,150);
					
					//공연장 명
					jp.add(reser1);//제목				
					jp.add(reser2);//캐스팅
									
					jp.add(reser3);//공연기간
								
					jp.add(reser4);//관람시간
						
					jp.add(reser5);//등급
							
					jp.add(reser6);//줄거리
					
					jp.add(reser7);//총결제금액
				
					
					//공연장 주소
					jp.add(reser1db); //제목디비
			
					//예매내역
					jp.add(reser2db); //캐스팅 디비
				
					//예매내역
					jp.add(reser3db); // 공연 기간 디비
			

					jp.add(reser4db); // 관람시간 디비
			
					
					jp.add(reser5db); // 등급 디비
				
					
					jp.add(reser6db); // 줄거리 디비
				
					
					jp.add(reser7db); // 줄거리 디비
				
					
					//공연장 전번
//					jp.add(tel1); //제목디비
//					tel1.setBounds(600,135,300,150);
//					jp.add(tel2); //제목디비
//					tel2.setBounds(600,215,300,150);
//					jp.add(tel3); //제목디비
//					tel3.setBounds(600,295,300,150);
//					jp.add(tel4); //제목디비
//					tel4.setBounds(600,375,300,150);
//					jp.add(tel5); //제목디비
//					tel5.setBounds(600,455,300,150);
//					jp.add(tel6); //제목디비
//					tel6.setBounds(600,535,300,150);
//					jp.add(tel7); //제목디비
//					tel7.setBounds(600,615,300,150);
								
					
			//폰트 종류 설정
				
			//폰트생성
				//myInfo.setFont(font);
				
				//date2.setFont(font2);
				
			
				cs1.addActionListener((this)); //버튼 실행소스
				cs2.addActionListener((this)); 
				cs3.addActionListener((this)); 
				cs4.addActionListener((this)); 
				cs5.addActionListener((this)); 
				cs6.addActionListener((this)); 
				cs7.addActionListener((this)); 
			//화면전환 2
			 cs1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(true);;
					}
			});
			 cs2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(true);;
					}
			});
			 cs3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(true);;
					}
			});
			 cs4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(true);;
					}
			});
			 cs5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(true);;
					}
			});
			 cs6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(true);;
					}
			});
			 cs7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						setVisible(true);;
					}
			});
			//배경
				jp.setBackground(color);
				add(jp);
				setSize(1215,750);
				setVisible(true);
				
				
		}
		

}
