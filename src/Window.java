import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;

public class Window {

	public JFrame frame;
	public JLabel labelCapacity;
	public JLabel labelName;
	public boolean canDraw;
	public boolean drawSpeed;
	public boolean drawFood;
	public JCheckBox checkBox;
	public JPanel panel;
	public static boolean isThisMonkeyAlbino;
	public static boolean isThisMonkeyNotHungry;
	public Window() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 700, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		panel = new JPanel(){
			@Override
            public void paintComponent(Graphics g) {
                super.paintComponent(g);

                int w = this.getWidth();
                int h = this.getHeight();
               if(Main.first.checkBoxRand.isSelected()) g.setColor(Color.red);
               else  {
            	  g.setColor(Color.blue);
            	   }
               
                //рисовать
                if(canDraw) {
                	 int c = Main.first.zooBuilder.GetResault().countMonkeys();
              	   for(int i = 0;i<c;i++) {
              		   g.setColor(Main.first.zooBuilder.GetResault().getMonkey(i).ShowColor());
                		g.fillOval(5 + (i% 13) *50, 70 + i/13 * 60, 35,35);
                		if(drawSpeed)   {
                			String tmp = String.valueOf(SingletonZoo.GetInstance().getMonkey(i).Run()) + "км/ч";
                			g.drawString(tmp, 5 + (i% 13) *50, 115 + i/13 * 60);
                		}
                		if(drawFood) {
                			//System.out.println(((AbstractEaterMonkey) SingletonZoo.GetInstance().getMonkey(i)).getFood());
                			switch(((AbstractEaterMonkey) SingletonZoo.GetInstance().getMonkey(i)).getFood()) {
                			case 1: {	g.drawString("мясо", 5 + (i% 13) *50, 70 + i/13 * 60);break;}
                			case 2: {	g.drawString("банан", 5 + (i% 13) *50, 70 + i/13 * 60);break;}
                			case 3: {	g.drawString("листья", 5 + (i% 13) *50, 70 + i/13 * 60);break;}
                			case 4: {	g.drawString("фрукты", 5 + (i% 13) *50, 70 + i/13 * 60);break;}
                			default: {g.drawString("пусто", 5 + (i% 13) *50, 70 + i/13 * 60);break;}
                			}
                		}
                		if(((AbstractEaterMonkey) SingletonZoo.GetInstance().getMonkey(i)).GetHungry()) {
              			  g.setColor(Color.green);
                    		g.fillOval(14 + (i% 13) *50, 79 + i/13 * 60, 15,15);
              		}
                		if(isThisMonkeyAlbino) {
                			  g.setColor(Color.white);
                			  g.fillOval(5 + (i% 13) *50, 70 + i/13 * 60, 15,15);
                			isThisMonkeyAlbino = false;
                		}
                		
              	   }
              	 drawSpeed = false;
                }
			}
		};
		panel.setBounds(0, 93, 684, 568);
		frame.getContentPane().add(panel);
		
