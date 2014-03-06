/**
 * One circle with position and radius
 */  
import java.awt.*;
public class Circle {
	private double x;
	private double y;
	private double r;
	private Color color;

	public Circle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
		this.color = Color.BLUE;
	}

        public void update(double x, double y) {
          this.x = x;
          this.y = y;
        }

	public void draw(Graphics g) {
	        g.setColor(color); 
		g.fillOval((int)Math.round(x-r),(int)Math.round(y-r),
			(int)Math.round(2.0*r),(int)Math.round(2.0*r));
	}

	public double distanceTo(double x, double y) {
		return (Math.abs(this.x-x) + Math.abs(this.y-y));
	}


	public void setColor(Color c) {
	  color = c;
	}

}
