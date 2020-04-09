package com.herbst.shapes;

import java.awt.Color;
import java.awt.Graphics;

import com.herbst.Shape;

public class Triangle extends Shape {

	private static int SIDES = 3;
	private static int vertex1 = 0;
	private static int vertex2 = 1;
	private static int vertex3 = 2;
	private int[] xVerticies = new int[SIDES];
	private int[] yVerticies = new int[SIDES];

	public Triangle(int x, int y, int height, int width, Color color) {

		setX(x);
		setY(y);
		setColor(color);
		setWidth(0);
		setHeight(0);

	}

	public void paint(Graphics g) {
		coordinatesToVerticies();
		Color previousColor = g.getColor();
		g.setColor(this.getColor());
		g.fillPolygon(xVerticies, yVerticies, SIDES);
		g.setColor(previousColor);
	}

	public void coordinatesToVerticies() {
		xVerticies[vertex1] = this.getX();
		xVerticies[vertex2] = this.getX() + this.getWidth() / 2;
		xVerticies[vertex3] = this.getX() + this.getWidth();

		yVerticies[vertex1] = this.getY() + this.getHeight();
		yVerticies[vertex2] = this.getY();
		yVerticies[vertex3] = this.getY() + this.getHeight();
	}

}