		JButton buttonRazognat = new JButton("\u0420\u0430\u0437\u043E\u0433\u043D\u0430\u0442\u044C!");
		buttonRazognat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				drawSpeed = true;
				panel.repaint();
				
			}
		});
		buttonRazognat.setBounds(191, 30, 127, 23);
		frame.getContentPane().add(buttonRazognat);
		
		JButton buttonNakormit = new JButton("\u041D\u0430\u043A\u043E\u0440\u043C\u0438\u0442\u044C!");
		buttonNakormit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SingletonZoo.GetInstance().FeedMonkeys();
				drawFood = true;
				panel.repaint();
			}
		});
		buttonNakormit.setBounds(341, 30, 127, 23);
		frame.getContentPane().add(buttonNakormit);
		
		JLabel label = new JLabel("\u0414\u043E\u0431\u0430\u0432\u0438\u0442\u044C:");
		label.setBounds(10, 47, 83, 14);
		frame.getContentPane().add(label);
		
		JButton buttonBaboon = new JButton("\u0411\u0430\u0431\u0443\u0438\u043D");
		buttonBaboon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Monkey m;
				m = Main.bc.createMonkey();
				if(Main.window.checkBox.isSelected()) {
					m = new AlbinoDecorator(m);
					
				}
				SingletonZoo.GetInstance().AddMonkey(m);
				panel.repaint();
			}
		});
		buttonBaboon.setBounds(136, 64, 127, 23);
		frame.getContentPane().add(buttonBaboon);
		
		JButton buttonChimp = new JButton("\u0428\u0438\u043C\u043F\u0430\u043D\u0437\u0435");
		buttonChimp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Monkey m;
				m = Main.cc.createMonkey();
				if(Main.window.checkBox.isSelected()) {
					m = new AlbinoDecorator(m);
					
				}
				SingletonZoo.GetInstance().AddMonkey(m);
				panel.repaint();
			}
		});
		buttonChimp.setBounds(273, 64, 127, 23);
		frame.getContentPane().add(buttonChimp);
		
		JButton buttonOrangutan = new JButton("\u041E\u0440\u0430\u043D\u0433\u0443\u0442\u0430\u043D");
		buttonOrangutan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Monkey m;
				m = Main.oc.createMonkey();
				if(Main.window.checkBox.isSelected()) {
					m = new AlbinoDecorator(m);
					
				}
				SingletonZoo.GetInstance().AddMonkey(m);
				panel.repaint();
			}
		});
		buttonOrangutan.setBounds(410, 64, 127, 23);
		frame.getContentPane().add(buttonOrangutan);
		
		JButton buttonGorilla = new JButton("\u0413\u043E\u0440\u0438\u043B\u043B\u0430");
		buttonGorilla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Monkey m;
				m = Main.gc.createMonkey();
				if(Main.window.checkBox.isSelected()) {
					m = new AlbinoDecorator(m);
					
				}
				SingletonZoo.GetInstance().AddMonkey(m);
				panel.repaint();
			}
		});
		buttonGorilla.setBounds(547, 64, 127, 23);
		frame.getContentPane().add(buttonGorilla);
		
		checkBox = new JCheckBox("\u0410\u043B\u044C\u0431\u0438\u043D\u043E\u0441");
		checkBox.setBounds(20, 68, 97, 23);
		frame.getContentPane().add(checkBox);
		
		JLabel label_1 = new JLabel("\u041E\u0442\u0434\u0435\u043B\u0435\u043D\u0438\u0435 \u043E\u0431\u0435\u0437\u044C\u044F\u043D:");
		label_1.setBounds(68, 34, 130, 14);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u0417\u043E\u043E\u043F\u0430\u0440\u043A:");
		label_2.setBounds(10, 11, 66, 14);
		frame.getContentPane().add(label_2);
		
		labelName = new JLabel("\u041D\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043D\u043E");
		labelName.setBounds(76, 11, 155, 14);
		frame.getContentPane().add(labelName);
		
		JLabel label_3 = new JLabel("\u0412\u043C\u0435\u0441\u0442\u0438\u043C\u043E\u0441\u0442\u044C:");
		label_3.setBounds(222, 11, 113, 14);
		frame.getContentPane().add(label_3);
		
		 labelCapacity = new JLabel("\u041D\u0435\u0438\u0437\u0432\u0435\u0441\u0442\u043D\u043E");
		labelCapacity.setBounds(310, 11, 97, 14);
		frame.getContentPane().add(labelCapacity);
		
		JButton buttonObmenat = new JButton("\u041E\u0431\u043C\u0435\u043D\u044F\u0442\u044C!");
		buttonObmenat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SingletonZoo.GetInstance().ExcangeFood();
				panel.repaint();
			}
		});
		buttonObmenat.setBounds(492, 30, 127, 23);
		frame.getContentPane().add(buttonObmenat);
		
		JButton button = new JButton("\u0442\u0435\u0441\u0442 \u043F\u0440\u0438\u0441\u043F.");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int c = SingletonZoo.GetInstance().countMonkeys();
				for(int i = 0;i <c; i++) {
				if( SingletonZoo.GetInstance().getMonkey(i) instanceof AbstractEaterMonkey)System.out.println(((AbstractEaterMonkey) SingletonZoo.GetInstance().getMonkey(i)).getMonkey().hashCode());
				}
			}
		});
		button.setBounds(434, 7, 127, 23);
		frame.getContentPane().add(button);
	}
}
