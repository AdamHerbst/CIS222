package com.herbst;

import javax.swing.JFrame;

public class MainFrame extends JFrame {
//mainframe is jframe

	private PaintPanel paintPanel;

	public MainFrame() {
		setSize(800, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		paintPanel = new PaintPanel();

		add(paintPanel);
	}

}
