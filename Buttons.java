import javax.swing.JToggleButton;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JPanel;

public class Buttons extends JPanel {
	private JToggleButton button1, button2, button3;
	private JPanel panel;
	private LeaderAirPlane leaderplane;
	private Airplane planes;
	private Holder holder;
	
	public Buttons(Holder holder, LeaderAirPlane leaderplane,Airplane plane1, Airplane plane2) {
		this.leaderplane = leaderplane;
		this.holder = holder; 
		
		ButtonGroup bGroup = new ButtonGroup();

		JToggleButton button1 = new JToggleButton("Follow Leader");
		JToggleButton button2 = new JToggleButton("Move Randomly");
		JToggleButton button3 = new JToggleButton("Do Nothing");
		
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
					holder.setButtonPressed(2);
				
					// get plane to follow the leader 
				
				
			}
			
		});
		
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
					holder.setButtonPressed(3);
					// get plane to move randomly 
				
				
			}
			
		});
		
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
					holder.setButtonPressed(1);
					//get plane to pause
				
				
			}
			
		});
		
		bGroup.add(button1);
		bGroup.add(button2);
		bGroup.add(button3);
		button3.setSelected(true);//default
		
	    button1.setSize(50,50);
		button2.setSize(50,50);
		button3.setSize(50,50);
	
		
		this.add(button1);
		this.add(button2);
		this.add(button3);
		
}		
	}
	
