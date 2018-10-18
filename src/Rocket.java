import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;

import blobz.BlobAction;
import blobz.PolyBlob;

public class Rocket extends PolyBlob implements BlobAction{
	
	Point[] p = {
			new Point(0,0),
			new Point(5,-10),
			new Point(15,0),
			new Point(0,15),
			new Point(-15,0),
			new Point(-5,-10),
			
	};
	
	private double angle = 0.0;
	private final double delta = 0.15;
	private final double speed = 5.0;
	
	public Rocket(int x, int y)
	{
		super(x, y, 0);
		super.setPolygon(p);
		this.setColor(Color.red);
		
	}
	
	
	
	@Override
	public void keyAction(KeyEvent e) {
		// left arrow, 37, rotate left
		// right arrow, 39, rotate right
		// up arrow,  38, move forward
		// down arrow, not implemented
		
		// right rotation
			// add to delta
			// if angle over 2pi, subtract 2pi (mod?)
			// turn with setAngle()
		
		// left rotation
			// subtract from delta
			// if less than 0, add 2pi
			// turn with setAngle()
		
		// locations
			// x = x + (int) Math.round(speed * Math.cos(angle));
			// x = x + (int) Math.round(speed * Math.cos(angle));
	}
}
