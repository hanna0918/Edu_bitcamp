import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JTableTest extends JFrame{

	JTable table;
	JScrollPane sp; 
	DefaultTableModel model;
	
	//JTable에서 제목으로 사용할 배열
	String title[] = {"번호", "이름", "연락처", "주소"};
	Object[][] data = {{100, "홍길동", "010-1234-5678", "서울시 마포구"},
						{200, "이순신", "010-2345-6789", "서울시 종로구"},
						{300,"세종대왕", "010-3456-7890", "서울시 영등포구"}
						};
	JLabel lbl = new JLabel(" ");
	
	public JTableTest() {
		model = new DefaultTableModel(data, title);
		table = new JTable(model);
		sp = new JScrollPane(table);
		
		add(sp);
		add(BorderLayout.SOUTH, lbl);
		
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
		try {Thread.sleep(3000);}catch(Exception e) {};
		//행추가 : addRow()
		Object[] row = {400, "김삿갓", "010-4444-5555", "서울시 서초구"};
		Vector<Object> v = new Vector<Object>();
		v.add(500);
		v.add("강감찬");
		v.add("010-4567-1234");
		v.add("서울시 은평구");
		
		model.addRow(row);
		model.addRow(v);
		
		try {Thread.sleep(3000);}catch(Exception e) {};
		//행삽입 : insertRow()
		Object[]  row2 = {600, "광개토대왕","010-7894-7894", "서울시 강남구"};
		model.insertRow(2, row2);
		
		try {Thread.sleep(3000);}catch(Exception e) {};
		//행이동 : moveRow();
		//		start, end, to
		model.moveRow(2, 4, 0);
		
		try {Thread.sleep(3000);}catch(Exception e) {};
//		//컬럼추가
//		model.addColumn("기타");
//		Object cData[] = {1,2,3,4,5,6};
//		model.addColumn("메모", cData);
//		
//		try {Thread.sleep(3000);}catch(Exception e) {};
//		//행삭제 
//		model.removeRow(3);
//		
//		try {Thread.sleep(3000);}catch(Exception e) {};
//		//컬럼삭제
//		table.removeColumn(table.getColumn("기타"));
//		
		table.addMouseListener(new MyEvent());
	}
	
	//마우스 이벤트 내부클래스
	public class MyEvent extends MouseAdapter{
		//재오버라이딩
		public void mouseClicked(MouseEvent me) {
			System.out.println("click");
			//1. 버튼의 종류(1:왼쪽, 2:가운데, 3:오른쪽)
			int eventBtn = me.getButton();
			if(eventBtn ==1) {
				int row = table.getSelectedRow(); //선택한 행번호 얻어오기
				String dataStr = "";
				//			칸의수
				for(int c=0; c<table.getColumnCount(); c++) {
					Object data = table.getValueAt(row, c);
					dataStr += data + ",";
				}
				lbl.setText(dataStr);
			}
		}
	}

	public static void main(String[] args) {
		new JTableTest();

	}

}
