import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

public class MemberMain extends JFrame implements ActionListener{
   //JFrame - North
   JPanel formPane = new JPanel(new BorderLayout());
      JPanel formWestPane = new JPanel(new GridLayout(6, 1, 5, 5));
         String[] formLbl = {"번호", "이름", "연락처", "이메일", "주소", "등록일"};
      JPanel formCenter = new JPanel(new GridLayout(6, 1, 5, 5));
         JTextField[] formTf = {new JTextField(5), new JTextField(15), new JTextField(20), new JTextField(30), new JTextField(45), new JTextField(20)};
   
   //Jframe - Center
   JPanel centerPane = new JPanel(new BorderLayout());
      JPanel btnList = new JPanel(new GridLayout(1, 0, 3, 3));
         JButton[] btn = {new JButton("전체목록"), new JButton("회원추가"), new JButton("회원수정"), new JButton("회원삭제"), 
                        new JButton("폼지우기"), new JButton("종료"), new JButton("엑셀쓰기"), new JButton("엑셀읽기")};
      DefaultTableModel model;
      String title = "번호/이름/연락처/이메일/주소/등록일";
      JTable memberList;
      JScrollPane sp;
      
      //JFrame - South
      JPanel southPane = new JPanel();
         //JLabel searchLbl = new JLabel(" 이름 "); 
      	DefaultComboBoxModel<String> searchModel = new DefaultComboBoxModel<String>();
        JComboBox<String> searchKey = new JComboBox<String>(searchModel);
      	JTextField searchWord = new JTextField(15);
        JButton searchBtn = new JButton("Search");
        
        
        
        
        
   
   public MemberMain() {
      super("회원관리시스템");
      
      //Frame - North
      setForm();
      
      //Frame - Center
      setButtonTable();
      
      //Frame - South
      setSearchForm();
      
      setSize(800,750);
      setVisible(true);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      
      memberAllList();
      
   }
   //데이터베이스에서 회원 전체 목록(이름순) 가져오기 --> JTable에 출력
   public void memberAllList() {
      
      MemberDAO dao = new MemberDAO();
      List<MemberVO> list = dao.allRecord();
      setMemberModel(list);
        
    
   }
   
