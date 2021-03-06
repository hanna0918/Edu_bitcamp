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

	
	//JTable에서 제목으로 사용할 배열
	String[] title = {"사원명", "급여", "보너스", "입사일"};
	
	
	public JTableEx() {
		model = new DefaultTableModel();
		table = new JTable(model);
		sp = new JScrollPane(table);
		
		//데이터
		try {
			//1. JVM에 jdbc드라이브 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
		try{
			//2. DB연결
			String dbUrl = "jdbc:oracle:thin:@localhost:1521:xe";
			Connection conn = DriverManager.getConnection(dbUrl, "c##scott", "tiger");
			//3. 쿼리문 만들기
			String sql = "select ename, sal, comm, to_char(hiredate, 'YYYY-MM-DD') hiredate from emp";
			//4. PreparedStatement 객체생성 -> DB에서 불러온거 담는다
			PreparedStatement pstmt = conn.prepareStatement(sql);
			//5. 쿼리문 실행
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
