import java.awt.Color;

import blobz.BlobGUI;
import blobz.SandBox;
import blobz.SandBoxMode;

public class RocketTest implements BlobGUI{

	
	
	static SandBox sandbox;
	
	
	
	public RocketTest()
	{
		sandbox = new SandBox(Color.BLACK);
		sandbox.init((BlobGUI) this);
		sandbox.setSandBoxMode(SandBoxMode.FLOW);
		sandbox.setFrameRate(100);
		
		
		
	}
	
	public static void main(String[] args) {
		
		new RocketTest();
	}
	

	
	public void generate()
	{	
		
		Rocket rocket = new Rocket(1,1);
		
		// int width = sandbox.getPanelBounds().width;
		// int height = sandbox.getPanelBounds().height;
		
		rocket.setLoc(100 , 200);
		//rocket.setColor(Color.red);
		System.out.println(rocket.report());
		sandbox.addBlob(rocket);
	}

}
