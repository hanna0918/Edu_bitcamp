
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
//�������Ѱ�
//1. s_code ��ĭ���� ���� ������ ������ ���, ���� �ȵ� ���������� join�����------�ذ�
//2. �̹��� �����Ͷ� �����ϱ�---------------------------------------------�ذ�
public class MusicalMng extends JFrame implements ActionListener, MouseListener {
	String icon = "";
	BufferedImage bi;
	File f;
	Font fnt = new Font("���� ���", Font.BOLD, 13);
//-------------------------------------------	
	//�����г�
	JPanel main = new JPanel();
	//�Է��г�
	
	JPanel writePane = new JPanel();
		JLabel paneName = new JLabel("������ ���/����/����");
	
		JLabel titleLbl = new JLabel("��           ��");
		JTextField titleTf = new JTextField("������ �Է����ּ���.");
		
		JLabel castLbl = new JLabel("ĳ    ��    ��");
		JTextField castTf = new JTextField("ĳ���ø���� �Է����ּ���.");
		
		JLabel dateLbl = new JLabel("��           ��");
		JTextField dateTf = new JTextField("�Ⱓ�� �Է����ּ���.");
		
		JLabel timeLbl = new JLabel("��           ��");
		JTextField timeTf = new JTextField("�ð��� �Է����ּ���.");
		
		JLabel rankLbl = new JLabel("�� ��  �� ��");
		JTextField rankTf = new JTextField("��������� �Է����ּ���.");
		
		JLabel locLbl = new JLabel("��           ��");
		JTextField locTf = new JTextField("��Ҹ� �Է����ּ���.");
		
		JLabel priceLbl = new JLabel("��           ��");
		JTextField priceTf = new JTextField("������ �Է����ּ���.");
		
		JLabel storyLbl = new JLabel("��    ��    ��");
		JTextArea storyTa = new JTextArea("�ٰŸ��� �Է����ּ���.");
		
		JLabel s_codeLbl = new JLabel("�������ڵ�");
		JTextField s_codeTf = new JTextField();
		
		JLabel rTimeLbl = new JLabel("��    Ÿ    ��");
		JTextField rTimeTf = new JTextField("�󿵽ð��� �Է����ּ���.");
		
	//�������г�
	JPanel posterPane= new JPanel();
	
		//JLabel imgLbl ;
		JButton editBtn = new JButton("�����ϱ�");
		JButton enrollBtn = new JButton("����ϱ�");
		JButton deleteBtn = new JButton("�����ϱ�");
		JButton resetBtn = new JButton("������");
		JButton imgOpenBtn = new JButton("�����ҷ�����");
		JButton viewBtn = new JButton("��ü��Ϻ���");
	////////////////////////////////////////////	
	//����г�
	JPanel tablePane = new JPanel();	
		DefaultTableModel model;
		JTable table;
		JScrollPane sp;	
		//����迭
		String title[] = {"����","ĳ����","�����Ⱓ","�ð�","�������","����","����","�ٰŸ�","�������ڵ�","��Ÿ��"};
		//������� ����� �迭
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

		//���̺��г�~~~~~!!!!!!
		main.add(tablePane);	
				
		//(���̺��г��� �����г��̶�� �����ؾ���)
		tablePane.setBounds(0,600,1200,550);		
		tablePane.setLayout(null);		
		tablePane.setBackground(new Color(245,245,245));
					
		tablePane.add(sp);		
		tablePane.add(lbl);	
		
