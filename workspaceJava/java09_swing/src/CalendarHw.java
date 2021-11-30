import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalendarHw extends JFrame{
	String wol[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
	String weekStr[] = {"일","월","화","수","목","금","토"};
	JComboBox yearCombo = new JComboBox();
	JComboBox monthCombo = new JComboBox(wol);
	JPanel dayPane = new JPanel();
	JPanel weekPane = new JPanel();
	JPanel calPane = new JPanel();
	JLabel [] dayLbl;
	Font fnt = new Font("돋움", Font.BOLD, 25);
	Calendar cal = Calendar.getInstance();
	int year = cal.get(Calendar.YEAR);
	int month = cal.get(Calendar.MONTH)+1;
	int date = cal.get(Calendar.DATE);
	int lastday = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	
	
	
	public CalendarHw() {
		JButton rightBtn = new JButton("▶");
		JButton leftBtn = new JButton("◀");
		JLabel yearLbl = new JLabel("년 ");
		JLabel monthLbl = new JLabel("월 ");
		
		super.add(BorderLayout.NORTH, dayPane);
		super.add(BorderLayout.CENTER, weekPane);
		super.add(BorderLayout.SOUTH, calPane);
		dayPane.setBackground(Color.CYAN);
		
		//day패널에 컴포넌트 추가
		dayPane.add(leftBtn);
		dayPane.add(yearCombo);
		dayPane.add(yearLbl);
		dayPane.add(monthCombo);
		dayPane.add(monthLbl);
		dayPane.add(rightBtn);
		
		weekPane.setLayout(new GridLayout(1,7));
		for (int i=0; i<weekStr.length; i++) {
			JLabel weekLbl = new JLabel(weekStr[i]);
			weekLbl.setFont(fnt);
			if(i==0) {
				weekLbl.setForeground(Color.RED);
			}else if(i==6){
				weekLbl.setForeground(Color.BLUE);
			}
			weekPane.add(weekLbl);
		}
		
		calPane.setLayout(new GridLayout(6, 7));
		cal.set(year, month-1, 1);
		int weekBlk = cal.get(Calendar.DAY_OF_WEEK);
		for(int j=1; j<weekBlk-1; j++) {
			JLabel blkLbl = new JLabel(String.valueOf(" "),JLabel.RIGHT);
			calPane.add(blkLbl);
		}
		for (int i=1; i<=lastday; i++) {
			JLabel dayLbl = new JLabel(String.valueOf(i));
			dayLbl.setFont(fnt);
			calPane.add(dayLbl);
		}
		
		
		
		
		super.setTitle("캘린더");
		super.setVisible(true);
		super.setSize(300,300);
		super.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}


	public static void main(String[] args) {
		new CalendarHw();
		
	}

}
