package windows;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game {
	public static void main(String[] args) {
		Image image = Toolkit.getDefaultToolkit().createImage("back.jpg");
		
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		JLabel contentPane = new JLabel();
		contentPane.setIcon(new ImageIcon(image));
		contentPane.setLayout( new BorderLayout() );
		frame.setContentPane( contentPane );
		
		StartWindow.addComponentsToPane(frame.getContentPane());
		frame.pack();
        frame.setVisible(true);
	}}
