import javax.swing.*;

public class SimpleFrame extends JFrame {

	SimpleFrame() {
		this.setSize(200,200);
		this.setLocation(200,200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void showIt() {
		this.setVisible(true);
	}

	public void showIt(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}


	public void showIt(String title,int x,int y) {
		this.setTitle(title);
		this.setLocation(x,y);
		this.setVisible(true);
	}

	public void hideIt() {
		this.setVisible(false);
	}

}



