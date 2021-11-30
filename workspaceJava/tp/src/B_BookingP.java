
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EtchedBorder;

public class B_BookingP extends JPanel implements ItemListener, ActionListener{
	JPanel jp = new JPanel();
	A_Buttons bs =  new A_Buttons();
	Color color = new Color(255,255,255);
	Color color2 = new Color(25,87,111);
	Font fnt =  new Font("나눔고딕",Font.BOLD, 13); //선택시 폰트
	Font fnt2 =  new Font("나눔고딕",Font.BOLD, 14); // 콤보  폰트
	Font fnt3 =  new Font("나눔고딕",Font.BOLD,20);//메인  예매 폰트
	
	Font fnt22 =  new Font("나눔고딕",Font.BOLD, 10);
	BufferedImage bi;
	C_InfoDAO ci = new C_InfoDAO();
	//콤보박스 A-1-1
	JComboBox<String> showCb ;	//뮤지컬
	DefaultComboBoxModel<String> mModel = new DefaultComboBoxModel<String>();
	JComboBox<String> dateCb = new JComboBox<String>();	//날짜
	//DefaultComboBoxModel<Date> dModel = new DefaultComboBoxModel<Date>();
	String [] time = {"14:30", "18:30"};
	JComboBox<String> timeCb = new JComboBox<String>(time);	//시간
	String [] cnt = {"1","2","3","4","5"};
	JComboBox<String> cntCb = new JComboBox<String>(cnt);	//인원
	
	
	
	JComboBox<String> s1 = new JComboBox<String>();
	JComboBox<String> s2 = new JComboBox<String>();
	JComboBox<String> s3 = new JComboBox<String>();
	JComboBox<String> s4 = new JComboBox<String>();
	JComboBox<String> s5 = new JComboBox<String>();
	JComboBox<String> s6 = new JComboBox<String>();
	JComboBox<String> s7 = new JComboBox<String>();
	JComboBox<String> s8 = new JComboBox<String>();
	JComboBox<String> s9 = new JComboBox<String>();
	JComboBox<String> s10 = new JComboBox<String>();
	JComboBox<String> s11= new JComboBox<String>();
	JComboBox<String> s12 = new JComboBox<String>();
	JComboBox<String> s13 = new JComboBox<String>();
	JComboBox<String> s14 = new JComboBox<String>();
	JComboBox<String> s15 = new JComboBox<String>();
	JComboBox<String> s16 = new JComboBox<String>();
	
	JComboBox<String> musi = new JComboBox<String>();
	
	// 콤보 박스 선택시 뜨는 라벨
	JLabel theaLbl = new JLabel();
	JLabel showLbl = new JLabel();
	JLabel dateLbl = new JLabel();
	JLabel timeLbl = new JLabel();
	JLabel cntLbl = new JLabel();
//	JLabel seatLbl = new JLabel("좌석 확인");
//	JLabel selecSeatLbl = new JLabel();

	
	JLabel  jaP5 = new JLabel (" ");
	JTextArea jaP6 = new JTextArea(" ");

	JLabel lbl = new JLabel("뮤지컬 선택");
	//JLabel lbl1 = new JLabel("공연장 선택");
	//JLabel lbl2 = new JLabel("뮤지컬 선택");
	JLabel lbl3 = new JLabel("날짜 선택");
	JLabel lbl4 = new JLabel("시간 선택");
	JLabel lbl5 = new JLabel("좌석 확인");
	
	JLabel lbl6 = new JLabel("A 열");
	JLabel lbl7 = new JLabel("B 열");
	JLabel lbl8 = new JLabel("C 열");
	JLabel lbl9 = new JLabel("D 열");
	
	JLabel lbl10 = new JLabel("1");
	JLabel lbl11 = new JLabel("2");
	JLabel lbl12 = new JLabel("3");
	JLabel lbl13 = new JLabel("4");
	
