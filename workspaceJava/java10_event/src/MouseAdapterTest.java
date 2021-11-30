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
      
      //�͸��� ����Ŭ����
      mc.addMouseListener(new MouseAdapter() {
   
         public void mouseReleased(MouseEvent me) {
            //getButton () : ���ʹ�ư :1, �����:2, �����ʹ�ư:3
            
            //���콺�� Ŭ���� ���� ��ǥ�� �����´�.
            //����� �ִ� xy�������ٰ�~~������
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
         g.fillOval(x, y, 50, 50);//50�ȼ�¥�� ���� �׷���
      }
      public void update(Graphics g) {
         paint(g);
      }
   }
   public static void main(String[] args) {
      new MouseAdapterTest();
   }

}
