package com.herbst.shapes;

import java.awt.Color;
import java.awt.Graphics;

import com.herbst.Shape;

public class Rectangle extends Shape {

	public Rectangle(int x, int y, Color color) {
		setX(x);
		setY(y);
		setColor(color);
		setWidth(0);
		setHeight(0);

	}

	public Rectangle() {

	}

	public void paint(Graphics g) {
		g.setColor(this.getColor());
		g.fillRect(this.getX(), this.getY(), this.getWidth(), this.getHeight());
	}
}
