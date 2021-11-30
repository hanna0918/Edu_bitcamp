import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JDesktopPane;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToggleButton;
import javax.swing.JToolBar;

public class JInternalFrameTest2 extends JFrame implements ActionListener{
   JDesktopPane dp = new JDesktopPane();
   JInternalFrame if1, if2, if3;
   
   ImageIcon openIcon = new ImageIcon("img/open.gif");
   ImageIcon saveIcon = new ImageIcon("img/save.gif");
   JToolBar tb = new JToolBar();
      JButton openBtn = new JButton(openIcon);
      JButton saveBtn = new JButton(saveIcon);
      JButton foreColor = new JButton("���ڻ�");
      
   //�۲�=======================================================================
   JToggleButton boldBtn = new JToggleButton("A");//���ϰ�
   JToggleButton italicBtn = new JToggleButton("A");//����Ӳ�
   JComboBox<String> fontCombo = new JComboBox<String>();//�۲�
   JComboBox<Integer> sizeCombo = new JComboBox<Integer>();//����ũ��
   DefaultComboBoxModel<String> fontModel ;
   DefaultComboBoxModel<Integer> sizeModel = new DefaultComboBoxModel<Integer>();
   
   
   int bold = 0; // 1 -> 0  �����ư��鼭 
   int italic = 0;
   
    //�޷�
   JButton calBtn = new JButton("�޷�");

