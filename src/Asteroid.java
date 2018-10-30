//Author: Stephen Speer

import java.awt.Point;
import java.util.concurrent.ThreadLocalRandom;
import blobz.BlobUtils;
import blobz.PolyBlob;


public class Asteroid extends PolyBlob
{

	public Asteroid(int x, int y, double r)
	{

		super(-100, -100, r);
		super.setDelta(x, y);
		
		int sides = ThreadLocalRandom.current().nextInt(4, 10);
		double theta = 2 * 3.14159 / sides;
		double [] angle = new double[sides];
		System.out.println("sides " + sides);
		for(int i = 0; i < sides; i ++)
		{
			angle[i] = (i * theta) + (Math.random() * theta);
		}
		
		Point[] p = new Point[sides];

		//System.out.println(numAsteroids);
		for(int i = 0; i < sides; i ++)
		{
			int size = ThreadLocalRandom.current().nextInt(4, 16);
			p[i] = new Point(BlobUtils.rotatePoint(size, angle[i]));
		}
	}
}