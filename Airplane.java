import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Airplane {
	private ColorRoundedRectangle body, wing1, wing2, window1, window2, window3;
	private LeaderAirPlane leaderap;
	private int x, y, behavior; // 1 is nothing 2 is follow 3 is random
	private double dpWidth;
	
	
	public Airplane(int x, int y, LeaderAirPlane leaderap) {
		super();
		body = new ColorRoundedRectangle(Color.BLUE);
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
		
		this.leaderap = leaderap;
		
		this.setLocation(x,y);
	}
	

	public void move() {
		//according to the value of behavior check is leader is not null
		if (behavior == 2 && leaderap != null) {
			this.setLocation( x + leaderap.getDX(), y + leaderap.getDY());
		
			//displacement of leader plane and get half of that and add to the location
			//get location of the leader and move according to that location 
		}
		if(behavior == 3 ) {
			this.setLocation(x + (int)(10* Math.random()), y +(int)(10* Math.random()));
			
		}
		
	}


	public void setLocation(int x, int y) {
		
		body.setLocation(x, y);
		wing1.setLocation(x+ 64, y- 50);
		wing2.setLocation(x+ 64, y + 30);
		window1.setLocation(x + 100, y + 20);
		window2.setLocation(x + 140, y + 20);
		window3.setLocation(x + 180, y + 20);
		this.x = x;
		this.y = y;
	}
	
	public void setBehavior(int behavior) {
		this.behavior = behavior;
	}
	
	public boolean contains(Point p) {
		return (body.contains(p) || wing1.contains(p) || wing2.contains(p) || window1.contains(p) || window2.contains(p) || window2.contains(p));
	}
	
	public void paint(Graphics2D brush) {
		body.paint(brush);
		wing1.paint(brush);
		wing2.paint(brush);
		window1.paint(brush);
		window2.paint(brush);
		window3.paint(brush);
	}

}
