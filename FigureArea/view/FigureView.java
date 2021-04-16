package by.htp.less14.view;

import java.util.ArrayList;

import by.htp.less14.figures.Figure;

public class FigureView {

	public void printTotalArea(ArrayList<Figure> figureCollection) {
		double totalArea = 0;
		for (Figure fig : figureCollection) {
			double figArea = fig.getArea();
			System.out.println(fig.getName() + "   " + figArea);
			totalArea = totalArea + figArea;
		}
		System.out.println("Total Area: " + totalArea);
	}
}
