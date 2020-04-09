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

	public static int R;
	public static int G;
	public static int B;

	public static final String SHAPE_RECTANGLE = "rectangle";
	public static final String SHAPE_CIRCLE = "circle";
	public static final String SHAPE_TRIANGLE = "triangle";
	public static final String SHAPE_LINE = "line";

	Color shapeColor = new Color(R, G, B);

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
						drawingShape = new Rectangle(e.getX(), e.getY(), shapeColor);
					} else if (shapeSelected.equals(SHAPE_CIRCLE)) {
						drawingShape = new Circle(e.getX(), e.getY(), shapeColor);
					} else if (shapeSelected.equals(SHAPE_LINE)) {
						drawingShape = new Line(e.getX(), e.getY(), shapeColor);
					} else {
						drawingShape = new Triangle(e.getX(), e.getY(), getHeight(), getWidth(), shapeColor);
					}

					addShape(drawingShape);
				} else {
					drawingShape.setWidth(e.getX() - drawingShape.getX());
					drawingShape.setHeight(e.getY() - drawingShape.getY());
					repaint();
				}
			}
		});
	}

	private void addShape(Shape shape) {
		shapes.add(shape);
		repaint();
	}

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