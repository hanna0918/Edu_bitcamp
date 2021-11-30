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
	//ȭ����ȯ
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
	
	//���
	JPanel tablePane = new JPanel();	
	DefaultTableModel model;
	JTable table;
	JScrollPane sp;				
	JLabel lbl = new JLabel();
	
	//��ư
	JButton cs1 = new JButton("������ȭȸ��");
	JButton cs2 = new JButton("��罺����");
	JButton cs3 = new JButton("���Ե�������");
	JButton cs4 = new JButton("��ť���Ʈ����");
	JButton cs5 = new JButton("ȫ�ʹ��б� ���з� ��Ʈ����");
	JButton cs6 = new JButton("LG��Ʈ����");
	JButton cs7 = new JButton("�湫��Ʈ����");
	
	
	//��
	 //JLabel myInfo = new JLabel("  ��  ��  ��  ��  ");
//	JLabel tel1 = new JLabel("Tel.  02 - 399 - 1000");
//	JLabel tel2 = new JLabel("Tel.  1544 - 1591");
//	JLabel tel3 = new JLabel("Tel.  1599 - 6336");
//	JLabel tel4 = new JLabel("Tel.  02 - 2211 - 3000");
//	JLabel tel5 = new JLabel("Tel.  02 - 742 - 0300");
//	JLabel tel6 = new JLabel("Tel.  02 - 2005 - 0114");
//	JLabel tel7 = new JLabel("Tel.  02 - 2230 - 6600");
	//JLabel addr = new JLabel("��        ��");
	//JLabel date = new JLabel("��  ��  ��");
	//JLabel date2 = new JLabel("2020-07-27(��񿬰�)");
	
	//�󿵰� ��
	JLabel reser = new JLabel("��   ��   ��   ��");
	JLabel reser1 = new JLabel("������ȭȸ�� :");
	JLabel reser2 = new JLabel("��罺���� :");
	JLabel reser3 = new JLabel("���Ե������� :");
	JLabel reser4 = new JLabel("��ť���Ʈ���� :");
	JLabel reser5 = new JLabel("<html>&nbsp;&nbsp; ȫ�ʹ��б� <br>���з� ��Ʈ���� :</html>");
	JLabel reser6 = new JLabel("LG ��Ʈ���� :");
	JLabel reser7 = new JLabel("�湫��Ʈ���� :");
	
	
	// �󿵰� ����,�ּ�
	JLabel reser1db = new JLabel("����Ư���� ���α� �������175 ������ȭȸ��"+"  Tel.  02 - 399 - 1000");
	JLabel reser2db = new JLabel("����Ư���� ��걸 ���¿���294 ��罺����"+"  Tel.  1544 - 1591");
	JLabel reser3db = new JLabel("����Ư���� ���ı� �ø��ȷ�240 ���Ե�������"+"  Tel.  1599 - 6336");
	JLabel reser4db = new JLabel("����Ư���� ���α� ���η�662 ��ť���Ʈ����"+"  Tel.  02 - 2211 - 3000");
	JLabel reser5db = new JLabel("����Ư���� ���α� ���η�662 ��ť���Ʈ����"+"  Tel.  02 - 742 - 0300");
	JLabel reser6db = new JLabel("����Ư���� ������ ���ﵿ ������508 LG��Ʈ����"+"  Tel.  02 - 2005 - 0114");
	JLabel reser7db = new JLabel("����Ư���� �߱� ���ε� ����387 �湫��Ʈ����"+"  Tel.  02 - 2230 - 6600");

	//üũ�ڽ�
	JRadioButton homerBtn, mobilerBtn;
	ButtonGroup bg;
	JButton confirmBtn, cancleBtn;
	Font font = new Font("�������",Font.BOLD,20);// ������ ��Ʈ
	Font font1 = new Font("�������",Font.BOLD, 15);// ������
	
	//Font font = new Font("�������",Font.BOLD,20); //������  ���� ��Ʈ
	//Font font1 = new Font("�������",Font.BOLD, 13);// ������
	//Font font2 = new Font("�������",Font.BOLD, 10);//���� ��� ����

	
	
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
					
					
					//������
					//jp.add(myInfo);	
					//myInfo.setBounds(185,10,400,150);
//////////////////////////////////////////////////////////////////

					//������ ����
					jp.add(reser);
					reser.setBounds(535,5,300,150);
					
					//������ ��
					jp.add(reser1);//����				
					jp.add(reser2);//ĳ����
									
					jp.add(reser3);//�����Ⱓ
								
					jp.add(reser4);//�����ð�
						
					jp.add(reser5);//���
							
					jp.add(reser6);//�ٰŸ�
					
					jp.add(reser7);//�Ѱ����ݾ�
				
					
					//������ �ּ�
					jp.add(reser1db); //������
			
					//���ų���
					jp.add(reser2db); //ĳ���� ���
				
					//���ų���
					jp.add(reser3db); // ���� �Ⱓ ���
			

					jp.add(reser4db); // �����ð� ���
			
					
					jp.add(reser5db); // ��� ���
				
					
					jp.add(reser6db); // �ٰŸ� ���
				
					
					jp.add(reser7db); // �ٰŸ� ���
				
					
					//������ ����
//					jp.add(tel1); //������
//					tel1.setBounds(600,135,300,150);
//					jp.add(tel2); //������
//					tel2.setBounds(600,215,300,150);
//					jp.add(tel3); //������
//					tel3.setBounds(600,295,300,150);
//					jp.add(tel4); //������
//					tel4.setBounds(600,375,300,150);
//					jp.add(tel5); //������
//					tel5.setBounds(600,455,300,150);
//					jp.add(tel6); //������
//					tel6.setBounds(600,535,300,150);
//					jp.add(tel7); //������
//					tel7.setBounds(600,615,300,150);
								
					
			//��Ʈ ���� ����
				
			//��Ʈ����
				//myInfo.setFont(font);
				
				//date2.setFont(font2);
				
			
				cs1.addActionListener((this)); //��ư ����ҽ�
				cs2.addActionListener((this)); 
				cs3.addActionListener((this)); 
				cs4.addActionListener((this)); 
				cs5.addActionListener((this)); 
				cs6.addActionListener((this)); 
				cs7.addActionListener((this)); 
			//ȭ����ȯ 2
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
			//���
				jp.setBackground(color);
				add(jp);
				setSize(1215,750);
				setVisible(true);
				
				
		}
		

}
