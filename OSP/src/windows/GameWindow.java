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
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JWindow;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import math.GOD;
import actions.Build;
import actions.Curses;
import actions.FunService;
import actions.Menu;
import actions.NextHod;

public class GameWindow extends Menu  {
	
	public static JFrame newFrame;
	public static GOD session;
	public static JPanel top, left, right, center, bottom;
	
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
		
		Image image = Toolkit.getDefaultToolkit().createImage("hod.png");
		JLabel hodImage = new JLabel();
		hodImage.setIcon(new ImageIcon(image));
		firstPanel.add(hodImage);
		String hod = Integer.toString(session.GetHod());
		JLabel hodLabel = new JLabel(hod); //A suda "hod"
		hodLabel.setFont(titleFont);
		firstPanel.add(hodLabel);
		
		firstPanel.add(Box.createRigidArea(new Dimension(15,0)));
		
		image = Toolkit.getDefaultToolkit().createImage("pos.png");
		JLabel posImage = new JLabel();
		posImage.setIcon(new ImageIcon(image));
		firstPanel.add(posImage);
		String pos = Integer.toString(session.GetPos()) + " (+" + session.GetPrihodPos() + ")";
		JLabel posLabel = new JLabel(pos); //Suda zasunut' "pos' nado
		posLabel.setFont(titleFont);
		firstPanel.add(posLabel);
	
		firstPanel.add(Box.createRigidArea(new Dimension(15,0)));
		
		image = Toolkit.getDefaultToolkit().createImage("res.png");
		JLabel resImage = new JLabel();
		resImage.setIcon(new ImageIcon(image));
		firstPanel.add(resImage);
	
		String res = Double.toString(session.GetRes()) + " (+" + session.GetPrihodRes() + ")";
		JLabel resLabel = new JLabel(res); //Zasun' "res"
		resLabel.setFont(titleFont);
		firstPanel.add(resLabel);
		
		firstPanel.add(Box.createRigidArea(new Dimension(15,0)));
		
		image = Toolkit.getDefaultToolkit().createImage("pow.png");
		JLabel powImage = new JLabel();
		powImage.setIcon(new ImageIcon(image));
		firstPanel.add(powImage);
		String pow = Integer.toString(session.GetPow()) + " (+" + session.GetPrihodPow() + ")";
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
	
	public static JPanel getLeftPanel() throws FontFormatException, IOException {
		Font titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("HondaC.ttf")).deriveFont(Font.PLAIN, 30);
		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
		
		JLabel labelAll = new JLabel("Вы можете возвести еще " + (session.GetCountMax()-session.GetCountAll()) + " построек");
		labelAll.setFont(titleFont);
		panel.add(labelAll);
		if (session.GetCountA()>0)
		{
			JLabel label1 = new JLabel("Возведенно " + session.GetCountA() + " алтарей.");
			label1.setFont(titleFont);
			panel.add(label1);
		}
		if (session.GetCountS()>0)
		{
			JLabel label2 = new JLabel("Возведенно " + session.GetCountS() + " рынков.");
			label2.setFont(titleFont);
			panel.add(label2);
		}
		if (session.GetCountM()>0)
		{
			JLabel label3 = new JLabel("Возведенно " + session.GetCountM() + " памятников.");
			label3.setFont(titleFont);
			panel.add(label3);
		}
		if (session.GetCountSch()>0)
		{
			JLabel label4 = new JLabel("Возведенно " + session.GetCountSch() + " ШРЕН.");
			label4.setFont(titleFont);
			panel.add(label4);
		}
		if (session.GetCountAmf()>0)
		{
			JLabel label5 = new JLabel("Возведенно " + session.GetCountAmf() + " амфитеатров.");
			label5.setFont(titleFont);
			panel.add(label5);
		}
		if (session.GetCountPag()>0)
		{
			JLabel label6 = new JLabel("Возведенно " + session.GetCountPag() + " пагод.");
			label6.setFont(titleFont);
			panel.add(label6);
		}
		if (session.GetCountCirk()>0)
		{
			JLabel label7 = new JLabel("Возведенно " + session.GetCountCirk() + " цирков.");
			label7.setFont(titleFont);
			panel.add(label7);
		}
		if (session.GetCountFarm()>0)
		{
			JLabel label8 = new JLabel("Возведенно " + session.GetCountFarm() + " ферм.");
			label8.setFont(titleFont);
			panel.add(label8);
		}
		if (session.GetCountRadio()>0)
		{
			JLabel label9 = new JLabel("Возведенно " + session.GetCountRadio() + " радиовышек.");
			label9.setFont(titleFont);
			panel.add(label9);
		}
		if (session.GetCountZavod()>0)
		{
			JLabel label10 = new JLabel("Возведенно " + session.GetCountRadio() + " заводов.");
			label10.setFont(titleFont);
			panel.add(label10);
		}
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
		box1.setIcon(new ImageIcon("unSel.png"));
		box1.setSelectedIcon(new ImageIcon("sel.png"));
		box1.setBorder(new EmptyBorder(0,0,0,0));
		panel.add(box1, c);
		 c.gridx = 1;
		 c.gridy = 0;
		
