package Lab9;

import java.applet.Applet;
import java.awt.*;

public class domik extends Applet{
	 public void paint(final Graphics g)
     {
		 g.setColor(Color.BLUE);
         g.drawLine(150, 300, 330, 300);
         g.drawLine(150, 300, 150, 200);
         g.drawLine(330, 300, 330, 200);
         g.drawLine(120, 200, 360, 200);
         g.drawLine(240, 100, 360, 200);
         g.drawLine(240, 100, 120, 200);
     }
}
