import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class URLSource extends JFrame implements ActionListener, KeyListener{
	JPanel northPane; 
	JLabel urlLbl;
	JTextField urlTf;
	JButton sourceBtn;
	JScrollPane centerPane;
	JTextArea sourceTa = new JTextArea();

	public URLSource() {
		//northPane
		urlLbl = new JLabel("URL");
		urlTf = new JTextField(50);
		sourceBtn = new JButton("소스보기");

		northPane = new JPanel();
		northPane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
		northPane.add(urlLbl);
		northPane.add(urlTf);
		northPane.add(sourceBtn);
		add(BorderLayout.NORTH, northPane);

		centerPane = new JScrollPane(sourceTa);
		add(centerPane);

		setSize(700,700);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		sourceBtn.addActionListener(this);
		urlTf.addKeyListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		String eventBtn = ae.getActionCommand();
		if(eventBtn.equals("소스보기")) {
			urlSearch();
		}


	}

	//
	public void urlSearch() {
		//TextField에 검색어 입력되었는지 확인
		String urlText = urlTf.getText();
		if(urlText!=null && !urlText.equals("")) {//url있음
			sourceTa.setText("");
			getUrl(urlText);
			urlTf.setText("");
		}
	}

	//url주소 받고 객체 만든후 리소스받아오기
	public void getUrl(String urlText) {
		try {
			URL url = new URL(urlText);
			URLConnection connection = url.openConnection();
			connection.connect();
			String type = connection.getContentType();

			//코드 얻어오기 
			int idx = type.indexOf("charset=");
			String encode = type.substring(idx+8);

			InputStream is = url.openStream();

			InputStreamReader isr = new InputStreamReader(is, encode);
			BufferedReader br = new BufferedReader(isr);

			while(true) {
				String readData = br.readLine();
				if(readData==null) break;
				sourceTa.append(readData+"\n");
			}

		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_ENTER) {
			urlSearch();
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {		
	}


	public static void main(String[] args) {
		new URLSource();

	}


}
