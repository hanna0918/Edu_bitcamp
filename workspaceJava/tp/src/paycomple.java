import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class paycomple extends JFrame {
	JLabel lbl = new JLabel("ff");
	JPanel jj = new JPanel();
	ImageIcon pay = new ImageIcon("D:\\image\\paycompl.png");
	
	JLabel com;
	
	JButton btn = new JButton("확인");
	/*
	//화면전환
	public void actionPerformed(ActionEvent a){
		if (a.getSource() == btn) {
			
		
		}
	}
	*/
	
	
	public paycomple() {
		add(jj);
		jj.setLayout(null);
		jj.setBounds(0,0,700,250);
		
		
		com = new JLabel(pay);
		com.setBounds(45,5, 600, 200);
		jj.add(com);
		
		
		btn.setBounds(300,200,60,30);
		jj.add(btn);

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
	});
		
		setSize(700,300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	
			//btn.addActionListener((this));

	public static void main(String[] args) {
		new paycomple();

	}

}
