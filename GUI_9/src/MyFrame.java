import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame{
	public MyFrame() {
		setTitle("ContentPane°ú JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setSize(300,150);
		
		Container contentPane=getContentPane();
		contentPane.setBackground(Color.ORANGE);
		contentPane.setLayout(new FlowLayout());
		
		
		contentPane.add(new JButton("Ok"));
		contentPane.add(new JButton("Cancel"));
		contentPane.add(new JButton("Ignore"));
			
	}
	public static void main(String[]args) {
		new MyFrame();
	}
}