		sp.setBounds(50,50,1100,250);
	}
	public void setPosterPane() {
		//�������г�~~~~~~~!!!!!!!!!!!!
		main.add(posterPane);		
		posterPane.setBounds(600,0,600,600);		
		posterPane.setLayout(null);

		posterPane.setBackground(new Color(245,245,245));		
		//������
			
		//posterLbl.setBackground(Color.black);
		
		imgOpenBtn.setBounds(70, 530, 150, 50);
		imgOpenBtn.setFont(fnt);
		//��ư
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
		paneName.setFont(new Font("����", Font.BOLD, 25));
		paneName.setBounds(30,20,300,45);
		
		//����
		writePane.add(titleLbl);
		writePane.add(titleTf);
		titleLbl.setBounds(30,95,65,40);
		titleTf.setBounds(130,95,350,40);
		//ĳ����
		writePane.add(castLbl);
		writePane.add(castTf);
		castLbl.setBounds(30,140,65,40);
		castTf.setBounds(130,140,350,40);		
		//�Ⱓ
		writePane.add(dateLbl);
		writePane.add(dateTf);
		dateLbl.setBounds(30,185,65,40);
		dateTf.setBounds(130,185,350,40);		
		//�ð�
		writePane.add(timeLbl);
		writePane.add(timeTf);
		timeLbl.setBounds(30,230,65,40);
		timeTf.setBounds(130,230,350,40);
		//�������
		writePane.add(rankLbl);
		writePane.add(rankTf);
		rankLbl.setBounds(30,275,65,40);
		rankTf.setBounds(130,275,350,40);
		//���
		writePane.add(locLbl);
		writePane.add(locTf);
		locLbl.setBounds(30,320,65,40);
		locTf.setBounds(130,320,350,40);	
		//����
		writePane.add(priceLbl);
		writePane.add(priceTf);
		priceLbl.setBounds(30,365,65,40);
		priceTf.setBounds(130,365,350,40);

		//�������ڵ�
		writePane.add(s_codeLbl);
		writePane.add(s_codeTf);
		s_codeTf.setEditable(false);
		s_codeLbl.setBounds(30,410,65,40);
		s_codeTf.setBounds(130,410,350,40);		
		//��Ÿ��
		writePane.add(rTimeLbl);
		writePane.add(rTimeTf);
		rTimeLbl.setBounds(30,455,65,40);
		rTimeTf.setBounds(130,455,350,40);
		//�ٰŸ�
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
			//��ϸ޼ҵ�
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
	//�гο� �̹��� �����ֱ�
	public void showImgPane() {
		int sCode = Integer.parseInt(s_codeTf.getText());
		UpdateImgDAO dao = new UpdateImgDAO();
		bi = dao.getDBImage(sCode);
		MyCanvas img = new MyCanvas();
		posterPane.add(img);
		img.setBounds(0,95,300,400);
		posterPane.setVisible(true);
	}
	//��ư�̺�Ʈ �̹�������
	public void openImage() {
		JFileChooser fc = new JFileChooser();
		int choice = fc.showOpenDialog(this);
		if(choice == 0) {
			try {
			posterPane.setVisible(false);
			f = fc.getSelectedFile();
			bi = ImageIO.read(f);
			
			MyCanvas img = new MyCanvas();
			fc.setMultiSelectionEnabled(false);	//���� �ϳ��� ����
			
						
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
			JOptionPane.showMessageDialog(this, "������ ����� �������ּ���.");
		}else {
			MusicalDAO dao = new MusicalDAO();
			int result = dao.deleteMusical(Integer.parseInt(codeNum));
			if(result>0) {
				JOptionPane.showMessageDialog(this, "�������� �����Ǿ����ϴ�.");
				musicalAllList();
				formDataClear();
			}else {
				JOptionPane.showMessageDialog(this, "������ ������ �����߽��ϴ�.");
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
				//�����Ϸ��~		
				musicalAllList();
				formDataClear();
			}else {//�������� �ȳ� �޼���~!
				JOptionPane.showMessageDialog(this, "�����ü����� �����Ͽ����ϴ�.");
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	//��ü ������ ��� ��������
	public void musicalAllList() {
		MusicalDAO dao= new MusicalDAO();
		List<MusicalVO> muList= dao.allMusical();
		setMusicalModel(muList);
	}
	//��,,?
	public void setMusicalModel(List<MusicalVO> list) {
		model.setRowCount(0);
		for(int i=0;i<list.size();i++) {
			MusicalVO vo= list.get(i);
			Object[] obj= {vo.getS_title(),vo.getS_cast(),vo.getS_day(),vo.getS_time(),vo.getS_grade(),vo.getT_code(),vo.getS_price(),vo.getS_synop(),vo.getS_code(),vo.getS_rtime()};

			model.addRow(obj);
		}
	}
	//�������߰�
	public void musicalInsert() {
		String musicalTitle = titleTf.getText();
		if(musicalTitle==null ||musicalTitle.equals("")) {
			 JOptionPane.showMessageDialog(this, "������ �Է��ϼ���");
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
				System.out.println("���ڵ� �߰����");
			}else {
				System.out.println("���ڵ� �߰� �ƽ��� �����޻�;");
				JOptionPane.showMessageDialog(this, "�������߰��� �����Ͽ����ϴ�.");
			}		
			musicalAllList();
		}
	}
	
	//������
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

	
	//����̺�--------------------------------------------
	
	public static void main(String[] args) {
		new MusicalMng();
	}
}
