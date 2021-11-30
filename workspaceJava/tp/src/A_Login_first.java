
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class A_Login_first extends JFrame{
	JPanel jp = new JPanel();
	A_Buttons bs =  new A_Buttons();
	Color color = new Color(255,255,255);
	A_Posters ps = new A_Posters();
	JPanel jp2 = new JPanel();
	String CompanyInfo = "<html>º 서울시 마포구 신촌로 비트캠프, 5-Group’s team project º<br>&emsp&emsp&emsp&emsp&emsp&emsp&emspº What the Performence º</html>";
	JTextField idPut= new JTextField("ID");
	JTextField pwdPut= new JTextField("PASSWORD");
	
	public A_Login_first() {
		
		jp.add(IdPut(498,560,218,33));
		jp.add(PwdPut(498,595,218,33));
		LoginLogo();
		LoginLine(447,518,320,2);
		LoginLine(447,698,320,2);
		
		
		jp.add(bs.JoinUs(498, 635, 75, 20));
		jp.add(bs.Login_FirstB(641, 635, 75, 20));
		StartSetup();
	}
	public void StartSetup() {
		jp.add(ps.Poster1_3(CompanyInfo, 447, 705, 320, 50));
		add(jp);
		setSize(1215,1000);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	public void LoginLogo() {
		jp.setLayout(null);
		jp.setBackground(color);
		jp.add(bs.LoginLogo(259,235,696,241));//로고위치 크기
	}
	public void LoginLine(int x, int y, int w, int h) {
		jp.setLayout(null);
		jp.setBackground(color);
		jp.add(bs.LoginLine(x,y,w,h));
	}
	public JTextField IdPut(int x,int y, int w, int h) {
		jp.setLayout(null);
		idPut.setHorizontalAlignment(JTextField.RIGHT);
		idPut.setBounds(x,y,w,h);
		return idPut;
	}
	public JTextField PwdPut(int x,int y, int w, int h) {
		jp.setLayout(null);
		pwdPut.setHorizontalAlignment(JTextField.RIGHT);
		pwdPut.setBounds(x,y,w,h);
		return pwdPut;
	}
	public static void main(String[] args) {
		new A_Login_first();
	}

}
