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
	
	public Rocket(int x, int y)
	{
		super(x, y, 0);
		super.setPolygon(p);
	}
	
	
	
	@Override
	public void keyAction(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
