package windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import math.GOD;
import actions.Build;
import actions.Menu;
import actions.NextHod;

public class GameWindow extends Menu {
	
	public static JFrame newFrame;
	public static GOD session;
	public static JPanel top;
	
	public static JPanel getTopPanel() throws FontFormatException, IOException {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panel.add(getLeftTopPanel(), BorderLayout.WEST);
		panel.add(getRightTopPanel(), BorderLayout.EAST);
		panel.setBackground(new Color(0,0,0,0));
		return panel;
	}
	
	public static JPanel getLeftTopPanel() throws FontFormatException, IOException {
		Font titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("HondaC.ttf")).deriveFont(Font.PLAIN, 30);
		JPanel firstPanel = new JPanel();
		firstPanel.setLayout(new BoxLayout(firstPanel, BoxLayout.X_AXIS));
		Image image = Toolkit.getDefaultToolkit().createImage("pos.png");
		JLabel posImage = new JLabel();
		posImage.setIcon(new ImageIcon(image));
		firstPanel.add(posImage);
		String pos = Integer.toString(session.GetPos());
		JLabel posLabel = new JLabel(pos); //Suda zasunut' "pos' nado
		posLabel.setFont(titleFont);
		firstPanel.add(posLabel);
		
		firstPanel.add(Box.createRigidArea(new Dimension(15,0)));
		
		image = Toolkit.getDefaultToolkit().createImage("hod.png");
		JLabel hodImage = new JLabel();
		hodImage.setIcon(new ImageIcon(image));
		firstPanel.add(hodImage);
		String hod = Integer.toString(session.GetHod());
		JLabel hodLabel = new JLabel(hod); //A suda "hod"
		hodLabel.setFont(titleFont);
		firstPanel.add(hodLabel);
		
		firstPanel.add(Box.createRigidArea(new Dimension(15,0)));
		
		image = Toolkit.getDefaultToolkit().createImage("res.png");
		JLabel resImage = new JLabel();
		resImage.setIcon(new ImageIcon(image));
		firstPanel.add(resImage);
	
		String res = Double.toString(session.GetRes());
		JLabel resLabel = new JLabel(res); //Zasun' "res"
		resLabel.setFont(titleFont);
		firstPanel.add(resLabel);
		
		firstPanel.add(Box.createRigidArea(new Dimension(15,0)));
		
		image = Toolkit.getDefaultToolkit().createImage("pow.png");
		JLabel powImage = new JLabel();
		powImage.setIcon(new ImageIcon(image));
		firstPanel.add(powImage);
		String pow = Integer.toString(session.GetPow());
		JLabel powLabel = new JLabel(pow); //Zasun' "res"
		powLabel.setFont(titleFont);
		firstPanel.add(powLabel);
		
		firstPanel.setBackground(new Color(0,0,0,0));
		
