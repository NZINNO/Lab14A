// Shape2Triangle.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape2Triangle implements Shape
{
   public void drawShape(Graphics g)
   {
     Polygon triangle = new Polygon();
     triangle.addPoint(610,60);
     triangle.addPoint(500,26);
     triangle.addPoint(700,260);
     g.setColor(Color.black);
     g.fillPolygon(triangle);
   }
}
