package by.htp.less14.figures;

public class Circle extends Figure {

	private static final String name = "Circle";
	static double pi = 3.14;
	private double radius;

	public Circle(double radius) {

		this.radius = radius;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getArea() {

		return (pi * Math.pow(radius, 2));
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}


	
	
	

}
