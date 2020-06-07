import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class First {

	public JFrame frame;
	public String name;
	public int capacity;
	public static ZooBuilder zooBuilder ;
	private JTextField textFieldName;
	private JTextField textFieldCapacity;
	JCheckBox checkBoxRand;

	/**
	 * Create the application.
	 */
	public First() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u0421\u043E\u0437\u0434\u0430\u043D\u0438\u0435 \u0437\u043E\u043E\u043F\u0430\u0440\u043A\u0430");
		label.setBounds(147, 11, 152, 14);
		frame.getContentPane().add(label);
		
		textFieldName = new JTextField();
		textFieldName.setText("\u0412\u0435\u0441\u0435\u043B\u044C\u0435");
		textFieldName.setBounds(165, 48, 86, 20);
		frame.getContentPane().add(textFieldName);
		textFieldName.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u041D\u0430\u0437\u0432\u0430\u043D\u0438\u0435:");
		lblNewLabel.setBounds(10, 51, 111, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0412\u043C\u0435\u0441\u0442\u0438\u043C\u043E\u0441\u0442\u044C:");
		label_1.setBounds(10, 114, 140, 14);
		frame.getContentPane().add(label_1);
		
		textFieldCapacity = new JTextField();
		textFieldCapacity.setText("10");
		textFieldCapacity.setBounds(165, 111, 86, 20);
		frame.getContentPane().add(textFieldCapacity);
		textFieldCapacity.setColumns(10);
		
		checkBoxRand = new JCheckBox("\u0417\u0430\u043F\u043E\u043B\u043D\u0438\u0442\u044C \u0441\u043B\u0443\u0447\u0430\u0439\u043D\u044B\u043C\u0438 \u043E\u0431\u0435\u0437\u044C\u044F\u043D\u0430\u043C\u0438");
		checkBoxRand.setBounds(23, 164, 246, 23);
		frame.getContentPane().add(checkBoxRand);
		
		JButton button = new JButton("\u0414\u0430\u043B\u0435\u0435");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				Main.window.frame.setVisible(true);
				Main.first.name = Main.first.textFieldName.getText();
				Main.first.capacity = Integer.valueOf(Main.first.textFieldCapacity.getText());
				Main.window.labelCapacity.setText(String.valueOf(Main.first.capacity));
				Main.window.labelName.setText(String.valueOf(Main.first.name));
				Main.first.frame.setVisible(false);
				zooBuilder = new ZooBuilder();
				zooBuilder.BuildName(Main.first.name);
				zooBuilder.BuildCapacity(Main.first.capacity);
				if(Main.first.checkBoxRand.isSelected()) {
					zooBuilder.BuildRandomMonkeys(Main.first.capacity);
				}
				Main.window.canDraw = true;
				Main.window.panel.repaint();
			}
		});
		button.setBounds(282, 195, 125, 44);
		frame.getContentPane().add(button);
		
		
	}
}
