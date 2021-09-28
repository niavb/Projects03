package zad2;

public class MyLine {
	private MyPoint begin;
	private MyPoint end;
	
	public MyLine(int x1, int y1, int x2, int y2) {
		this.begin = new MyPoint(x1, y1);
		this.end = new MyPoint(x2, y2);
	}
	
	public MyLine(MyPoint begin, MyPoint end) {
		this.begin.setX(begin.getX());
		this.begin.setY(begin.getY());
		this.end.setX(begin.getX());
		this.end.setY(begin.getY());
	}
	
	public MyPoint getBegin() {
		return begin;
	}
	
	public void setBegin(MyPoint begin) {
		this.begin.setX(begin.getX());
		this.begin.setY(begin.getY());
	}
	
	public MyPoint getEnd() {
		return end;
	}
	
	public void setEnd(MyPoint end) {
		this.end.setX(end.getX());
		this.end.setY(end.getY());
	}
	
	public int getBeginX() {
		return begin.getX();
	}
	public void setBeginX(int x) {
		this.begin.setX(x);
	}
	
	public int getBeginY() {
		return begin.getY();
	}
	public void setBeginY(int y) {
		this.begin.setY(y);
	}
	
	public int getEndX() {
		return end.getX();
	}
	public void setEndX(int x) {
		this.end.setX(x);
	}
	
	public int getEndY() {
		return end.getY();
	}
	public void setEndY(int y) {
		this.end.setY(y);
	}
	
	public int[] getBeginXY() {
		int[] xy = new int[2];
		xy[0] = this.begin.getX();
		xy[1] = this.begin.getY();
		return xy;
	}
	
	public void setBeginXY(int x, int y) {
		this.begin.setX(x);
		this.begin.setY(y);
	}
	
	public int[] getEndXY() {
		int[] xy = new int[2];
		xy[0] = this.end.getX();
		xy[1] = this.end.getY();
		return xy;
	}
	
	public void setEndXY(int x, int y) {
		this.end.setX(x);
		this.end.setY(y);
	}
	
	public double getLenght() {
		return Math.sqrt(Math.pow((getBeginX()-getEndX()), 2) + Math.pow((getBeginY()-getEndY()), 2));
	}
	
	//????
	public double getGradient() {
		return Math.atan2(getBeginY()-getEndY(), getBeginX()-getEndX());
	}
	
	public String toString() {
		return "MyLine[begin=(" + getBeginX() + "," + getBeginY() + "),end=(" + getEndX() + "," + getEndY() + ")]";
	}
	
	

}
