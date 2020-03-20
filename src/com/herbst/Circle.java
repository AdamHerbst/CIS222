package com.herbst;

import java.awt.Graphics;

public class Circle extends Shape {
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Circle(int x,int y) {
		this.x = x;
		this.y=y;
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
	public void draw() {
		
	}



	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawOval(100, 100, 200, 200);
	}

}
