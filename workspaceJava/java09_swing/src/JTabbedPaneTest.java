import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;

public class JTabbedPaneTest extends JFrame {
	JTabbedPane tp;
	
	JLabel lbl;
	ImageIcon ii = new ImageIcon("img/fire.png");
	
	JButton btn;
	ImageIcon iii = new ImageIcon("img/doll.png");
	
	DigitalClock2 dc = new DigitalClock2(0,0);
	CalculatorEx2 cal = new CalculatorEx2();
	SwingCalendar2 cld = new SwingCalendar2();
	PackMan2 pm = new PackMan2();
	
	public JTabbedPaneTest() {
		super("�Ǹ޴�");
		
		tp = new JTabbedPane(JTabbedPane.LEFT);
		
		lbl = new JLabel(ii);
		tp.addTab("���̺�", lbl);
		
		btn = new JButton(iii);
		tp.addTab("��ư", btn);
		
		tp.addTab("�ð�", dc);
		
		tp.addTab("����", cal);
		
		tp.addTab("�޷�", null, cld, "�޷�");
		
		tp.addTab("�Ѹ�", null, pm, "�Ѹ�");
		
		tp.insertTab("Button", null, new JButton("�߰��� ��ư"), "�߰��� �Ǹ޴� �߰�", 3);
		
		//���� Ȱ��ȭ �� ��Ȱ��ȭ
		//						Ȱ��ȭ/��Ȱ��ȭ
		//				��index, true/false
		//tp.setEnabledAt(2, false);
		
		//ù��° ���� ������ ������ ��� ���� ��Ȱ��ȭ
		//tp.setEnabled(false);
		
		add(tp);
		setSize(500,500);
		
		pm.setCanvasSize();//�Ѹ� ĵ���� ũ�⸦ �����Ѵ�.
		
		
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		pm.setCanvasSize();
		Thread t = new Thread(pm);
		t.start();
		
//		//�� ����
//		try {Thread.sleep(3000);}catch(Exception e) {}
//		tp.removeTabAt(3);
//		
		
		
	}

	public static void main(String[] args) {
		new JTabbedPaneTest();

	}

}
