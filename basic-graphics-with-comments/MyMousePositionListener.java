/**
 * Listens to Mouse Moves and updates status panel (so needs link to it)
 * In mini assignment will have to implement mouseDragged() and will need link to mouse panel
 */
import java.awt.event.*;
public class MyMousePositionListener implements MouseMotionListener {
	private StatusPanel statusPane;
	private MouseEventPanel mousePane;

	public MyMousePositionListener(StatusPanel sp, MouseEventPanel mp) {
		statusPane = sp;
		mousePane = mp;
	}

	public void mouseMoved(MouseEvent e) {
		statusPane.setCoordinates(e.getX(),e.getY());
	}

	public void mouseDragged(MouseEvent e) {		
          Circle thisOne=mousePane.findNearestCircle(e.getX(),e.getY()); 
	}
}



