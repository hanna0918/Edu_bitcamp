package management;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MusicalDAO extends DBCON{

	public MusicalDAO() {
	}
	
	//뮤지컬 목록 삭제
	public int deleteMusical(int s_code) {
		int cnt = 0;
		try {
			dbConn();
			String sql = "delete from show where s_code =?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, s_code);
			
			cnt = pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			dbClose();
		}
		return cnt;
	}
	
	//뮤지컬 전체 목록
	public List<MusicalVO> allMusical(){
		List<MusicalVO> muList= new ArrayList<MusicalVO>();

		try {
			dbConn();

			String sql="select s_code, s_title, s_cast, t_code,s_day,s_time,s_price,s_grade,s_rtime,s_synop from show order by s_title asc";

			pstmt=conn.prepareStatement(sql);

			rs=pstmt.executeQuery();

			while(rs.next()) {
				MusicalVO  muVO = new MusicalVO();
				muVO.setS_code(rs.getInt(1));
				muVO.setS_title(rs.getString(2));
				muVO.setS_cast(rs.getString(3));
				muVO.setT_code(rs.getString(4));
				muVO.setS_day(rs.getString(5));
				muVO.setS_time(rs.getString(6));
				muVO.setS_price(rs.getString(7));
				muVO.setS_grade(rs.getString(8));
				muVO.setS_rtime(rs.getString(9));
				muVO.setS_synop(rs.getString(10));

				muList.add(muVO);

			}
		}catch (Exception e) {
			System.out.println("전체 멤버 선택 에러~~~~");
			e.printStackTrace();
		}finally {
			dbClose();
		}return muList;
	}	
	//뮤지컬정보 수정하기
	public int setCorrect(MusicalVO vo) {
		int cnt=0;
		try {
			dbConn();

			String sql="update show set s_title=?,s_cast=?,t_code=?, "
					+ "s_day=?,s_time=?,s_price=?, "
					+ "s_synop=?,s_grade=?,s_rtime=? where s_code = ?";

			pstmt= conn.prepareStatement(sql);		

			pstmt.setString(1, vo.getS_title());
			pstmt.setString(2, vo.getS_cast());
			pstmt.setString(3, vo.getT_code());
			pstmt.setString(4, vo.getS_day());
			pstmt.setString(5, vo.getS_time());
			pstmt.setString(6, vo.getS_price());
			pstmt.setString(7, vo.getS_synop());
			pstmt.setString(8, vo.getS_grade());
			pstmt.setString(9, vo.getS_rtime());
			pstmt.setInt(10, vo.getS_code());
			
			cnt=pstmt.executeUpdate();
		}catch (Exception ee) {
			System.out.println("아마도 데이터베이스 연결 실패가 아닐까낭"+ee.getMessage());
			ee.printStackTrace();
		}finally {
			dbClose();
		}
		return cnt;		
	}				
	//뮤지컬 등록하기
	public int setEnroll(MusicalVO vo) {
		int cnt=0;
		//제목,캐스팅,공연기간, 시간, 관람등급, 장소, 가격, 줄거리 어쩌고저쩌고 다 입력받고 레코드 추가함
		//BufferedReader br= new BufferedReader(new InputStreamReader(System.in));		
		try {
			dbConn();			

			String sql="insert into show(s_code, s_title, s_cast, s_day, s_time, s_grade, t_code, s_price, s_synop, s_rtime)"
					+ " values(show_num.nextval,?,?,?,?,?,?,?,?,?)";

			pstmt= conn.prepareStatement(sql);		

			pstmt.setString(1, vo.getS_title());
			pstmt.setString(2, vo.getS_cast());
			pstmt.setString(3, vo.getS_day());
			pstmt.setString(4, vo.getS_time());
			pstmt.setString(5, vo.getS_grade());
			pstmt.setString(6, vo.getT_code());
			pstmt.setString(7, vo.getS_price());
			pstmt.setString(8, vo.getS_synop());
			pstmt.setString(9, vo.getS_rtime());

			cnt=pstmt.executeUpdate();

		}catch (SQLException se) {			
			se.printStackTrace();
		}
		finally {
			try {
				dbClose();
			}catch (Exception ee) {
				System.out.println("닫기에러여유");
			}
		}
		return cnt;
	}
	//뮤지컬타이틀
	public List<MusicalVO> musicalTitleList() {
		List<MusicalVO> titleList= new ArrayList<MusicalVO>();
		try {			
			dbConn();
			String sql = "select s_title from show";

			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while(rs.next()) {
				MusicalVO  muVO = new MusicalVO();
				muVO.setS_title(rs.getString(1));

				titleList.add(muVO);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return titleList;
	}
}


