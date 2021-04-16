package by.htp.less14.figures;

public class Triangle extends Figure {

	private double foundation;
	private double height;
	private static final String name = "Triangle";

	public Triangle(double foundation, double height) {

		this.foundation = foundation;
		this.height = height;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getArea() {

		return ((foundation * height) / 2);
	}

	public double getFoundation() {
		return foundation;
	}

	public void setFoundation(double foundation) {
		this.foundation = foundation;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}
