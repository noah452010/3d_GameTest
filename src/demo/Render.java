package demo;

import javax.swing.JFrame;

public class Render {
	
	
	public Render() {
	
	JFrame frame = new JFrame("window");
	// I set to 1000 and 800 for match the fov of 100 and the vertical fov of 80. You can scale it but dont change the 5 to 4 ratio. (500, 400 or 600, 480))
	frame.setSize(1000, 800);
	frame.setLocation(400, 10);
	frame.setTitle("3D Demo");
	frame.setVisible(true);
	
	}	

	public static void r_init() {
		

	}

}
