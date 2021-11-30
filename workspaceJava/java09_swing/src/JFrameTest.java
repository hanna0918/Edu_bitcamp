import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
//								default : BorderLayout
public class JFrameTest extends JFrame {
	ImageIcon icon1 = new ImageIcon("img/dinosaur.png");
	ImageIcon icon2 = new ImageIcon("img/doll.png");
	ImageIcon icon3 = new ImageIcon("img/fire.png");
	public JFrameTest() {
		//BorderLayout을 GridLayout으로 변경하기
		//								  3행2열
		GridLayout layout = new GridLayout(3,2,10,10);
		setLayout(layout);
		//=setLayout(new GridLayout(3,2));
		
		JButton btn1 = new JButton("버튼1");
		add(btn1);
		
		
		//JButton(Icon icon)
		JButton btn2 = new JButton(icon1);
		add(btn2);		
		//마우스로 버튼 누를때 icon 바꾸기
		btn2.setPressedIcon(icon2);
		//마우스 오버시 icon바꾸기
		btn2.setRolloverIcon(icon3);
		
		
		JButton btn3 = new JButton("공룡", icon1);
		add(btn3);
		//버튼 활성화(true) 비활성화(false)
		btn3.setEnabled(false);
		
		JButton btn4 = new JButton("네번째버튼");
		add(btn4);
		
		//라디오 버튼
		JPanel pane = new JPanel(new GridLayout(3,1));	//테두리가 없는 컨테이너
		JRadioButton rBtn1 = new JRadioButton("ONE");
		JRadioButton rBtn2 = new JRadioButton("TWO");
		JRadioButton rBtn3 = new JRadioButton("THREE");
		
		//라디오 버튼 그룹만들기
		ButtonGroup bg = new ButtonGroup();
		bg.add(rBtn1);		bg.add(rBtn2);		bg.add(rBtn3);
		
		pane.add(rBtn1);
		pane.add(rBtn2);
		pane.add(rBtn3);
		
		add(pane);
		
		//토글버튼
		JToggleButton toggleBtn = new JToggleButton("토글", icon3);
		toggleBtn.setRolloverIcon(icon1);
		toggleBtn.setSelectedIcon(icon2);
		add(toggleBtn);
		
		//라벨만들기
		//						라벨내용	,	오른쪽정렬(수평정렬)
		JLabel lbl = new JLabel("라벨표시", JLabel.CENTER);
		add(lbl);
		
		//배경색 컬러 설정하기
		btn1.setBackground(Color.ORANGE);
		//컬러 객체 만들어서 배경색 설정
		//				R:0~255, G:0~255, B:0~255
		Color clr = new Color(100, 100, 200);
		toggleBtn.setBackground(clr);
		
		//글자색 컬러 설정하기
		btn1.setForeground(Color.WHITE);
		
		//라벨에 배경색 설정하기
		//투명처리해제
		lbl.setOpaque(true);//true:투명처리해제 false:투명처리
		lbl.setBackground(new Color(160,160,100));//배경이 투명처리. 투명처리 해제하고 배경설정 ㄱ
		
		//Font : 글꼴(굴림체, 돋움체, Arial...), 글자유형(기울임, 진하게, 보통), 글자크기(pixel) 설정
		//Font(String name, int style, int size);
		//			글꼴이름, 기울임,진하게등.., 글자크기
		Font fnt = new Font("궁서체", Font.ITALIC+Font.BOLD, 40);
		
		lbl.setFont(fnt);
		
		
		
		setSize(500,500);
		setVisible(true);
		//프로그램이 종료되면 자원해제 하거나, 프로그램을 종료할 수 없도록 설정...
		// 						 DISPSE_ON_CLOSE : 프로그램 종료시 자원을 해제하라.
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		//						   DO_NOTHING_ON_CLOSE : 닫기가 수행되지 않는다.
		//setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		
		//밀리초만큼 잠시 쉼
		try {
			Thread.sleep(5000);//밀리초 
		}catch(InterruptedException e) {}
		
		
		//버튼의 라벨, Label의 라벨 변경하기
		btn1.setText("변경된 버튼 라벨");
		lbl.setText("변경된 라벨");
	}
	
	
	
	
	public static void main(String [] args) {
		new JFrameTest();
	}
}
