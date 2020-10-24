import javax.swing.*;
import java.awt.*;

public class FlowLayoutEX extends JFrame {
	public FlowLayoutEX() {
		setTitle("FlowLayout Sample");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		
		c.setLayout(new FlowLayout(FlowLayout.LEFT,30,20));
		c.add(new JButton("add"));
		c.add(new JButton("div"));
		c.add(new JButton("Calculate"));
		c.add(new JButton("mul"));
		c.add(new JButton("sub"));
		
		setSize(300,200);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutEX();

	}

}
