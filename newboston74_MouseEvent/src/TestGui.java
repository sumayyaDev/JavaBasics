import javax.swing.JFrame;

public class TestGui {

	public static void main(String[] args) {
		Gui mouseEventObj = new Gui();
		mouseEventObj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mouseEventObj.setSize(600, 400);
		mouseEventObj.setVisible(true);

	}

}
