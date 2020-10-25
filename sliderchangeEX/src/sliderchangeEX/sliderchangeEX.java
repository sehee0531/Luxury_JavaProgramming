package sliderchangeEX;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class sliderchangeEX extends JFrame {
	private JLabel colorLabel;
	private JSlider[] sl =new JSlider[3];
	public sliderchangeEX() {
		
		setTitle("슬라이더와 ChangeEvent 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		colorLabel = new JLabel("Slider Example");
		
		for(int i=0;i<sl.length;i++) {
			sl[i]=new JSlider(JSlider.HORIZONTAL,0,255,128);
			sl[i].setPaintLabels(true);
			sl[i].setPaintTicks(true);
			sl[i].setPaintTrack(true);
			sl[i].setMajorTickSpacing(50);
			sl[i].setMinorTickSpacing(10);
			
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
