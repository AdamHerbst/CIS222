package com.herbst;

import com.herbst.shapes.Rectangle;

public class Main {

	public static void main(String[] args) {

		Rectangle rec = new Rectangle();
		MainFrame frame = new MainFrame();
		frame.setVisible(true);

		if (rec instanceof Shape) {
			System.out.println("rec is an instance of Shape");
		} else {
			System.out.println("rec is not an instance of Shape");
		}

		if (frame instanceof MainFrame) {
			System.out.println("frame is an instance of MainFrame");
		} else {
			System.out.println("frame is not an instance of MainFrame");
		}

	}

}
