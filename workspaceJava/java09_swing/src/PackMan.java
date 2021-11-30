import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class PackMan extends JFrame implements KeyListener {
	MyCanvas mc = new MyCanvas();
	Dimension dim;
	
	//ĵ������ x,y��ǥ
	int x, y;
	//�̹��� ����Ʈ�� ����� ����
	int p=0;
	public PackMan() {
		add(mc);
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
		//ĵ���� ũ��  ���ϱ�
		dim = mc.getSize();
		x = dim.width/2 - 25;
		y = dim.height/2 - 25;
		
		//Ŀ���� ĵ���� �����ϱ�
		mc.setFocusable(true);
		//�̺�Ʈ���
		mc.addKeyListener(this);
		
		//paint�޼ҵ带 �ݺ�ȣ��
		while(true) {
			mc.repaint();
			
			//�̹�����ȯ	���� 0,1 ������ 2,3 �� 4,5 �Ʒ� 6,7
			if(p%2==0) p++;
			else  p--;
			
			//��ǥ�̵�
			if(p==0 || p==1) {//�������� �̵�
				x-=5;
				if(x<=-50) x=dim.width;
			}else if(p==2 || p==3) {
				x+=5;
				if(x>=dim.width) x=-50;
			}else if(p==4 || p==5) {
				y-=5;
				if(y<=-50) y=dim.height;
			}else if(p==6 || p==7) {
				y+=5;
				if(y>=dim.height) y=-50;
			}
			
			
			//�ð�����
			try {
				Thread.sleep(200);
			}catch(Exception e) {
				
			}
		}
	}
	class MyCanvas extends Canvas{
		Image packMan;
		
		public MyCanvas() {
			setBackground(Color.WHITE);
			packMan = Toolkit.getDefaultToolkit().getImage("img/packman.jpg");
		}
		public void paint(Graphics g) {
			//					ĵ����				�̹���
			//								 p=0	0,		0, 	50, 50
			//								 p=1	50,		0,	100	50
			//								 p=2	100,	0,	150	50
			//								 p=3	150,	0,	200	50
			
			g.drawImage(packMan, x, y, x+50, y+50, p*50, 0, p*50+50, 50, this);
		}
	}
	//KeyEvent overriding
	public void keyPressed(KeyEvent ke) {
		
	}
	public void keyReleased(KeyEvent ke) {
		int code = ke.getKeyCode();
		if(code == KeyEvent.VK_LEFT || code == KeyEvent.VK_A) {//���ʹ���Ű
			p=0;			
		}else if(code == KeyEvent.VK_RIGHT || code == KeyEvent.VK_D) {
			p=2;
		}else if(code == KeyEvent.VK_UP || code == KeyEvent.VK_W) {
			p=4;
		}else if(code == KeyEvent.VK_DOWN || code == KeyEvent.VK_S) {
			p=6;
		}
	}
	public void keyType(KeyEvent ke) {
		
	}
	public static void main(String[] args) {
		new PackMan();

	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
