package windows;


import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class StartWindow {

	public static void addComponentsToPane(Container pane) {
		pane.setLayout(new BorderLayout());
		Image image = Toolkit.getDefaultToolkit().createImage("startGame.png");
		JButton startGame = new JButton();
		startGame.setBorder(BorderFactory.createEmptyBorder());
		startGame.setIcon(new ImageIcon(image));
		startGame.setContentAreaFilled(false);
		startGame.setBorderPainted(false);
		startGame.addActionListener(new Choice());
		pane.add(startGame, BorderLayout.CENTER);
	}
	static class Choice implements ActionListener {
		public void actionPerformed(ActionEvent e) {
	        Chooser.openChooser();
	    }
	}
}