   public JInternalFrameTest2() {
      tb.add(openBtn);
      tb.add(saveBtn);
      tb.addSeparator();
      tb.add(foreColor);
      
      //�۲ð��� �޴�
      boldBtn.setFont(new Font("�ü�ü",Font.BOLD,14));
      italicBtn.setFont(new Font("�ü�ü",Font.ITALIC,14));
      tb.add(boldBtn);
      tb.add(italicBtn);
      
      //�۲� : ������ �ü�����������ϴ� �۲��� �̿��Ͽ� �޺��ڽ��� ���鿹��
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      String fontName[] = ge.getAvailableFontFamilyNames();
      fontModel = new DefaultComboBoxModel<String>(fontName);
      fontCombo.setModel(fontModel);
      fontCombo.setSelectedItem("�ü�"); //��Ʈ���� �⺻���� �����ǰԸ���
      tb.add(fontCombo);
      
      //����ũ��
      for(int size=8; size<100; size+=2) {
         sizeModel.addElement(size);
      }
      sizeCombo.setModel(sizeModel);
      sizeCombo.setSelectedItem(12);
      tb.add(sizeCombo);
      
      tb.add(calBtn);
      add(BorderLayout.NORTH,tb);
      ///////////////////////////////////////////////////
      add(dp);
      
      //JInternalFrame ��ü ���� ���
      
      if1 = new JInternalFrame("JInternalFrame/ if1"); //âũ������, �ּ�ȭ, �ִ�ȭ, ������ȭ ��κҰ�
      if1.setSize(300,200);
      if1.setVisible(true);
      dp.add(if1);
      
      if2 = new JInternalFrame("�޸���",true); //âũ�� ��������
      if2.add(new JScrollPane(new JTextArea()));
      if2.setBounds(100,200,500,400);
      if2.setVisible(true);
      dp.add(if2);
      
      if3 = new JInternalFrame("����",true,true,true,true);
      if3.add(new CalculatorEx2());
      if3.setSize(400,350);
      if3.setVisible(true);
      dp.add(if3);
      
      setSize(1000,800);
      setVisible(true);
      setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //DO_NOTHING_ON_CLOSE
      
      try {
         if3.setSelected(true);//���� ������ Ȱ��ȭ
      }catch(Exception e) {

      }
      
      openBtn.addActionListener(this);
      saveBtn.addActionListener(this);
      foreColor.addActionListener(this);
      boldBtn.addActionListener(this);
      italicBtn.addActionListener(this);
      fontCombo.addActionListener(this);
      sizeCombo.addActionListener(this);
      calBtn.addActionListener(this);
      
      JInternalFrameTest2 ift = this;
      addWindowListener(new WindowAdapter() {
         public void windowClosing(WindowEvent we) {
            JOptionPane op = new JOptionPane();
            int que =op.showConfirmDialog(ift, "�����Ͻðڽ��ϱ�?", "����Ȯ��", JOptionPane.YES_NO_CANCEL_OPTION);
            if(que == JOptionPane.YES_OPTION) {//YES = 0
               //������ ����
               fileSave();
               dispose();//�ڿ�����
               System.exit(0);
            }else if(que == JOptionPane.NO_OPTION){//NO = 1
               //������ϰ� ����
               dispose();//�ڿ�����
               System.exit(0);
            }else if(que == JOptionPane.CANCEL_OPTION){//cancel = 2��������
               //�ƹ��ϵ� ����
               
            }
         }
      });
   }
   public void actionPerformed(ActionEvent ae) {
      Object event = ae.getSource();
      if(event instanceof JButton) {
         if(event == openBtn) {//���Ͽ���
            fileOpen();
         }else if(event == saveBtn) {//��������
            fileSave();
         }else if(event == foreColor) {//���ڻ� ����
            setFontFore();
         }else if(event == calBtn) {
            getCalendarDialog();
         }
         }else if(event instanceof JToggleButton) { 
            if(event == boldBtn) { //���ϰ� ����/���� ��ư
            if(boldBtn.isSelected()) {
               //���ϰ� ��ư�� ���õǾ�����
               bold = 1;
            }else {
               //���ϰ� �������� �Ǿ�����
               bold = 0;
            }
            fontSetting();
         }else if(event == italicBtn) {
            if(italicBtn.isSelected()) {
               italic = 2;
            }else {
               italic = 0;
            }
            fontSetting();
           }
         }else if(event instanceof JComboBox) {
            if(event == fontCombo || event == sizeCombo) {
               fontSetting();
            }
         }
      }
    //�޷� Dialog
   public void getCalendarDialog(){
         SwingCalendar2 cal = new SwingCalendar2();
         
         //BorderLayout
         JDialog dialog = new JDialog(this, "�޷�", true);
         dialog.add(cal);
         dialog.setSize(400,350);
         dialog.setVisible(true);
   }
   //��Ʈ����
   public void fontSetting() {
      //DeskTop���� ���õ� JinternalFrame �� ������ JTextArea ������
      JInternalFrame activeIf = dp.getSelectedFrame();
      JTextArea ta =(JTextArea)activeIf.getFocusOwner();
      
      ta.setFont(new Font((String)fontCombo.getSelectedItem(), bold+italic, (Integer)sizeCombo.getSelectedItem()));
   }
   //���ڻ� ����
   public void setFontFore() {
      JColorChooser cc = new JColorChooser(Color.GREEN);
      Color selectColor = cc.showDialog(this, "���ڻ�", Color.BLUE);
      
      JInternalFrame selectIf = dp.getSelectedFrame();
      JTextArea ta = (JTextArea)selectIf.getFocusOwner();
      ta.setForeground(selectColor);
   }
   //��������
   public void fileSave() {
      JFileChooser fc = new JFileChooser();
      if(fc.showSaveDialog(this)==0) {
         try {
            File f = fc.getSelectedFile();
            FileWriter fw = new FileWriter(f);
            //���� ���õ� Frame������
            JInternalFrame selectIf = dp.getSelectedFrame();
            JTextArea eventTa = (JTextArea)selectIf.getFocusOwner();
            
            fw.write(eventTa.getText());
            fw.close();
         }catch(Exception e) {
            
         }
      }
   }
   //���Ͽ���
   public void fileOpen() {
      JFileChooser fc = new JFileChooser();
      // 0:����, 1:���
      if(fc.showOpenDialog(this)==0) {
         //������ ���� ��ü ������
         File f = fc.getSelectedFile();
         JTextArea ta = new JTextArea();
         
         try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            while(true) {
               String readData = br.readLine();
               if(readData == null) break;
               ta.append(readData+"\n");
            }
            JScrollPane sp2 = new JScrollPane(ta);
            JInternalFrame if5 = new JInternalFrame(f.getPath(),true,true,true,true);
            if5.add(sp2);
            dp.add(if5);
            if5.setSize(500,500);
            if5.setSelected(true);
            if5.setVisible(true);
            
            
         }catch(Exception e) {}
      }
   }
   public static void main(String[] args) {
      new JInternalFrameTest();

   }

}
