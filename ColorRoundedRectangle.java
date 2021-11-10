import java.awt.Color;
import java.awt.geom.RectangularShape;

public class ColorRoundedRectangle extends ColorShape {
	


	public ColorRoundedRectangle(Color color) {
		super(new java.awt.geom.RoundRectangle2D.Double(0,0,0,0, 17, 17));
		this.setColor(color);
		// TODO Auto-generated constructor stub
	}

	
}
