import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

public class C_InfoDAO extends C_DBCon{
	
	String name;
	String cast;
	String date;
	String time;
	String grade;
	String synop;
	String[] nameList = new String[titleLength()];
	String[] castList = new String[titleLength()];
	String[] dayList = new String[titleLength()];
	String[] timeList = new String[titleLength()];
	String[] gradeList = new String[titleLength()];
	String[] synopList = new String[titleLength()];
	int pLength = 0;
	BufferedImage bi;
	public C_InfoDAO() {}

	public void setInfo() {
		try {
			dbConn();
			
			String sql = "select s_title, s_cast, s_day, s_time, s_grade, s_synop from show where s_day between '2021/01' and '2021/07/16' order by s_day";

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
			System.out.println("c_infodao allShowName 에러");
		}finally {
			dbClose();
		}
	}

	public int titleLength(){
		List<C_ShowInfoVO> list =  new ArrayList<C_ShowInfoVO>();
		try {
			dbConn();
			
			String sql = "select s_title, s_cast, s_day, s_time, s_grade, s_synop from show where s_day between '2021/01' and '2021/07/16' order by s_day";

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


	
	public List<BookingVO> setShowModle(){
		List<BookingVO> showList = new ArrayList<BookingVO>();
		try {
			dbConn();
			
			String sql = "select s.s_title, s.s_day, t.t_name from show s join theater t on s.t_code = t.t_code";
			pstmt = conn.prepareStatement(sql);

			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				BookingVO vo = new BookingVO();
				vo.setS_title(rs.getString(1));
				vo.setS_day(rs.getString(2));
				vo.setT_name(rs.getString(3));
				
				showList.add(vo);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return showList;
	}
	
	//이미지불러오기
		public BufferedImage getDBImage(String s_title){
			try {
				dbConn();
				String sql = "select s_img from show where s_title = ?";
				
				pstmt = conn.prepareStatement(sql);
				pstmt.setString(1, s_title);
				
				rs = pstmt.executeQuery();

				rs.next();

				InputStream is = rs.getBinaryStream(1);
				bi = ImageIO.read(is);

			}catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				dbClose();
			}
			return bi;
		}
}
