import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorEx extends JFrame implements ActionListener{
	Font fnt = new Font("����", Font.BOLD, 25);
	//
	JTextField tf = new JTextField("0.0");
	
	JPanel allBtnPane = new JPanel(new BorderLayout());
		JPanel northPane = new JPanel(new GridLayout(1,3));
		JPanel centerPane = new JPanel(new GridLayout(4,4));
	//��ư ���
	String btnStr[] = {"Backspace", "Clear", "End", 
						"7", "8", "9", "+",
						"4", "5", "6", "-",
						"1", "2", "3", "*",
						"0", ".", "=", "/"};
	///////////////////////////////////////////////////////////////////////////////
	double result; //�Ǽ�����(������ ��)
	String operator; //����������

	
	public CalculatorEx() {
		setTitle("����");
		add(BorderLayout.NORTH, tf);//�ؽ�Ʈ�ʵ� ���̾ƿ� ���ʿ� ��ġ ����
		tf.setHorizontalAlignment(JTextField.RIGHT);//�ؽ�Ʈ �ʵ� ����������(setHorizontalAlignment:��������)
		tf.setFont(fnt);//��Ʈ����
		
		
		add(allBtnPane);
		allBtnPane.add(BorderLayout.NORTH, northPane);
		allBtnPane.add(BorderLayout.CENTER, centerPane);
		/////////////////////////////////////////////////////////////////////////���׾ƿ�
		//��ư�� JPanel�߰�
		for(int i=0; i<btnStr.length; i++) {
			JButton btn = new JButton(btnStr[i]);
			btn.setFont(fnt);
			btn.setBackground(Color.LIGHT_GRAY);//��ư ����
			if(i<=2) {
				northPane.add(btn);
			}else {
				centerPane.add(btn);
			}
			//��ư���� �̺�Ʈ ���
			btn.addActionListener(this);
		}
		
		
		
		
		
		setSize(500,350);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	//interface ActionListener -> �̺�Ʈ ��� -> �������̵� 
	public void actionPerformed(ActionEvent ae) {
		JButton event = (JButton)ae.getSource();
		String btnLbl = event.getText();
		
		switch(event.getText()) {
			case "End" : //���α׷� ����
				System.exit(0);
				break;
			case "0" : case "1" : case "2" : case "3": case "4" : 
			case "5": case "6" : case "7" : case "8" : case "9" : 
				inNumber(btnLbl);//���ڹ�ư�Է� �޼ҵ�
				break;
			case "Backspace" :
				setBackspace();
				break;
			case "." :
				setPoint();
				break;
			case "+" : case "-" : case "*" : case "/":
				setResultOperator(btnLbl);
				break;
			case "=" :
				setResult();
			
				
		}
	}
	//+, -, *, / �����ڸ� ���� �Ͽ����� 
	public void setResultOperator(String btnLbl) {
		double second = Double.parseDouble(tf.getText());	//�Է��ߴ� ����
		if(operator==null) {//ó������ ������ ����
			result = second;//tf�� ���� ����
		}else {
			//�̹� �����ڰ� ������ ������ ���� tf�� ���� ����Ͽ� result�� ����
			switch (operator) {
			case "+" : 
				result += second; 
				break;
			case "-" :
				result -= second;
				break;
			case "*" : 
				result *= second;
				break;
			case "/" :
				result /= second;
				break;
			case "Clear" : 
				setClear();
				
			}

		}
		operator = btnLbl; //������ ����		
		tf.setText(""); //tf�� ���� �ʱ�ȭ�Ѵ�
	}
	//�ʱ�ȭ
	public void setClear() {
		result = 0.0;
		operator = null;
		tf.setText("0.0");
		
	}
	
	// = �����ڰ� ���õǸ� result, operator, tf���� ���.
	public void setResult() {
		double num2 = Double.parseDouble(tf.getText());
		switch(operator) {
		case "+" : result += num2; break;
		case "-" : result -= num2; break;
		case "*" : result *= num2; break;
		case "/" : result /= num2; break;
		}
		//����� tf�� �����ֱ�
		tf.setText(String.valueOf(result));
		operator = null;// �ʱ�ȭ
		
	}
	
	//�Ҽ��� ��ư�� ���õǾ�����
	public void setPoint() {
		String str = tf.getText();
		int idx = str.indexOf(".");	//.�� ������ index��ġ ������, ������ -1�� ��ȯ
		
		if(idx==-1){
			tf.setText(str+".");
		}
		
	}
	
	//Backspace��ư ���õǾ�����
	public void setBackspace() {
		String str = tf.getText();				//4564
		int len = str.length();					//4����
		String cutStr = str.substring(0, len-1); //456
		tf.setText(cutStr);
	}
	
	//���ڹ�ư ���õǾ�����
	public void inNumber(String btnLbl) {
		String tfTxt = tf.getText(); //tf�ؽ�Ʈ�� �����´�
		if(tfTxt.equals("0.0")) {//�ʱⰪ 0.0�϶��� ��� �̺�Ʈ�� �߻��� ��ư�� ���� ����
			tf.setText(btnLbl);
		}else {
			tf.setText(tfTxt+btnLbl);
		}
	}
	
	public static void main(String[] args) {
		new CalculatorEx();

	}

}
