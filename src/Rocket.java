import java.awt.Color;
import java.awt.Point;
import java.awt.event.KeyEvent;

import blobz.BlobAction;
import blobz.PolyBlob;

public class Rocket extends PolyBlob implements BlobAction{
	
	Point[] p = {
			
			new Point(0, 0),
			new Point(-10, -25),
			
			new Point(-20, -35),
			new Point(-20, -45),
			new Point(-10, -35),
			
			new Point(10, -35),
			new Point(20, -45),
			new Point(20, -35),
			
			
			new Point(10, -25),
			
			
		
			
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
	private double angle = -3/4 * pi;
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
				
				// locations
					// x = x + (int) Math.round(speed * Math.cos(angle));
		//			// x = x + (int) Math.round(speed * Math.cos(angle));
		///x = x + (int) Math.round(speed * Math.cos(angle));
		//y = y + (int) Math.round(speed * Math.cos(angle));
		int key = e.getKeyCode();
		
		if(key == 37)
		{
			angle +=  .5;
			
			this.setColor(Color.red);
			
			System.out.println("left arrow");
			
		}

		
		
		if(key == 39)
		{
			angle -= .5;

			this.setColor(Color.green);

			System.out.println("right arrow");	
		}

		angle %= 2 * pi;
		x = 1 + (-1 * speed * Math.sin(angle));
		y = 1 + ( speed * Math.cos(angle));
		
		if(key == 38)
		{
			System.out.println("x = " + x);
			System.out.println("y = " + y);
			
			this.setColor(Color.blue);
			
			System.out.println("up arrow");
			this.setDelta((int) x, (int) y);
			
		}
		


			

			System.out.println("x = " + x);
			System.out.println("y = " + y);
			
			this.setAngle(angle);
			
	}
	
}
