import javax.swing.*;
import java.awt.*;

public class Java9_7 extends JFrame {
	public Java9_7() {
		setTitle("계산기 프레임");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.add(new topPanel(),BorderLayout.NORTH);
		c.add(new middlePanel(),BorderLayout.CENTER);
		c.add(new bottomPanel(),BorderLayout.SOUTH);
		setSize(300,200);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Java9_7();
	}

}
class topPanel extends JPanel{
	public topPanel() {
		setBackground(Color.gray);
		add(new JLabel("수식입력"));
		add(new JTextField(16));
	}
	
}
class middlePanel extends JPanel {
	public middlePanel(){
		String btnName[]= {"0","1","2","3","4","5","6","7","8","9","CE","계산","+","-","x","/"};
		setLayout(new GridLayout(4,4,2,2));
		for(int i=0;i<16;i++) {
			JButton btn=new JButton(btnName[i]);
			if(i>11) {
				setBackground(Color.BLUE);
			}
			add(btn);
		}
	}
}
class bottomPanel extends JPanel {
	public bottomPanel() {
		setBackground(Color.yellow);
		add(new JLabel("계산결과"));
		add(new JTextField(16));
		
	
}
}