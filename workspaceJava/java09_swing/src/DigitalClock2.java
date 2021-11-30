import java.awt.BorderLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DigitalClock2 extends JPanel implements Runnable {
	Font fnt = new Font("돋움", Font.BOLD, 99);
	Calendar now = Calendar.getInstance();
	JLabel lbl = new JLabel("00:00:00",JLabel.CENTER);
	TimeZone time;
	int x, y;
	public DigitalClock2() {
		setLayout(new BorderLayout());
		add(lbl);
		lbl.setFont(fnt);
		
	}
	
	public DigitalClock2(int x, int y) {
		this();
		this.x = x;
		this.y = y;
//		setBounds(x, y, 500,200);
//		setVisible(true);
		
		
		Thread t = new Thread(this);
		t.start();
	}
	public void run() {
		do {
			//시간 변경
			lbl.setText(getTimer());
			
		}while(true);
	}
	
	public String getTimer() {
		now = Calendar.getInstance();
		SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");
		return fmt.format(now.getTime());
		
	}
}

