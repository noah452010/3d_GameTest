public class Rect extends GameObject {
    private double width;
    private double height;
    private double depth;
    private double pitch;
    private double yaw;
    public Rect(double x, double y, double z, double width, double height, double depth, double pitch, double yaw) {
        super(x, y, z);
        this.width = width;
        this.height = height;
        this.depth = depth;
        this.pitch = pitch;
        this.yaw = yaw;
    }
}