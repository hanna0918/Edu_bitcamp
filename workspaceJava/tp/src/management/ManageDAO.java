package management;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


public class ManageDAO extends DBCON {
	ResultSetMetaData rsmd = null;
	public ManageDAO() {
	}
	//회원전체목록
	public List<MemberVO> allMemRecord(){
		List<MemberVO> list = new ArrayList<MemberVO>();
		
		try {
			//DB연결
			dbConn();
			
			String sql = "select mem_no, mem_name, mem_id, mem_tel, mem_addr "
					+ "from membership order by mem_no asc";
			
			//preparedstatement
			pstmt = conn.prepareStatement(sql);
			
			//실행
			rs = pstmt.executeQuery();
			while(rs.next()) {
				MemberVO vo = new MemberVO();
				vo.setMem_no(rs.getInt(1));
				vo.setMem_name(rs.getString(2));
				vo.setMem_id(rs.getString(3));
				vo.setMem_tel(rs.getString(4));
				vo.setMem_addr(rs.getString(5));
				list.add(vo);
			}
		}catch(Exception e) {
			System.out.println("회원전체목록 에러 발생!!!!!!");
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return list;
	}
	//회원정보수정
	public int updateMemRecord(MemberVO vo) {


		int cnt = 0;
		try {
			dbConn();
			
			String sql = "update membership set mem_name=?, mem_id=?,"
					+ " mem_tel=?, mem_addr=? where mem_no=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getMem_name());
			pstmt.setString(2, vo.getMem_id());
			pstmt.setString(3, vo.getMem_tel());
			pstmt.setString(4, vo.getMem_addr());
			pstmt.setInt(5, vo.getMem_no());
			
			cnt = pstmt.executeUpdate();
			
			
		}catch(Exception e ) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return cnt;
		
	}
	//회원삭제
	public int deleteMemRecord(int mem_no) {
		int cnt = 0;
		try {
			dbConn();
			String sql = "delete from membership where mem_no=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, mem_no);
			
			cnt = pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return cnt;
	}
	
	//예매내역list
	public List<BookingVO> bookingList(String mem_no) {
		List<BookingVO> bList= new ArrayList<BookingVO>();
		try {
			
			dbConn();
			String sql = "select b.b_num, b.mem_no, s.s_title, b.b_cnt, s.s_time, b.s_date, s.s_code, b.b_seat, b.b_date\r\n"
					+ "from booking b join show s\r\n"
					+ "on s.s_code = b.s_code and b.mem_no=?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, mem_no);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BookingVO vo = new BookingVO();
				vo.setB_num(rs.getInt(1));
				vo.setMem_no(rs.getInt(2));
				vo.setS_title(rs.getString(3));
				vo.setB_cnt(rs.getInt(4));
				vo.setS_time(rs.getString(5));
				vo.setS_date(rs.getString(6));
				vo.setS_code(rs.getInt(7));
				vo.setB_seat(rs.getString(8));
				vo.setB_date(rs.getString(9));;
				
				bList.add(vo);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return bList;
		
	}

	
	
}
