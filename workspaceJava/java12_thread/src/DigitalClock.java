import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimeZone;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame implements Runnable {
	Font fnt = new Font("돋움", Font.BOLD, 99);
	Calendar now = Calendar.getInstance();
	JLabel lbl = new JLabel("00:00:00",JLabel.CENTER);
	TimeZone time;
	int x, y;
	public DigitalClock() {
		super("시계");	//setTitle("시계");
		add(lbl);
		lbl.setFont(fnt);
		
	}
	
	public DigitalClock(int x, int y) {
		this();
		this.x = x;
		this.y = y;
		setBounds(x, y, 500,200);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
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

	public static void main(String[] args) {
//		DigitalClock cl1 = new DigitalClock(0, 200);
//		DigitalClock cl2 = new DigitalClock(600,200);
//		DigitalClock cl3 = new DigitalClock(1200,200);
//		
//		Thread t1 = new Thread(cl1);
//		Thread t2 = new Thread(cl2);
//		Thread t3 = new Thread(cl3);
//		
//		t1.start();
//		t2.start();
//		t3.start();
		new DigitalClock(0,0);
		new DigitalClock(500,0);
		new DigitalClock(1000,0);
		
	}
}
