import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

public class AnimationTimer extends Timer {
	private DrawingPanel dp;

	public AnimationTimer(DrawingPanel dp) {
		super(100,null);
		this.dp = dp;
		this.addActionListener(new MoveListener());
		
	}
	private class MoveListener implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			dp.move();
		}
	}
}
