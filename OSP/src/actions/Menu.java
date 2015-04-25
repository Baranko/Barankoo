package actions;

import java.awt.BorderLayout;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JWindow;

import windows.GameWindow;


public class Menu {
	static JWindow menuWindow;
	public static class OpenMenu implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			menuWindow = new JWindow();
			menuWindow.setLayout(new BorderLayout());
			JButton backButton = new JButton();
			backButton.setIcon(new ImageIcon("back.png"));
			backButton.setContentAreaFilled(false);
			backButton.setBorderPainted(false);
			backButton.setBorder(BorderFactory.createEmptyBorder());
			backButton.addActionListener(new BackToGame());
			menuWindow.add(backButton, BorderLayout.NORTH);
			
			JButton exitButton = new JButton();
			exitButton.setIcon(new ImageIcon("exit.png"));
			exitButton.setContentAreaFilled(false);
			exitButton.setBorderPainted(false);
			exitButton.setBorder(BorderFactory.createEmptyBorder());
			exitButton.addActionListener(new ExitGame());
			menuWindow.add(exitButton, BorderLayout.SOUTH);
			menuWindow.pack();
			menuWindow.setLocationRelativeTo(null);
			menuWindow.setVisible(true);
			menuWindow.toFront();
			menuWindow.setAlwaysOnTop(true);
			
		}
	

		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent arg0) {
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}
	static class BackToGame implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			menuWindow.dispose();
		}
	}
	
	static class ExitGame implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			menuWindow.dispose();
			GameWindow.newFrame.dispose();
		}
	}

}