	/////////////////
	JLabel inf = new JLabel("예매 정보");
	
///////////////////////////////////////////////////////////////////////////////////
		JLabel main = new JLabel("예매");
		JButton seatSelect = new JButton("좌석 선택 이미지");
		JButton im = new JButton("선택 뮤지컬 포스터");
		JButton pay = new JButton("결제 하기");

		JPanel scp = new JPanel();
		JLabel sc = new JLabel("SCREEN");
		
	public B_BookingP() {
		
		
		
		jaP5.setFont(fnt);
		
		jaP5.setBorder(new EtchedBorder());
		
		
		lbl.setFont(fnt2);
//		lbl1.setFont(fnt2);
//		lbl2.setFont(fnt2);
		lbl3.setFont(fnt2);
		lbl4.setFont(fnt2);
		lbl5.setFont(fnt2);
		inf.setFont(fnt2);
		
		
		
		jp.add(sc);
		sc.setBounds(990,200,200,100);
		sc.setForeground(color);
		scp.setBackground(color2);
		jp.add(scp);
		scp.setBounds(915,200,200,100);
		
		main.setFont(fnt3);

		
		jp.setLayout(null);

		
		
		
		lbl4.setFont(fnt2);
		jp.add(lbl4);

		lbl4.setBounds(90,250,200,30);
		jp.add(timeCb);
		timeCb.setBounds(30,440,200,30);
		timeCb.setFont(fnt2);
		
		JLabel seatLbl = new JLabel (" ");
		seatLbl.setBounds(240,500,230,30);
		seatLbl.setFont(fnt);
		timeCb.setBackground(color);


		// 패널추가 A-3
		
		jp.add(jaP5);
		jp.add(lbl5);
		
		jp.add(lbl6);
		jp.add(lbl7);
		jp.add(lbl8);
		jp.add(lbl9);
		jp.add(lbl10);
		jp.add(lbl11);
		jp.add(lbl12);
		jp.add(lbl13);
		
		lbl6.setBorder(new EtchedBorder());
		lbl7.setBorder(new EtchedBorder());
		lbl8.setBorder(new EtchedBorder());
		lbl9.setBorder(new EtchedBorder());
		lbl10.setBorder(new EtchedBorder());
		lbl11.setBorder(new EtchedBorder());
		lbl12.setBorder(new EtchedBorder());
		lbl13.setBorder(new EtchedBorder());
	
		
// 영화정보 누르면 옆에 뜨게하는기능 A-2
		
		s1.addItem("선택");	s1.setBackground(color);
		s1.addItem("A1"); 	s2.setBackground(color);
		s2.addItem("선택");	s3.setBackground(color);
		s2.addItem("A2"); 	s4.setBackground(color);
		s3.addItem("선택");	s5.setBackground(color);
		s3.addItem("A3");	s6.setBackground(color);
		s4.addItem("선택");	s7.setBackground(color);
		s4.addItem("A4");	s8.setBackground(color);
		s5.addItem("선택");	s9.setBackground(color);
		s5.addItem("B1");	s10.setBackground(color);
		s6.addItem("선택");	s11.setBackground(color);
		s6.addItem("B2");	s12.setBackground(color);
		s7.addItem("선택");	s13.setBackground(color);
		s7.addItem("B3");	s14.setBackground(color);
		s8.addItem("선택");	s15.setBackground(color);
		s8.addItem("B4");	s16.setBackground(color);
		s9.addItem("선택");	s1.setFont(fnt22);  
		s9.addItem("C1");	s2.setFont(fnt22); 
		s10.addItem("선택");	s3.setFont(fnt22);
		s10.addItem("C2");	s4.setFont(fnt22);
		s11.addItem("선택");	s5.setFont(fnt22);
		s11.addItem("C3");	s6.setFont(fnt22);
		s12.addItem("선택");	s7.setFont(fnt22);
		s12.addItem("C4");	s8.setFont(fnt22);
		s13.addItem("선택");	s9.setFont(fnt22);
		s13.addItem("D1");	s10.setFont(fnt22);
		s14.addItem("선택");	s11.setFont(fnt22);
		s14.addItem("D2");	s12.setFont(fnt22);
		s15.addItem("선택");	s13.setFont(fnt22);
		s15.addItem("D3");	s14.setFont(fnt22);
		s16.addItem("선택");	s15.setFont(fnt22);
		s16.addItem("D4");	s16.setFont(fnt22);
							
		
		
		jp.add(s1);
		jp.add(s2);
		jp.add(s3);
		jp.add(s4);
		jp.add(s5);
		jp.add(s6);
		jp.add(s7);
		jp.add(s8);
		jp.add(s9);
		jp.add(s10);
		jp.add(s11);
		jp.add(s12);
		jp.add(s13);
		jp.add(s14);
		jp.add(s15);
		jp.add(s16);
		
		s1.setBounds(900,350,50,30);
		s2.setBounds(960,350,50,30);
		s3.setBounds(1020,350,50,30);
		s4.setBounds(1080,350,50,30);
		
		s5.setBounds(900,410,50,30);
		s6.setBounds(960,410,50,30);
		s7.setBounds(1020,410,50,30);
		s8.setBounds(1080,410,50,30);
		
		s9.setBounds(900,470,50,30);
		s10.setBounds(960,470,50,30);
		s11.setBounds(1020,470,50,30);
		s12.setBounds(1080,470,50,30);
		
		s13.setBounds(900,530,50,30);
		s14.setBounds(960,530,50,30);
		s15.setBounds(1020,530,50,30);
		s16.setBounds(1080,530,50,30);
		//목록추가
				
		setShowCb();
		lbl3.setFont(fnt2);
		jp.add(lbl3);
		lbl3.setBounds(90,260,200,30);
		dateCb.setBounds(30,290,200,30);
		dateCb.setFont(fnt2);
		jp.add(dateCb);

		dateCb.setBackground(color);

		setLbl();
		setCntCb();
				
				
				jaP5.setBounds(240,500,230,30);
				
				jp.add(inf);
				inf.setBounds(322,130,200,100);
				
//				jp.add(lbl1);
//				jp.add(lbl2);
				jp.add(lbl3);
//				jp.add(lbl4);
//				lbl1.setBounds(90,130,200,100);
//				lbl2.setBounds(90,255,200,50);
				lbl3.setBounds(90,355,200,50);
//				lbl4.setBounds(90,455,200,50);
				lbl5.setBounds(90,500,200,50);
				
				lbl6.setBounds(840,350,30,30);
				lbl7.setBounds(840,410,30,30);
				lbl8.setBounds(840,470,30,30);
				lbl9.setBounds(840,530,30,30);
				
				lbl10.setBounds(910,305,30,30);
				lbl11.setBounds(970,305,30,30);
				lbl12.setBounds(1030,305,30,30);
				lbl13.setBounds(1090,305,30,30);
				
				lbl10.setHorizontalAlignment(JLabel.CENTER);
				lbl11.setHorizontalAlignment(JLabel.CENTER);
				lbl12.setHorizontalAlignment(JLabel.CENTER);
				lbl13.setHorizontalAlignment(JLabel.CENTER);
				
			
				
				
		
	
		//사전 예매하기 버튼
		jp.add(pay);
		pay.setBounds(965,610,100,50);
		pay.setBackground(color);
		
		
		jp.add(main);
		main.setBounds(580,-20,300,200);
		

		
		
		jp.setBounds(0,220,1215,750);
		jp.setVisible(true);
		jp.setBackground(color);
		//이벤트 등록 A-4
		
				
				
				s1.addItemListener(this);
				s2.addItemListener(this);
				s3.addItemListener(this);
				s4.addItemListener(this);
				s5.addItemListener(this);
				s6.addItemListener(this);
				s7.addItemListener(this);
				s8.addItemListener(this);
				s9.addItemListener(this);
				s10.addItemListener(this);
				s11.addItemListener(this);
				s12.addItemListener(this);
				s13.addItemListener(this);
				s14.addItemListener(this);
				s15.addItemListener(this);
				s16.addItemListener(this);
				
				 pay.addActionListener((this));
				timeCb.addActionListener(this);
				 pay.addActionListener(new ActionListener() {
					 public void actionPerformed(ActionEvent arg0) {
					 setVisible(true);
					 }
					 });   
				 

	}
	public void actionPerformed(ActionEvent a){
		Object event = a.getSource();
		if (a.getSource() == pay) {
			updateBooking();
			new PayPay();
		}else if(event==showCb) {
			showLbl.setText((String)showCb.getSelectedItem());
			showImgPane((String)showCb.getSelectedItem());
			dateCb.removeAllItems();
			setDateCb();
		}else if(event==dateCb) {
			dateLbl.setText((String)dateCb.getSelectedItem());
		}else if(event==cntCb) {
			cntLbl.setText((String)cntCb.getSelectedItem());
		}else if(event==timeCb) {
			timeLbl.setText((String)timeCb.getSelectedItem());
		}
		
	}	
	
