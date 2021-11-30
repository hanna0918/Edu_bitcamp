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
      JButton foreColor = new JButton("글자색");
      
   //글꼴=======================================================================
   JToggleButton boldBtn = new JToggleButton("A");//진하게
   JToggleButton italicBtn = new JToggleButton("A");//기울임꼴
   JComboBox<String> fontCombo = new JComboBox<String>();//글꼴
   JComboBox<Integer> sizeCombo = new JComboBox<Integer>();//글자크기
   DefaultComboBoxModel<String> fontModel ;
   DefaultComboBoxModel<Integer> sizeModel = new DefaultComboBoxModel<Integer>();
   
   
   int bold = 0; // 1 -> 0  번갈아가면서 
   int italic = 0;
   
    //달력
   JButton calBtn = new JButton("달력");

   public JInternalFrameTest2() {
      tb.add(openBtn);
      tb.add(saveBtn);
      tb.addSeparator();
      tb.add(foreColor);
      
      //글꼴관련 메뉴
      boldBtn.setFont(new Font("궁서체",Font.BOLD,14));
      italicBtn.setFont(new Font("궁서체",Font.ITALIC,14));
      tb.add(boldBtn);
      tb.add(italicBtn);
      
      //글꼴 : 윈도우 운영체제에서지원하는 글꼴을 이용하여 콤보박스를 만들예정
      GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
      String fontName[] = ge.getAvailableFontFamilyNames();
      fontModel = new DefaultComboBoxModel<String>(fontName);
      fontCombo.setModel(fontModel);
      fontCombo.setSelectedItem("궁서"); //폰트고를때 기본으로 설정되게만듬
      tb.add(fontCombo);
      
      //글자크기
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
      
      //JInternalFrame 객체 생성 방법
      
      if1 = new JInternalFrame("JInternalFrame/ if1"); //창크기조절, 최소화, 최대화, 아이콘화 모두불가
      if1.setSize(300,200);
      if1.setVisible(true);
      dp.add(if1);
      
      if2 = new JInternalFrame("메모장",true); //창크기 조절가능
      if2.add(new JScrollPane(new JTextArea()));
      if2.setBounds(100,200,500,400);
      if2.setVisible(true);
      dp.add(if2);
      
      if3 = new JInternalFrame("계산기",true,true,true,true);
      if3.add(new CalculatorEx2());
      if3.setSize(400,350);
      if3.setVisible(true);
      dp.add(if3);
      
      setSize(1000,800);
      setVisible(true);
      setDefaultCloseOperation(DO_NOTHING_ON_CLOSE); //DO_NOTHING_ON_CLOSE
      
      try {
         if3.setSelected(true);//계산기 프레임 활성화
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
            int que =op.showConfirmDialog(ift, "저장하시겠습니까?", "저장확인", JOptionPane.YES_NO_CANCEL_OPTION);
            if(que == JOptionPane.YES_OPTION) {//YES = 0
               //저장후 종료
               fileSave();
               dispose();//자원제거
               System.exit(0);
            }else if(que == JOptionPane.NO_OPTION){//NO = 1
               //저장안하고 종료
               dispose();//자원제거
               System.exit(0);
            }else if(que == JOptionPane.CANCEL_OPTION){//cancel = 2눌렀을때
               //아무일도 안함
               
            }
         }
      });
   }
   public void actionPerformed(ActionEvent ae) {
      Object event = ae.getSource();
      if(event instanceof JButton) {
         if(event == openBtn) {//파일열기
            fileOpen();
         }else if(event == saveBtn) {//파일저장
            fileSave();
         }else if(event == foreColor) {//글자색 변경
            setFontFore();
         }else if(event == calBtn) {
            getCalendarDialog();
         }
         }else if(event instanceof JToggleButton) { 
            if(event == boldBtn) { //진하게 선택/해제 버튼
            if(boldBtn.isSelected()) {
               //진하게 버튼이 선택되었을때
               bold = 1;
            }else {
               //진하게 선택해제 되었을때
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
    //달력 Dialog
   public void getCalendarDialog(){
         SwingCalendar2 cal = new SwingCalendar2();
         
         //BorderLayout
         JDialog dialog = new JDialog(this, "달력", true);
         dialog.add(cal);
         dialog.setSize(400,350);
         dialog.setVisible(true);
   }
   //폰트셋팅
   public void fontSetting() {
      //DeskTop에서 선택된 JinternalFrame 을 구한후 JTextArea 얻어오기
      JInternalFrame activeIf = dp.getSelectedFrame();
      JTextArea ta =(JTextArea)activeIf.getFocusOwner();
      
      ta.setFont(new Font((String)fontCombo.getSelectedItem(), bold+italic, (Integer)sizeCombo.getSelectedItem()));
   }
   //글자색 변경
   public void setFontFore() {
      JColorChooser cc = new JColorChooser(Color.GREEN);
      Color selectColor = cc.showDialog(this, "글자색", Color.BLUE);
      
      JInternalFrame selectIf = dp.getSelectedFrame();
      JTextArea ta = (JTextArea)selectIf.getFocusOwner();
      ta.setForeground(selectColor);
   }
   //파일저장
   public void fileSave() {
      JFileChooser fc = new JFileChooser();
      if(fc.showSaveDialog(this)==0) {
         try {
            File f = fc.getSelectedFile();
            FileWriter fw = new FileWriter(f);
            //현재 선택된 Frame얻어오기
            JInternalFrame selectIf = dp.getSelectedFrame();
            JTextArea eventTa = (JTextArea)selectIf.getFocusOwner();
            
            fw.write(eventTa.getText());
            fw.close();
         }catch(Exception e) {
            
         }
      }
   }
   //파일열기
   public void fileOpen() {
      JFileChooser fc = new JFileChooser();
      // 0:열기, 1:취소
      if(fc.showOpenDialog(this)==0) {
         //선택한 파일 객체 얻어오기
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
