package actions;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JWindow;

public class FunService {

	public static class tipsFromGod implements MouseListener {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			Random random = new Random();
			int r = random.nextInt(14);
				switch(r) {
				case 0: JOptionPane.showMessageDialog(new JWindow(), "��� - ��� ������. ����� ��� �����."); break;
				case 1: JOptionPane.showMessageDialog(new JWindow(), "����� ���."); break;
				case 2: JOptionPane.showMessageDialog(new JWindow(), "���� ������ ����� ���� ����, ���� ������� �����."); break;
				case 3: JOptionPane.showMessageDialog(new JWindow(), "��������� ������� ����!"); break;
				case 4: JOptionPane.showMessageDialog(new JWindow(), "�� ����� ����, ��� ��� - ����."); break;	
				case 5: JOptionPane.showMessageDialog(new JWindow(), "�� ��� ������ � �������."); break;	
				case 6: JOptionPane.showMessageDialog(new JWindow(), "����� �� ����������� ����������� � ��������. ������ ���������� � ��������� �� �����������."); break;	
				case 7: JOptionPane.showMessageDialog(new JWindow(), "����� ������ � ����! �� ����������� ������ ������� ������� �������� ����������� �, � �������� �����, ����� ����."); break;	
				case 8: JOptionPane.showMessageDialog(new JWindow(), "� ���� ������ �� ������? �������� �� ������� - �������� � �����."); break;	
				case 9: JOptionPane.showMessageDialog(new JWindow(), "����� �� �������� �������� �� ����� ������� � ������� ��� ���������."); break;	
				case 10: JOptionPane.showMessageDialog(new JWindow(), "���� ��������� ���� ������� �����������."); break;	
				case 11: JOptionPane.showMessageDialog(new JWindow(), "���� ������� �� ��� �������, �������� �������� �����!"); break;	
				case 12: JOptionPane.showMessageDialog(new JWindow(), "���� ������� �� ���� ����� ���, �� �� �������."); break;	
				case 13: JOptionPane.showMessageDialog(new JWindow(), "���� �������� ��������� ����� ����?"); break;	
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
		
	}
}
