package actions;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JWindow;

import math.Skills;
import windows.GameWindow;

public class Curses extends GameWindow  {
	static Random random = new Random();
	static JWindow window;
	static Skills skill1, skill2, skill3;
	
	public static class letsCurse implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent e)   {
			int rand1, rand2, rand3;

			if ((session.GetPow() >= session.GetZatratMana())&&(session.GetShtrav()==0)) {
				Font titleFont = null;
				try {
					titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("HondaC.ttf")).deriveFont(Font.PLAIN, 30);
				} catch (FontFormatException | IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				
				skill1 = new Skills(rand1 = random.nextInt(5), rand2 = random.nextInt(5), rand3 = random.nextInt(5));
				skill2 = new Skills(rand1 = random.nextInt(5), rand2 = random.nextInt(5), rand3 = random.nextInt(5));
				skill3 = new Skills(rand1 = random.nextInt(5), rand2 = random.nextInt(5), rand3 = random.nextInt(5)); 
				window = new JWindow();
				JLabel img = new JLabel();
				img.setIcon(new ImageIcon("backDi.png"));
				img.setLayout( new BorderLayout() );
				window.setContentPane(img);
				window.setLayout(new GridBagLayout());
				GridBagConstraints c = new GridBagConstraints();
				c.gridx = 0;
				c.gridy = 0;
				JLabel curse1 = new JLabel(skill1.getHeader());
				curse1.setFont(titleFont);
				window.add(curse1, c);
				c.gridx = 1;
				JButton button1 = new JButton();
				button1.setIcon(new ImageIcon("liitle.png"));
				button1.setContentAreaFilled(false);
				button1.setBorderPainted(false);
				button1.addActionListener(new useCurse1());
				window.add(button1, c);
				c.gridx = 0;
				c.gridy = 1;
				JLabel curse2 = new JLabel(skill2.getHeader());
				curse2.setFont(titleFont);
				window.add(curse2, c);
				c.gridx = 1;
				JButton button2 = new JButton();
				button2.setIcon(new ImageIcon("liitle.png"));
				button2.setContentAreaFilled(false);
				button2.setBorderPainted(false);
				button2.addActionListener(new useCurse2());
				window.add(button2, c);
				c.gridx = 0;
				c.gridy = 2;
				JLabel curse3 = new JLabel(skill3.getHeader());
				curse3.setFont(titleFont);
				window.add(curse3, c);
				c.gridx = 1;
				JButton button3 = new JButton();
				button3.setIcon(new ImageIcon("liitle.png"));
				button3.setContentAreaFilled(false);
				button3.setBorderPainted(false);
				button3.addActionListener(new useCurse3());
				window.add(button3, c);
				c.gridx = 0;
				c.gridy = 3;
				JButton button4 = new JButton();
				button4.setIcon(new ImageIcon("back.png"));
				button4.setContentAreaFilled(false);
				button4.setBorderPainted(false);
				window.add(button4, c);
				button4.addActionListener(new Exit());
				
				window.pack();
				window.setLocationRelativeTo(null);
				window.toFront();
				window.setAlwaysOnTop(true);
				window.setVisible(true);
			}
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
	
	static class Exit implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			window.dispose();
		}
	}
	static class useCurse1 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (skill1.getCheck1()==true)
				session.SetRes(session.GetRes() + skill1.getDob1());
				else
					session.SetPos(session.GetPos() + skill1.getDob1());
			session.SetShtrav(skill1.getShtrav());
			if(skill1.getCheck2()==true)
				session.SetBonusRes(session.GetBonusRes() + skill1.getDob2());
			else
				session.SetBonusPos(session.GetBonusPos() + skill1.getDob2());
			window.dispose();
			updateFrame.updateFrame();
			JOptionPane.showMessageDialog(new JFrame(), skill1.getOpis());
	}
	}
	static class useCurse2 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (skill2.getCheck1()==true)
				session.SetRes(session.GetRes() + skill2.getDob1());
				else
					session.SetPos(session.GetPos() + skill2.getDob1());
			session.SetShtrav(skill2.getShtrav());
			if(skill2.getCheck2()==true)
				session.SetBonusRes(session.GetBonusRes() + skill2.getDob2());
			else
				session.SetBonusPos(session.GetBonusPos() + skill2.getDob2());
			window.dispose();
			updateFrame.updateFrame();
			JOptionPane.showMessageDialog(new JFrame(), skill2.getOpis());

	}
	}
	static class useCurse3 implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (skill3.getCheck1()==true)
				session.SetRes(session.GetRes() + skill3.getDob1());
				else
					session.SetPos(session.GetPos() + skill3.getDob1());
			session.SetShtrav(skill3.getShtrav());
			if(skill3.getCheck2()==true)
				session.SetBonusRes(session.GetBonusRes() + skill3.getDob2());
			else
				session.SetBonusPos(session.GetBonusPos() + skill3.getDob2());
			window.dispose();
			updateFrame.updateFrame();
			JOptionPane.showMessageDialog(new JFrame(), skill3.getOpis());
	}
	}
	}
}
