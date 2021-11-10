import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.RectangularShape;

public abstract class ColorShape {
	
	//geom data
	private RectangularShape shape;
	//color , rotation angle, etc
	private Color fillColor, borderColor;
	
	public ColorShape(RectangularShape shape) {
		this.shape = shape;
	}
	//setters
	public void setLocation(double x, double y) {
		shape.setFrame(x, y, shape.getWidth(),shape.getHeight());
	}
	public void setSize(double w, double h) {
		shape.setFrame(shape.getX(),shape.getY(),w,h);
	}
	public void setFillColor(Color color) {
		this.fillColor = color;
	}
	public void setBorderColor(Color color) {
		this.borderColor = color;
	}
	public void setColor(Color color) {
		this.fillColor = color;
		this.borderColor = color;
	}
	//getters

	public double getX() {
		return shape.getX();
	}
	public double getY() {
		return shape.getY();
	}
	public Color getFillColor() {
		return fillColor;
	}
	public Color getBorderColor() {
		return borderColor;
	}
	
	public boolean contains(Point p) {
		return shape.contains(p); // if the point is inside shape return true else return flase
		
	}
	public void paint(Graphics2D brush) {
		brush.setColor(borderColor);
		brush.draw(shape);
		brush.setColor(fillColor);
		brush.fill(shape);
	}
	
}

