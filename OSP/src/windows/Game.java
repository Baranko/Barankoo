package windows;

import java.awt.BorderLayout;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.IOException;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class Game    {
	static JFrame frame;
	public static void main(String[] args) throws FontFormatException, IOException, Exception {
		URL url = new URL("file:C:\\Users\\User\\workspace\\OSP\\pesenka.wav");
        Clip clip = AudioSystem.getClip();
        AudioInputStream ais = AudioSystem.
            getAudioInputStream( url );
        clip.open(ais);
        clip.loop(Clip.LOOP_CONTINUOUSLY);
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Image image = Toolkit.getDefaultToolkit().createImage("back.jpg");
            	frame = new JFrame();
        		
        		frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        		JLabel contentPane = new JLabel();
        		contentPane.setIcon(new ImageIcon(image));
        		contentPane.setLayout( new BorderLayout() );
        		frame.setContentPane( contentPane );
        		
        		StartWindow.addComponentsToPane(frame.getContentPane());
        		frame.setUndecorated(true);
        		frame.pack();
                frame.setVisible(true);
            }
        });
		
	        
	}}
