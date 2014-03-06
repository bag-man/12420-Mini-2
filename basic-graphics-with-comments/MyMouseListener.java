/**
 * Listens to Mouse clicks 
 * updates status panel and then also the Mousepanel with new circles (and removals)
 */
import java.awt.event.*;
import javax.swing.*;
public class MyMouseListener implements MouseListener {
	//needs to be linked in so can update these panels (is also listening to mousePane)
	private StatusPanel statusPane;
	private MouseEventPanel mousePane;
	
	public MyMouseListener(StatusPanel sp,MouseEventPanel mp) {
		statusPane = sp;
		mousePane = mp;
	}

	public void mouseEntered(MouseEvent e) {
		statusPane.setInOut("yes");
	}

	public void mouseExited(MouseEvent e) {
		statusPane.setInOut("no");
		statusPane.setCoordinates(-1,-1);
	}

	public void mouseClicked(MouseEvent e) {
		statusPane.incrementClickCount();
		if(SwingUtilities.isLeftMouseButton(e)) {
			mousePane.addCircle(e.getX(),e.getY());
		}
		else {
			mousePane.removeNearestCircle(e.getX(),e.getY());
		}
		statusPane.setNoOfCircles(mousePane.getNoOfCircles());
	}

	public void mousePressed(MouseEvent e) {	
	}

	public void mouseReleased(MouseEvent e) {	
	}

}



