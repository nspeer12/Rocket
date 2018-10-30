// Stephen Speer
// COP 3330, Fall 2018
// pid: 4103136
// nid: st525223

import java.awt.Color;
import java.awt.Point;
import blobz.PolyBlob;

public class Missile extends PolyBlob
{
	
	Point[] p = {
		new Point(0,0),
		new Point(5, 0),
		new Point(5, 1),
		new Point(0, 1),
		

	};
	

	
	public Missile(int x, int y)
	{
		// pass in coordinates of rocket
		super(x,y,0);
		super.setPolygon(p);
		//super.setDelta(x, y);
		super.setColor(Color.red);
		
	}
	
	

}