package com.herbst;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.herbst.shapes.Circle;
import com.herbst.shapes.Rectangle;

public class PaintPanel extends JPanel {
	private String shapeSelected = SHAPE_RECTANGLE;
	private ArrayList<Shape> shapes;

	public static final String SHAPE_RECTANGLE = "rectangle";
	public static final String SHAPE_CIRCLE = "circle";
	public static final String SHAPE_TRIANGLE = "triangle";
	
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
					if(shapeSelected.equals(SHAPE_RECTANGLE)) {
						drawingShape = new Rectangle(e.getX(), e.getY(), Color.BLUE);
					} else if(shapeSelected.equals(SHAPE_CIRCLE)) {
						drawingShape = new Circle(e.getX(), e.getY(), Color.BLUE);
					} else {
						drawingShape = new Rectangle(e.getX(), e.getY(), Color.BLUE);
					}
					
					addShape(drawingShape);
				} else {
					drawingShape.setWidth(e.getX() - drawingShape.getX());
					drawingShape.setHeight(e.getY() - drawingShape.getY());
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
		super.paintComponent(g);
		for (Shape shape : shapes) {
			shape.paint(g);
		}

	}

	public String getShapeSelected() {
		return shapeSelected;
	}

	public void setShapeSelected(String shapeSelected) {
		this.shapeSelected = shapeSelected;
	}
}