   public void setMemberModel(List<MemberVO> list) {
	   //기존 JTable의 목록을 지우고 새로 리스트를 출력한다.
	      model.setRowCount(0);
	    //컬렉션의 vo를 get하여 JTable에 목록으로 추가한다.
	      for(int i=0; i<list.size(); i++) {
	         MemberVO vo = list.get(i);
	         Object[] obj = {vo.getMem_no(), vo.getUsername(), vo.getTel(), vo.getEmail(), vo.getAddr(), vo.getWrite_date()};
	         model.addRow(obj);
	      }
	       
   }
   
   
   
   
   //Frame - North
   public void setForm() {
      add(BorderLayout.NORTH, formPane);
         formPane.add(BorderLayout.WEST, formWestPane);
         formPane.add(BorderLayout.CENTER, formCenter);
            for(int i=0; i<formLbl.length; i++) {
               JLabel lbl = new JLabel(formLbl[i]);
               formWestPane.add(lbl);
            }
         formPane.add(BorderLayout.CENTER, formCenter);
            for(int i=0; i<formTf.length; i++) {
               JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT));
               p.add(formTf[i]);
               formCenter.add(p);
               if(i==0) formTf[i].setEditable(false);
               
            }
   }
   
   //Frame - Center
   public void setButtonTable() {
      add(centerPane);
         centerPane.add(BorderLayout.NORTH, btnList);
         for(int i=0; i<btn.length; i++) {
            btnList.add(btn[i]);
            //이벤트등록
            btn[i].addActionListener(this);
         }
      //JTable 
      model = new DefaultTableModel(title.split("/"),0);
      memberList = new JTable(model);
      sp = new JScrollPane(memberList);
      centerPane.add(sp);

      memberList.addMouseListener(new JTableMouseEventProcess(formTf, memberList));
   }
   
   //Frame - South
   public void setSearchForm() {
      add(BorderLayout.SOUTH, southPane);
      
      //southPane.add(searchLbl);
      searchModel.addElement("이름");
      searchModel.addElement("연락처");
      searchModel.addElement("주소");
      southPane.add(searchKey);//콤보박스
      
      southPane.add(searchWord);
      southPane.add(searchBtn);
      
      searchBtn.addActionListener(this);
      
   }
   
   //액션이벤트 오버라이딩
   public void actionPerformed(ActionEvent ae) {
      String eventBtn= ae.getActionCommand();
      if(eventBtn.equals("회원추가")) {
         memberInsert();
      }else if(eventBtn.equals("폼지우기")) {
         formDataClear();
      }else if(eventBtn.equals("종료")) {
         System.exit(0);
      }else if(eventBtn.equals("회원수정")) {
    	  memberUpdate();
      }else if (eventBtn.equals("회원삭제")) {
    	  memberDelete();
      }else if(eventBtn.equals("Search")) {
    	  memberSearch();
      }else if (eventBtn.equals("전체목록")) {
    	  memberAllList();
      }else if(eventBtn.equals("엑셀쓰기")) {
    	  //JTable의 레코드를 엑셀로 쓰기
    	  excelWrite();
      }else if(eventBtn.equals("엑셀읽기")) {
    	  excelRead();
      }
      
   }
   //excel읽기
   public void excelRead() {
	   JFileChooser fc = new JFileChooser();
	   int state = fc.showOpenDialog(this);
	   if(state==0) {
	   	   try {
	   		    File f = fc.getSelectedFile();
	   	   		FileInputStream fis = new FileInputStream(f);
	   	   		
	   	   		POIFSFileSystem poi = new POIFSFileSystem(fis);
	   	   		
	   	   		HSSFWorkbook workbook = new HSSFWorkbook(poi);
	   	   		
	   	   		//시트 구하기
	   	   		HSSFSheet sheet = workbook.getSheet("회원목록");
	   	   		
	   	   		//기존 JTable데이터 지우기
	   	   		model.setRowCount(0);
	   	   		
	   	   		//행의 수 구하기
	   	   		int rows = sheet.getPhysicalNumberOfRows();
	   	   		for(int r=1; r<rows; r++) {
	   	   			//행얻어오기
	   	   			HSSFRow row = sheet.getRow(r);
	   	   			int cols = row.getPhysicalNumberOfCells();
	   	   			Vector v = new Vector();
	   	   			for(int c=0; c<cols; c++) {
	   	   				if(c==0){	
	   	   					v.add((int)row.getCell(c).getNumericCellValue());
	   	   				}else {
	   	   					v.add(row.getCell(c).getStringCellValue());
	   	   				}
	   	   			}
	   	   			
	   	   			model.addRow(v);
	   	   			
	   	   		}
	   	   		poi.close();
	   	   		fis.close();
	   	   		
	   	   }catch(Exception e) {
	   		   System.out.println("엑셀읽기 에러 발생.....");
	   		   e.printStackTrace();
	   	   }
	   }
	   
   }
   
   //excel로 쓰기
   public void excelWrite() {
	   JFileChooser fc = new JFileChooser();
	   
	   int state = fc.showSaveDialog(this);
	   if(state==0) {
		   File f = fc.getSelectedFile();
		   
		   //엑셀
		   HSSFWorkbook workbook = new HSSFWorkbook();
		   HSSFSheet sheet = workbook.createSheet("회원목록");
		  
		   //제목(title)
		   HSSFRow rowTitle = sheet.createRow(0);
		   
		   String [] excelTitle = title.split("/");
		  		   for(int i=0; i<excelTitle.length; i++) {
			   rowTitle.createCell(i).setCellValue(excelTitle[i]);
		   }
		  //JTable목록의 행의 수
		  		   
		  int rows = memberList.getRowCount();//5
		  int cols = memberList.getColumnCount();//6
		  for(int i=0; i<rows; i++) {//0,1,2,3,4	//0행이 title
			  HSSFRow row = sheet.createRow(i+1);	//1행이 만들어짐
			  //JTable목록의 열의 수  
			  for(int j=0; j<cols; j++) {//0,1,2,3,4,5
				  if(j==0) {
					  row.createCell(j).setCellValue((int)memberList.getValueAt(i, j));
				  }else {
					  row.createCell(j).setCellValue((String)memberList.getValueAt(i, j));
				  }
			  }
		  }
		  
		  //엑셀을 파일로 쓰기
		  try{
			  FileOutputStream fos = new FileOutputStream(f);
			  workbook.write(fos);
			  fos.close();
			  workbook.close();
		  }catch(Exception e) {
			  System.out.println("엑셀쓰기 에러 발생.....");
			  e.printStackTrace();
		  }
		  
	   }
   }
   
   //레코드 검색
   	public void memberSearch() {
   		//검색어가 입력되었는지 확인
   		String search =  searchWord.getText();
   		if(search!=null && !search.equals("")) {//검색어가 있다.
   			String searchField = (String)searchKey.getSelectedItem();//검색키	이름, 연락처, 주소
   			String fieldName = "";
   			if(searchField.equals("이름")) {
   				fieldName = "username";
   			}else if(searchField.equals("연락처")) {
   				fieldName = "tel";
   			}else if(searchField.equals("주소")) {
   				fieldName = "addr";
   			}
   			
   			MemberDAO dao = new MemberDAO();
   			List<MemberVO> list = dao.searchRecord(search, fieldName);
   			
   			setMemberModel(list);
   			searchWord.setText("");

   			
   			
   		}
   	}
   
   //회원수정
  public void memberUpdate(){
	  MemberVO vo = new MemberVO();
	  vo.setMem_no(Integer.parseInt(formTf[0].getText()));
	  vo.setTel(formTf[2].getText());
	  vo.setEmail(formTf[3].getText());
	  vo.setAddr(formTf[4].getText());
	  
	  MemberDAO dao = new MemberDAO();
	  int cnt = dao.updateRecord(vo);
	  
	  if(cnt>0){//수정시 리스트 다시 선택하기
		  memberAllList();
	  }else { //수정실패시 안내메시지 표시
		  JOptionPane.showMessageDialog(this, "회원정보 수정을 실패하였습니다.");
	  }
	 
  
  }
  
  //회원삭제
  public void memberDelete() {
	  //삭제할 회원번호
	  String delNum = formTf[0].getText();
	  if(delNum==null || delNum.equals("")) {
		  JOptionPane.showMessageDialog(this, "삭제할 회원을 입력후 삭제버튼을 클릭하세요.");
	  }else {
		  MemberDAO dao = new MemberDAO();
		 int result = dao.deleteRecord(Integer.parseInt(delNum));
		 if(result>0) {//회원삭제됨
			 JOptionPane.showMessageDialog(this, delNum+"회원이 삭제되었습니다.");
			 memberAllList();
			 formDataClear();
		 }else {//회원삭제 실패
			 JOptionPane.showMessageDialog(this, delNum+"회원 삭제를 실패하였습니다.");
		 }
	  }
  }
    
   //회원추가
   public void memberInsert() {
      //폼의 이름이 입력상태인지 확인
      String username=formTf[1].getText();
      if (username==null||username.equals("")) {
      JOptionPane.showMessageDialog(this, "이름을 입력하세요");
      }else{
         MemberVO vo= new MemberVO();
         vo.setUsername(username);
         vo.setTel(formTf[2].getText());
         vo.setEmail(formTf[3].getText());
         vo.setAddr(formTf[4].getText());
         
         MemberDAO dao= new MemberDAO();
         int cnt = dao.insertRecord(vo);
         if(cnt>0) {//회원 추가된거임
            formDataClear();// 회원이 추가되면 폼의 데이터를 지운다.
            memberAllList();
         }else {//회원추가실패
            JOptionPane.showMessageDialog(this, "회원추가 실패하였습니다.");
         }
      }
   }
   
   //폼 지우기
   public void formDataClear() {
      //폼의 값을 지운다.
      for(int i=0;i<formTf.length;i++) {
         formTf[i].setText("");
      }
   }
   
   public static void main(String[] args) {
      new MemberMain();

   }

}
