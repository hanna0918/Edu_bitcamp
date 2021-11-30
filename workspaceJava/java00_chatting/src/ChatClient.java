import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.StringTokenizer;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatClient extends JFrame implements ActionListener, Runnable {
	//JFrame - Center
	JPanel centerPane = new JPanel(new BorderLayout());
		JPanel connPane = new JPanel(new BorderLayout());
			JTextField  connTf = new JTextField("192.168.0.29");
			JButton connBtn = new JButton("����");
		
		JTextArea msgTa = new JTextArea();
		JScrollPane sp = new JScrollPane(msgTa);
		
		JPanel msgPane = new JPanel(new BorderLayout());
			JTextField msgTf = new JTextField();
			JButton sendBtn = new JButton("������");
			
	//Frame - East
	JPanel eastPane = new JPanel(new BorderLayout());
		JLabel title = new JLabel("           ������ ����Ʈ           ");
		
		DefaultListModel<String> connModel = new DefaultListModel<String>();
		JList<String> connList = new JList<String>(connModel);
		JScrollPane connSp = new JScrollPane(connList);
		
		
		JLabel count = new JLabel("���� : 0��");
	///////////////////////////////////////////////////////////////
	Socket s;
	BufferedReader br;
	PrintWriter pw;
	
	
	public ChatClient() {
		add(centerPane);
		
		
		//connect
		centerPane.add(BorderLayout.NORTH, connPane);
		connPane.add(connTf);
		connPane.add("East", connBtn);
		
		//All Message
		centerPane.add(sp);
		msgTa.setBackground(new Color(176, 202, 209));
		
		//Send Message
		centerPane.add("South", msgPane);
		msgPane.add(msgTf);
		msgPane.add("East", sendBtn);
		
		
		//chat information
		add("East", eastPane);
		eastPane.add("North", title);
		connModel.addElement("									");
		eastPane.add("Center", connSp);
		eastPane.add("South", count);
		
		
		setSize(800, 500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		//�̺�Ʈ ���
		connTf.addActionListener(this);
		connBtn.addActionListener(this);
		msgTf.addActionListener(this);
		sendBtn.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent ae) {
		Object eventObj = ae.getSource();
		if(eventObj == connTf || eventObj == connBtn) {
			setServerConnection();
		}else if(eventObj == msgTf || eventObj == sendBtn) {
			sendMessage();
		}
	}
	
	//������ Ŭ���̾�Ʈ�� ���� ������
	public void sendMessage() {
		String sendMsg = msgTf.getText();
		if(!sendMsg.equals("")) {
			pw.println(sendMsg);
			pw.flush();
		}
	}
	
	public void setServerConnection() {
		try {		
			//������ ����
			InetAddress ia = InetAddress.getByName("192.168.0.28");
			s = new Socket(ia, 13000);
			
			//IO����
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));
			
			connTf.setEnabled(false);
			connBtn.setEnabled(false);
			
			Thread t = new Thread(this);
			t.start();
			
		}catch(Exception e) {
			System.out.println("!! �������ӿ��� �߻� !!" + e.getMessage());
		}
	}
	
	//�������� �� ���ڸ� �޴� ������
	public synchronized void run() {
		while(true) {
			try {
				String receiveData = br.readLine();
				if(receiveData != null && !receiveData.equals("")) {
					//message
					if(receiveData.substring(0, 4).equals("*MG$")) {
						msgTa.append(receiveData.substring(4)+"\n");
					}else if(receiveData.substring(0, 4).equals("$CN#")) {//count
						count.setText("���� : " + receiveData.substring(4)+"��");
					}else if(receiveData.substring(0,4).equals("@LI*")) {// ������ ���
						StringTokenizer st = new StringTokenizer(receiveData.substring(4), "/");
						//���� ��� ������ ����� �����.
						connModel.removeAllElements();
						
						while(st.hasMoreTokens()) {
							connModel.addElement(st.nextToken());
							
						}
					}
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}
	}
	

	public static void main(String[] args) {
		new ChatClient();

	}

}
