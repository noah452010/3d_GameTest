package demo;

public class Player {
	// raycasting does not need a 3rd vector for position,
	// Z vector used here is rotation of player.
	
	private double x;
	
	private double y;

	private double z;
	
	// x rotation and y rotation are generally called pitch and yaw, pitch is looking up and down, yaw is looking left and right.

	private double pitch;

	private double yaw;

	// this makes player information returnable. it's kind of ass
	
	public Player(double x, double y, double z, double pitch, double yaw) {
		this.x = x;
		this.y = y;
		this.z = z;
		this.pitch = pitch;
		this.yaw = yaw;
	}

	// Lots of getter and setter methods, these may or may not save us time later

	public double getX() { return this.x; }
	public double getY() { return this.y; }
	public double getZ() { return this.z; }
	public double getPitch() { return this.pitch; }
	public double getYaw() { return this.yaw; }
	
	public void setPos(double newX, double newY, double newZ) {
		this.x = newX;
        this.y = newY;
        this.z = newZ;
	}

	public void setPitch(double newPitch) {
		// You cant look so far up that you look behind you
		if (newPitch < -90.0) { this.pitch = -90.0; }
        else if (newPitch > 90.0) { this.pitch = 90.0; }
        else { this.pitch = newPitch; }
	}

	public void setYaw(double newYaw) {
		// Keeps the right left looking between 0 and 359.9999999999999999999999 degrees
		this.yaw = (newYaw % 360.0 + 360.0) % 360.0;
	}
}
