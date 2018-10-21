// Stephen Speer
// COP 3330, Fall 2018
// pid: 4103136
// nid: st525223

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
		sandbox.setFrameRate(15);
	}
	
	public static void main(String[] args) 
	{
		new RocketTest();
	}
	
	public void generate()
	{	
		// find center of GUI
		int y = (int) sandbox.getPanelBounds().getHeight() / 2;
		int x = (int) sandbox.getPanelBounds().getWidth() / 2;
		Rocket rocket = new Rocket(x,y);
		
		sandbox.addBlob(rocket);
	}
}
