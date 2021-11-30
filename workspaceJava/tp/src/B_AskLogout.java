import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class B_AskLogout extends JFrame{
	JButton jb = new JButton();
	JPanel jp = new JPanel();
	Color col = new Color(255,255,255);
	public B_AskLogout() {
		jp.setLayout(null);
		jp.add(jb);
		jp.setBounds(120,75,150,150);
		jb.setBounds(90,30,60,60);
		jp.setBackground(col);
		add(jp);
		
		setBounds(400,300,300,200);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new B_AskLogout();

	}

}
