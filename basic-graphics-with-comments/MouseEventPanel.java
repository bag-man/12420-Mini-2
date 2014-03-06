/**
 * The object of this class is used to collect mouse clicks and also to display circles
 * where the mouse has been clicked
 * It refers to a Collection of Circles called voc (that is the Model)
 */

import java.awt.*;
import javax.swing.*;
public class MouseEventPanel extends JPanel {
	private VectorOfCircles voc;
	private double r = 6.0;

	public MouseEventPanel() {
		voc = new VectorOfCircles();
		this.setBackground(Color.white);
		this.setPreferredSize(new Dimension(300,300));
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		voc.drawAll(g);
	}

	public void addCircle(int x, int y) {
		voc.addCircle(new Circle(x,y,r));
		repaint();
	}

	public void removeNearestCircle(int x, int y) {
		voc.removeNearestCircle(x,y);
		repaint();
	}

	public int getNoOfCircles() {
		return(voc.getNoOfCircles());
	}

	public Circle findNearestCircle(int x, int y) {
	  return null;
	} 
}



