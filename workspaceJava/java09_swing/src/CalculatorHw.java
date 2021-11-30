import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorHw extends JFrame{
	JTextField txt = new JTextField("",JTextField.NORTH);
	
	
	public CalculatorHw() {
		add(txt,BorderLayout.NORTH);
		
		JPanel pane = new JPanel(new GridLayout(1,3));
		JButton btn1 = new JButton("Backspace");
		JButton btn2 = new JButton("Clear");
		JButton btn3 = new JButton("End");
		pane.add(btn1);	pane.add(btn2);	pane.add(btn3);
		add(pane);
		
		
		JPanel pane2 = new JPanel(new GridLayout(4,4));
		JButton bt1 = new JButton("1");
		JButton bt2 = new JButton("2");
		JButton bt3 = new JButton("3");
		JButton bt4 = new JButton("4");
		JButton bt5 = new JButton("5");
		JButton bt6 = new JButton("6");
		JButton bt7 = new JButton("7");
		JButton bt8 = new JButton("8");
		JButton bt9 = new JButton("9");
		JButton bt0 = new JButton("0");
		JButton btDot = new JButton(".");
		JButton btEq = new JButton("=");
		JButton btPlus = new JButton("+");
		JButton btMinus = new JButton("-");
		JButton btMul = new JButton("*");
		JButton btDiv = new JButton("/");
		
		
		add(pane2);
		
		setSize(500,600);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new CalculatorHw();
		
	}

}
