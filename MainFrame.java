package com.herbst;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
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
		paintPanel.setLayout(null);

		JRadioButton rdbtnTriangle = new JRadioButton("Triangle", false);
		rdbtnTriangle.setBounds(120, 6, 83, 23);
		paintPanel.add(rdbtnTriangle);
		JRadioButton rdbtnSquare = new JRadioButton("Square", true);
		rdbtnSquare.setBounds(207, 6, 76, 23);
		paintPanel.add(rdbtnSquare);
		JRadioButton rdbtnCircle = new JRadioButton("Circle", false);
		rdbtnCircle.setBounds(287, 6, 64, 23);
		paintPanel.add(rdbtnCircle);
		JRadioButton rdbtnLine = new JRadioButton("Line", false);
		rdbtnLine.setBounds(52, 6, 64, 23);
		paintPanel.add(rdbtnLine);
		

		ButtonGroup Gshapes = new ButtonGroup();
		Gshapes.add(rdbtnTriangle);
		Gshapes.add(rdbtnSquare);
		Gshapes.add(rdbtnCircle);
		Gshapes.add(rdbtnLine);

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
		rdbtnLine.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				paintPanel.setShapeSelected(PaintPanel.SHAPE_LINE);

			}

		});

		JSeparator separator = new JSeparator();
		separator.setBounds(395, 16, 0, 2);
		paintPanel.add(separator);

		lblChooseColors = new JLabel("Choose color#'s");
		lblChooseColors.setBounds(375, 10, 114, 15);
		paintPanel.add(lblChooseColors);

		JFormattedTextField txtRed = new JFormattedTextField();
		txtRed.setBounds(519, 8, 47, 19);
		txtRed.setText("0");
		paintPanel.add(txtRed);

		JFormattedTextField txtGreen = new JFormattedTextField();
		txtGreen.setBounds(578, 8, 43, 19);
		txtGreen.setText("0");
		paintPanel.add(txtGreen);

		JFormattedTextField txtBlue = new JFormattedTextField();
		txtBlue.setBounds(633, 8, 52, 19);
		txtBlue.setText("0");
		paintPanel.add(txtBlue);



		JButton btnGo = new JButton("Go!");
		btnGo.setBounds(697, 5, 58, 25);
		btnGo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int intRedValue = Integer.parseInt(txtRed.getText());
				int intGreenValue = Integer.parseInt(txtGreen.getText());
				int intBlueValue = Integer.parseInt(txtBlue.getText());
				
				if(intRedValue >= 0 && intRedValue <= 255) {
				paintPanel.myColor = new Color(intRedValue, intGreenValue, intBlueValue);
				}
				else {
					 JOptionPane.showMessageDialog(paintPanel, "Must be between 0 and 255");
				}

				
			}
		});
		paintPanel.add(btnGo);
		


	}
};
