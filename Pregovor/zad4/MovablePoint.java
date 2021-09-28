package zad4;

public class MovablePoint implements Movable {
	int x;
	int y;
	int xSpeed;
	int ySpeed;
	
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public String toString() {
		return "(" + x + "," + y + "),speed=(" + xSpeed + "," + ySpeed + ")";
	}

	public void moveUp() {
		// TODO Auto-generated method stub
		y++;

	}

	public void moveDown() {
		// TODO Auto-generated method stub
		y--;

	}

	public void moveLeft() {
		// TODO Auto-generated method stub
		x--;

	}

	public void moveRight() {
		// TODO Auto-generated method stub
		x++;

	}

}
