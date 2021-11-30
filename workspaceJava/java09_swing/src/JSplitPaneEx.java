import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;

public class JSplitPaneEx extends JFrame {
	JSplitPane spHori, spCal, imgPac, clockCalendar;
	DigitalClock2 dc = new DigitalClock2(0,0);
	SwingCalendar2 calendar = new SwingCalendar2();
	CalculatorEx2 cal = new CalculatorEx2();
	//이미지
	ImageIcon ii = new ImageIcon("img/eatMoreGluten.JPG");
	JLabel img = new JLabel(ii);
	//팩맨
	PackMan2 pm = new PackMan2();
	public JSplitPaneEx() {
		//수직나누기
		//시계달력 패널 추가
		clockCalendar = new JSplitPane(JSplitPane.VERTICAL_SPLIT,dc, calendar);
		//시,달 패널+계산기(왼쪽)
		spCal = new JSplitPane(JSplitPane.VERTICAL_SPLIT, clockCalendar, cal);
		//이미지+팩맨(오른쪽)
		imgPac = new JSplitPane(JSplitPane.VERTICAL_SPLIT, img, pm);
		
		//수평나누기
		spHori = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, spCal, imgPac);
		add(spHori);
		
		
		
		
		
		
		
		setSize(1000,1000);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//창크기 조절(true:조절가능,  false:조정불가)
		setResizable(false);
		
		//팩맨 캔버스 사이즈,스레드 
		pm.packmanStart(pm);
	}

	public static void main(String[] args) {
		new JSplitPaneEx();

	}

}
