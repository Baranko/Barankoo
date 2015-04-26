package actions;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JWindow;

import windows.GameWindow;

public class RandomEvent extends GameWindow {
	public static void Event() {
		Random random = new Random();
		int r = random.nextInt(80);
		String s;
		switch(r) {
		case 10: 
			{
				s= "��������� ������ ������������! ���� ������ ���������!"; 
				message(s); 
				session.SetCountA(session.GetCountA() + 1);
				break;
			}
		case 11: 
		{
			s= "������ ����� ���������� � �������� ������� ��� �������! ��� �� ���! ����� 2 ����!";
			message(s); 
			session.SetPow(session.GetPow() - 2);
			break;
		}
		case 12: 
		{
			s= "�� ���������� ���������� ������! ������ ��������������� ����� 48 ����� ������ ����������� �����! ����� 5 ������� ����!";
			message(s); 
			session.SetPow(session.GetPow() - 5);
			break;
		}
		case 13:
		{
			s= "���������� ���������� ����, ��� ����� �������! �� ����� � ����� ����� ����� ��������� �� 1 ��������� ������!";
			session.SetCountMax(session.GetCountMax() + 1);
			message(s); 
			break;
		}
		case 14: 
		{
			s= "�� ��� ���������� �������, ��� ������ ��� � �����������! � �� ���������! ���� 2 ������� ����!";
			session.SetPow(session.GetPow() +2);
			message(s); 
			break;
		}
		case 15: 
		{
			s= "���������� ���������� ��� ������� � �������� 100 � 1! ���� 3 ������� ����, ����� 1 ������� ��������!";
			session.SetPow(session.GetPow() + 3);
			session.SetRes(session.GetRes() - 1);
			message(s); 
			break;
		}
		case 16: 
		{
			s= "���-�� �� ����������� ����� ������ �� ����� �� ����� ������ ��� ���������� ���. ���� 2 ������� ����, ����� 1 ������� ��������!";
			session.SetPow(session.GetPow() +2);
			session.SetRes(session.GetRes() -1);
			message(s); 
			break;
		}
		case 17: 
		{
			s= "���������� ������, ��� ��������� ��� ������ �� �������������� ���������� -��� ����� ���� ���������! ���� 5 ������ ��������, ����� 1 ������� ����!";
			message(s); 
			break;
		}
		case 18: 
		{
			s= "������� � ��� ���� ��������! ���������� ������� ��� �������� ����!. ���� 10 ������ ����, ����� 1 ������� ��������!";
			session.SetPow(session.GetPow() + 10);
			session.SetRes(session.GetRes() - 1);
			message(s); 
			break;
		}
		case 19:
		{
			s= "�� �������� ���������� ������� � �� ������ ������ ���� ����� �� ����! ����� 5 ������ ��������, ����� 10 �����������!";
			session.SetRes(session.GetRes() - 5);
			session.SetPos(session.GetPos() - 10);
			message(s); 
			break;
		}
		case 20: 
		{
			s= "�� ������ ��� ������� ������� � ���� ����������� �����������, ������� ��� ����������� ��������� ���� �������. ���� 1 ������� ����!";
			session.SetPow(session.GetPow() + 1);
			message(s); 
			
			break;
		}
		case 21:
		{
			if (session.GetCountS()==0)
				Event();
			else
			{
			s= "������� ����� �������, ��� �� �� �����������! � ������ �����, �� ������� �����!";
			session.SetCountS(session.GetCountS() + 1);
			message(s); 
			break;
			}
		}
		case 22: 
		{
			s= "�� �������� ��������� � ����� � �����������. ����� 1 ������� ����.";
			session.SetPow(session.GetPow() - 1);
			message(s); 
			
			break;
		}
		case 23: 
		{
			s= "���������� �������, ��� ����� ���! ���� 1 ������� ����!";
			session.SetPow(session.GetPow() + 1);
			message(s); 
			
			break;
		}
		case 24: 
		{
			s= "����� ����� ����������� �� ������� ��������� � �� �� ������ ����� �� ������������ �������! ����� 5 ������ ��������!";
			session.SetRes(session.GetRes() - 5);
			message(s); 
			
			break;
		}
		case 25: 
		{
			s= "���� ������� �������. ����������� ����� ����������� ����s � �� ����������� ����! ����� 5 ������ ����!";
			session.SetPow(session.GetPow() - 5);
			message(s); 
			
			break;
		}
		case 26: 
		{
			s= "����� ������ ����� ������ ���� ������ �� ����������! ���� 3 ������� ����, ���� 1 ������� ��������!";
			session.SetRes(session.GetRes() + 1);
			session.SetPow(session.GetPow() + 3);
			message(s); 
			
			break;
		}
		case 27: 
		{
			s= "������ ������ ���� ���� ����� �����������! ���� 10 ������ ����!";
			session.SetPow(session.GetPow() + 10);
			message(s); 
			
			break;
		}
		case 28: 
		{
			s= "��������� �������� ������ ����������� ���������! ��� - ���� �� ���!";
			message(s); 
			break;
		}
		case 29:
			s="�� ���������� �������� �����! ��� ��������. ���� 3 ������� ��������!";
			message(s);
			break;
		}
	}
	
	public static void message(String s) {
		JOptionPane.showMessageDialog(new JWindow(), s);
		
	}

}
