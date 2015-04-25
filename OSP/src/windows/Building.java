package windows;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class Building  {
	
	static JWindow buildingWindow;
	
	public static JPanel getAlt() throws FontFormatException, IOException {
		Font titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("HondaC.ttf")).deriveFont(Font.PLAIN, 30);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JLabel img = new JLabel();
		img.setIcon(new ImageIcon("alt.png"));
		
		JLabel header = new JLabel("������");
		header.setFont(titleFont);
		panel.add(header, BorderLayout.NORTH);
		panel.add(img, BorderLayout.SOUTH);
		panel.setBackground(new Color(0,0,0,0));
		return panel;
	}
	
	public static JPanel getMag() throws FontFormatException, IOException {
		Font titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("HondaC.ttf")).deriveFont(Font.PLAIN, 30);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JLabel img = new JLabel();
		img.setIcon(new ImageIcon("mag.png"));
		
		JLabel header = new JLabel("�����");
		header.setFont(titleFont);
		panel.add(header, BorderLayout.NORTH);
		panel.add(img, BorderLayout.SOUTH);
		panel.setBackground(new Color(0,0,0,0));
		return panel;
	}
	
	public static JPanel getPam() throws FontFormatException, IOException {
		Font titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("HondaC.ttf")).deriveFont(Font.PLAIN, 30);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JLabel img = new JLabel();
		img.setIcon(new ImageIcon("pam.png"));
		
		JLabel header = new JLabel("��������");
		header.setFont(titleFont);
		panel.add(header, BorderLayout.NORTH);
		panel.add(img, BorderLayout.SOUTH);
		panel.setBackground(new Color(0,0,0,0));
		return panel;
	}
	
	public static JPanel getUch() throws FontFormatException, IOException {
		Font titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("HondaC.ttf")).deriveFont(Font.PLAIN, 30);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JLabel img = new JLabel();
		img.setIcon(new ImageIcon("uch.png"));
		
		JLabel header = new JLabel("����");
		header.setFont(titleFont);
		panel.add(header, BorderLayout.NORTH);
		panel.add(img, BorderLayout.SOUTH);
		panel.setBackground(new Color(0,0,0,0));
		return panel;
	}
	
	public static JPanel getRadio() throws FontFormatException, IOException {
		Font titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("HondaC.ttf")).deriveFont(Font.PLAIN, 30);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JLabel img = new JLabel();
		img.setIcon(new ImageIcon("radio.png"));
		
		JLabel header = new JLabel("����������");
		header.setFont(titleFont);
		panel.add(header, BorderLayout.NORTH);
		panel.add(img, BorderLayout.SOUTH);
		panel.setBackground(new Color(0,0,0,0));
		return panel;
	}
	
	public static JPanel getAmfi() throws FontFormatException, IOException {
		Font titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("HondaC.ttf")).deriveFont(Font.PLAIN, 30);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JLabel img = new JLabel();
		img.setIcon(new ImageIcon("amfi.png"));
		
		JLabel header = new JLabel("���������");
		header.setFont(titleFont);
		panel.add(header, BorderLayout.NORTH);
		panel.add(img, BorderLayout.SOUTH);
		panel.setBackground(new Color(0,0,0,0));
		return panel;
	}
	
	public static JPanel getPagod() throws FontFormatException, IOException {
		Font titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("HondaC.ttf")).deriveFont(Font.PLAIN, 30);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JLabel img = new JLabel();
		img.setIcon(new ImageIcon("pagod.png"));
		
		JLabel header = new JLabel("������");
		header.setFont(titleFont);
		panel.add(header, BorderLayout.NORTH);
		panel.add(img, BorderLayout.SOUTH);
		panel.setBackground(new Color(0,0,0,0));
		return panel;
	}
	
	public static JPanel getFerma() throws FontFormatException, IOException {
		Font titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("HondaC.ttf")).deriveFont(Font.PLAIN, 30);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JLabel img = new JLabel();
		img.setIcon(new ImageIcon("ferma.png"));
		
		JLabel header = new JLabel("�����");
		header.setFont(titleFont);
		panel.add(header, BorderLayout.NORTH);
		panel.add(img, BorderLayout.SOUTH);
		panel.setBackground(new Color(0,0,0,0));
		return panel;
	}
	
	public static JPanel getCirk() throws FontFormatException, IOException {
		Font titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("HondaC.ttf")).deriveFont(Font.PLAIN, 30);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JLabel img = new JLabel();
		img.setIcon(new ImageIcon("cirk.png"));
		
		JLabel header = new JLabel("����");
		header.setFont(titleFont);
		panel.add(header, BorderLayout.NORTH);
		panel.add(img, BorderLayout.SOUTH);
		panel.setBackground(new Color(0,0,0,0));
		return panel;
	}
	
	public static JPanel getZavod() throws FontFormatException, IOException {
		Font titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("HondaC.ttf")).deriveFont(Font.PLAIN, 30);
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		JLabel img = new JLabel();
		img.setIcon(new ImageIcon("zavod.png"));
		
		JLabel header = new JLabel("�����");
		header.setFont(titleFont);
		panel.add(header, BorderLayout.NORTH);
		panel.add(img, BorderLayout.SOUTH);
		panel.setBackground(new Color(0,0,0,0));
		return panel;
	}
	
	public static void makeWindow() throws FontFormatException, IOException {
		Image image = Toolkit.getDefaultToolkit().createImage("backSTR.png");
		Font titleFont = Font.createFont(Font.TRUETYPE_FONT, new File("HondaC.ttf")).deriveFont(Font.PLAIN, 30);
		buildingWindow = new JWindow();
		JLabel contentPane = new JLabel();
		contentPane.setIcon(new ImageIcon(image));
		contentPane.setLayout( new BorderLayout() );
		buildingWindow.setContentPane(contentPane);
		
		buildingWindow.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		JPanel alt = getAlt();
		alt.setToolTipText("���������: 3 �������. �����: +2 ������� � ���, -5 ����������� � ���.");
		JPanel mag = getMag();
		mag.setToolTipText("���������: 3 �������. �����: +10 ����������� � ���, -1 �������� � ���.");
		JPanel pam = getPam();
		pam.setToolTipText("���������: 5 ��������. �����: +5 ����������� � ���, -1 �������� � ���, +1 ���� � ���.");
		JPanel uch = getUch();
		uch.setToolTipText("���������: 6 ��������. �����: +5 �������� � ���, -5 ����������� � ���, -1 ���� � ���.");
		JPanel amfi = getAmfi();
		amfi.setToolTipText("���������: 10 ��������. �����: +11 ����������� � ���, -6 �������� � ���, +1 ���� � ���.");
		JPanel pagod = getPagod();
		pagod.setToolTipText("���������: 12 ��������. �����: +7 �������� � ���, -7 ����������� � ���, -2 ���� � ���.");
		JPanel cirk = getCirk();
		cirk.setToolTipText("���������: 13 ��������. �����: +10 ����������� � ���, -6 �������� � ���, +3 ���� � ���.");
		JPanel ferma = getFerma();
		ferma.setToolTipText("���������: 15 ��������. �����: +9 �������� � ���, -7 ����������� � ���, +1 ���� � ���.");
		JPanel radio = getRadio();
		radio.setToolTipText("���������: 18 ��������. �����: ����������� ����������� ������ �����������, +5 ���� � ���.");
		JPanel zavod = getZavod();
		zavod.setToolTipText("���������: 22 ��������. �����: ����������� ����������� ������ ��������, +5 ���� � ���.");
		c.gridx = 0;
		c.gridy = 0;
		JLabel lvl1 = new JLabel("������� 1");
		lvl1.setFont(titleFont);
		buildingWindow.add(lvl1, c);
		c.gridx = 1;	
		JButton exit = new JButton();
		exit.setIcon(new ImageIcon("extit.png"));
		exit.setBorder(BorderFactory.createEmptyBorder());
		exit.setContentAreaFilled(false);
		exit.setBorderPainted(false);
		exit.addActionListener(new Exit());
		buildingWindow.add(exit,c);
		c.gridx = 0;
		c.gridy = 1;
		buildingWindow.add(alt, c);
		c.gridx = 1;
		buildingWindow.add(mag, c);
		c.gridx = GridBagConstraints.REMAINDER;
		c.gridy = 2;
		JLabel lvl2 = new JLabel("������� 2");
		lvl2.setFont(titleFont);
		buildingWindow.add(lvl2, c);
		c.gridy = 3;
		buildingWindow.add(pam, c);
		c.gridx = 1;
		buildingWindow.add(uch, c);
		c.gridx = GridBagConstraints.REMAINDER;
		c.gridy =4;
		JLabel lvl3 = new JLabel("������� 3");
		lvl3.setFont(titleFont);
		buildingWindow.add(lvl3, c);
		c.gridy=5;
		buildingWindow.add(amfi, c);
		c.gridx = 1;
		buildingWindow.add(pagod, c);
		c.gridx = GridBagConstraints.REMAINDER;
		c.gridy = 6;
		JLabel lvl4 = new JLabel("������� 4");
		lvl4.setFont(titleFont);
		buildingWindow.add(lvl4, c);
		c.gridy = 7;
		buildingWindow.add(cirk, c);
		c.gridx = 1;
		buildingWindow.add(ferma,c);
		c.gridx = GridBagConstraints.REMAINDER;
		c.gridy = 8;
		JLabel lvl5 = new JLabel("������� 5");
		lvl5.setFont(titleFont);
		buildingWindow.add(lvl5, c);
		c.gridy = 9;
		buildingWindow.add(radio, c);
		c.gridx = 1;
		buildingWindow.add(zavod, c);
		buildingWindow.pack();
		buildingWindow.setLocationRelativeTo(null);
		buildingWindow.toFront();
		buildingWindow.setAlwaysOnTop(true);
		buildingWindow.setVisible(true);
	}
	static class Exit implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			buildingWindow.dispose();
		}
	}
}
