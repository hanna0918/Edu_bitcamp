
package management;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
//구현못한거
//1. s_code 빈칸으로 넣지 않으면 뮤지컬 등록, 수정 안됨 쿼리문에서 join써야함------해결
//2. 이미지 데이터랑 연결하기---------------------------------------------해결
public class MusicalMng extends JFrame implements ActionListener, MouseListener {
	String icon = "";
	BufferedImage bi;
	File f;
	Font fnt = new Font("맑은 고딕", Font.BOLD, 13);
//-------------------------------------------	
	//메인패널
	JPanel main = new JPanel();
	//입력패널
	
	JPanel writePane = new JPanel();
		JLabel paneName = new JLabel("뮤지컬 등록/수정/삭제");
	
		JLabel titleLbl = new JLabel("제           목");
		JTextField titleTf = new JTextField("제목을 입력해주세요.");
		
		JLabel castLbl = new JLabel("캐    스    팅");
		JTextField castTf = new JTextField("캐스팅목록을 입력해주세요.");
		
		JLabel dateLbl = new JLabel("기           간");
		JTextField dateTf = new JTextField("기간을 입력해주세요.");
		
		JLabel timeLbl = new JLabel("시           간");
		JTextField timeTf = new JTextField("시간을 입력해주세요.");
		
		JLabel rankLbl = new JLabel("관 람  등 급");
		JTextField rankTf = new JTextField("관람등급을 입력해주세요.");
		
		JLabel locLbl = new JLabel("장           소");
		JTextField locTf = new JTextField("장소를 입력해주세요.");
		
		JLabel priceLbl = new JLabel("가           격");
		JTextField priceTf = new JTextField("가격을 입력해주세요.");
		
		JLabel storyLbl = new JLabel("줄    거    리");
		JTextArea storyTa = new JTextArea("줄거리를 입력해주세요.");
		
		JLabel s_codeLbl = new JLabel("뮤지컬코드");
		JTextField s_codeTf = new JTextField();
		
		JLabel rTimeLbl = new JLabel("런    타    임");
		JTextField rTimeTf = new JTextField("상영시간을 입력해주세요.");
		
	//포스터패널
	JPanel posterPane= new JPanel();
	
		//JLabel imgLbl ;
		JButton editBtn = new JButton("수정하기");
		JButton enrollBtn = new JButton("등록하기");
		JButton deleteBtn = new JButton("삭제하기");
		JButton resetBtn = new JButton("폼리셋");
		JButton imgOpenBtn = new JButton("사진불러오기");
		JButton viewBtn = new JButton("전체목록보기");
	////////////////////////////////////////////	
	//목록패널
	JPanel tablePane = new JPanel();	
		DefaultTableModel model;
		JTable table;
		JScrollPane sp;	
		//제목배열
		String title[] = {"제목","캐스팅","공연기간","시간","관람등급","극장","가격","줄거리","뮤지컬코드","런타임"};
		//목록으로 사용할 배열
		Object [][] data = {};				
		JLabel lbl = new JLabel(" ");
		
		////////////////////////////////////////
		
	public MusicalMng() {
		add(main);
		main.setLayout(null);
		
		model = new DefaultTableModel(data,title);
		table = new JTable(model);
		sp = new JScrollPane(table);
		
		setTablePane();
		setWritePane();
		setPosterPane();
		
		
		setSize(1200,1000);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			
		musicalAllList();
		table.addMouseListener(this);
		enrollBtn.addActionListener(this);
		editBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		resetBtn.addActionListener(this);
		viewBtn.addActionListener(this);
		imgOpenBtn.addActionListener(this);
		
		


	}
	public void setTablePane() {

		//테이블패널~~~~~!!!!!!
		main.add(tablePane);	
				
		//(테이블패널이 메인패널이라고 생각해야함)
		tablePane.setBounds(0,600,1200,550);		
		tablePane.setLayout(null);		
		tablePane.setBackground(new Color(245,245,245));
					
		tablePane.add(sp);		
		tablePane.add(lbl);	
		
		sp.setBounds(50,50,1100,250);
	}
	public void setPosterPane() {
		//포스터패널~~~~~~~!!!!!!!!!!!!
		main.add(posterPane);		
		posterPane.setBounds(600,0,600,600);		
		posterPane.setLayout(null);

		posterPane.setBackground(new Color(245,245,245));		
		//포스터
			
		//posterLbl.setBackground(Color.black);
		
		imgOpenBtn.setBounds(70, 530, 150, 50);
		imgOpenBtn.setFont(fnt);
		//버튼
		posterPane.add(editBtn);
		posterPane.add(enrollBtn);
		posterPane.add(deleteBtn);
		posterPane.add(resetBtn);
		posterPane.add(imgOpenBtn);
		posterPane.add(viewBtn);
		viewBtn.setBounds(400,95,100,50);
		viewBtn.setFont(fnt);
		enrollBtn.setBounds(400,195,100,50);
		enrollBtn.setFont(fnt);
		editBtn.setBounds(400,295,100,50);
		editBtn.setFont(fnt);
		deleteBtn.setBounds(400,395,100,50);
		deleteBtn.setFont(fnt);
		resetBtn.setBounds(400,495,100,50);
		resetBtn.setFont(fnt);
	}

