import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;

// �����̳� Frame ��ӹ޾� �����ϱ�
public class FrameTest extends Frame{
	Point xy = new Point(500,300);
	Dimension wh = new Dimension(500,300);
	Rectangle rect = new Rectangle(100,100,400,400);
	public FrameTest() {
		//â ����
		//setTitle("������ ���� ������...");
		super("�������� ������");//Frame("�������� ������")
		// â�� ũ��(Pixel)
		//setSize(500,400);
		setSize(wh);
		//		   x   y   w   h
		//setBounds(200,200,500,400);	Rectangle 	x��ǥ, y��ǥ, w�� h����
		setBounds(rect);
		//setSize(500,500); //w, h		Dimension	���� ����
		//setLocation(300,300);// x, y	Point		x��ǥ, y��ȿ
		
		//â�� �����ֱ�
		
		//Ÿ��Ʋ�ٿ� �̹��� ����
		//Toolkit tk = Toolkit.getDefaultToolkit();
		//Image icon = tk.getImage("img/dinosaur.png");
		
		Image icon = Toolkit.getDefaultToolkit().getImage("img/dinosaur.png");
		setIconImage(icon);
		
		//Button�߰�
		Button btn = new Button("��ư");
		add(btn);
		
		Button btn1 = new Button("11111");
		Button btn2 = new Button("22222");
		Button btn3 = new Button("33333");
		Button btn4 = new Button("44444");
		
		add(BorderLayout.NORTH, btn1);
		add("South", btn2);
		add(BorderLayout.EAST, btn3);
		add(BorderLayout.WEST, btn4);//BorderLayout �⺻���̾ƿ�
		
		
		
		setVisible(true);//true������ false�Ⱥ�����
		
	}
	public static void main(String[] args) {
		new FrameTest();
	}
}
