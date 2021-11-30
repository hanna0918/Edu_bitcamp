import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class map3 extends JFrame {
	Color color = new Color(255,255,255);
	JLabel lbl = new JLabel("ff");
	JPanel jj = new JPanel();
	ImageIcon map = new ImageIcon("img\\3.png");
	
	JLabel com;
	JLabel ex1 = new JLabel("¼­¿ïÆ¯º°½Ã ¼ÛÆÄ±¸ ¿Ã¸²ÇÈ·Î 240 (Àá½Çµ¿) ·Ôµ¥¼îÇÎ ¢ß ·Ôµ¥½Ã³×¸¶ »þ·Ôµ¥¾¾¾îÅÍ");
	JLabel ex2 = new JLabel("Tel. 1644-0078");
	
	JButton btn = new JButton("È®ÀÎ");
	
	public map3() {
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
				System.exit(0);
			}
	});
		
		setSize(700,700);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	
			//btn.addActionListener((this));

	public static void main(String[] args) {
		new map3();

	}

}
