import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableEx extends JFrame{
	JTable table;
	JScrollPane sp;
	DefaultTableModel model;

	
	//JTable���� �������� ����� �迭
	String[] title = {"�����", "�޿�", "���ʽ�", "�Ի���"};
	
	
	public JTableEx() {
		model = new DefaultTableModel();
		table = new JTable(model);
		sp = new JScrollPane(table);
		
		//������
		try {
			//1. JVM�� jdbc����̺� �ε�
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		try{
			//2. DB����
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "c##scott", "tiger");
			//3. ������ �����
			String sql = "select ename, sal, comm, to_char(hiredate, 'YYYY-MM-DD') hiredate from emp";
			//4. PreparedStatement ��ü���� -> DB���� �ҷ��°� ��´�
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//5. ������ ����
			ResultSet rs = pstmt.executeQuery();
			for(int i=0; i<title.length; i++) {
				model.addColumn(title[i]);
			}
			while(rs.next()) {
				String ename = rs.getString(1);
				double sal = rs.getDouble(2);
				double comm = rs.getDouble(3);
				String hiredate = rs.getString(4);
				
				Object [] row = {ename, sal, comm, hiredate};
				model.addRow(row);
				System.out.println(ename + ", "+ sal + ", "+comm+ ", "+hiredate);
				
			
			}
			
			rs.close();
			pstmt.close();
			conn.close();
		}catch(SQLException se){
			se.printStackTrace();
		}
		
		
		add(sp);
	
		
		setSize(700,700);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JTableEx();
	}

}