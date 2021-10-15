package uri1002;

public class Circle {
	
	final double Pi = 3.14159;
	private double radius;

	public void setRadius(double radius) {
		
		this.radius = radius;
	}

	public double getArea() {
		
		return Pi * Math.pow(this.radius, 2);
	}
}
