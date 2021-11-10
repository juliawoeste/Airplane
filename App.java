import java.awt.BorderLayout;

import javax.swing.JFrame;
public class App extends JFrame {
	private Holder holder;
	public App() {
        super("Airplane Demo");
        holder = new Holder();
		this.setLayout(new BorderLayout());
		this.setSize(800,800);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		DrawingPanel panel = new DrawingPanel(holder);
		this.add(panel, BorderLayout.CENTER);
		
	
		this.add(new Buttons(holder, panel.getLeaderap(), panel.getAirplane1(), panel.getAirplane2()), BorderLayout.SOUTH);
		
		pack();//resizes the frame to its content 

		this.setVisible(true);
		
		
	}
	
	public static void main(String[] args) {
		new App();
	}

}
