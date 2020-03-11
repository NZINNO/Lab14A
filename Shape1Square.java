// Shape1Square.java
// Lab14a
// Student starting version

import java.awt.*;

public class Shape1Square implements Shape
{
   public void drawShape(Graphics g)
   {
     g.setColor(Color.black);
     g.fillRect(100,100,200,200);
   }
}
