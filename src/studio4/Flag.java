package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		Color color1 = new Color(0, 0, 0);
		StdDraw.setPenColor(color1);
		StdDraw.filledRectangle(0.5, 0.5, 1, .3);
		Color color2 = new Color(255, 255, 255);
		StdDraw.setPenColor(color2);
		double[] x = { 0.1, 0.2, 0.3, 0.2 };
		double[] y = { 0.3, 0.4, 0.3, 0.2 };
		StdDraw.filledPolygon(x, y);
		Color color3 = new Color(186, 64, 87);
		StdDraw.setPenColor(color3);
		double[] a = { 0.6, 0.7, 0.8, 0.7 };
		double[] b = { 0.7, 0.8, 0.7, 0.6 };
		StdDraw.filledPolygon(a, b); 
		Color color4 = new Color(255, 255, 255);
		StdDraw.setPenColor(color4);
		StdDraw.filledRectangle(0.5, 0.5, 1, .1);
		   
		
	}
}