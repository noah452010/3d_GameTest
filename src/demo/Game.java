package demo;

public class Game {

	public static void game() {
		// this is where all the player, and game objects are,
		// instantiated.
		Player cat = new Player(0.0, 0.0, 0.0, 0.0, 0.0);
		
		Rect wall = new Rect(2.0, 1.0, 1.0, 1.0, 1.0, 0.1, 0.0, 0.0);
	}

}