	public void setWritePane() {
		//writeapnel~~~~~~!!!!!!!!
		main.add(writePane);
		
		writePane.setLayout(null);
		writePane.setBounds(0,0,600,700);
		writePane.setBackground(new Color(245,245,245));
		
		writePane.add(paneName);
		paneName.setFont(new Font("돋움", Font.BOLD, 25));
		paneName.setBounds(30,20,300,45);
		
		//제목
		writePane.add(titleLbl);
		writePane.add(titleTf);
		titleLbl.setBounds(30,95,65,40);
		titleTf.setBounds(130,95,350,40);
		//캐스팅
		writePane.add(castLbl);
		writePane.add(castTf);
		castLbl.setBounds(30,140,65,40);
		castTf.setBounds(130,140,350,40);		
		//기간
		writePane.add(dateLbl);
		writePane.add(dateTf);
		dateLbl.setBounds(30,185,65,40);
		dateTf.setBounds(130,185,350,40);		
		//시간
		writePane.add(timeLbl);
		writePane.add(timeTf);
		timeLbl.setBounds(30,230,65,40);
		timeTf.setBounds(130,230,350,40);
		//관람등급
		writePane.add(rankLbl);
		writePane.add(rankTf);
		rankLbl.setBounds(30,275,65,40);
		rankTf.setBounds(130,275,350,40);
		//장소
		writePane.add(locLbl);
		writePane.add(locTf);
		locLbl.setBounds(30,320,65,40);
		locTf.setBounds(130,320,350,40);	
		//가격
		writePane.add(priceLbl);
		writePane.add(priceTf);
		priceLbl.setBounds(30,365,65,40);
		priceTf.setBounds(130,365,350,40);

		//뮤지컬코드
		writePane.add(s_codeLbl);
		writePane.add(s_codeTf);
		s_codeTf.setEditable(false);
		s_codeLbl.setBounds(30,410,65,40);
		s_codeTf.setBounds(130,410,350,40);		
		//런타임
		writePane.add(rTimeLbl);
		writePane.add(rTimeTf);
		rTimeLbl.setBounds(30,455,65,40);
		rTimeTf.setBounds(130,455,350,40);
		//줄거리
		writePane.add(storyLbl);
		JScrollPane storySp = new JScrollPane(storyTa);
		writePane.add(storySp);
		storyLbl.setBounds(30,500,65,40);
		storySp.setBounds(130,500,350,100);
		storyTa.setLineWrap(true);
		storyTa.setWrapStyleWord(true);
		
	}
	@Override
	public void actionPerformed(ActionEvent ae) {

		if(ae.getSource()==editBtn) {			
			musicalUpdate();
			
		}else if (ae.getSource()==enrollBtn) {
			//등록메소드
			musicalInsert();
		}else if(ae.getSource()==resetBtn) {
			formDataClear();
		}else if(ae.getSource()==deleteBtn) {
			musicalDelete();
		}else if(ae.getSource()==viewBtn) {
			musicalAllList();
		}else if(ae.getSource() == imgOpenBtn) {
			openImage();
		}
	}
	
