import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.geom.Rectangle2D;

public class MyCanvas extends JComponent {
	public void paint(Graphics g) {
		g.drawRect(10,  10,  200,  200);
		g.setColor(Color.RED);
		g.fillRect(35, 45, 75, 95);;
	
	}
	
}