package com.herbst;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

import com.herbst.shapes.Circle;
import com.herbst.shapes.Line;
import com.herbst.shapes.Rectangle;
import com.herbst.shapes.Triangle;

public class PaintPanel extends JPanel {
	private String shapeSelected = SHAPE_RECTANGLE;

	private ArrayList<Shape> shapes;

	public int R = 0;
	public int G = 0;
	public int B = 0;
	
public void setColors(int R, int G, int B) {
	this.R = R;
	this.G = G;
	this.B = B;
}

	//private int colorSelected = COLOR_RED;
	public static final String SHAPE_RECTANGLE = "rectangle";
	public static final String SHAPE_CIRCLE = "circle";
	public static final String SHAPE_TRIANGLE = "triangle";
	public static final String SHAPE_LINE = "line";

	//Color red2 = new Color(155,0,0);
	// private ArrayList<Shape> circles; only need 1 rectangle array

	Color myColor = new Color(R, G, B);
	public PaintPanel() {
		shapes = new ArrayList<Shape>();
		
		addMouseMotionListener(new MouseMotionListener() {
			private Shape drawingShape = null;

			@Override
			public void mouseMoved(MouseEvent e) {
				drawingShape = null;
			}

			@Override
			public void mouseDragged(MouseEvent e) {
				
				if (drawingShape == null) {
					if(shapeSelected.equals(SHAPE_RECTANGLE)) {
						drawingShape = new Rectangle(e.getX(), e.getY(), myColor);
					} else if(shapeSelected.equals(SHAPE_CIRCLE)) {
						drawingShape = new Circle(e.getX(), e.getY(), myColor);
					} else if(shapeSelected.equals(SHAPE_LINE)) {
						drawingShape = new Line(e.getX(), e.getY(), myColor);
					}
					else {
						drawingShape = new Triangle(e.getX(), e.getY(), myColor);
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