		return firstPanel;
		
	}
	
	public static JPanel getRightTopPanel() {
		JPanel secondPanel = new JPanel();
		secondPanel.setLayout(new BorderLayout());
		
		Image image = Toolkit.getDefaultToolkit().createImage("help.png");
		JLabel helpButton = new JLabel();
		helpButton.setIcon(new ImageIcon(image));
		secondPanel.add(helpButton, BorderLayout.WEST);
		
		image = Toolkit.getDefaultToolkit().createImage("menu.png");
		JLabel menuImage = new JLabel();
		menuImage.setIcon(new ImageIcon(image));
		menuImage.addMouseListener(new OpenMenu());
		secondPanel.add(menuImage, BorderLayout.EAST);
		
		secondPanel.setBackground(new Color(0,0,0,0));
		
		return secondPanel;
	}
	
	public static JPanel getLeftPanel() {
		JPanel panel = new JPanel();
		// Zdes dolzhen bit' yslovie dly opredelinia nastroenia
		panel.setLayout(new BorderLayout());
		Image image = Toolkit.getDefaultToolkit().createImage("good.png");
		JLabel goodImage = new JLabel();
		goodImage.setIcon(new ImageIcon(image));
		panel.add(goodImage);
		panel.setBackground(new Color(0,0,0,0));
		return panel;
	}
	
	public static JPanel getRightPanel() throws FontFormatException, IOException {
		Font titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("HondaC.ttf")).deriveFont(Font.PLAIN, 30);
		JPanel panel = new JPanel();
		//Tut nabor boxov zavisit ot proidennih kvestov
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		c.gridx = 0;
		c.gridy = 0;
		c.weightx = 1;
		c.weighty = 1;
		panel.setBackground(new Color(0,0,0,0));
		JCheckBox box1 = new JCheckBox();
		box1.setEnabled(false);
		box1.setIcon(new ImageIcon("unSel.png"));
		box1.setSelectedIcon(new ImageIcon("sel.png"));
		box1.setBorder(new EmptyBorder(0,0,0,0));
		panel.add(box1, c);
		 c.gridx = 1;
		 c.gridy = 0;
		
		JLabel label1 = new JLabel("Убить трех енотов");
		label1.setFont(titleFont);
		panel.add(label1, c);
		
		c.gridx = 0;
		c.gridy = 1;
		
		JCheckBox box2 = new JCheckBox();
		box2.setEnabled(true);
		box2.setIcon(new ImageIcon("unSel.png"));
		box2.setSelectedIcon(new ImageIcon("sel.png"));
		box2.setBorder(new EmptyBorder(0,0,0,0));
		panel.add(box2, c);
		
		c.gridx = 1;
		c.gridy = 1;
		
		JLabel label2 = new JLabel("Убить четырех енотов");
		label2.setFont(titleFont);
		panel.add(label2, c);
		
		c.gridx = 0;
		c.gridy = 2;
		
		JCheckBox box3 = new JCheckBox();
		box3.setEnabled(false);
		box3.setIcon(new ImageIcon("unSel.png"));
		box3.setSelectedIcon(new ImageIcon("sel.png"));
		box3.setBorder(new EmptyBorder(0,0,0,0));
		panel.add(box3, c);
		
		c.gridx = 1;
		c.gridy = 2;
		
		JLabel label3 = new JLabel("Прекратите убивать енотов");
		label3.setFont(titleFont);
		panel.add(label3, c);
		
		return panel;
	}
	
	public static JPanel getBottomPanel() {
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		JLabel buildButton = new JLabel();
		buildButton.setIcon(new ImageIcon("build.png"));
		buildButton.addMouseListener(new Build.openBuild() );
		panel.add(Box.createRigidArea(new Dimension(100,0)));
		panel.add(buildButton);
		panel.add(Box.createRigidArea(new Dimension(200,0)));
		
		JLabel curseButton = new JLabel();
		curseButton.setIcon(new ImageIcon("curse.png"));

		panel.add(curseButton);
		panel.add(Box.createRigidArea(new Dimension(200,0)));
		
		JLabel nextButton = new JLabel();
		nextButton.setIcon(new ImageIcon("next.png"));
		nextButton.addMouseListener(new NextHod.nextMove());

		panel.add(nextButton);
		
		panel.setBackground(new Color(0,0,0,0));
		
		return panel;
	}
	
	public static JPanel getCenterPanel() throws FontFormatException, IOException {
		JPanel panel = new JPanel();
		panel.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.gridx = 0;
		c.gridy = 0;
		
		Font titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("HondaC.ttf")).deriveFont(Font.PLAIN, 30);
		JLabel godName = new JLabel("Doge-Gode"); //Suda nado vstavluyat imya boga iz klassa god
		godName.setFont(titleFont);
		panel.add(godName, c);
		
		c.gridx = 0;
		c.gridy = 1;
		
		JLabel ava = new JLabel();
		ava.setIcon(new ImageIcon("doge1.png"));
		panel.add(ava, c);
		
		panel.setBackground(new Color(0,0,0,0));
		
		c.gridx = 0;
		c.gridy = 2;
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setMinimum(0);
		progressBar.setMaximum(100);
		progressBar.setValue(30); //Zaprashivai suda nekoe znachenie v % neobhodimoe dlya poluchenia urovnya
		progressBar.setForeground(Color.GREEN);

	
		UIManager.put("progressBar.background", Color.ORANGE);
		UIManager.put("progressBar.foreground", Color.BLUE);
		UIManager.put("progressBar.selectionBackground", Color.RED);
		UIManager.put("progressBar.selectionForeground", Color.GREEN);
		panel.add(progressBar, c);

		
		return panel;
	}
	
	
	
	public static void updateFrame(JFrame frame, GOD god) throws FontFormatException, IOException {
		Image image = Toolkit.getDefaultToolkit().createImage("back.jpg");
		frame.dispose();

		session = god;
		newFrame = new JFrame();
		newFrame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		JLabel contentPane = new JLabel();
		contentPane.setIcon(new ImageIcon(image));
		contentPane.setLayout( new BorderLayout() );
		newFrame.setContentPane(contentPane);
		top = getTopPanel();
		newFrame.setLayout(new BorderLayout());
		newFrame.add(top, BorderLayout.NORTH);
		newFrame.add(getRightPanel(), BorderLayout.EAST);
		newFrame.add(getLeftPanel(), BorderLayout.WEST);
		newFrame.add(getBottomPanel(), BorderLayout.SOUTH);
		newFrame.add(getCenterPanel(), BorderLayout.CENTER);
		
		newFrame.pack();
        newFrame.setVisible(true);
	}
	
}
