package com.herbst;

import java.awt.Graphics;

//maybe create new package for all shapes
public class Rectangle extends Shape {
	
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Rectangle(int x,int y) {
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

	public void draw(Graphics g) {
		g.drawRect(x, y, 200, 200);
	}
			//change to x, y , width and height
			
		
		// TODO Auto-generated method stub

//	public void paint(Graphics g) {
//		// TODO Auto-generated method stub
//		g.drawRect(x, y, 200, 200);
//	}


		
	}

