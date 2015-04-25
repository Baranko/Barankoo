package windows;

import java.awt.FontFormatException;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JWindow;

import math.GOD;


public class Chooser  {
	
	static JWindow window;
	
	public static void openChooser() {
	window = new JWindow();
	window.setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();
	
	c.gridx = 0;
	c.gridy = 0;
	JLabel ava1 = new JLabel();
	ava1.setIcon(new ImageIcon("doge1.png"));
	window.add(ava1, c);
	
	c.gridx = 1;
	c.gridy = 0;
	JLabel ava2 = new JLabel();
	ava2.setIcon(new ImageIcon("doge1.png"));
	window.add(ava2, c);
	
	c.gridx = 2;
	c.gridy = 0;
	JButton ava3 = new JButton();
	ava3.setIcon(new ImageIcon("doge1.png"));
	ava3.addActionListener(new Begin());
	window.add(ava3, c);
	
	c.gridx = 0;
	c.gridy = 1;
	JLabel ava4 = new JLabel();
	ava4.setIcon(new ImageIcon("doge1.png"));
	window.add(ava4, c);
	
	c.gridx = 1;
	c.gridy = 1;
	JLabel ava5 = new JLabel();
	ava5.setIcon(new ImageIcon("doge1.png"));
	window.add(ava5, c);
	
	c.gridx = 2;
	c.gridy = 1;
	JLabel ava6 = new JLabel();
	ava6.setIcon(new ImageIcon("doge1.png"));
	window.add(ava5, c);
	window.pack();
	window.setLocationRelativeTo(null);
	window.setVisible(true);
	window.toFront();
	window.setAlwaysOnTop(true);
	}
	
		static class Begin implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				GOD player = new GOD();
				player.SetClas(1);
				window.dispose();
					try {
						GameWindow.updateFrame(Game.frame, player);
					} catch (FontFormatException | IOException e1) {
						e1.printStackTrace();
					}
				
		    }
			

	}


}
