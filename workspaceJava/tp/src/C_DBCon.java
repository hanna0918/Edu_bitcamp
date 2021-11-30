import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class C_DBCon {

	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}catch(Exception e) {
			System.out.println("jdbc 드라이브 로딩 실패 !!!!!!!!!!!!");
			e.printStackTrace();
		}
	}
	
	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	
	String url = "jdbc:oracle:thin:@bitcamp4.iptime.org:1521:xe";
	String name = "c##Class05";
	String pwd = "sjwk1212";
	
	
	public C_DBCon () {
		
	}
	
	//DB연결
	public void dbConn() {
		try {
			conn = DriverManager.getConnection(url, name, pwd);
		}catch(Exception ee) {
			System.out.println("데이터베이스 연결 실패.....");
			ee.printStackTrace();
		}
	}
	
	//DB닫기
	public void dbClose() {
		try {
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}catch(Exception e) {
			System.out.println("데이터베이스 닫기 실패.....");
			e.printStackTrace();
		}
	}
	
}
