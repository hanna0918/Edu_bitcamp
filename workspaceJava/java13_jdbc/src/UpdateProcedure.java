import java.sql.CallableStatement;
import java.sql.Types;

public class UpdateProcedure extends DBConnection{

	public UpdateProcedure() {

	}
	public void start() {
		try {
			dbConn();
			
			sql = "{call mem_update(?,?,?,?,?)}";
			
			CallableStatement cstmt = conn.prepareCall(sql);
			cstmt.setInt(1, 143);
			cstmt.setString(2, "010-1234-5678");
			cstmt.setString(3, "dmlfl@nate.com");
			cstmt.setString(4, "서울시 서대문구");
			cstmt.registerOutParameter(5, Types.INTEGER);
			
			//실행
			cstmt.executeUpdate();
			
			if(cstmt.getInt(5)==1) {
				System.out.println("수정했다~~~~~~~~");
			}else {
				System.out.println("수정모댔다~~~~~~~");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
	}

	public static void main(String[] args) {
		new UpdateProcedure().start();
		
	}

}
/*
create or replace procedure mem_update(m_mem_no in member.mem_no%type, 
m_tel in member.tel%type,
m_email in member.email%type,
m_addr in member.addr%type,
m_result out number)
is
begin
m_result := 1;
update member set tel=m_tel, email=m_email, addr=m_addr where mem_no=m_mem_no;
exception
when others then
m_result :=0;
end;
*/