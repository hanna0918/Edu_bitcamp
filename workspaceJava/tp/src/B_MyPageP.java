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
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class B_MyPageP extends JPanel implements ActionListener{
	JPanel jp = new JPanel();
	
	A_Buttons bs =  new A_Buttons();
	Color color = new Color(255,255,255);
	
	//버튼
	
	JButton edit = new JButton("변경 완료");
	
	

	//라벨
	JLabel myInfo = new JLabel("마이페이지");
	JLabel id = new JLabel("아이디");
	JLabel id2 = new JLabel("디비연결해야함");
	JLabel name = new JLabel("이   름");
	JLabel name2 = new JLabel("디비연결해야함");
	JLabel pw = new JLabel("비밀번호");
	JLabel pw1 = new JLabel("비밀번호 확인");
	JLabel ph = new JLabel("연  락  처");
	JLabel addr = new JLabel("주        소");
	JLabel date = new JLabel("가  입  일");
	JLabel date2 = new JLabel("2020-07-27(디비연결)");
	
	//예매내역파트
	JLabel reser = new JLabel("예매내역");
	JLabel reser1 = new JLabel("1. ");
	JLabel reser2 = new JLabel("2. ");
	JLabel reser3 = new JLabel("3. ");
	JLabel reser4 = new JLabel("4. ");
	JLabel reser5 = new JLabel("5. ");
	JLabel reser6 = new JLabel("6. ");
	JLabel reser7 = new JLabel("7. ");
	
	
	
	JTable table;	
	
	
	//텍스트변수
	JTextField pwtf,pwtf1,phtf,addrtf,adrtf;
	
	Font fnt = new Font("나눔고딕",Font.BOLD,20); //현재 상영작 표시 폰트
	Font fnt1 = new Font("나눔고딕",Font.BOLD, 13); // 영화 제목 폰트
	Font fnt2 = new Font("나눔고딕",Font.BOLD, 10); //버튼 폰트
	
		public B_MyPageP() {
			//폰트 종류 설정
			Font font = new Font("나눔고딕",Font.BOLD,20); //내정보  글자 폰트
			Font font1 = new Font("나눔고딕",Font.BOLD, 13);// 나머지
			Font font2 = new Font("나눔고딕",Font.BOLD, 10);//아직 사용 안함
			
		//폰트생성
			
			myInfo.setFont(font);
			id.setFont(font1);
			id2.setFont(font1);
			name.setFont(font1);
			name2.setFont(font1);
			pw.setFont(font1);
			pw1.setFont(font1);
			ph.setFont(font1);
			addr.setFont(font1);
			date.setFont(font1);
			edit.setFont(font1);
			date2.setFont(font1);
			reser.setFont(font1);
			reser1.setFont(font1);
			reser2.setFont(font1);
			reser3.setFont(font1);
			reser4.setFont(font1);
			reser5.setFont(font1);
			reser6.setFont(font1);
			reser7.setFont(font1);
			
			//lbl
					
					jp.setLayout(null);
					jp.setBounds(0,0,600,800);
					jp.setBackground(color);
					
					
					
					//내정보
					jp.add(myInfo);	
					myInfo.setBounds(550,200,300,200);
		
					
					//아이디
					jp.add(id);
					id.setBounds(150,330,100,100);
					
					//고객아이디 디비연결해야함
					jp.add(id2);
					id2.setBounds(365,330,150,100);
					
					//이름
					jp.add(name);
					name.setBounds(150,380,100,100);
					
					//이름 디비연결해야함
					jp.add(name2);
					name2.setBounds(365,380,150,100);
					
					//비번
					jp.add(pw);
					pw.setBounds(150,450,100,100);
					//비번확인
					jp.add(pw1);
					pw1.setBounds(150,510,200,100);
					//연락처
					jp.add(ph);
					ph.setBounds(150,570,100,100);
					//주소
					jp.add(addr);
					addr.setBounds(150,630,100,100);
					//가입일
					jp.add(date);
					date.setBounds(150,690,100,100);
					
					//가입일 디비연결해야함
					jp.add(date2);
					date2.setBounds(320,690,300,100);
					//수정완료버튼
					jp.add(edit);
					edit.setBounds(320,780,150,40);
					edit.setBackground(color);
					
					
					pwtf = new JTextField(20);
					pwtf.setBounds(320, 485, 200,40);
					jp.add(pwtf);
					
					pwtf1 = new JTextField(20);
					pwtf1.setBounds(320, 543, 200,40);
					jp.add(pwtf1);
					
					phtf = new JTextField(20);
					phtf.setBounds(320, 603, 200,40);
					jp.add(phtf);
					
					addrtf = new JTextField(100);
					addrtf.setBounds(320, 660, 370,40);
					jp.add(addrtf);
				
					//예매내역
					pwtf.setFont(font1);
					pwtf1.setFont(font1);
					phtf.setFont(font1);
					addrtf.setFont(font1);
					//예매내역
					int x = 800, xx=30;
					jp.add(reser);
					reser.setBounds(970,290,150,150);
					
					//예매내역
					jp.add(reser1);
					reser1.setBounds(x,350,150,150);
					//예매내역
					jp.add(reser2);
					reser2.setBounds(x,410,150,150);
					//예매내역
					jp.add(reser3);
					reser3.setBounds(x,470,150,150);
					//예매내역
					jp.add(reser4);
					reser4.setBounds(x,530,150,150);
					//예매내역
					jp.add(reser5);
					reser5.setBounds(x,590,150,150);
					//예매내역
					jp.add(reser6);
					reser6.setBounds(x,650,150,150);
					//예매내역
					jp.add(reser7);
					reser7.setBounds(x,710,150,150);
					
					
			
			
			jp.setBounds(0,0,1200,1000);
			jp.setVisible(true);
		}
		public void actionPerformed(ActionEvent ae) {
			JButton event = (JButton)ae.getSource();
		}
}
