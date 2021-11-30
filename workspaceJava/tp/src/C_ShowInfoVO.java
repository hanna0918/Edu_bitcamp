import java.awt.image.BufferedImage;

public class C_ShowInfoVO {
	BufferedImage poster; //이미지
	String showname; //S_title
	String casting; //출연배우 S_Cast
	String showdate; //공연날짜 s_day
	String showtime; //공연시간 S_time
	String showprice; // s_price
	String showsynop; //s_synop 내용
	String showgrade; //관람나이, s_grade 
	String showruntime; //s_rtime
	
	public C_ShowInfoVO() {
	}

	public BufferedImage getPoster() {
		return poster;
	}

	public void setPoster(BufferedImage poster) {
		this.poster = poster;
	}

	public String getShowname() {
		return showname;
	}

	public void setShowname(String showname) {
		this.showname = showname;
	}

	public String getCasting() {
		return casting;
	}

	public void setCasting(String casting) {
		this.casting = casting;
	}

	public String getShowdate() {
		return showdate;
	}

	public void setShowdate(String showdate) {
		this.showdate = showdate;
	}

	public String getShowtime() {
		return showtime;
	}

	public void setShowtime(String showtime) {
		this.showtime = showtime;
	}

	public String getShowprice() {
		return showprice;
	}

	public void setShowprice(String showprice) {
		this.showprice = showprice;
	}

	public String getShowsynop() {
		return showsynop;
	}

	public void setShowsynop(String showsynop) {
		this.showsynop = showsynop;
	}

	public String getShowgrade() {
		return showgrade;
	}

	public void setShowgrade(String showgrade) {
		this.showgrade = showgrade;
	}

	public String getShowruntime() {
		return showruntime;
	}

	public void setShowruntime(String showruntime) {
		this.showruntime = showruntime;
	}
	
}
