package demo;

public class Player {
		

	// raycasting does not need a 3rd vector for position,
	// Z vector used here is rotation of player.
	
	public static float x_pos;
	
	public static float y_pos;
	
	public static float y_rot;

	// this makes player information returnable. it's ass
	
	public Player(float x, float y, float z) {
		this.x_pos = x;
		this.y_pos = y;
		this.y_pos = z;
		
	}

}
