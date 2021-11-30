import java.sql.CallableStatement;
import java.sql.Types;

public class InsertProcedure extends DBConnection {
	
	public InsertProcedure() {
			try {
				dbConn();
				//						username, tel, return
				sql = "{call mem_insert(?,?,?)}";
				CallableStatement cstmt = conn.prepareCall(sql);
				
				cstmt.setString(1, "�̱�ȭ");
				cstmt.setString(2, "010-8520-9515");
				cstmt.registerOutParameter(3, Types.INTEGER);
				
				
				cstmt.executeUpdate();
				
				if(cstmt.getInt(3)==1) {
					System.out.println("���ڵ� �߰� �Ϸ�� -----");
				}else {
					System.out.println("���ڵ� �߰� ���д� -----");
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}finally {
				dbClose();
			}
	}

	public static void main(String[] args) {
		new InsertProcedure();

	}

}

/*
 create or replace procedure mem_insert(p_username in member.username%type, p_tel in member.tel%type, p_result out number)
is
begin
    -- 1:�߰� 0:�߰�����
    p_result := 1;
    insert into member(mem_no, username, tel, write_date)
    values(mem_sq.nextval, p_username, p_tel, sysdate);
    
    --���ڵ� �߰��� ������ �߻��ϸ� �����
    exception
        when others then
            p_result := 0;
end;
 */