package windows;

import java.awt.BorderLayout;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Game   {
	static JFrame frame;
	public static void main(String[] args) throws FontFormatException, IOException {
		Image image = Toolkit.getDefaultToolkit().createImage("back.jpg");
		
		frame = new JFrame();
		
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		JLabel contentPane = new JLabel();
		contentPane.setIcon(new ImageIcon(image));
		contentPane.setLayout( new BorderLayout() );
		frame.setContentPane( contentPane );
		
		StartWindow.addComponentsToPane(frame.getContentPane());
		frame.pack();
        frame.setVisible(true);
	}}
