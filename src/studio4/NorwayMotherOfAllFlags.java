package studio4;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;
import support.cse131.DialogBoxes;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class NorwayMotherOfAllFlags {
	private static void mother() {
		StdDraw.clear();
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledRectangle(3, 3, 3, 3);
		StdDraw.filledRectangle(3, 13, 3, 3);
		StdDraw.filledRectangle(16, 3, 6, 3);
		StdDraw.filledRectangle(16, 13, 6, 3);
		StdDraw.setPenColor(0, 0, 127);
		StdDraw.filledRectangle(11, 8, 11, 1);
		StdDraw.filledRectangle(8, 8, 1, 8);
	}

	public static void norway() {
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		mother();
	}

	public static void france() {

		//
		StdDraw.clear();
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(11/3.0, 8, 11/3.0, 8);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(11, 8, 11/3.0, 8);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(55/3.0, 8, 11/3.0, 8);

	}
	public static void vietnam() {
		StdDraw.setXscale(0, 30);
		StdDraw.setYscale(0, 20);
		StdDraw.setPenColor(218, 37, 29);
		StdDraw.filledRectangle(15, 10, 15, 10);
		StdDraw.setPenColor(255, 255, 0);
		double[] x = {9.29, 15, 20.71, 18.53, 11.47};
		double[] y = {8.15, 4, 8.15, 14.85, 14.85};
		StdDraw.filledPolygon(x, y);
		
		



	}


	public static void indonesia() {

		// TODO
	}

	public static void netherlands() {

		// TODO
	}

	public static void poland() {

		// TODO
	}

	public static void thailand() {

		// TODO
	}

	public static void finland() {

		// TODO
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			int canvasHeight = 512;
			int canvasWidth = 22 * canvasHeight / 16;
			StdDraw.setCanvasSize(canvasWidth, canvasHeight);
			Object[] options = { "Continue", "Exit" };
			while (true) {
				norway();
				if (DialogBoxes.askUser("Continue to Flag of France?", "Current: Norway", JOptionPane.QUESTION_MESSAGE,
						options)) {
					france();
					if (DialogBoxes.askUser("Continue to Flag of Vietnam?", "Current: France",
							JOptionPane.QUESTION_MESSAGE, options)) {
						vietnam();
						if (DialogBoxes.askUser("Continue to Flag of Indonesia?", "Current: France",
								JOptionPane.QUESTION_MESSAGE, options)) {
							indonesia();
							if (DialogBoxes.askUser("Continue to Flag of Netherlands?", "Current: Indonesia",
									JOptionPane.QUESTION_MESSAGE, options)) {
								netherlands();
								if (DialogBoxes.askUser("Continue to Flag of Poland?", "Current: Netherlands",
										JOptionPane.QUESTION_MESSAGE, options)) {
									poland();
									if (DialogBoxes.askUser("Continue to Flag of Thailand?", "Current: Poland",
											JOptionPane.QUESTION_MESSAGE, options)) {
										thailand();
										if (DialogBoxes.askUser("Continue to Flag of Finland?", "Current: Thailand",
												JOptionPane.QUESTION_MESSAGE, options)) {
											finland();
											if (DialogBoxes.askUser("Exit?", "Current: Finland")) {
												// pass
											} else {
												continue;
											}
										}
									}
								}
							}
						}
					}
				}
				System.exit(0);
			}
		});
	}
}
