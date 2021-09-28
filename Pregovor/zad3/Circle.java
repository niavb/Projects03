package zad3;

public class Circle {
	private double radius = 0.1;
	private String color = "red";
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.setRadius(radius);
	}
	
	public Circle(double radius, String color) {
		this.setRadius(radius);
		this.setColor(color);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return Math.PI*radius*radius;
	}
	
	public String toString() {
		return "Circle[radius=" + getRadius() + ",color=" + getColor() + "]";
	}

}
