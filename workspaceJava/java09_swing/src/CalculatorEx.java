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
	Font fnt = new Font("돋움", Font.BOLD, 25);
	//
	JTextField tf = new JTextField("0.0");
	
	JPanel allBtnPane = new JPanel(new BorderLayout());
		JPanel northPane = new JPanel(new GridLayout(1,3));
		JPanel centerPane = new JPanel(new GridLayout(4,4));
	//버튼 목록
	String btnStr[] = {"Backspace", "Clear", "End", 
						"7", "8", "9", "+",
						"4", "5", "6", "-",
						"1", "2", "3", "*",
						"0", ".", "=", "/"};
	///////////////////////////////////////////////////////////////////////////////
	double result; //실수저장(연산결과 값)
	String operator; //연산자저장

	
	public CalculatorEx() {
		setTitle("계산기");
		add(BorderLayout.NORTH, tf);//텍스트필드 레이아웃 북쪽에 위치 셋팅
		tf.setHorizontalAlignment(JTextField.RIGHT);//텍스트 필드 오른쪽정렬(setHorizontalAlignment:수평정렬)
		tf.setFont(fnt);//폰트설정
		
		
		add(allBtnPane);
		allBtnPane.add(BorderLayout.NORTH, northPane);
		allBtnPane.add(BorderLayout.CENTER, centerPane);
		/////////////////////////////////////////////////////////////////////////레잉아웃
		//버튼을 JPanel추가
		for(int i=0; i<btnStr.length; i++) {
			JButton btn = new JButton(btnStr[i]);
			btn.setFont(fnt);
			btn.setBackground(Color.LIGHT_GRAY);//버튼 배경색
			if(i<=2) {
				northPane.add(btn);
			}else {
				centerPane.add(btn);
			}
			//버튼들을 이벤트 등록
			btn.addActionListener(this);
		}
		
		
		
		
		
		setSize(500,350);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}
	//interface ActionListener -> 이벤트 등록 -> 오버라이딩 
	public void actionPerformed(ActionEvent ae) {
		JButton event = (JButton)ae.getSource();
		String btnLbl = event.getText();
		
		switch(event.getText()) {
			case "End" : //프로그램 종료
				System.exit(0);
				break;
			case "0" : case "1" : case "2" : case "3": case "4" : 
			case "5": case "6" : case "7" : case "8" : case "9" : 
				inNumber(btnLbl);//숫자버튼입력 메소드
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
	//+, -, *, / 연산자를 선택 하였을때 
	public void setResultOperator(String btnLbl) {
		double second = Double.parseDouble(tf.getText());	//입력했던 숫자
		if(operator==null) {//처음으로 연산자 선택
			result = second;//tf의 값을 보관
		}else {
			//이미 연산자가 있으면 보관된 값과 tf의 값을 계산하여 result에 보관
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
		operator = btnLbl; //연산자 보관		
		tf.setText(""); //tf의 값을 초기화한다
	}
	//초기화
	public void setClear() {
		result = 0.0;
		operator = null;
		tf.setText("0.0");
		
	}
	
	// = 연산자가 선택되면 result, operator, tf값을 계산.
	public void setResult() {
		double num2 = Double.parseDouble(tf.getText());
		switch(operator) {
		case "+" : result += num2; break;
		case "-" : result -= num2; break;
		case "*" : result *= num2; break;
		case "/" : result /= num2; break;
		}
		//결과를 tf에 보여주기
		tf.setText(String.valueOf(result));
		operator = null;// 초기화
		
	}
	
	//소숫점 버튼이 선택되었을때
	public void setPoint() {
		String str = tf.getText();
		int idx = str.indexOf(".");	//.가 있으면 index위치 구해줌, 없으면 -1을 반환
		
		if(idx==-1){
			tf.setText(str+".");
		}
		
	}
	
	//Backspace버튼 선택되었을때
	public void setBackspace() {
		String str = tf.getText();				//4564
		int len = str.length();					//4글자
		String cutStr = str.substring(0, len-1); //456
		tf.setText(cutStr);
	}
	
	//숫자버튼 선택되었을때
	public void inNumber(String btnLbl) {
		String tfTxt = tf.getText(); //tf텍스트를 가져온다
		if(tfTxt.equals("0.0")) {//초기값 0.0일때는 방금 이벤트가 발생한 버튼의 값을 셋팅
			tf.setText(btnLbl);
		}else {
			tf.setText(tfTxt+btnLbl);
		}
	}
	
	public static void main(String[] args) {
		new CalculatorEx();

	}

}
