package com.herbst.shapes;

import java.awt.Color;
import java.awt.Graphics;

import com.herbst.Shape;

public class Line extends Shape {

	public Line(int x, int y, Color color) {
		setX(x);
		setY(y);
		setColor(color);
		setWidth(0);
		setHeight(0);

	}

	public void paint(Graphics g) {
		g.setColor(this.getColor());
		g.drawLine(this.getX(), this.getY(), this.getWidth(), this.getHeight());
	}

}
