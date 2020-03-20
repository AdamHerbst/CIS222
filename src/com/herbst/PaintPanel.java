package com.herbst;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class PaintPanel extends JPanel {
	
	private ArrayList<Shape> rectangles;

	public PaintPanel() {
		rectangles = new ArrayList<Shape>();
		rectangles.add(new Rectangle(100,100));
		rectangles.add(new Rectangle(400,200));
		
		circles = new ArrayList<Shape>();
		circles.add(new Circle(200,300));
		circles.add(new Circle(400,30));
	}
	
	private ArrayList<Shape> circles;

	public void PaintPanel1() {
		circles = new ArrayList<Shape>();
		circles.add(new Circle(300,200));
		circles.add(new Circle(200,200));
	}

	// Called automatically
	protected void paintComponent(Graphics g) {
		for (Shape rectangle : rectangles) {
		// built in - draws a square
		rectangle.draw(g);
		}
		for (Shape circle : circles) {
		// built in - draws a square
		circle.draw(g);
		}
	}
//	public static void drawComp(Shape s) {
//		s.draw();
//	}
//		@Override
//		protected void paintComponent(Graphics g1) {
//		for (Shape circle : circles) {
//		// built in - draws a square
//		circle.paint(g1);
//		}
//		// instead of redoing the code over and over - create a "shapes" class
//
//	}
	

	
	}


