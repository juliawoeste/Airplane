import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class DrawingPanel extends JPanel implements MouseListener{
	private Airplane ap1, ap2;
	private AnimationTimer timer;
	private LeaderAirPlane leaderap;
    private Holder holder; 
    
	
	public DrawingPanel(Holder holder) {
		super();
		this.holder = holder;
		this.setSize(800,800);
		this.setPreferredSize(new Dimension(800,800));
		this.setBackground(Color.white);
		leaderap = new LeaderAirPlane(300,200, this.getWidth(), this.getHeight());
		
		ap1 = new Airplane(100,100, leaderap);
		
		ap2 = new Airplane(100,300, leaderap);
		
		
		timer = new AnimationTimer(this);
		timer.start();
		
		this.addMouseListener(this);
		
		
	}
	
	public void move() {
		leaderap.move(5,0);
		ap1.move();
		ap2.move();
		
		repaint();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D brush = (Graphics2D)g;
		ap1.paint(brush);
		ap2.paint(brush);
		leaderap.paint(brush);
		
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		if (ap1.contains(e.getPoint()) )
			ap1.setBehavior(holder.getButtonPressed());
	
		if(ap2.contains(e.getPoint()))
			ap2.setBehavior(holder.getButtonPressed());
		
		if(leaderap.contains(e.getPoint()))
			leaderap.setBehavior(holder.getButtonPressed());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public Airplane getAirplane1() {
		return ap1;
	}
	
	public Airplane getAirplane2() {
		return ap2;
	}
	
	public LeaderAirPlane getLeaderap() {
		return leaderap;
	}

}
