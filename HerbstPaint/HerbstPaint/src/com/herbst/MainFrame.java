package com.herbst;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;

public class MainFrame extends JFrame{
//mainframe is jframe

	private PaintPanel paintPanel;
	private JTextField tf;

	public MainFrame() {
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		paintPanel = new PaintPanel();

		getContentPane().add(paintPanel);
		radioButtons();
		
	}
	

	public void radioButtons() {
	
	tf = new JTextField();
	paintPanel.add(tf);
	tf.setColumns(10);

	JRadioButton rdbtnTriangle = new JRadioButton("Triangle",false);
	paintPanel.add(rdbtnTriangle);
	JRadioButton rdbtnSquare = new JRadioButton("Square", true);
	paintPanel.add(rdbtnSquare);
	JRadioButton rdbtnCircle = new JRadioButton("Circle",false);
	paintPanel.add(rdbtnCircle);
	
	ButtonGroup Gshapes = new ButtonGroup();
	Gshapes.add(rdbtnTriangle);
	Gshapes.add(rdbtnSquare);
	Gshapes.add(rdbtnCircle);
	
	rdbtnTriangle.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	});
	rdbtnSquare.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			paintPanel.setShapeSelected(PaintPanel.SHAPE_RECTANGLE);
		}
		
	});
	rdbtnCircle.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			paintPanel.setShapeSelected(PaintPanel.SHAPE_CIRCLE);
			
		}
		
	});
	
	JSeparator separator = new JSeparator();
	paintPanel.add(separator);
	
	JRadioButton rdbtnGreen = new JRadioButton("Green",false);
	paintPanel.add(rdbtnGreen);
	JRadioButton rdbtnRed = new JRadioButton("Red", true);
	paintPanel.add(rdbtnRed);
	JRadioButton rdbtnBlue = new JRadioButton("Blue", false);
	paintPanel.add(rdbtnBlue);
	
	ButtonGroup Gcolors = new ButtonGroup();
	Gcolors.add(rdbtnGreen);
	Gcolors.add(rdbtnRed);
	Gcolors.add(rdbtnBlue);
	
	rdbtnGreen.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			if(rdbtnGreen.isSelected()) {
		//		PaintPanel.setColor(Color.GREEN);
			}
		}
		
	});
	rdbtnRed.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	});
	rdbtnBlue.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	});


	}
}

