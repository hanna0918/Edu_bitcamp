import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFrame extends JFrame{
	int width, height;
	JButton button;
	public TestFrame() {
		
	}
	public TestFrame(int w, int h) {
		width = w;
		height  = h;
		button = new JButton("Click Me");
	}
	
	public void setUpGUI() {
		add(BorderLayout.CENTER,button);
		
		setTitle("My Java App");
		setSize(width, height);
		setVisible(true);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		
	}

	public static void main(String[] args) {
		new TestFrame(500,500);

	}

}
