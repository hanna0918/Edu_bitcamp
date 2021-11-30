package empInfor;

import java.util.HashMap;

public class EmpDataSet {
	
	public static HashMap<String, EmpVO> empList = new HashMap<String, EmpVO>();
	
	public EmpDataSet() {
		
	}
	//기본데이터 셋팅
	public static void basicEmpSet() {
		empList.put("홍길동", new EmpVO("11111", "홍길동", "010-1234-2345", 5000, "2020-11-30"));
		empList.put("이순신", new EmpVO("22222", "이순신", "010-2345-2345", 6000, "2020-01-12"));
		empList.put("강감찬", new EmpVO("33333", "강감찬", "010-7894-6512", 7000, "2019-05-14"));
		empList.put("장영실", new EmpVO("44444", "장영실", "010-5624-5846", 9000, "2017-09-01"));
		empList.put("유승룡", new EmpVO("55555", "유승룡", "010-7706-8546", 4500, "2021-03-02"));
	}
}
