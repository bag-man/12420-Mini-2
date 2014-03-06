/**
 * One circle with position and radius
 */  
import java.awt.*;
public class Circle {
	private double x;
	private double y;
	private double r;

	public Circle(double x, double y, double r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}

        public void update(double x, double y) {
          this.x = x;
          this.y = y;
        }

	public void draw(Graphics g) {
		g.fillOval((int)Math.round(x-r),(int)Math.round(y-r),
			(int)Math.round(2.0*r),(int)Math.round(2.0*r));
	}

	public double distanceTo(double x, double y) {
		return (Math.abs(this.x-x) + Math.abs(this.y-y));
	}

	g.setColor(color);
        g.fillOval((int)Math.round(x-r),(int)Math.round(y-r),
          (int)Math.round(2.0*r),(int)Math.round(2.0*r));
}
