import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class map1 extends JFrame {
	Color color = new Color(255,255,255);
	JLabel lbl = new JLabel("ff");
	JPanel jj = new JPanel();
	ImageIcon map = new ImageIcon("img\\1.png");
	
	JLabel com;
	JLabel ex1 = new JLabel("����Ư���� ���α� ������� 175 (������) ������ȭȸ�� (��)03172");
	JLabel ex2 = new JLabel("Tel. 02-399-1000(���� 9�� ~ ���� 8��)");
	
	JButton btn = new JButton("Ȯ��");
	
	
	public map1() {
		add(jj);
		jj.setLayout(null);
		jj.setBounds(0,0,700,250);
		
		
		com = new JLabel(map);
		com.setBounds(45,25, 600, 500);
		jj.add(com);
		
		
		ex1.setBounds(45,450,700,200);
		jj.add(ex1);
		ex2.setBounds(45,470,700,200);
		jj.add(ex2);
		
		btn.setBounds(300,600,60,30);
		jj.add(btn);
		jj.setBackground(color);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		
		setSize(700,700);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new map1();

	}

}
