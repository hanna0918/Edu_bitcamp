import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Calendar;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalendarTest extends JFrame{
	Font fnt = new Font("����", Font.BOLD, 20);
	JPanel frmNorth = new JPanel();
		JButton leftBtn = new JButton("��");
		JButton rightBtn = new JButton("��");
		JLabel yearLbl = new JLabel("��");
		JLabel monthLbl = new JLabel("��");
		
		JComboBox<Integer> yearCombo = new JComboBox<Integer>();
		DefaultComboBoxModel<Integer> yearModel = new DefaultComboBoxModel<Integer>();
		JComboBox<String> monthCombo = new JComboBox<String>();
		DefaultComboBoxModel<Integer> monthModel = new DefaultComboBoxModel<Integer>();
		
	JPanel frmCenter = new JPanel();
		JPanel weekPane = new JPanel(new GridLayout(1,7));
		JPanel dayPane = new JPanel(new GridLayout(0,7));
	
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH);
		int day = now.get(Calendar.DAY_OF_MONTH);
		int lastDay = now.getActualMaximum(month);
		
	public CalendarTest() {
		super("Calendar");
		
		add(BorderLayout.NORTH, frmNorth);
		frmNorth.setBackground(Color.yellow);
		add(frmCenter);
		frmCenter.setBackground(Color.LIGHT_GRAY);
		
		frmNorth.add(leftBtn);
		frmNorth.add(yearCombo);
		frmNorth.add(yearLbl);
		frmNorth.add(monthCombo);
		frmNorth.add(monthLbl);
		frmNorth.add(rightBtn);
		
		frmCenter.add(BorderLayout.NORTH, weekPane);
		frmCenter.add(dayPane);
		//�⵵����Ʈ
		int nowYear = setNowYear();
		yearCombo.setModel(yearModel);
		
		//������Ʈ
		int nowMonth = setNowMonth();
		//monthCombo.setModel(monthModel);
		
		//���ϳֱ�
		setWeekTitle();
		//�ش���� 1�� ����
		int week = getWeek(nowYear, nowMonth);
		//��¥�ֱ�
		setSpaceLabel(week);
		setDayLabel(nowYear, nowMonth, lastDay);
		
		
		
		setSize(400, 300);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}
	//���ϳֱ�
	public void setWeekTitle() {
		String weekName = "�Ͽ�ȭ�������";
		for(int i=0; i<weekName.length(); i++) {
			JLabel lbl = new JLabel(weekName.substring(i, i+1), JLabel.CENTER);
			lbl.setFont(fnt);
			if(i==0) lbl.setForeground(Color.red);
			if(i==6) lbl.setForeground(Color.blue);

			weekPane.add(lbl);
		}
	}
	//���鱸�ϱ�
	public void setSpaceLabel(int s) {
		for(int i=1; i<s; i++) {
			JLabel lbl = new JLabel(" ");
			dayPane.add(lbl);
		}
	}
	//���ϱ��ϱ�
	public int getWeek(int y, int m) {
		now.set(y,m,1);
		return now.get(Calendar.DAY_OF_WEEK);
	}
	//��¥�߰�
	public void setDayLabel(int year, int month, int lastDay) {
		for(int day=1; day<=lastDay; day++) {
			JLabel lbl = new JLabel(String.valueOf(day),JLabel.CENTER);
			lbl.setFont(fnt);
			now.set(year, month, day);
			int week = now.get(Calendar.DAY_OF_WEEK);
			if(week==1) lbl.setForeground(Color.red);
			if(week==7) lbl.setForeground(Color.blue);
			dayPane.add(lbl);
		}
	}
	//year�޺����� ����
	public int setNowYear() {
		int year = now.get(Calendar.YEAR);
		for(int y = year-100; y<=year+20; year++) {
			yearModel.addElement(y);
		}
		return year;
	}
	//month�޺����� ����
	public int setNowMonth() {
		for(int m =1; m<=12; m++) {
			monthModel.addElement(m);
		}
		return now.get(Calendar.MONTH);
	}
	
	
	public static void main(String[] args) {
		new CalendarTest();

	}

}
