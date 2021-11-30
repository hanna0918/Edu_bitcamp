import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
//								default : BorderLayout
public class JFrameTest extends JFrame {
	ImageIcon icon1 = new ImageIcon("img/dinosaur.png");
	ImageIcon icon2 = new ImageIcon("img/doll.png");
	ImageIcon icon3 = new ImageIcon("img/fire.png");
	public JFrameTest() {
		//BorderLayout�� GridLayout���� �����ϱ�
		//								  3��2��
		GridLayout layout = new GridLayout(3,2,10,10);
		setLayout(layout);
		//=setLayout(new GridLayout(3,2));
		
		JButton btn1 = new JButton("��ư1");
		add(btn1);
		
		
		//JButton(Icon icon)
		JButton btn2 = new JButton(icon1);
		add(btn2);		
		//���콺�� ��ư ������ icon �ٲٱ�
		btn2.setPressedIcon(icon2);
		//���콺 ������ icon�ٲٱ�
		btn2.setRolloverIcon(icon3);
		
		
		JButton btn3 = new JButton("����", icon1);
		add(btn3);
		//��ư Ȱ��ȭ(true) ��Ȱ��ȭ(false)
		btn3.setEnabled(false);
		
		JButton btn4 = new JButton("�׹�°��ư");
		add(btn4);
		
		//���� ��ư
		JPanel pane = new JPanel(new GridLayout(3,1));	//�׵θ��� ���� �����̳�
		JRadioButton rBtn1 = new JRadioButton("ONE");
		JRadioButton rBtn2 = new JRadioButton("TWO");
		JRadioButton rBtn3 = new JRadioButton("THREE");
		
		//���� ��ư �׷츸���
		ButtonGroup bg = new ButtonGroup();
		bg.add(rBtn1);		bg.add(rBtn2);		bg.add(rBtn3);
		
		pane.add(rBtn1);
		pane.add(rBtn2);
		pane.add(rBtn3);
		
		add(pane);
		
		//��۹�ư
		JToggleButton toggleBtn = new JToggleButton("���", icon3);
		toggleBtn.setRolloverIcon(icon1);
		toggleBtn.setSelectedIcon(icon2);
		add(toggleBtn);
		
		//�󺧸����
		//						�󺧳���	,	����������(��������)
		JLabel lbl = new JLabel("��ǥ��", JLabel.CENTER);
		add(lbl);
		
		//���� �÷� �����ϱ�
		btn1.setBackground(Color.ORANGE);
		//�÷� ��ü ���� ���� ����
		//				R:0~255, G:0~255, B:0~255
		Color clr = new Color(100, 100, 200);
		toggleBtn.setBackground(clr);
		
		//���ڻ� �÷� �����ϱ�
		btn1.setForeground(Color.WHITE);
		
		//�󺧿� ���� �����ϱ�
		//����ó������
		lbl.setOpaque(true);//true:����ó������ false:����ó��
		lbl.setBackground(new Color(160,160,100));//����� ����ó��. ����ó�� �����ϰ� ��漳�� ��
		
		//Font : �۲�(����ü, ����ü, Arial...), ��������(�����, ���ϰ�, ����), ����ũ��(pixel) ����
		//Font(String name, int style, int size);
		//			�۲��̸�, �����,���ϰԵ�.., ����ũ��
		Font fnt = new Font("�ü�ü", Font.ITALIC+Font.BOLD, 40);
		
		lbl.setFont(fnt);
		
		
		
		setSize(500,500);
		setVisible(true);
		//���α׷��� ����Ǹ� �ڿ����� �ϰų�, ���α׷��� ������ �� ������ ����...
		// 						 DISPSE_ON_CLOSE : ���α׷� ����� �ڿ��� �����϶�.
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//						   DO_NOTHING_ON_CLOSE : �ݱⰡ ������� �ʴ´�.
		//setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		//�и��ʸ�ŭ ��� ��
		try {
			Thread.sleep(5000);//�и��� 
		}catch(InterruptedException e) {}
		
		
		//��ư�� ��, Label�� �� �����ϱ�
		btn1.setText("����� ��ư ��");
		lbl.setText("����� ��");
	}
	
	
	
	
	public static void main(String [] args) {
		new JFrameTest();
	}
}
