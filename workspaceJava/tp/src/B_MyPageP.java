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
	
	//��ư
	
	JButton edit = new JButton("���� �Ϸ�");
	
	

	//��
	JLabel myInfo = new JLabel("����������");
	JLabel id = new JLabel("���̵�");
	JLabel id2 = new JLabel("��񿬰��ؾ���");
	JLabel name = new JLabel("��   ��");
	JLabel name2 = new JLabel("��񿬰��ؾ���");
	JLabel pw = new JLabel("��й�ȣ");
	JLabel pw1 = new JLabel("��й�ȣ Ȯ��");
	JLabel ph = new JLabel("��  ��  ó");
	JLabel addr = new JLabel("��        ��");
	JLabel date = new JLabel("��  ��  ��");
	JLabel date2 = new JLabel("2020-07-27(��񿬰�)");
	
	//���ų�����Ʈ
	JLabel reser = new JLabel("���ų���");
	JLabel reser1 = new JLabel("1. ");
	JLabel reser2 = new JLabel("2. ");
	JLabel reser3 = new JLabel("3. ");
	JLabel reser4 = new JLabel("4. ");
	JLabel reser5 = new JLabel("5. ");
	JLabel reser6 = new JLabel("6. ");
	JLabel reser7 = new JLabel("7. ");
	
	
	
	JTable table;	
	
	
	//�ؽ�Ʈ����
	JTextField pwtf,pwtf1,phtf,addrtf,adrtf;
	
	Font fnt = new Font("�������",Font.BOLD,20); //���� ���� ǥ�� ��Ʈ
	Font fnt1 = new Font("�������",Font.BOLD, 13); // ��ȭ ���� ��Ʈ
	Font fnt2 = new Font("�������",Font.BOLD, 10); //��ư ��Ʈ
	
		public B_MyPageP() {
			//��Ʈ ���� ����
			Font font = new Font("�������",Font.BOLD,20); //������  ���� ��Ʈ
			Font font1 = new Font("�������",Font.BOLD, 13);// ������
			Font font2 = new Font("�������",Font.BOLD, 10);//���� ��� ����
			
		//��Ʈ����
			
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
					
					
					
					//������
					jp.add(myInfo);	
					myInfo.setBounds(550,200,300,200);
		
					
					//���̵�
					jp.add(id);
					id.setBounds(150,330,100,100);
					
					//�����̵� ��񿬰��ؾ���
					jp.add(id2);
					id2.setBounds(365,330,150,100);
					
					//�̸�
					jp.add(name);
					name.setBounds(150,380,100,100);
					
					//�̸� ��񿬰��ؾ���
					jp.add(name2);
					name2.setBounds(365,380,150,100);
					
					//���
					jp.add(pw);
					pw.setBounds(150,450,100,100);
					//���Ȯ��
					jp.add(pw1);
					pw1.setBounds(150,510,200,100);
					//����ó
					jp.add(ph);
					ph.setBounds(150,570,100,100);
					//�ּ�
					jp.add(addr);
					addr.setBounds(150,630,100,100);
					//������
					jp.add(date);
					date.setBounds(150,690,100,100);
					
					//������ ��񿬰��ؾ���
					jp.add(date2);
					date2.setBounds(320,690,300,100);
					//�����Ϸ��ư
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
				
					//���ų���
					pwtf.setFont(font1);
					pwtf1.setFont(font1);
					phtf.setFont(font1);
					addrtf.setFont(font1);
					//���ų���
					int x = 800, xx=30;
					jp.add(reser);
					reser.setBounds(970,290,150,150);
					
					//���ų���
					jp.add(reser1);
					reser1.setBounds(x,350,150,150);
					//���ų���
					jp.add(reser2);
					reser2.setBounds(x,410,150,150);
					//���ų���
					jp.add(reser3);
					reser3.setBounds(x,470,150,150);
					//���ų���
					jp.add(reser4);
					reser4.setBounds(x,530,150,150);
					//���ų���
					jp.add(reser5);
					reser5.setBounds(x,590,150,150);
					//���ų���
					jp.add(reser6);
					reser6.setBounds(x,650,150,150);
					//���ų���
					jp.add(reser7);
					reser7.setBounds(x,710,150,150);
					
					
			
			
			jp.setBounds(0,0,1200,1000);
			jp.setVisible(true);
		}
		public void actionPerformed(ActionEvent ae) {
			JButton event = (JButton)ae.getSource();
		}
}
