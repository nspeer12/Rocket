// Stephen Speer
// COP 3330, Fall 2018
// pid: 4103136
// nid: st525223

import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;
import blobz.BlobAction;
import blobz.PolyBlob;

public class Rocket extends PolyBlob implements BlobAction {
	
	// set shape of rocket
	Point[] p = {
			new Point(-2,0),
			new Point(-5, -5),
			new Point(0, -2),
			new Point(0, -10),
			new Point(5, -2),
			new Point(10, 0),
			new Point(5, 2),
			new Point(0, 10),
			new Point(0, 2),
			new Point(-5, 5),

	};

	private final double pi = 3.14159;
	private double angle = 0;
	private double delta = 0.15;
	private double speed = 5;
	private double x = 0;
	private double y = 0;
	
	public Rocket(int x, int y)
	{
		super(x, y, 0);
		super.setPolygon(p);
		this.setColor(Color.orange);
	}
	
	public void keyAction(KeyEvent e) {
		
		// capture input and store as int
		int key = e.getKeyCode();
		
		// when right arrow is pressed
		if(key == 39)
		{
			angle +=  delta;
		}

		// when left arrow is pressed
		if(key == 37)
		{
			angle -= delta;	
		}

		// adjust angles and velocity before up arrow is pressed
		// this allows for user to chose angle, then accelerate
		angle %= 2 * pi;
		this.setAngle(angle);
		
		// set x and y delta using newly calculated angle
		y = 1 + (speed * Math.sin(angle));
		x = 1 + (speed * Math.cos(angle));
		
		// when up arrow is pressed
		if(key == 38)
		{
			// using setDelta will make the rocket seem like it's floating through space
			// this.setDelta((int) x, (int) y);
			
			// add current locations to previously calculated velocities
			x += this.getLoc().getX();
			y += this.getLoc().getY();
			this.setLoc((int) x, (int) y);
		}
	}
}
