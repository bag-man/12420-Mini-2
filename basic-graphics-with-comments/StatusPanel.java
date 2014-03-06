/**
 * This panel just displays info on Mouse clicks and position
 */
import java.awt.*;
import javax.swing.*;
public class StatusPanel extends JPanel {
	private JLabel posText = new JLabel("position:");
	private JLabel xCoord = new JLabel("0",JLabel.RIGHT);
	private JLabel yCoord = new JLabel("0",JLabel.RIGHT);
	private JLabel countsText = new JLabel("no. of clicks");
	private JLabel counts = new JLabel("0",JLabel.RIGHT);
	private JLabel dummy1 = new JLabel();
	private JLabel circleText = new JLabel("no. of circles");
	private JLabel noOfCirc = new JLabel("0",JLabel.RIGHT);
	private JLabel dummy2 = new JLabel();
	private JLabel inOutText = new JLabel("mouse is in comp.");
	private JLabel inOut = new JLabel("no",JLabel.RIGHT);
	private JLabel dummy3 = new JLabel();

	private int clickCount = 0;
	public StatusPanel() {
		this.setLayout(new GridLayout(4,3));
		this.add(posText);
		this.add(xCoord);
		this.add(yCoord);
		this.add(countsText);
		this.add(counts);
		this.add(dummy1);
		this.add(circleText);
		this.add(noOfCirc);
		this.add(dummy2);
		this.add(inOutText);
		this.add(inOut);
		this.add(dummy3);
	}

	public void setCoordinates(int x,int y) {
		xCoord.setText(Integer.toString(x));
		yCoord.setText(Integer.toString(y));
	}

	public void setInOut(String s) {
		inOut.setText(s);
	}

	public void incrementClickCount() {
		clickCount++;
		counts.setText(Integer.toString(clickCount));
	}

	public void setNoOfCircles(int n) {
		noOfCirc.setText(Integer.toString(n));
	}
}



