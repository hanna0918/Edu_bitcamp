import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;

// 컨테이너 Frame 상속받아 구현하기
public class FrameTest extends Frame{
	Point xy = new Point(500,300);
	Dimension wh = new Dimension(500,300);
	Rectangle rect = new Rectangle(100,100,400,400);
	public FrameTest() {
		//창 제목
		//setTitle("프레임 생성 연습중...");
		super("하위에서 제목설정");//Frame("하위에서 제목설정")
		// 창의 크기(Pixel)
		//setSize(500,400);
		setSize(wh);
		//		   x   y   w   h
		//setBounds(200,200,500,400);	Rectangle 	x좌표, y좌표, w폭 h높이
		setBounds(rect);
		//setSize(500,500); //w, h		Dimension	폭과 높이
		//setLocation(300,300);// x, y	Point		x좌표, y좌효
		
		//창을 보여주기
		
		//타이틀바에 이미지 삽입
		//Toolkit tk = Toolkit.getDefaultToolkit();
		//Image icon = tk.getImage("img/dinosaur.png");
		
		Image icon = Toolkit.getDefaultToolkit().getImage("img/dinosaur.png");
		setIconImage(icon);
		
		//Button추가
		Button btn = new Button("버튼");
		add(btn);
		
		Button btn1 = new Button("11111");
		Button btn2 = new Button("22222");
		Button btn3 = new Button("33333");
		Button btn4 = new Button("44444");
		
		add(BorderLayout.NORTH, btn1);
		add("South", btn2);
		add(BorderLayout.EAST, btn3);
		add(BorderLayout.WEST, btn4);//BorderLayout 기본레이아웃
		
		
		
		setVisible(true);//true보여줌 false안보여줌
		
	}
	public static void main(String[] args) {
		new FrameTest();
	}
}
