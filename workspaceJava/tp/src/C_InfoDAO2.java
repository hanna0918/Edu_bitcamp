	import java.util.ArrayList;
	import java.util.List;
	
	public class C_InfoDAO2 extends C_DBCon{
		
		String sql = "select s_title, s_cast, s_day, s_time, s_grade, s_synop from show where s_day between '2021/07/16' and '2028/10' order by s_day";
		String name;
		String cast;
		String date;
		String time;
		String grade;
		String synop;
		String[] nameList = new String[100];
		String[] castList = new String[100];
		String[] dayList = new String[100];
		String[] timeList = new String[100];
		String[] gradeList = new String[100];
		String[] synopList = new String[100];
		int pLength = 0;
	public C_InfoDAO2() {
			try {
				dbConn();
				pstmt =  conn.prepareStatement(sql);
				rs =  pstmt.executeQuery();
				for(int i = 0; rs.next(); ++i) {
					C_ShowInfoVO vo = new C_ShowInfoVO();
					vo.setShowname(rs.getString(1));
					vo.setCasting(rs.getString(2)); //쿼리문 2번 문을 1번 반복 끝날때까지 반복해서 변수에 넣고 변수를 배열에 넣는다
					vo.setShowdate(rs.getString(3));
					vo.setShowtime(rs.getString(4));
					vo.setShowgrade(rs.getString(5));
					vo.setShowsynop(rs.getString(6));
					name = vo.getShowname();
					nameList[i] = name;
					cast = vo.getCasting();
					castList[i] = cast;
					date = vo.getShowdate();
					dayList[i] = date;
					time = vo.getShowtime();
					timeList[i] = time;
					grade = vo.getShowgrade();
					gradeList[i] = grade;
					synop= vo.getShowsynop();
					synopList[i] = synop;
					
				}
				
			}catch(Exception e){
				e.printStackTrace();
				System.out.println("c_infodao 22222 에러");
			}finally {
				dbClose();
			}
		}
	public int titleLength(){
		List<C_ShowInfoVO> list =  new ArrayList<C_ShowInfoVO>();
	try {
		dbConn();
		pstmt =  conn.prepareStatement(sql);
		rs =  pstmt.executeQuery();
		while(rs.next()) {
			C_ShowInfoVO vo = new C_ShowInfoVO();
			vo.setShowname(rs.getString(1));
			list.add(vo);
		}
	}catch(Exception e) {
		e.printStackTrace();
		System.out.println("길이값 불러오기 에러");
	}finally {
		dbClose();
	}
	return list.size();
}
	}
