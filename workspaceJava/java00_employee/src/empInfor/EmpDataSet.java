package empInfor;

import java.util.HashMap;

public class EmpDataSet {
	
	public static HashMap<String, EmpVO> empList = new HashMap<String, EmpVO>();
	
	public EmpDataSet() {
		
	}
	//�⺻������ ����
	public static void basicEmpSet() {
		empList.put("ȫ�浿", new EmpVO("11111", "ȫ�浿", "010-1234-2345", 5000, "2020-11-30"));
		empList.put("�̼���", new EmpVO("22222", "�̼���", "010-2345-2345", 6000, "2020-01-12"));
		empList.put("������", new EmpVO("33333", "������", "010-7894-6512", 7000, "2019-05-14"));
		empList.put("�念��", new EmpVO("44444", "�念��", "010-5624-5846", 9000, "2017-09-01"));
		empList.put("���·�", new EmpVO("55555", "���·�", "010-7706-8546", 4500, "2021-03-02"));
	}
}