		JLabel label1 = new JLabel("Это не работает");
		label1.setFont(titleFont);
		panel.add(label1, c);
		
		c.gridx = 0;
		c.gridy = 1;
		
		JCheckBox box2 = new JCheckBox();
		box2.setIcon(new ImageIcon("unSel.png"));
		box2.setSelectedIcon(new ImageIcon("sel.png"));
		box2.setBorder(new EmptyBorder(0,0,0,0));
		panel.add(box2, c);
		
		c.gridx = 1;
		c.gridy = 1;
		
		JLabel label2 = new JLabel("Это тоже не работает");
		label2.setFont(titleFont);
		panel.add(label2, c);
		
		c.gridx = 0;
		c.gridy = 2;
		
		JCheckBox box3 = new JCheckBox();
		box3.setIcon(new ImageIcon("unSel.png"));
		box3.setSelectedIcon(new ImageIcon("sel.png"));
		box3.setBorder(new EmptyBorder(0,0,0,0));
		panel.add(box3, c);
		
		c.gridx = 1;
		c.gridy = 2;
		
		JLabel label3 = new JLabel("И это не работает");
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
		curseButton.addMouseListener(new Curses.letsCurse());

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
		ava.addMouseListener(new FunService.tipsFromGod());
		panel.add(ava, c);
		
		panel.setBackground(new Color(0,0,0,0));
		
		c.gridx = 0;
		c.gridy = 2;
		String slvl = Integer.toString(session.GetLvl());
		JLabel lvl = new JLabel("Уровень " + slvl);
		lvl.setFont(titleFont);
		panel.add(lvl,c);
		
		/*Na potom
		JProgressBar progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setMinimum(0);
		progressBar.setMaximum(100);
		progressBar.setValue(30); //Zaprashivai suda nekoe znachenie v % neobhodimoe dlya poluchenia urovnya
		progressBar.setForeground(Color.GREEN);

		
		
		 * UIManager.put("progressBar.background", Color.ORANGE);
		UIManager.put("progressBar.foreground", Color.BLUE);
		UIManager.put("progressBar.selectionBackground", Color.RED);
		UIManager.put("progressBar.selectionForeground", Color.GREEN);
		panel.add(progressBar, c);*/

		
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
		left = getLeftPanel();
		right = getRightPanel();
		bottom = getBottomPanel();
		center = getCenterPanel();
		newFrame.setUndecorated(true);
		newFrame.setLayout(new BorderLayout());
		newFrame.add(top, BorderLayout.NORTH);
		newFrame.add(right, BorderLayout.EAST);
		newFrame.add(left, BorderLayout.WEST);
		newFrame.add(bottom, BorderLayout.SOUTH);
		newFrame.add(center, BorderLayout.CENTER);
		newFrame.pack();
        newFrame.setVisible(true);
        JOptionPane.showMessageDialog(new JWindow(), "Главный жрец обсерватории: \n Владыка! Сегодня мы наконец можем начать расширение Вашего влияния среди населения \n планеты! Нам удалось восстановить несколько радиовышек и наладить стабильную передачу \n сигнала. Теперь мы можем смело заявить, что являемся первой и единственной \n предапокалипсической радиостанцией в мире! Также мы открыли набор всех желающих в школу \n Распространения Его Ноосферы (Ш.Р.Е.Н.), в которой проходят лекции по ораторскому \n искусству, психологии, оказанию первой помощи в случае возникновения собственного мнения и \n охоте на кроликов с лопатой. Выпускники школы станут послами в другие земли, где продолжат \n распространять знание о Вашем величии и могуществе. \n А сейчас прими от нас в дар скромное подношение!  \n Bene placito!");
	}
	
}
