import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class LeaderAirPlane {
	private ColorRoundedRectangle body, wing1, wing2, window1, window2, window3;
	private int x, y;
	private int dpWidth, dpHeight;
	private LeaderAirPlane leaderap; 
	private double leaderX, leaderY;
	private int behavior;
	private int dx, dy;
	public LeaderAirPlane(int x, int y, int dpWidth, int dpHeight) {
		
		body = new ColorRoundedRectangle(Color.GREEN);
		wing1 = new ColorRoundedRectangle(Color.BLACK);
		wing2 = new ColorRoundedRectangle(Color.BLACK);
		window1 = new ColorRoundedRectangle(Color.BLACK);
		window2 = new ColorRoundedRectangle(Color.BLACK);
		window3 = new ColorRoundedRectangle(Color.BLACK);
		
		body.setSize(250, 45);
		wing1.setSize(20, 60);
		wing2.setSize(20, 60);
		
		window1.setSize(20, 20);
		window2.setSize(20, 20);
		window3.setSize(20, 20);
		
		this.dpWidth = dpWidth;
		this.dpHeight = dpHeight;
		
		this.setLocation(x,y);
	}



	public void setLocation(double x, double y) {
		double newX = (x) % dpWidth;
		double newY = (y) % dpWidth;
		
		
		leaderX = newX;
		leaderY = newY;
		
		body.setLocation(newX, newY);
		wing1.setLocation(newX + 64, newY- 50);
		wing2.setLocation(newX + 64, newY + 30);
		window1.setLocation(newX + 100, newY + 20);
		window2.setLocation(newX + 140, newY + 20);
		window3.setLocation(newX + 180, newY + 20);
		this.x = (int) newX;
		this.y = (int) newY;
	}
	
	public void paint(Graphics2D brush) {
		body.paint(brush);
		wing1.paint(brush);
		wing2.paint(brush);
		window1.paint(brush);
		window2.paint(brush);
		window3.paint(brush);
	}
	
	public void setBehavior(int behavior) {
		this.behavior = behavior;
	}
	
	public void move(int dx, int dy) {
		this.setLocation(leaderX + dx, leaderY + dy);
		this.dx = dx;
		this.dy = dy;
		
	}
	
	public int getDX() {
		return dx;
	}
	public int getDY() {
		return dy;
	}
	
	public int getXLocation() {
		return x;
	}
	
	public int getYLocation() {
		return y;
	}
	
	public boolean contains(Point p) {
		return (body.contains(p) || wing1.contains(p) || wing2.contains(p) || window1.contains(p) || window2.contains(p) || window2.contains(p));
	}

	

}
