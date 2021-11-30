import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PayPage extends JFrame {
	ImageIcon seatImg = new ImageIcon("img/seat1.gif");
	
	// Panel - north 
	JPanel northPane = new JPanel(new GridLayout(1,7));
		JButton[] btn = {new JButton("Home"), new JButton("���������"), new JButton("����������"), new JButton("�����ϱ�"), 
	               new JButton("MY PAGE"), new JButton("ã�ƿ��� ��"), new JButton("�α׾ƿ�")};
	
	// Panel - center
	JPanel centerPane = new JPanel();
	JPanel leftPane, rightPane;
	JLabel priceLbl, paymentLbl, cardNumLbl, receiptLbl, totalLbl;
	
	String[] pay = {"ī�����","���������"};
	JComboBox payCom = new JComboBox(pay);
	
	JTextField priceTf, cardNumTf, totalTf;
	JRadioButton homerBtn, mobilerBtn;
	ButtonGroup bg;
	JButton confirmBtn, cancleBtn;
	
	public PayPage() {
		setMenuBar();
		setCenter();
		
		setSize(1200,1000);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
	}
	public void setCenter() {
		centerPane.setLayout(new GridLayout(1,2));
		add("Center", centerPane);
		leftPane = new JPanel();
		leftPane.setLayout(null);
		JLabel nothing = new JLabel(seatImg);
		leftPane.add(nothing);
		
		
		//rightPane
		rightPane = new JPanel();
		rightPane.setLayout(null);
		
		priceLbl = new JLabel("��    ��");
		priceLbl.setBounds(50, 250, 100, 50);
		rightPane.add(priceLbl);
		
		paymentLbl = new JLabel("��������");
		paymentLbl.setBounds(50,300, 100, 50);
		rightPane.add(paymentLbl);
		
		cardNumLbl = new JLabel("ī���ȣ");
		cardNumLbl.setBounds(50,350,100,50);
		rightPane.add(cardNumLbl);
		
		receiptLbl = new JLabel("Ƽ�ϼ���");
		receiptLbl.setBounds(50, 400, 100, 50);
		rightPane.add(receiptLbl);
		
		totalLbl = new JLabel("�Ѱ����ݾ�");
		totalLbl.setBounds(50,500,100,50);
		rightPane.add(totalLbl);
		
		
		
		priceTf = new JTextField(20);
		priceTf.setBounds(150, 260, 200, 30);
		rightPane.add(priceTf);
		
		payCom.setBounds(150, 310, 200, 30);
		rightPane.add(payCom);
		
		cardNumTf = new JTextField(20);
		cardNumTf.setBounds(150, 360, 200, 30);
		rightPane.add(cardNumTf);
		
		homerBtn = new JRadioButton("��    ��");
		mobilerBtn = new JRadioButton("�����Ƽ��");
		bg = new ButtonGroup();
		bg.add(homerBtn);
		bg.add(mobilerBtn);
		homerBtn.setBounds(50, 460, 100, 30);
		mobilerBtn.setBounds(170, 460, 100, 30);
		rightPane.add(homerBtn);
		rightPane.add(mobilerBtn);
		
		totalTf = new JTextField(20);
		totalTf.setBounds(150, 510, 200, 30);
		rightPane.add(totalTf);
			
		confirmBtn = new JButton("�����ϱ�");
		cancleBtn = new JButton("����ϱ�");
		confirmBtn.setBounds(70, 650, 100, 50);
		cancleBtn.setBounds(250, 650, 100, 50);
		rightPane.add(confirmBtn);
		rightPane.add(cancleBtn);
			
		
		centerPane.add(leftPane);
		centerPane.add(rightPane);
		
		
		
		
		
	}
	public void setMenuBar() {
		add(BorderLayout.NORTH, northPane);
        for(int i=0; i<btn.length; i++) {
           northPane.add(btn[i]);
        }
	}
	
	public static void main(String[] args) {
		new PayPage();

	}

}
