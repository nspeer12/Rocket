// Stephen Speer
// COP 3330, Fall 2018
// pid: 4103136
// nid: st525223

import java.awt.Color;
import java.util.concurrent.ThreadLocalRandom;
import blobz.BlobGUI;
import blobz.SandBox;
import blobz.SandBoxMode;

public class RocketTest implements BlobGUI{

	SandBox sandbox;
	Integer numAsteroids;
	public RocketTest(int input)
	{
		numAsteroids = input;
		sandbox = new SandBox(Color.BLACK);
		sandbox.init((BlobGUI) this);
		sandbox.setSandBoxMode(SandBoxMode.FLOW);
		sandbox.setFrameRate(15);
	}
	
	public static void main(String[] args) 
	{
		new RocketTest(Integer.parseInt(args[0]));
	
	}
	
	public void generate()
	{	
		// find center of GUI
		int y = (int) sandbox.getPanelBounds().getHeight() / 2;
		int x = (int) sandbox.getPanelBounds().getWidth() / 2;
		Rocket rocket = new Rocket(x,y, sandbox);
		
		sandbox.addBlob(rocket);
		
		// asteroids
		Asteroid[] roids = new Asteroid[numAsteroids];
		
		for(int i = 0; i < numAsteroids; i++)
		{
			// get new Asteroid by passing return values of velocity() and setRate()
			roids[i] = new Asteroid(velocity(), velocity(), setRate());
			// set random color
			roids[i].setColor(new Color(getColor(), getColor(), getColor()));
			sandbox.addBlob(roids[i]);
		}
	}



	private static double setRate()
	{
		// outsourced from generate()
		// must randomly choose a rotation value of either -.1 or .1
		boolean randomBool = ThreadLocalRandom.current().nextBoolean();
		return (randomBool) ? .1 : -.1;
	}
	
	private static int velocity()
	{
		// outsourced from generate()
		// get random positive int between 1 and 3
		int randomNum = ThreadLocalRandom.current().nextInt(1,4);
		// get random boolean
		boolean randomBool = ThreadLocalRandom.current().nextBoolean();
		// if bool, return positive int, else return random
		return randomBool ? randomNum : -randomNum;
	}
	
	private static int getColor()
	{
		return ThreadLocalRandom.current().nextInt(0,255);
	}
}
