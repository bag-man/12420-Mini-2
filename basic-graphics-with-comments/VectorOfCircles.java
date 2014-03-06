import java.awt.*;
import java.util.*;
/**
 * This is the collection of Circles - it is the Model in this problem
 * this should be done with Vectors which are threadsafe - more later
 */
public class VectorOfCircles {
	private Vector<Circle> circles;

	public VectorOfCircles() {
		circles = new Vector<Circle>();
	}

	public void addCircle(Circle c) {
		circles.add(c);
	}

	public void removeNearestCircle(int x, int y) {
		Circle c;
		double minDist = Double.MAX_VALUE;
		int minDistIndex = -1;

		for(int i=0; i < circles.size(); i++) {
			c = (Circle)(circles.get(i));
			if(c.distanceTo(x,y) < minDist) {
				minDist = c.distanceTo(x,y);
				minDistIndex = i;
			}
		}
		if((minDistIndex >= 0) && (minDist < 30)) {
			circles.remove(minDistIndex);
		}
	}

	public void drawAll(Graphics g) {
		Circle currentCircle;

		for(int i=0; i < circles.size(); i++) {
			currentCircle = (Circle)(circles.get(i));
			currentCircle.draw(g);
		}
	}

	public int getNoOfCircles() {
		return(circles.size());
	}
}
