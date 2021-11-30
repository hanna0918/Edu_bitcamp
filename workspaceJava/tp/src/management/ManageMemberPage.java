package management;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class ManageMemberPage extends JFrame implements ActionListener, MouseListener{
	Font fnt = new Font("돋움", Font.BOLD, 30);
	
	//메인패널
	JPanel main = new JPanel();
	JLabel titleLbl = new JLabel("회원관리");
		
	//입력패널
		JPanel writePane = new JPanel();
			JLabel memNoLbl = new JLabel("    회원번호");
			JTextField memNoTf = new JTextField();			
			JLabel nameLbl = new JLabel("    	이    름");
			JTextField nameTf = new JTextField("아이디를 입력해주세요.");
			
			JLabel idLbl = new JLabel("    아 이 디");
			JTextField idTf = new JTextField("비밀번호를 입력해주세요.");
			
			JLabel telLbl = new JLabel("     연 락 처");
			JTextField telTf = new JTextField("연락처를 입력해주세요.");
			
			JLabel addrLbl = new JLabel("     주    소");
			JTextField addrTf = new JTextField("주소를 입력해주세요.");
			
			JButton allMemBtn, updateMemBtn ,deleteMemBtn; 
			
	//회원목록패널
	JPanel tablePane = new JPanel();	
		DefaultTableModel model;
		JTable table;
		JScrollPane sp;	
		//제목배열
		String title = "회원목록/이름/아이디/연락처/주소";
		//목록으로 사용할 배열				
		JLabel lbl = new JLabel(" ");
		///////////////////////////////
		
	//회원 결제내역패널
		JPanel bookingTablePane = new JPanel();	
		DefaultTableModel bookingModel;
		JTable bookingTable;
		JScrollPane bookingSp;	
		//제목배열
		String bookingTitle = "예매번호/회원번호/제목/예매인수/공연시간/공연날짜/공연코드/좌석/예매일";
		//목록으로 사용할 배열
		JLabel payLbl = new JLabel(" ");
		
	public ManageMemberPage() {
		add(main);
		main.setLayout(null);
		
		setPayPane();
		setTablePane();
		setWritePane();
		memAllList();
		
		
		
		setSize(1200,1000);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		allMemBtn.addActionListener(this);
		updateMemBtn.addActionListener(this);
		deleteMemBtn.addActionListener(this);
		
		
	}
	
	
	///////////////////////////////////////////////////////////////////////////////////////////////
	public void bookingTableViewer() {
		String memNum = memNoTf.getText();
		if(memNum != null || !memNum.equals("")) {
			ManageDAO dao = new ManageDAO();
			List<BookingVO> bList = dao.bookingList(memNum);
			setBookingList(bList);
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////////////
	public void setBookingList(List<BookingVO> bList) {
		bookingModel.setRowCount(0);
		for(int i=0; i<bList.size(); i++) {
			BookingVO vo = bList.get(i);
			Object[] obj = {vo.getB_num(), vo.getMem_no(), vo.getS_title(), vo.getB_cnt(), vo.getS_time(), vo.getS_date(),
					vo.getS_code(), vo.getB_seat(), vo.getB_date()};
			bookingModel.addRow(obj);
			}
			
	}
	
	public void setBookingModel() {
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		String eventBtn = ae.getActionCommand();
		if(eventBtn.equals("회원전체목록")) {
			memAllList();
		}else if(eventBtn.equals("회원수정")) {
			memberUpdate();
		}else if(eventBtn.equals("회원삭제")) {
			memberDelete();
		}
		
	}
	
	public void memberDelete() {
		String delNum = memNoTf.getText();
		if(delNum == null || delNum.equals("")) {
			JOptionPane.showMessageDialog(this, "삭제할 회원을 선택해주세요.");
		}else {
			ManageDAO dao = new ManageDAO();
			int result = dao.deleteMemRecord(Integer.parseInt(delNum));
			if(result>0) {
				JOptionPane.showMessageDialog(this, delNum + "회원이 삭제되었습니다.");
				memAllList();
				formDataClear();
			}else {
				JOptionPane.showMessageDialog(this, delNum+"회원 삭제를 실패하였습니다.");
			}
		}
	}
	
	public void memberUpdate() {
		MemberVO vo = new MemberVO();
		vo.setMem_no(Integer.parseInt(memNoTf.getText()));
		vo.setMem_name(nameTf.getText());
		vo.setMem_id(idTf.getText());
		vo.setMem_tel(telTf.getText());
		vo.setMem_addr(addrTf.getText());
		
		ManageDAO dao = new ManageDAO();
		int cnt = dao.updateMemRecord(vo);
		
		if(cnt>0) {
			memAllList();
		}else {
			JOptionPane.showMessageDialog(this, "회원정보 수정을 실패하였습니다.");
		}
	}

	public void memAllList() {
		ManageDAO dao = new ManageDAO();
		List<MemberVO> list = dao.allMemRecord();
		
		setMemberModel(list);
	}
	
	public void setMemberModel(List<MemberVO> list) {
		model.setRowCount(0);
		for(int i=0; i<list.size(); i++) {
			MemberVO vo =list.get(i);
			Object[] obj = {vo.getMem_no(), vo.getMem_name(), vo.getMem_id(), vo.getMem_tel(), vo.getMem_addr()};
			model.addRow(obj);
		}
	}
	
	public void formDataClear() {
		memNoTf.setText("");
		nameTf.setText("");
		idTf.setText("");
		telTf.setText("");
		addrTf.setText("");
	}

	public void setPayPane() {
		bookingModel = new DefaultTableModel(bookingTitle.split("/"),0);
		bookingTable = new JTable(bookingModel);
		bookingSp = new JScrollPane(bookingTable);
		
		//결제내역 테이블패널~~~~~!!!!!!
		main.add(bookingTablePane);
		
		bookingTablePane.setBounds(500,0,700,500);		
		bookingTablePane.setLayout(null);		
		bookingTablePane.setBackground(new Color(255,255,224));
		
		bookingTablePane.add(bookingSp);		
		bookingTablePane.add(payLbl);	
		
		bookingSp.setBounds(50,50,600,400);
	
		
	}
	
	public void setTablePane() {

		model = new DefaultTableModel(title.split("/"),0);
		table = new JTable(model);
		sp = new JScrollPane(table);
		
		//테이블패널~~~~~!!!!!!
		main.add(tablePane);
		
		tablePane.setBounds(0,500,1200,1000);		
		tablePane.setLayout(null);		
		tablePane.setBackground(new Color(255,255,224));
		
		tablePane.add(sp);		
		tablePane.add(lbl);	
		
		table.addMouseListener(this);
		
		sp.setBounds(50,50,1100,350);
	}
	public void setWritePane() {
		//write 패널~~~~~~!!!!!!!!!1
		main.add(writePane);
		
		titleLbl.setFont(fnt);
		writePane.add(titleLbl);
		titleLbl.setBounds(10,0, 200, 100);
		
		writePane.setBounds(0,0,500,550);		
		writePane.setLayout(null);		
		writePane.setBackground(new Color(255,255,224));
		
		//회원번호
		writePane.add(memNoLbl);
		writePane.add(memNoTf);
		memNoTf.setEditable(false);
		memNoLbl.setBounds(45,100,70,40);
		memNoTf.setBounds(130,100,350,40);
		//이름
		writePane.add(nameLbl);
		writePane.add(nameTf);
		nameLbl.setBounds(45,160,70,40);
		nameTf.setBounds(130,160,350,40);
		//아이디
		writePane.add(idLbl);
		writePane.add(idTf);
		idLbl.setBounds(45,220,70,40);
		idTf.setBounds(130,220,350,40);
		//연락처
		writePane.add(telLbl);
		writePane.add(telTf);
		telLbl.setBounds(45,280,70,40);
		telTf.setBounds(130,280,350,40);
		//주소
		writePane.add(addrLbl);
		writePane.add(addrTf);
		addrLbl.setBounds(45,340,70,40);
		addrTf.setBounds(130,340,350,40);
		//목록,수정,삭제버튼
		allMemBtn = new JButton("회원전체목록");
		updateMemBtn = new JButton("회원수정");
		deleteMemBtn = new JButton("회원삭제");
		writePane.add(allMemBtn);
		allMemBtn.setBounds(50, 430, 120, 40);
		writePane.add(updateMemBtn);
		updateMemBtn.setBounds(200, 430, 120, 40);
		writePane.add(deleteMemBtn);
		deleteMemBtn.setBounds(350,430,120,40);
		
		
		
		addrLbl.setOpaque(true); //Opaque값을 true로 미리 설정해 주어야 배경색이 적용된다.
		addrLbl.setBackground(new Color(255,201,14));
		telLbl.setOpaque(true); 
		telLbl.setBackground(new Color(255,201,14));
		idLbl.setOpaque(true); 
		idLbl.setBackground(new Color(255,201,14));
		nameLbl.setOpaque(true); 
		nameLbl.setBackground(new Color(255,201,14));
		memNoLbl.setOpaque(true);
		memNoLbl.setBackground(new Color(255,201,14));

	}
	@Override
	public void mouseReleased(MouseEvent me) {
		if(me.getButton()==1) {
			int row = table.getSelectedRow();	//0,1,2,3,4
			memNoTf.setText(String.valueOf(table.getValueAt(row, 0)));
			nameTf.setText((String)table.getValueAt(row, 1));
			idTf.setText((String)table.getValueAt(row, 2));
			telTf.setText((String)table.getValueAt(row, 3));
			addrTf.setText((String)table.getValueAt(row, 4));
			
			bookingTableViewer();
		}
	}
	@Override
	public void mouseClicked(MouseEvent e) {}
	@Override
	public void mousePressed(MouseEvent e) {}
	@Override
	public void mouseEntered(MouseEvent e) {}
	@Override
	public void mouseExited(MouseEvent e) {}


	public static void main(String[] args) {
		new ManageMemberPage();
	}
}
