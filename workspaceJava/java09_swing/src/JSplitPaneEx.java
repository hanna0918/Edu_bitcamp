import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;

public class JSplitPaneEx extends JFrame {
	JSplitPane spHori, spCal, imgPac, clockCalendar;
	DigitalClock2 dc = new DigitalClock2(0,0);
	SwingCalendar2 calendar = new SwingCalendar2();
	CalculatorEx2 cal = new CalculatorEx2();
	//�̹���
	ImageIcon ii = new ImageIcon("img/eatMoreGluten.JPG");
	JLabel img = new JLabel(ii);
	//�Ѹ�
	PackMan2 pm = new PackMan2();
	public JSplitPaneEx() {
		//����������
		//�ð�޷� �г� �߰�
		clockCalendar = new JSplitPane(JSplitPane.VERTICAL_SPLIT,dc, calendar);
		//��,�� �г�+����(����)
		spCal = new JSplitPane(JSplitPane.VERTICAL_SPLIT, clockCalendar, cal);
		//�̹���+�Ѹ�(������)
		imgPac = new JSplitPane(JSplitPane.VERTICAL_SPLIT, img, pm);
		
		//���򳪴���
		spHori = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, spCal, imgPac);
		add(spHori);
		
		
		
		
		
		
		
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//âũ�� ����(true:��������,  false:�����Ұ�)
		setResizable(false);
		
		//�Ѹ� ĵ���� ������,������ 
		pm.packmanStart(pm);
	}

	public static void main(String[] args) {
		new JSplitPaneEx();

	}

}
