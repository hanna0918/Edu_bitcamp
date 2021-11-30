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
		super("탭메뉴");
		
		tp = new JTabbedPane(JTabbedPane.LEFT);
		
		lbl = new JLabel(ii);
		tp.addTab("레이블", lbl);
		
		btn = new JButton(iii);
		tp.addTab("버튼", btn);
		
		tp.addTab("시계", dc);
		
		tp.addTab("계산기", cal);
		
		tp.addTab("달력", null, cld, "달력");
		
		tp.addTab("팩맨", null, pm, "팩맨");
		
		tp.insertTab("Button", null, new JButton("추가된 버튼"), "중간에 탭메뉴 추가", 3);
		
		//탭의 활성화 및 비활성화
		//						활성화/비활성화
		//				탭index, true/false
		//tp.setEnabledAt(2, false);
		
		//첫번째 탭을 제외한 나머지 모든 탭을 비활성화
		//tp.setEnabled(false);
		
		add(tp);
		setSize(500,500);
		
		pm.setCanvasSize();//팩맨 캔버스 크기를 설정한다.
		
		
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		pm.setCanvasSize();
		Thread t = new Thread(pm);
		t.start();
		
//		//탭 삭제
//		try {Thread.sleep(3000);}catch(Exception e) {}
//		tp.removeTabAt(3);
//		
		
		
	}

	public static void main(String[] args) {
		new JTabbedPaneTest();

	}

}
