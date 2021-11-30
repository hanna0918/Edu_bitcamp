package management;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class StatMng extends JFrame {
	JPanel mainPane = new JPanel();
		JPanel datePane = new JPanel();
			JComboBox<String> titleCombo= new JComboBox<String>();
			DefaultComboBoxModel<String> titleModel;
		JPanel tablePane = new JPanel();
			DefaultTableModel model;
			JTable statTable;
			JScrollPane statSp;	
			//제목배열
			String title = "공연코드/제목/공연기간/예매수/매출액/총결제금액"; 
			//목록으로 사용할 배열
			
			//2021.2.26기준
			
			//Object [][] data = {{"1","위키드","2021.02.16~2021.05.02","92","30.000.000원"}};				
			JLabel lbl = new JLabel(" ");
			////////////////////////////////////////
	public StatMng() {	
		
		add(mainPane);
		mainPane.setLayout(null);
		
		
		mainPane.add(datePane);
		
		datePane.setLayout(null);
		datePane.setBounds(0,0,1200,100);
		datePane.setBackground(new Color(245,245,245));
		
		datePane.add(titleCombo);
		titleCombo.setBounds(100,30,300,40);
		//-----------------------------------
		
		//테이블패널~~~~~!!!!!!
		model = new DefaultTableModel(title.split("/"),0);
		statTable = new JTable(model);
		statSp = new JScrollPane(statTable);
		
		//테이블패널~~~~~!!!!!!
		mainPane.add(tablePane);	
				
		//(테이블패널이 메인패널이라고 생각해야함)
		tablePane.setBounds(0,100,1200,900);		
		tablePane.setLayout(null);		
		tablePane.setBackground(new Color(245,245,245));
					
		tablePane.add(statSp);		
		tablePane.add(lbl);	
		
		statSp.setBounds(80,80,1000,600);
		
		setSize(1200,1000);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
	}

	public void titleModelset() {
	

		//titleModel = new DefaultComboBoxModel<String>()
				
	}
	
	public static void main(String[] args) {
		new StatMng();
	}	

}
