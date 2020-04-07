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

	private int x1, y1, x2, y2;

	public void setColors(int R, int G, int B) {
		this.R = R;
		this.G = G;
		this.B = B;
	}

	// private int colorSelected = COLOR_RED;
	public static final String SHAPE_RECTANGLE = "rectangle";
	public static final String SHAPE_CIRCLE = "circle";
	public static final String SHAPE_TRIANGLE = "triangle";
	public static final String SHAPE_LINE = "line";

	// Color red2 = new Color(155,0,0);
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
					if (shapeSelected.equals(SHAPE_RECTANGLE)) {
						drawingShape = new Rectangle(e.getX(), e.getY(), myColor);
					} else if (shapeSelected.equals(SHAPE_CIRCLE)) {
						drawingShape = new Circle(e.getX(), e.getY(), myColor);
					} else if (shapeSelected.equals(SHAPE_LINE)) {
						x2 = e.getX();
						y2 = e.getY();
						setX2Y2(x2, y2);
						// repaint();
						x1 = x2;
						y1 = y2;
						setX1Y1(x1, y1);
						drawingShape = new Line(getX1(), getY1(), getX2(), getY2(), myColor);
					} else {
						drawingShape = new Triangle(e.getX(), e.getY(), getHeight(), getWidth(), myColor);
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

	public void setX2Y2(int x2, int y2) {
		this.x2 = x2;
		this.y2 = y2;
	}

	public int getX2() {
		return x2;
	}

	public int getY2() {
		return y2;
	}

	public void setX1Y1(int x1, int y1) {
		this.x1 = x1;
		this.y1 = y1;
	}

	public int getX1() {
		return x1;
	}

	public int getY1() {
		return y1;
	}
}