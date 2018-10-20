import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;

import blobz.BlobAction;
import blobz.PolyBlob;

public class Rocket extends PolyBlob implements BlobAction {
	
	Point[] p = {
			
			new Point(-2,0),
			new Point(-5, -5),
			new Point(0, -2),
			new Point(0, -10),
			new Point(5, -2),
			new Point(15, 0),
			new Point(5, 2),
			new Point(0, 10),
			new Point(0, 2),
			new Point(-5, 5),
			/* triangle
			new Point(-10, -10),
			new Point(10, 0),
			new Point(-10, 10),
			*/
			/*
			new Point(0, 0),
			new Point(-10, -25),
			
			new Point(-20, -35),
			new Point(-20, -45),
			new Point(-10, -35),
			
			new Point(10, -35),
			new Point(20, -45),
			new Point(20, -35),
			
			
			new Point(10, -25)
			*/
			
			
		
			
	};
	
	//private double angle = 0.0;
	//private final double delta = 0.15;
	//private final double speed = 5.0;
	
	public Rocket(int x, int y)
	{
		super(x, y, 0);
		super.setPolygon(p);
		this.setColor(Color.red);
		
	}
	private double pi = 3.14159;
	private double angle = 0;
	private double speed = 5;
	private double x = 0;
	private double y = 0;
	
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

		int key = e.getKeyCode();
		
		// when left arrow is pressed
		if(key == 37)
		{
			angle +=  .5;
		}


		
		// when right arrow is pressed
		if(key == 39)
		{
			angle -= .5;	
		}


		
		// adjust angles and velocity before up arrow is pressed
		// this allows for user to chose angle, then accelerate
		angle %= 2 * pi;
		this.setAngle(angle);
		y = 1 + (speed * Math.sin(angle));
		x = 1 + (speed * Math.cos(angle));
		
		
		// when up arrow is pressed
		if(key == 38)
		{
			// only set delta after up arrow is pressed
			this.setDelta((int) x, (int) y);
		}
		


			
		System.out.println(this.report());

			
			
			
	}
	
}
