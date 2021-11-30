import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class DigitalClock extends JFrame {
	Font fnt = new Font("����", Font.BOLD, 99);
	Calendar now = Calendar.getInstance();
	JLabel lbl = new JLabel("00:00:00",JLabel.CENTER);
	
	public DigitalClock() {
		super("�ð�");	//setTitle("�ð�");
		add(lbl);
		lbl.setFont(fnt);
		
		setSize(500,200);
		setVisible(true);
		
		startClock();
		
	}
	
	public void startClock() {
		do {
			//�ð� ����
			lbl.setText(getTimer());
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {}
		}while(true);
	}
	
	public String getTimer() {
		now = Calendar.getInstance();
		
		SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");
		return fmt.format(now.getTime());
		
	}

	public static void main(String[] args) {
		new DigitalClock();
	}

}
/*
		setTitle("�ð�");
		setSize(500,150);
		setVisible(true);
		
		JLabel lbl = new JLabel();
		add(lbl);
		
		Calendar cld = Calendar.getInstance();
		String time = cld.get(Calendar.HOUR_OF_DAY)+" : "+cld.get(Calendar.MINUTE);
		
		lbl.setText(time);
		
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {}
		*/