package com.herbst.shapes;

import java.awt.Color;
import java.awt.Graphics;

import com.herbst.Shape;

//maybe create new package for all shapes
public class Triangle extends Shape {
	
	public Triangle(int x, int y, Color color) {
		setX(x);
		setY(y);
		setColor(color);
		setWidth(0);
		setHeight(0);
		
	}

public void paint(Graphics g)  {
	g.setColor(getColor());
	//g.fillPolygon(10, 20, 30);
	//g.fillPolygon(arg0, arg1, arg2);
}


}