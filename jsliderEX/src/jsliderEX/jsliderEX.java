package jsliderEX;
import javax.swing.*;
import java.awt.*;

public class jsliderEX extends JFrame {
	public jsliderEX() {
		setTitle("�����̴� ����� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL,0,200,100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		c.add(slider);
		setSize(300,100);
		setVisible(true);
	}
		
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new jsliderEX();
	}

}