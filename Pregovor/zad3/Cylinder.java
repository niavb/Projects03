package zad3;

public class Cylinder extends Circle {
	private double height = 1.0;
	
	public Cylinder() {
		
	}
	
	public Cylinder(double radius) {
		this.setRadius(radius);
	}
	
	public Cylinder(double radius, double height) {
		this.setRadius(radius);
		this.setHeight(height);
	}
	
	public Cylinder(double radius, double height, String color) {
		this.setRadius(radius);
		this.setHeight(height);
		this.setColor(color);
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return Math.PI*getRadius()*2*getHeight();
	}

}
