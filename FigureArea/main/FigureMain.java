package by.htp.less14.main;

import java.util.ArrayList;
import by.htp.less14.figures.Circle;
import by.htp.less14.figures.Figure;
import by.htp.less14.figures.Rectangle;
import by.htp.less14.figures.Triangle;
import by.htp.less14.view.FigureView;

public class FigureMain {

	public static void main(String[] args) {

		ArrayList<Figure> figureCollection = new ArrayList<Figure>();

		Rectangle rectangle = new Rectangle(5.2, 8.3);
		Circle circle = new Circle(3.5);
		Triangle triangle = new Triangle(7.2, 3.3);

		figureCollection.add(triangle);
		figureCollection.add(circle);
		figureCollection.add(rectangle);

		FigureView view = new FigureView();
		view.printTotalArea(figureCollection);
	}
}
