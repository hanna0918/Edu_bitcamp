
public class TransactionTest extends DBConnection{

	public TransactionTest() {
		
		//a_bank : 5000�� ���, 	b_bank : 5000�� �Ա�
		try {
			dbConn();

			// �ڵ� commit �����ϱ�
			conn.setAutoCommit(false);	// true: �ڵ�Ŀ��, false:�ڵ�Ŀ�� ����
			
			int abank = -5000, bbank = 5000;
			
			//���
			sql = "insert into a_bank(num, money) values(a_number.nextval, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, abank);
			int cnt = pstmt.executeUpdate();
			if(cnt>0) {
				System.out.println(Math.abs(abank)+"���� ��ݵǾ����ϴ�.");
			}else {
				System.out.println(Math.abs(abank)+"�� ��� �����Ͽ����ϴ�.");
			}
			
			
			//if(cnt>0) throw new Exception();
			//�Ա�
			sql = "insert into b_bank(num, money) values(b_number.nextval, ?)";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, bbank);
			int cnt2 = pstmt.executeUpdate();
			if(cnt2>0) {
				System.out.println(bbank + "���� �ԱݵǾ����ϴ�.");
			}else {
				System.out.println(bbank + "�� �Ա� �����Ͽ����ϴ�.");
			}
			
			conn.commit();
			
		}catch(Exception e) {
			e.printStackTrace();
			try {
				conn.rollback();
			}catch(Exception ee) {}
		}finally {
			dbClose();
		}
	}

	public static void main(String[] args) {
		new TransactionTest();
	}

}
