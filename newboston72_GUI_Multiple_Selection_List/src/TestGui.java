import javax.swing.JFrame;

public class TestGui {

	public static void main(String[] args) {
		
		Gui guiObject = new Gui();
		guiObject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiObject.setSize(300, 200);
		guiObject.setVisible(true);
	}

}
