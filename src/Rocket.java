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
	
	//private double angle = 0.0;
	//private final double delta = 0.15;
	//private final double speed = 5.0;
	
	public Rocket(int x, int y)
	{
		super(x, y, 0);
		super.setPolygon(p);
		this.setColor(Color.red);
		
	}
	double pi = 3.14159;
	double angle = -3/4 * pi;
	double speed = .3;
	double x = 0;
	double y = 0;
	
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
		//			// x = x + (int) Math.round(speed * Math.cos(angle));
		///x = x + (int) Math.round(speed * Math.cos(angle));
		//y = y + (int) Math.round(speed * Math.cos(angle));
		int key = e.getKeyCode();
		
		if(key == 37)
		{
			angle +=  1;
			angle %= 6;
			//angle %= 2 *3.14159;
			this.setColor(Color.red);
			this.setAngle(angle);
			System.out.println("left arrow");
		}

		
		
		if(key == 39)
		{
			angle -= 1;
			angle %= 6;
			//angle %= 2 *3.14159;
			this.setColor(Color.green);
			this.setAngle(angle);
			System.out.println("right arrow");	
		}

		
		if(key == 38)
		{
			
			x -= 1 + (speed * Math.cos(angle));
			System.out.println("x = " + x);
			y -= (speed * Math.cos(angle));
			System.out.println("y = " + y);
			this.setColor(Color.blue);
			System.out.println("up arrow");
		}
		
		if(key == 40)
		{
			System.out.println("down arrow");
			x += (speed * Math.cos(angle));
			System.out.println("x = " + x);
			y += (speed * Math.cos(angle));
			System.out.println("y = " + y);
		}
			System.out.println("down arrow");
			
			x += Math.round(speed * Math.cos(angle));
			System.out.println("x = " + x);
			y += Math.round(speed * Math.cos(angle));
			System.out.println("y = " + y);
			this.setDelta((int) x, (int) y);
	}
	
}
