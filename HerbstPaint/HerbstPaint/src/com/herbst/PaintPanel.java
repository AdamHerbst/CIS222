package com.herbst;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.herbst.shapes.Rectangle;

public class PaintPanel extends JPanel {

	private ArrayList<Shape> shapes;
	// private ArrayList<Shape> circles; only need 1 rectangle array

	public PaintPanel() {
		shapes = new ArrayList<Shape>();

	
		addMouseMotionListener(new MouseMotionListener() {
				private Shape drawingShape = null;
			
			@Override
			public void mouseMoved(MouseEvent e) {
				drawingShape = null;
			}
//				System.out.println("mouse Released" + e.getX() + ", " + e.getY());
//				drawingShape = new Rectangle(e.getX(), e.getY(), Color.Black);
//				addShape(drawingShape);
			
			@Override
				public void mouseDragged(MouseEvent e) {
					if (drawingShape == null) {
					drawingShape = new Rectangle(e.getX(), e.getY(), Color.BLUE); 
					addShape(drawingShape);
					}
					else {
						drawingShape.setWidth(e.getX() - drawingShape.getX());
						drawingShape.setHeight (e.getY() - drawingShape.getY());
						repaint();
					}
//					 System.out.println("mouse Released" + e.getX() + ", " + e.getY(), Color.BLACK);
//					drawingShape = new Rectangle(e.getX(), e.getY(), Color.Black);
//					addShape(drawingShape);
			}
		});
	}

//	
//		shapes.add(new Rectangle(100, 100, Color.black));
//		shapes.add(new Rectangle(400, 200, new Color(1,0,1)));
//
//		shapes.add(new Circle(200, 300));
//		shapes.add(new Circle(400, 30));

	

	private void addShape(Shape shape) {
		shapes.add(shape);
		repaint();
	}

	// Called automatically
	@Override
	protected void paintComponent(Graphics g) {
		for (Shape shape : shapes) {
			shape.paint(g);
		}

	}
}

