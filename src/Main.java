import java.awt.EventQueue;

public class Main {
	
	static public Window window = null;
	static public First first = null;
	public static BaboonCreator bc = new BaboonCreator();
	public static ChimpCreator cc = new ChimpCreator();
	public static OrangutanCreator oc = new OrangutanCreator();
	public static GorillaCreator gc = new GorillaCreator();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window = new Window();
					first = new First();
					first.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
