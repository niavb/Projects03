package zad4;

public class MovableCircle implements Movable {
	private int radius;
	private MovablePoint center;
	
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.center.x = x;
		this.center.xSpeed = xSpeed;
		this.center.y = y;
		this.center.ySpeed = ySpeed;
		this.radius = radius;
	}
	
	public String toString() {
		return "";
	}

}