	public void updateBooking() {
		
	}
	class  MyCanvas extends Canvas{
		public void paint(Graphics g) {
			g.drawImage(bi, 0, 0,300,400, this);
		}
	}
	public void setDateCb() {					//날짜선택
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			String startDay;
			String lastDay;

			C_InfoDAO dao = new C_InfoDAO();
			List<BookingVO> showList = new ArrayList<BookingVO>();
			showList = dao.setShowModle();
			for(int i=0; i<showList.size(); i++) {
				BookingVO vo = showList.get(i);
				if(showLbl.getText().equals(vo.getS_title())){
					String date = vo.getS_day();
					startDay = date.substring(0, 10);
					lastDay = date.substring(13, 23);
					startDay = startDay.replace("/", "-");
					lastDay = lastDay.replace("/", "-");

					Date sDay = sdf.parse(startDay);

					Date lDay = sdf.parse(lastDay);

					Calendar sC = Calendar.getInstance();
					Calendar lC = Calendar.getInstance();
					sC.setTime(sDay);
					lC.setTime(lDay);

					while(sC.compareTo(lC)!=1) {

						dateCb.addItem(sdf.format(sC.getTime()));
						sC.add(Calendar.DATE, 1);

					}
				}
				dateCb.addActionListener(this);
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void setShowCb() {					//뮤지컬선택콤보
		JLabel lbl2 = new JLabel("뮤지컬 선택");
		lbl2.setFont(fnt2);
		jp.add(lbl2);
		lbl2.setBounds(90,180,200,30);

		C_InfoDAO dao = new C_InfoDAO();


		List<BookingVO> showList = dao.setShowModle();
		for(int i=0; i<showList.size(); i++) {
			mModel.addElement(showList.get(i).getS_title());
		}
		showCb = new JComboBox<String>(mModel);

		showCb.setBounds(30,210,200,30);
		showCb.setFont(fnt2);
		jp.add(showCb);		
		showCb.setBackground(color);
		showCb.addActionListener(this);


	}



	public void setCntCb() {				//인원선택콤보
		JLabel cntLbl = new JLabel("인원선택");

		jp.add(cntLbl);
		jp.add(cntCb);
		cntLbl.setBounds(90,340,200,30);
		cntCb.setBounds(30, 370, 200, 30);
		cntLbl.setFont(fnt2);
		
		cntCb.setBackground(color);
		

		cntCb.addActionListener(this);

	}
		
	public void setLbl() {

		jp.setLayout(null);
		cntLbl.setBorder(new EtchedBorder());
		theaLbl.setBorder(new EtchedBorder());
		showLbl.setBorder(new EtchedBorder());
		dateLbl.setBorder(new EtchedBorder());
		timeLbl.setBorder(new EtchedBorder());
//		seatLbl.setBorder(new EtchedBorder());
//		selecSeatLbl.setBorder(new EtchedBorder());


		cntLbl.setHorizontalAlignment(JLabel.CENTER);
		theaLbl.setHorizontalAlignment(JLabel.CENTER);
		showLbl.setHorizontalAlignment(JLabel.CENTER);
		dateLbl.setHorizontalAlignment(JLabel.CENTER);
		timeLbl.setHorizontalAlignment(JLabel.CENTER);
//		seatLbl.setHorizontalAlignment(JLabel.CENTER);
//		selecSeatLbl.setHorizontalAlignment(JLabel.CENTER);


		showLbl.setBounds(240,210,230,30);
		dateLbl.setBounds(240,290,230,30);
		jp.add(timeLbl);
		cntLbl.setBounds(240, 370, 230, 30);
		timeLbl.setBounds(240,440,230,30);
//		seatLbl.setBounds(30,520,200,30);
//		selecSeatLbl.setBounds(240,520,230,30);

		theaLbl.setFont(fnt);
		showLbl.setFont(fnt);
		dateLbl.setFont(fnt);
		timeLbl.setFont(fnt);
//		seatLbl.setFont(fnt2);
		

		jp.add(theaLbl);
		jp.add(showLbl);
		jp.add(dateLbl);
		
//		jp.add(seatLbl);
//		jp.add(seatLbl);
		jp.add(cntLbl);
//		jp.add(selecSeatLbl);

	}
	//패널에 이미지 보여주기
		public void showImgPane(String sLbl) {
			jp.setVisible(false);
			C_InfoDAO dao = new C_InfoDAO();
			bi = dao.getDBImage(sLbl);
			MyCanvas img = new MyCanvas();
			jp.add(img);
			img.setBounds(500,180,300,400);
			jp.setVisible(true);
		}

	
		public void itemStateChanged(ItemEvent ie) {

			JComboBox event = (JComboBox)ie.getSource();
			if(event.equals(s1)) {
				if(s1.getSelectedItem().equals("A1")) {
			         Passtext5("A1");
			}				
			}
			if(event.equals(s2)) {
				if(s2.getSelectedItem().equals("A2")) {
			         Passtext5("A2");
			}				
			}

			if(event.equals(s3)) {
				if(s3.getSelectedItem().equals("A3")) {
			         Passtext5("A3");
			}			
			}
			if(event.equals(s4)) {
				if(s4.getSelectedItem().equals("A4")) {
			         Passtext5("A4");
			}				
			}
			if(event.equals(s5)) {
				if(s5.getSelectedItem().equals("B1")) {
			         Passtext5("B1");
			}				
			}
			if(event.equals(s6)) {
				if(s6.getSelectedItem().equals("B2")) {
			         Passtext5("B2");
			}				
			}
			if(event.equals(s7)) {
				if(s7.getSelectedItem().equals("B3")) {
			         Passtext5("B3");
			}				
			}
			if(event.equals(s8)) {
				if(s8.getSelectedItem().equals("B4")) {
			         Passtext5("B4");
			}				
			}
			if(event.equals(s9)) {
				if(s9.getSelectedItem().equals("C1")) {
			         Passtext5("C1");
			}				
			}
			if(event.equals(s10)) {
				if(s10.getSelectedItem().equals("C2")) {
			         Passtext5("C2");
			}				
			}
			if(event.equals(s11)) {
				if(s11.getSelectedItem().equals("C3")) {
			         Passtext5("C3");
			}				
			}
			if(event.equals(s12)) {
				if(s12.getSelectedItem().equals("C4")) {
			         Passtext5("C4");
			}				
			}
			if(event.equals(s13)) {
				if(s13.getSelectedItem().equals("D1")) {
			         Passtext5("D1");
			}				
			}
			if(event.equals(s14)) {
				if(s14.getSelectedItem().equals("D2")) {
			         Passtext5("D2");
			}				
			}
			if(event.equals(s15)) {
				if(s15.getSelectedItem().equals("D3")) {
			         Passtext5("D3");
			}				
			}
			if(event.equals(s16)) {
				if(s16.getSelectedItem().equals("D4")) {
			         Passtext5("D4");
			}				
			}
			
			
	}
		
		public void itemStateChanged4(ItemEvent ie4) {
			
	}
	
	private void Passtext5(String st5) {
		jaP5.setText(st5);
}

}
