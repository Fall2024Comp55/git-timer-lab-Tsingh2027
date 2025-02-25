import javax.swing.Timer;

import acm.graphics.*;
import acm.program.*;

public class MyFirstTimer extends GraphicsProgram implements ActionListener {
	public static final int PROGRAM_HEIGHT = 600;
	public static final int PROGRAM_WIDTH = 800;
	public static final int MAX_STEPS = 20;
	private GLabel myLabel;
	private Timer timer;

	public void init() {
		setSize(PROGRAM_WIDTH, PROGRAM_HEIGHT);
		requestFocus();
	}
	
	public void run() {
		myLabel = new GLabel("# of times called?", 0, 100);
		add(myLabel);
		timer = new Timer(1000, this);
		timer.setInitialDelay(3000);
		timer.start();
		
	}
	public void actionPerformed(ActionEvent e) {
		numTimes++;
		
		myLabel.move(5, 0);
		myLabel.setLabel("Times called: "+ numTimes);
		if(numTimes >= 10) {
			timer.stop();
			return;
		}
	}
	public static void main(String[] args) {
		new MyFirstTimer().start();
	}
}