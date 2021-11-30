
public class MemberVO {
	private String name, dept, hiredate;
	private int sal;
	
	
	public MemberVO() {
		
	}
	
	public MemberVO(String id, String pw, String name, int tel) {
		this.name = name;
		this.dept = dept;
		this.hiredate = hiredate;
		this.sal = sal;
			
	}
	public void memberPrint(){
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getHiredate() {
		return hiredate;
	}

	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

}
