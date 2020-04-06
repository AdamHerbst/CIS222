package com.herbst;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;

public class MainFrame extends JFrame {

	private PaintPanel paintPanel;

	private JLabel lblChooseColors;

	public MainFrame() {
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		paintPanel = new PaintPanel();

		getContentPane().add(paintPanel);
		getColors();

	}

	public void getColors() {

		JRadioButton rdbtnTriangle = new JRadioButton("Triangle", false);
		paintPanel.add(rdbtnTriangle);
		JRadioButton rdbtnSquare = new JRadioButton("Square", true);
		paintPanel.add(rdbtnSquare);
		JRadioButton rdbtnCircle = new JRadioButton("Circle", false);
		paintPanel.add(rdbtnCircle);

		ButtonGroup Gshapes = new ButtonGroup();
		Gshapes.add(rdbtnTriangle);
		Gshapes.add(rdbtnSquare);
		Gshapes.add(rdbtnCircle);

		rdbtnTriangle.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				paintPanel.setShapeSelected(PaintPanel.SHAPE_TRIANGLE);
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

		lblChooseColors = new JLabel("Choose color#'s");
		paintPanel.add(lblChooseColors);

		JFormattedTextField frmtdtxtfldRed = new JFormattedTextField();
		frmtdtxtfldRed.setText("Red");
		paintPanel.add(frmtdtxtfldRed);

		JFormattedTextField frmtdtxtfldGreen = new JFormattedTextField();
		frmtdtxtfldGreen.setText("Green");
		paintPanel.add(frmtdtxtfldGreen);

		JFormattedTextField frmtdtxtfldBlue = new JFormattedTextField();
		frmtdtxtfldBlue.setText("Blue");
		paintPanel.add(frmtdtxtfldBlue);

		JButton btnGo = new JButton("GO!");

		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				paintPanel.myColor = new Color(Integer.parseInt(frmtdtxtfldRed.getText()),
						Integer.parseInt(frmtdtxtfldGreen.getText()), Integer.parseInt(frmtdtxtfldBlue.getText()));
			}
		});
		paintPanel.add(btnGo);

	}

}
