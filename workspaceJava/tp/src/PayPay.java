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
	//ȭ����ȯ
			public void actionPerformed(ActionEvent a){
				if (a.getSource() == btscpay) {
					 new paycomple();
				}
			}
			
	
	//�̹���
	 ImageIcon pay = new ImageIcon("D:\\image\\pay.png");
	 ImageIcon adv = new ImageIcon("D:\\image\\adv.png");
	
	
	//�����г�
	JPanel main = new JPanel();
	//�Է��г�
	JPanel writePane = new JPanel();
		JLabel Kgignis = new JLabel("KG �̴Ͻý�");
		JLabel Kgignis2 = new JLabel("�����ϰ� ���� �̴Ͻý� �����Դϴ�");
		
		JLabel Kgignis3 = new JLabel("������������������������������������������������������������������������������������������������������������������������������");
		JLabel Kgignis3_1 = new JLabel("������������������������������������������������������������������������������������������������������������������������������");
		JLabel Kgignis3_2 = new JLabel("========================================================================");
		JLabel Kgignis3_3 = new JLabel("========================================================================");
		JLabel Kgignis13 = new JLabel("========================================================================");
		
		JLabel Kgignis4 = new JLabel("�̿���");
	
		
		JLabel Kgignis5 = new JLabel("���ڱ����ŷ� �̿���");
		
		
		JLabel Kgignis6 = new JLabel("���������� ���� �� �̿�ȳ�");
		
		JLabel Kgignis7 = new JLabel("�������� ���� �� ��Ź�ȳ�");
	
		JLabel Kgignis3_4_1 = new JLabel("����������������������������������������������������������������������������������������������");
		
		JLabel Kgignis8 = new JLabel("KG �̴Ͻý� ��������");
		
		JLabel Kgignis3_4 = new JLabel("��������������������������������������������������������������������������������������������������");
		
		JLabel Kgignis9 = new JLabel("��ǰ��                                        �����������");
		
		JLabel Kgignis10 = new JLabel("��ǰ����                                    1,004��");
		
		JLabel Kgignis11 = new JLabel("�����Ⱓ                                    ���������Ⱓ����");
		
		JLabel Kgignis3_5 = new JLabel("����������������������������������������������������������������������������������������������������");
		
		JLabel Kgignis12 = new JLabel("�����ݾ�                                     1,004��");


		//ī�������Է¶�
		JLabel cardLbl;
		JTextField cardTf;
		
		
		
	//����г�
	JPanel tablePane = new JPanel();	
		DefaultTableModel model;
		JTable table;
		JScrollPane sp;				
		JLabel lbl = new JLabel(" ");
	
		
		//���������ư
		JButton btsc1a= new JButton("īī������");
		JButton btsc2a= new JButton("L.pay");
		JButton btsc3a= new JButton("PAYCO");
		JButton btsc4a= new JButton("Kpay");
		JButton btsc5a= new JButton("samsungPay");
		JButton btsc6a= new JButton("����ī��");//�󿵿�����
	    JButton btsc7a= new JButton("�Ｚī��");
		JButton btsc8a= new JButton("��ī��");
		JButton btsc9a= new JButton("KB����");
		JButton btsc10a= new JButton("����ī��");
		JButton btsc11a= new JButton("�Ե�ī��");
		JButton btsc12a= new JButton("NH����");
		JButton btsc13a= new JButton("�ϳ�ī��");
		JButton btsc14a= new JButton("��Ƽī��");
		JButton btsc15a= new JButton("UnionPay");
		JButton btsc16a= new JButton("���̹�ũ");
		JButton btsc17a= new JButton("SC��������");
		JButton btsc18a= new JButton("��������");
		JButton btsc19a= new JButton("�˸�����");
		JButton btsc20a= new JButton("��������");
		
		//�����ϱ�
		JButton btscpay= new JButton(pay);
		
		//����������
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
		
		
		//�̱״Ͻ�
		writePane.add(Kgignis);	
		Kgignis.setBounds(45,10,350,40);
		
		//�����ϰ����� �̴Ͻý������Դϴ�.
		writePane.add(Kgignis2);	
		Kgignis2.setBounds(345,10,350,40);
		
		//���뼱1
		writePane.add(Kgignis3);		
		Kgignis3.setBounds(45,25,509,40);
		
		//�̿���
		writePane.add(Kgignis4);
		Kgignis4.setBounds(45,45,150,40);
		
		//���뼱
		writePane.add(Kgignis3_1);		
		Kgignis3_1.setBounds(45,60,509,40);
		
		//���ڱ����ŷ��̿���
		writePane.add(Kgignis5);
		Kgignis5.setBounds(45,75,150,40);
		//���������Ǽ��� �� �̿�ȳ�
		writePane.add(Kgignis6);
		Kgignis6.setBounds(45,90,165,40);

		//�������� ���� �� ��Ź �ȳ�
		writePane.add(Kgignis7);
		Kgignis7.setBounds(45,125,170,40);
		
		//���뼱
		writePane.add(Kgignis3_2);		
		Kgignis3_2.setBounds(45,140,509,40);
		
		
		//üũ�ڽ�
		JCheckBox totalAgree = new JCheckBox("��ü����",false);
		writePane.add(totalAgree);
		JCheckBox agree1 = new JCheckBox("����",false);
		writePane.add(agree1);
		JCheckBox agree2 = new JCheckBox("����",false);
		writePane.add(agree2);
		totalAgree.setBounds(470, 45, 100, 30);
		agree1.setBounds(470, 95, 100, 30);
		agree2.setBounds(470, 125, 100, 30);

		//�������� ��ư
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
		 
		 
		 
		//���뼱
			writePane.add(Kgignis3_3);		
			Kgignis3_3.setBounds(45,390,509,40);
	////////////////////////////////////////////////////////////		
			//ī�������Է¶�
			cardLbl = new JLabel("�� ī������ �Է� ��");
			cardLbl.setBounds(130, 405, 130, 50);
			writePane.add(cardLbl);	
			
			cardLbl = new JLabel("ī  ��  ��  ȣ");
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
			
			cardLbl = new JLabel("��  ȿ  ��  ��");
			cardLbl.setBounds(45, 480, 100, 50);
			writePane.add(cardLbl);			
			cardTf = new JTextField(20);
			cardTf.setBounds(125, 497, 45, 20);
			writePane.add(cardTf);
	////////////////////////////////////////////////////////		
			
			//���뼱
			writePane.add(Kgignis3_4_1);		
			Kgignis3_4_1.setBounds(45,510,300,40);
			
			//KG�̴Ͻý� ��������
			writePane.add(Kgignis8);		
			Kgignis8.setBounds(45,520,509,40);
			
			//���뼱
			writePane.add(Kgignis3_4);		
			Kgignis3_4.setBounds(45,530,300,40);
			
			//��ǰ��
			writePane.add(Kgignis9);		
			Kgignis9.setBounds(45,545,509,40);
			
			//��ǰ����
			writePane.add(Kgignis10);		
			Kgignis10.setBounds(45,565,509,40);
			
			//�����Ⱓ
			writePane.add(Kgignis11);		
			Kgignis11.setBounds(45,585,509,40);
			
			//���뼱
			writePane.add(Kgignis3_5);		
			Kgignis3_5.setBounds(45,600,300,40);
			
			//�����ݾ�
			writePane.add(Kgignis12);		
			Kgignis12.setBounds(45,615,509,40);
			
			//���뼱
			writePane.add(Kgignis13);		
			Kgignis13.setBounds(45,650,509,40);
			
		/////////////////////////////////////////////////
	//������ư
			
			btscpay.setBounds(64,687,450,58);
			writePane.add(btscpay);
			
			btscpay.addActionListener((this)); //��ư ����ҽ�
			
			
			
			
			
	
	//������ġ
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
