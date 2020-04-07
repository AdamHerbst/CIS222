package com.herbst;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Shape {

	private int x;
	private int y;
	private int width;
	private int height;
	private Color color;

//	private String size;
	public abstract void paint(Graphics g);

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public void Rectangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

}
