// Shape.java
// Lab14a
// This is the student starting version.

import java.awt.*;

public abstract interface Shape
{
	public abstract void drawShape(Graphics g);
		Shape 1 = new Shape1Square();
		Shape 2 = new Shape2Triangle();
		Shape 3 = new Shape3Octagon();
		Shape 4 = new Shape4Circle();
			Shape 1.drawShape(g);
			Shape 2.drawShape(g);
			Shape 3.drawShape(g);
			Shape 4.drawShape(g);
	// public abstract void displayName(Graphics g);

	// public abstract void displayNumSides(Graphics g);
}