	class  MyCanvas extends Canvas{
		public void paint(Graphics g) {
			g.drawImage(bi, 0, 0,300,400, this);
		}
	}
	//패널에 이미지 보여주기
	public void showImgPane() {
		int sCode = Integer.parseInt(s_codeTf.getText());
		UpdateImgDAO dao = new UpdateImgDAO();
		bi = dao.getDBImage(sCode);
		MyCanvas img = new MyCanvas();
		posterPane.add(img);
		img.setBounds(0,95,300,400);
		posterPane.setVisible(true);
	}
	//버튼이벤트 이미지열기
	public void openImage() {
		JFileChooser fc = new JFileChooser();
		int choice = fc.showOpenDialog(this);
		if(choice == 0) {
			try {
			posterPane.setVisible(false);
			f = fc.getSelectedFile();
			bi = ImageIO.read(f);
			
			MyCanvas img = new MyCanvas();
			fc.setMultiSelectionEnabled(false);	//파일 하나만 선택
			
						
			posterPane.add(img);
			img.setBounds(0,95,300,400);
			posterPane.setVisible(true);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	public void musicalDelete() {
		String codeNum = s_codeTf.getText();
		if(codeNum==null||codeNum.equals("")) {
			JOptionPane.showMessageDialog(this, "삭제할 목록을 선택해주세요.");
		}else {
			MusicalDAO dao = new MusicalDAO();
			int result = dao.deleteMusical(Integer.parseInt(codeNum));
			if(result>0) {
				JOptionPane.showMessageDialog(this, "뮤지컬이 삭제되었습니다.");
				musicalAllList();
				formDataClear();
			}else {
				JOptionPane.showMessageDialog(this, "뮤지컬 삭제를 실패했습니다.");
			}
		}
		
	}
	
		
	public void musicalUpdate() {
		try {
			MusicalVO vo = new MusicalVO();

			vo.setS_title(titleTf.getText());
			vo.setS_cast(castTf.getText());
			vo.setS_day(dateTf.getText());
			vo.setS_time(timeTf.getText());
			vo.setS_grade(rankTf.getText());
			vo.setT_code(locTf.getText());
			vo.setS_price(priceTf.getText());
			vo.setS_synop(storyTa.getText());
			vo.setS_rtime(rTimeTf.getText());
			vo.setS_code(Integer.parseInt(s_codeTf.getText()));
			MusicalDAO dao= new MusicalDAO();
			int cnt =dao.setCorrect(vo);
			
			UpdateImgDAO imgDao = new UpdateImgDAO();
			imgDao.UpdateImg(f, vo.getS_code());
			if(cnt>0) {
				//수정완료우~		
				musicalAllList();
				formDataClear();
			}else {//수정실패 안내 메세쥥~!
				JOptionPane.showMessageDialog(this, "뮤지컬수정을 실패하였습니다.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//전체 뮤지컬 목록 가져오기
	public void musicalAllList() {
		MusicalDAO dao= new MusicalDAO();
		List<MusicalVO> muList= dao.allMusical();
		setMusicalModel(muList);
	}
	//모델,,?
	public void setMusicalModel(List<MusicalVO> list) {
		model.setRowCount(0);
		for(int i=0;i<list.size();i++) {
			MusicalVO vo= list.get(i);
			Object[] obj= {vo.getS_title(),vo.getS_cast(),vo.getS_day(),vo.getS_time(),vo.getS_grade(),vo.getT_code(),vo.getS_price(),vo.getS_synop(),vo.getS_code(),vo.getS_rtime()};

			model.addRow(obj);
		}
	}
	//뮤지컬추가
	public void musicalInsert() {
		String musicalTitle = titleTf.getText();
		if(musicalTitle==null ||musicalTitle.equals("")) {
			 JOptionPane.showMessageDialog(this, "제목을 입력하세요");
		}else {
			MusicalVO vo= new MusicalVO();
			
			vo.setS_title(titleTf.getText());
			vo.setS_cast(castTf.getText());
			vo.setS_day(dateTf.getText());
			vo.setS_time(timeTf.getText());
			vo.setS_grade(rankTf.getText());
			vo.setT_code(locTf.getText());
			vo.setS_price(priceTf.getText());
			vo.setS_synop(storyTa.getText());
			vo.setS_rtime(rTimeTf.getText());
			
			MusicalDAO dao= new MusicalDAO();
			int cnt =dao.setEnroll(vo);
			
			UpdateImgDAO imgDao = new UpdateImgDAO();
			imgDao.UpdateImg(f, vo.getS_title());
			if(cnt>0) {
				formDataClear();
				System.out.println("레코드 추가댓삼");
			}else {
				System.out.println("레코드 추가 아쉽게 실패햇삼;");
				JOptionPane.showMessageDialog(this, "뮤지컬추가를 실패하였습니다.");
			}		
			musicalAllList();
		}
	}
	
	//폼리셋
	public void formDataClear() {
		
			titleTf.setText("");
			castTf.setText("");
			dateTf.setText("");
			timeTf.setText("");
			rankTf.setText("");
			locTf.setText("");
			priceTf.setText("");
			storyTa.setText("");
			s_codeTf.setText("");
			rTimeTf.setText("");
			
		
	}
	
	public void mouseReleased(MouseEvent me) {
		if(me.getButton()==1) {
			int row = table.getSelectedRow();	//0,1,2,3,4
			posterPane.setVisible(false);
			titleTf.setText(String.valueOf(table.getValueAt(row, 0)));
			castTf.setText(String.valueOf(table.getValueAt(row, 1)));
			dateTf.setText(String.valueOf(table.getValueAt(row, 2)));
			timeTf.setText(String.valueOf(table.getValueAt(row, 3)));
			rankTf.setText(String.valueOf(table.getValueAt(row, 4)));
			locTf.setText(String.valueOf(table.getValueAt(row, 5)));
			priceTf.setText(String.valueOf(table.getValueAt(row, 6)));
			storyTa.setText(String.valueOf(table.getValueAt(row, 7)));
			s_codeTf.setText(String.valueOf(table.getValueAt(row, 8)));
			rTimeTf.setText(String.valueOf(table.getValueAt(row, 9)));
			
			
			showImgPane();
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

	
	//드라이브--------------------------------------------
	
	public static void main(String[] args) {
		new MusicalMng();
	}
}
