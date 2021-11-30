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
	
	//캔버스의 x,y좌표
	int x, y;
	//이미지 포인트로 사용할 변수
	int p=0;
	public PackMan() {
		add(mc);
		
		setSize(500, 500);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
				
		//캔버스 크기  구하기
		dim = mc.getSize();
		x = dim.width/2 - 25;
		y = dim.height/2 - 25;
		
		//커서를 캔버스 설정하기
		mc.setFocusable(true);
		//이벤트등록
		mc.addKeyListener(this);
		
		//paint메소드를 반복호출
		while(true) {
			mc.repaint();
			
			//이미지변환	왼쪽 0,1 오른쪽 2,3 위 4,5 아래 6,7
			if(p%2==0) p++;
			else  p--;
			
			//좌표이동
			if(p==0 || p==1) {//왼쪽으로 이동
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
			
			
			//시간지연
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
			//					캔버스				이미지
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
		if(code == KeyEvent.VK_LEFT || code == KeyEvent.VK_A) {//왼쪽방향키
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
