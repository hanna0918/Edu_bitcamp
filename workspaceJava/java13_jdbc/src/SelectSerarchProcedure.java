import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import oracle.jdbc.OracleTypes;

public class SelectSerarchProcedure extends DBConnection {
	Scanner scan = new Scanner(System.in);
	public SelectSerarchProcedure() {
		try {
			dbConn();
			
			System.out.print("검색어 입력 = ");
			String searchWord = scan.nextLine();
			
			sql = "{Call mem_search(?,?)}";
			
			CallableStatement cstmt = conn.prepareCall(sql);
			
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			cstmt.setString(2, searchWord);
			
			cstmt.executeLargeUpdate();
			rs = (ResultSet)cstmt.getObject(1);
			
			while(rs.next()) {
				System.out.printf("%d, %s, %s\n", rs.getInt(1), rs.getString(2), rs.getString(3));
			}
			
		}catch(Exception e) {
			
			e.printStackTrace();
		}finally{
			dbClose();
		}
	}
	

	public static void main(String[] args) {
		new SelectSerarchProcedure();
	}

}
/*
 create or replace procedure mem_search(p_result out sys_refcursor,
                                        p_name in member.username%type)
is
begin
    open p_result for
    select mem_no, username, tel from member 
    where username like '%'||p_name||'%' order by username asc;
end;
 */