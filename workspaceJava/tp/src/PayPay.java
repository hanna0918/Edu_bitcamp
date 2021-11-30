import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class PayPay extends JFrame implements ActionListener{
	//화면전환
			public void actionPerformed(ActionEvent a){
				if (a.getSource() == btscpay) {
					 new paycomple();
				}
			}
			
	
	//이미지
	 ImageIcon pay = new ImageIcon("D:\\image\\pay.png");
	 ImageIcon adv = new ImageIcon("D:\\image\\adv.png");
	
	
	//메인패널
	JPanel main = new JPanel();
	//입력패널
	JPanel writePane = new JPanel();
		JLabel Kgignis = new JLabel("KG 이니시스");
		JLabel Kgignis2 = new JLabel("안전하고 편리한 이니시스 결제입니다");
		
		JLabel Kgignis3 = new JLabel("───────────────────────────────────────────────────────────────");
		JLabel Kgignis3_1 = new JLabel("───────────────────────────────────────────────────────────────");
		JLabel Kgignis3_2 = new JLabel("========================================================================");
		JLabel Kgignis3_3 = new JLabel("========================================================================");
		JLabel Kgignis13 = new JLabel("========================================================================");
		
		JLabel Kgignis4 = new JLabel("이용약관");
	
		
		JLabel Kgignis5 = new JLabel("전자금융거래 이용약관");
		
		
		JLabel Kgignis6 = new JLabel("개인정보의 수집 및 이용안내");
		
		JLabel Kgignis7 = new JLabel("개인정보 제공 및 위탁안내");
	
		JLabel Kgignis3_4_1 = new JLabel("───────────────────────────────────────────────");
		
		JLabel Kgignis8 = new JLabel("KG 이니시스 결제정보");
		
		JLabel Kgignis3_4 = new JLabel("─────────────────────────────────────────────────");
		
		JLabel Kgignis9 = new JLabel("상품명                                        오페라의유령");
		
		JLabel Kgignis10 = new JLabel("상품가격                                    1,004원");
		
		JLabel Kgignis11 = new JLabel("제공기간                                    별도제공기간없음");
		
		JLabel Kgignis3_5 = new JLabel("──────────────────────────────────────────────────");
		
		JLabel Kgignis12 = new JLabel("결제금액                                     1,004원");


		//카드정보입력란
		JLabel cardLbl;
		JTextField cardTf;
		
		
		
	//목록패널
	JPanel tablePane = new JPanel();	
		DefaultTableModel model;
		JTable table;
		JScrollPane sp;				
		JLabel lbl = new JLabel(" ");
	
		
		//결제은행버튼
		JButton btsc1a= new JButton("카카오페이");
		JButton btsc2a= new JButton("L.pay");
		JButton btsc3a= new JButton("PAYCO");
		JButton btsc4a= new JButton("Kpay");
		JButton btsc5a= new JButton("samsungPay");
		JButton btsc6a= new JButton("현대카드");//상영예정작
	    JButton btsc7a= new JButton("삼성카드");
		JButton btsc8a= new JButton("비씨카드");
		JButton btsc9a= new JButton("KB국민");
		JButton btsc10a= new JButton("신한카드");
		JButton btsc11a= new JButton("롯데카드");
		JButton btsc12a= new JButton("NH농협");
		JButton btsc13a= new JButton("하나카드");
		JButton btsc14a= new JButton("씨티카드");
		JButton btsc15a= new JButton("UnionPay");
		JButton btsc16a= new JButton("케이뱅크");
		JButton btsc17a= new JButton("SC제일은행");
		JButton btsc18a= new JButton("위쳇페이");
		JButton btsc19a= new JButton("알리페이");
		JButton btsc20a= new JButton("차니페이");
		
		//결제하기
		JButton btscpay= new JButton(pay);
		
		//광고페이지
		JButton btscadv= new JButton(adv);
		

	public PayPay() {
		
		add(main);
		main.setLayout(null);
		table = new JTable(model);
		sp = new JScrollPane(table);
		
		
		//writeapnel
		main.add(writePane);
		writePane.setLayout(null);
		writePane.setBounds(0,0,600,800);
		writePane.setBackground(new Color(245,245,245));
		
		
		//이그니스
		writePane.add(Kgignis);	
		Kgignis.setBounds(45,10,350,40);
		
		//안전하고편리한 이니시스결제입니다.
		writePane.add(Kgignis2);	
		Kgignis2.setBounds(345,10,350,40);
		
		//절취선1
		writePane.add(Kgignis3);		
		Kgignis3.setBounds(45,25,509,40);
		
		//이용약관
		writePane.add(Kgignis4);
		Kgignis4.setBounds(45,45,150,40);
		
		//절취선
		writePane.add(Kgignis3_1);		
		Kgignis3_1.setBounds(45,60,509,40);
		
		//전자금융거래이용약관
		writePane.add(Kgignis5);
		Kgignis5.setBounds(45,75,150,40);
		//개인정보의수집 및 이용안내
		writePane.add(Kgignis6);
		Kgignis6.setBounds(45,90,165,40);

		//개인정보 제공 및 위탁 안내
		writePane.add(Kgignis7);
		Kgignis7.setBounds(45,125,170,40);
		
		//절취선
		writePane.add(Kgignis3_2);		
		Kgignis3_2.setBounds(45,140,509,40);
		
		
		//체크박스
		JCheckBox totalAgree = new JCheckBox("전체동의",false);
		writePane.add(totalAgree);
		JCheckBox agree1 = new JCheckBox("동의",false);
		writePane.add(agree1);
		JCheckBox agree2 = new JCheckBox("동의",false);
		writePane.add(agree2);
		totalAgree.setBounds(470, 45, 100, 30);
		agree1.setBounds(470, 95, 100, 30);
		agree2.setBounds(470, 125, 100, 30);

		//결제은행 버튼
		 btsc1a.setBounds(45,185,120,35);
		 btsc2a.setBounds(175,185,120,35);
		 btsc3a.setBounds(305,185,120,35);
		 btsc4a.setBounds(435,185,120,35);
		 btsc5a.setBounds(45,225,120,35);
		 btsc6a.setBounds(175,225,120,35);
		 btsc7a.setBounds(305,225,120,35);
		 btsc8a.setBounds(435,225,120,35);
		 btsc9a.setBounds(45,265,120,35);
		 btsc10a.setBounds(175,265,120,35);
		 btsc11a.setBounds(305,265,120,35);
		 btsc12a.setBounds(435,265,120,35);
		 btsc13a.setBounds(45,305,120,35);
		 btsc14a.setBounds(175,305,120,35);
		 btsc15a.setBounds(305,305,120,35);
		 btsc16a.setBounds(435,305,120,35);
		 btsc17a.setBounds(45,345,120,35);
		 btsc18a.setBounds(175,345,120,35);
		 btsc19a.setBounds(305,345,120,35);
		 btsc20a.setBounds(435,345,120,35);
		 
		 writePane.add(btsc1a);
		 writePane.add(btsc2a);
		 writePane.add(btsc3a);
		 writePane.add(btsc4a);
		 writePane.add(btsc5a);
		 writePane.add(btsc6a);
		 writePane.add(btsc7a);
		 writePane.add(btsc8a);
		 writePane.add(btsc9a);
		 writePane.add(btsc10a);
		 writePane.add(btsc11a);
		 writePane.add(btsc12a);
		 writePane.add(btsc13a);
		 writePane.add(btsc14a);
		 writePane.add(btsc15a);
		 writePane.add(btsc16a);
		 writePane.add(btsc17a);
		 writePane.add(btsc18a);
		 writePane.add(btsc19a);
		 writePane.add(btsc20a);
		 
		 
		 
		//절취선
			writePane.add(Kgignis3_3);		
			Kgignis3_3.setBounds(45,390,509,40);
	////////////////////////////////////////////////////////////		
			//카드정보입력란
			cardLbl = new JLabel("▷ 카드정보 입력 ◁");
			cardLbl.setBounds(130, 405, 130, 50);
			writePane.add(cardLbl);	
			
			cardLbl = new JLabel("카  드  번  호");
			cardLbl.setBounds(45, 430, 100, 50);
			writePane.add(cardLbl);			
			cardTf = new JTextField(20);
			cardTf.setBounds(125, 447, 200, 20);
			writePane.add(cardTf);
			
			cardLbl = new JLabel("CVC");
			cardLbl.setBounds(45, 455, 100, 50);
			writePane.add(cardLbl);			
			cardTf = new JTextField(20);
			cardTf.setBounds(125, 473, 35, 20);
			writePane.add(cardTf);
			
			cardLbl = new JLabel("유  효  기  간");
			cardLbl.setBounds(45, 480, 100, 50);
			writePane.add(cardLbl);			
			cardTf = new JTextField(20);
			cardTf.setBounds(125, 497, 45, 20);
			writePane.add(cardTf);
	////////////////////////////////////////////////////////		
			
			//절취선
			writePane.add(Kgignis3_4_1);		
			Kgignis3_4_1.setBounds(45,510,300,40);
			
			//KG이니시스 결제정보
			writePane.add(Kgignis8);		
			Kgignis8.setBounds(45,520,509,40);
			
			//절취선
			writePane.add(Kgignis3_4);		
			Kgignis3_4.setBounds(45,530,300,40);
			
			//상품명
			writePane.add(Kgignis9);		
			Kgignis9.setBounds(45,545,509,40);
			
			//상품가격
			writePane.add(Kgignis10);		
			Kgignis10.setBounds(45,565,509,40);
			
			//제공기간
			writePane.add(Kgignis11);		
			Kgignis11.setBounds(45,585,509,40);
			
			//절취선
			writePane.add(Kgignis3_5);		
			Kgignis3_5.setBounds(45,600,300,40);
			
			//결제금액
			writePane.add(Kgignis12);		
			Kgignis12.setBounds(45,615,509,40);
			
			//절취선
			writePane.add(Kgignis13);		
			Kgignis13.setBounds(45,650,509,40);
			
		/////////////////////////////////////////////////
	//결제버튼
			
			btscpay.setBounds(64,687,450,58);
			writePane.add(btscpay);
			
			btscpay.addActionListener((this)); //버튼 실행소스
			
			
			
			
			
	
	//광고위치
			btscadv.setBounds(360,430,192,220);
			writePane.add(btscadv);
		 
			 btscpay.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
					 dispose();
					}
			});
	
	
	
		 
		setSize(600,800);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		
		new PayPay();
	}

}
