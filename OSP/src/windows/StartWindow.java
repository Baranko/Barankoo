package windows;

import java.awt.AlphaComposite;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class StartWindow {

	public static void addComponentsToPane(Container pane) {
		pane.setLayout(new BorderLayout());
		Image image = Toolkit.getDefaultToolkit().createImage("startGame.png");
		JButton startGame = new JButton();
		startGame.setBorder(BorderFactory.createEmptyBorder());
		startGame.setIcon(new ImageIcon(image));
		startGame.setContentAreaFilled(false);
		startGame.setBorderPainted(false);
		image = Toolkit.getDefaultToolkit().createImage("startGameRoll.png");
		startGame.setRolloverIcon(new ImageIcon(image));
		pane.add(startGame, BorderLayout.CENTER);
	}
	

}
