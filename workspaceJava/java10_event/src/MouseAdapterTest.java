import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;

public class MouseAdapterTest extends JFrame{
   int x,y;
   
   MyCanvas mc= new MyCanvas();
   public MouseAdapterTest() {
      
      add(mc);
      setSize(500,500);
      setVisible(true);
      setDefaultCloseOperation(DISPOSE_ON_CLOSE);
      
      //익명의 내부클래스
      mc.addMouseListener(new MouseAdapter() {
   
         public void mouseReleased(MouseEvent me) {
            //getButton () : 왼쪽버튼 :1, 가운데휠:2, 오른쪽버튼:3
            
            //마우스가 클릭된 곳의 좌표를 가져온다.
            //멤버에 있는 xy변수에다가~~가져옴
            if(me.getButton()==1) {
               x=me.getX();
               y=me.getY();
               mc.repaint();
            }
         }
      });
   }
   public class MyCanvas extends Canvas{
      public void paint(Graphics g) {
         Random ran = new Random();
         g.setColor(new Color(ran.nextInt(256),ran.nextInt(256),ran.nextInt(256)));
         g.fillOval(x, y, 50, 50);//50픽셀짜리 원이 그려짐
      }
      public void update(Graphics g) {
         paint(g);
      }
   }
   public static void main(String[] args) {
      new MouseAdapterTest();
   }

}
