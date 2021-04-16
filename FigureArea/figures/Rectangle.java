package by.htp.less14.figures;

public class Rectangle extends Figure {

	private double length;
	private double width;
	private static final String name = "Rectangle";

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public double getArea() {
		return (width * length);
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
}
