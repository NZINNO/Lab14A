// Shape3Octagon.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape3Octagon implements Shape
{
   public void drawShape(Graphics g)
   {
     Polygon octagon = new Polygon();
     octagon.addPoint(185,320);
     octagon.addPoint(235,320);
     octagon.addPoint(275,350);
     octagon.addPoint(275,400);
     octagon.addPoint(235,430);
     octagon.addPoint(185,430);
     octagon.addPoint(145,400);
     octagon.addPoint(145,350);
     g.setColor(Color.black);
     g.fillPolygon(octagon);
   }
}
