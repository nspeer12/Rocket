import java.awt.Color;

import blobz.BlobGUI;
import blobz.SandBox;
import blobz.SandBoxMode;

public class RocketTest implements BlobGUI{

	
	
	static SandBox sandbox;
	//static int y = (Sandbox) sandbox.getPanelHeight();
	
	
	public RocketTest()
	{
		sandbox = new SandBox(Color.BLACK);
		sandbox.init((BlobGUI) this);
		sandbox.setSandBoxMode(SandBoxMode.FLOW);
		sandbox.setFrameRate(15);
		
	}
	
	public static void main(String[] args) {
		
		new RocketTest();
		
	}
	

	
	public void generate()
	{	
		
		Rocket rocket = new Rocket(1,1);
		
		int y = (int) sandbox.getPanelBounds().getHeight() / 2;
		int x = (int) sandbox.getPanelBounds().getWidth() / 2;
		//y = y/2;
		rocket.setLoc(x , y);
		//rocket.setColor(Color.red);
		System.out.println(rocket.report());
		sandbox.addBlob(rocket);
	}

}
