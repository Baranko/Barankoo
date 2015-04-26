package actions;

import java.awt.BorderLayout;
import java.awt.FontFormatException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JOptionPane;
import javax.swing.JWindow;

import windows.GameWindow;

public class NextHod extends GameWindow {
	static Boolean pit, otpus, bez, vish, obser, bez2, bez3, pres, vish2, obser2, agent, army, udar, jd, agent1, vzriv;
	public static class nextMove implements MouseListener  {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			session.SetPos(session.GetPos() + session.GetPrihodPos());
			session.SetPow(session.GetPow() + session.GetPrihodPow()); 
			session.SetHod(session.GetHod() + 1);
			
            if ((session.GetPrihodPos() < 0) && (Math.abs(session.GetPrihodPos()) > session.GetPos()))
            {
                session.SetPos(0);
            }
            session.SetRes(session.GetRes() + session.GetPrihodRes());

            if ((session.GetPos() > 15)||(session.GetRes() > 15))
			{
				session.SetLvl(2);
				session.SetCountMax(5);
				if ((session.GetPos() > 30)||(session.GetRes() > 30))
				{
					session.SetLvl(3);
					session.SetCountMax(8);
					if ((session.GetPos() > 60)||(session.GetRes() > 60))
					{
						session.SetLvl(4);
						session.SetCountMax(10);
						if ((session.GetPos() > 120)||(session.GetRes() > 120))
						{
							session.SetLvl(5);
							session.SetCountMax(15);
						}
					}
				}
			}
            
            
        RandomEvent.Event();
   
        
        switch(session.GetLvl()) {
        case 1: session.SetZatratMana(5); break;
        case 2: session.SetZatratMana(10); break;
        case 3: session.SetZatratMana(20); break;
        case 4: session.SetZatratMana(30); break;
        case 5: session.SetZatratMana(50); break;
        }
        
        session.SetStroy(false);
        session.SetZakl(false);
        if (session.GetPos() >= session.GetRes())
		{
			session.SetPos((int) session.GetRes());
			session.SetRes(session.GetPrihodRes());
		}
		if (session.GetPos() < session.GetRes())
		{
			session.SetRes(session.GetRes() - session.GetPos());
			session.SetPos(session.GetPos() + session.GetPrihodPos());
			session.SetRes(session.GetRes() + session.GetPrihodRes());
		}
		//Lose
		if (session.GetHod() == 30) {
			JOptionPane.showMessageDialog(new JWindow(), "������, �� ���������");
				newFrame.dispose();
		}
		if (session.GetCountRadio() == 1||session.GetCountZavod() ==1) {
			JOptionPane.showMessageDialog(new JWindow(), "������, �� ��������");
			newFrame.dispose();
		}
		if (session.GetShtrav()>0) {
			session.SetShtrav(session.GetShtrav() -1);
			if (session.GetBonusPos()!=0)
				session.SetPos(session.GetPos() + session.GetBonusPos());
			else
				session.SetRes(session.GetRes() + session.GetBonusRes());
		}
		   updateFrame.updateFrame();
		   
		   if (session.GetHod()==5) {
			   int input = JOptionPane.showOptionDialog(new JWindow(), "������� ���� ������������: \n ��� ����������! ������ ����� ��������� ����, � ���� ���� ����������� �������� ����� \n �����������. ���� � ����� ���������� ��������� �� �� ������������ �� ����� �����. �� \n �������� ������������������ ���� ����, ������� ���������, �� ��� �������� \n �����-�������������� ��������! ������ ������� � ����� ��������������� �������. \n ������, �� �� ���. ����������� ��������� �� ������ ����� ��������������� �������� �������� �����. \n �����������, ��� ���� �� ����� �� �������� ������. � ���������� ����� ����� � ����� \n ������������ ��������, ������� ������ � ������������� ����� ����� ������� �� ��� � ������� \n ���������� � ����. ����������� ���� ���������� �� ������� � �� �����. ������������, ��� ��� \n ������� ����� �������� �������� ��������� ����� ������ ��������, � ���������� �������� ���, \n ��� ������� ������� �� ������� ������ ����, ���� ����������. �����, ��� �� ����� ��� ������ \n ��������. \n Bene placito!", null, JOptionPane.OK_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"������ �� ������", "������� ������"}, null);
		   }
		   
		   if(session.GetHod()==8) {
			   int input = JOptionPane.showOptionDialog(new JWindow(), "������� ���� ������������: \n ������, �������� �������������. \n ������ ������, ���������������� ������ ����������, ������������� ����������. ��� \n �������� ���� ��������� �����. \n ������� ����� ���� ����� �������� ��������, ����� ��� \n ������� ������� ������������. �� �������� ���� ɒ�����. ������ �� ��������� � ����� �� \n ��������� ��������� �� ������� ����� ��� �������������� �������. �� ��� ������� �������� \n ������������. ��� �� ��������� ������, � �������?", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"������", "���������, �� ���������� ���������", "������ �� ������"}, null);
			   if(input == 0 ){
				   pit = true;
			   }
			   if(input == 1){
				   otpus = true;		
			   }
			   if(input == 2) {
				   bez = true;
			   }
		   }
		   if((session.GetHod()==12)&&(pit==true)) {
			   JOptionPane.showMessageDialog(new JWindow(), "������� ���� ������������: \n ��� ������� �� ����� � ����� � ������ � �������� ������! \n �����������, �� ����� ������� ������� ���� ������� �������� ������ �������, �� ��������� �� \n �������� ��������� �������. �����, ��� ������ ���� ���������� ���� ��������� � ����� \n ����� ������, �������� ���� ���������� � ������ �������. � ����� ����� �������� \n ����������� ���������, ������ ���������� ������� ���������� ������� �������� \n �����������. �� �� ����, ����������, ��� �������� ����� ������ �������� �������� ����, �� ��� \n � �������� ������� ��� ����� ��������� ������ ��� �����, � ����� ��������� ����� ���� �� \n ������������� � ����. \n ��������� ����� �������. ��� ��������������� �������� ������ ����� �� ���� �������, � ��� ���������� �������������. ���������� ����� ��������� �����, ��� ��� \n �� ���� ������������ ������ ����� ������. ��������� ��������� �������� ������ �������. \n �� ������ ������ �� ����: �� ����, �� ������������ ��� � ������, �� ������������� �����. \n ������ ����� ������� ����� ��������, ��� ����� ������ ���������� � � ��������� ����� \n ��������� ���-�� �������. � ���, ������ �����, ��������, ��� ������� ������� �������."); 
		   }
		   if((session.GetHod()==12)&&(otpus==true)) {
			   int input = JOptionPane.showOptionDialog(new JWindow(), "������� ���� ������������: \n �������� ���� � ����, ��������� ����������, ������ ����, \n ���������� � ��������� �� ��� ������ ������� ��������, ������� ���� �� ��������� ������� ���� \n  ����� ������ � ��� �� ���� �������� ������ �����, ���������! �� �� ���� ����� ������� \n ����셻 � ���������, �������� �������� � ������� �����������. \n ����� ����������� ����� ��������, ������� �� ���� ��� ��������� ��������. ���� �� ����������� ���������� ���� \n ���������� ������ �������. � �������, ����� �� ���������, ��� �����������, ���� ��� \n ���������� � ������ �������� ���������. ����� ���������� �� ��� �������� ����������. ������ � \n ������ ����� ������������ ������. \n �� �������� ������������� ����������� ������ \n ��������� �� ������ ���������� ������ � ��� ���������. �� ����� ����� ����� � ����� ��� \n ������� �������� �� �������� ������, �, ������, ������ � ����������� �����������. \n ���� ���� ����: ������ �� �� ���� ���������� �������� ������ � ��� ���������� ����� � ������  \n �����.", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"������ ������ �����", "������� ������ ������������", "������ �� ������"}, null);
			   if(input == 0) {
				   vish = true;
			   }
			   if(input == 1) {
				   obser =true;
			   }
			   if(input == 2) {
				   bez2 = true;
			   }
		   }
		   if((session.GetHod()==12)&&(bez==true)) {
			   int input = JOptionPane.showOptionDialog(new JWindow(), "������� ���� ������������:  \n ����� ����������� ����� ��������, ������� �� ���� ��� \n ��������� ��������. ���� �� ����������� ���������� ���� ���������� ������ �������. � \n �������, ����� �� ���������, ��� �����������, ���� ��� ���������� � ������ �������� ���������. \n ����� ���������� �� ��� �������� ����������. ������ � ������ ����� ������������ ������. \n ���������������� ����� ���������������, ������������� ������ ������������ ��������� �� \n ������� ������������, � ������� ��������� ��� ������� ���������. ��������, ��� ���� \n ������� ������������ ��������. ��������� ������� ��������� ��� ����� ������,  ��� ��� � ���� \n ������ �������� ����� ��� �����������.", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"������ ������ �����", "������� ������ ������������", "������������ ����������"}, null);
			   if(input == 0) {
				   vish2 = true;
			   }
			   if(input == 1) {
				   obser2 =true;
			   }
			   if(input == 2) {
				   pres = true;
			   }
		   }
		   if((session.GetHod()==16)&&((bez==true))||(bez2==true)) {
			   int input = JOptionPane.showOptionDialog(new JWindow(), "������� ���� ������������: \n ������� ������������ ����, ������� ������������� ��� ����� \n ������ ���������� � ��������� ������, �� ��������� � ������ ���������. �� ��� ��� �� �� \n ����� �� ����� � ������. ������ �������� �������� ��� � ����. \n������ ����� ������� ����� �� ����������. ��� ����������� ����� ��� ����� ���������� � ����� � ������ ���� ����������. \n ������ ����� �� ����� ����������� ���������� �����������, ����� ������ ���� ����������� \n �����. ������� � ����� ��� �����! Bene placito, ��� ������ ����. ���� ��� � ��� ��������. �� \n ����� ���� ������ ���� � ��������. ����� �� ������� � �� ������ ���� ������ � ������ ��� ����.", null, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"������ �������� �����", "�������� ������", "������ �� ������"}, null);
			   if(input == 0) {
				   army = true;
			   }
			   if(input == 1) {
				   agent =true;
			   }
			   if(input == 2) {
				   bez3 = true;
			   }
		   }
		   if((session.GetHod()==16)&&((obser==true))||(obser2==true)) {
			   int input = JOptionPane.showOptionDialog(new JWindow(), "������� ���� ������������:  \n ��� ��������, ������ ������ ����� ������ ��� �������. � \n ������ ������ �� ������ ��� ��� ��������� ����, ������, ��� ����� ���������� �� �� �����. \n � \n ��� ����� ���� ���������� ������������ � ��������� �� �������� ��������. ��� ����������� \n ����� ��� ����� ���������� � ����� � ������ ���� ����������. ������ ����� �� ����� \n ����������� ���������� �����������, ����� ������ ���� ����������� �����. ������� � ����� \n ��� �����! Bene placito, ��� ������ ����. ���� ��� � ��� ��������. �� ����� ���� ������ ���� \n � ��������. ����� �� ������� � �� ������ ���� ������ � ������ ��� ����.", null, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"������ �������� �����", "�������� ������"}, null);
			   if(input == 0) {
				   army = true;
			   }
			   if(input == 1) {
				   agent =true;
			   }
			   if(input == 2) {
				   bez3 = true;
			   }
		   }
			   if((session.GetHod()==16)&&((vish==true))||(vish2==true)) {
				   int input = JOptionPane.showOptionDialog(new JWindow(), "������� ����:  \n ������ ������ ��������� ��������. ���������� ����� ��� ������ \n ������������ ����� ������ ������� ��� �������. ������� ���� ��� ����, ����� � ���� �������� \n �� ��������� �����, � ���� ��������. �������, ����� � ������! ", null, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"������� ���� �� ������������ ", "��������� �������� ������ � ����������"}, null);
				   if (input ==0) {
					   udar = true;
				   }
				   if (input ==1) {
					   jd = true;
				   }
			   }
				   if((session.GetHod()==16)&&((vish==true))||(vish2==true)) {   
				   int input = JOptionPane.showOptionDialog(new JWindow(), "������� ���� �����: \n ��� ����������� ����� �������� �� ����������� ��������� ����. ��� \n ���� ���������� � �������� ���, ��� ���������� �������� � ������ ��������������� ������. \n ������, ��� ������� ���������� ���� ������������. \n �� ������� ������: \n ��� ����������� ������. ��� �����, �� ������ ���� ��� ��������� � ��������������� ������� ���� ���������. \n ��������� ������ �� ������ � ����������� � ��� ��������. �������� ������� ����� ���������� \n ���������� ������, �� ����� �� ������ ��������� ������� (� ��� ��������������� \n ������������ �������). ������ ��������� ������� ����� �������, ��� � ���������� ������� \n ������� �������� ������������ ��������� ����� ��������� � �������. ������� ���������� �� �������. \n ������� ���� �����: \n ��� ������ ���������. ������, ����� ����� ���������� �� \n ���������� ��� ������? ������! �� ������� ���� ����� ������ ������ ������ ������� ����! \n ��� ������, �� ���� �� �������� � ��� ������������� �� ������ ������ � ��������. ��������� \n ����� ��������� ������ ���� �� ���� ������� ���. � ��� �����, ������� ��� ����� �� �������� \n ���� �� �������. ��� ��������� ������, ����������? ", null, JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE, null, new Object[] {"�������� ���� ��������� ", "���������� �������� ������ � ����� "}, null);
				   if (input ==0) {
					   vzriv = true;
				   }
				   if (input == 1) {
					   agent1 = true;
				   }
 				   }
				   if((session.GetHod()==22)&&(vzriv=true)) {
					   JOptionPane.showMessageDialog(new JWindow(), "��� ������, ���� �������� �� ����������� ���� ����? \n ����� ����, �������. �� ����� \n ������ ������ ��������. ��� � ����� �������� ������ �� ������� ����������. �������� \n ������������ ������, ������ ������� ���� �� ���� �����, �������� ������� ���������� \n ��������� ����. \n ���� ���������, ������� ����� ����� ����� ������� ����� �� ����� ���, \n ����������, �������� ����, ���� �� ��������������� ��������� ������ ���. �������� ������� \n �������� ������ ��������� ���, � � ���� �� ��� ��� �������� ��������� ������. ���� ������� \n ��������� � ���� �� ������ ������� ������������� � ��������������� �� �����. \n ���� ��� ���� �������� ���� � �� ������� ��� �������, ��� ���������� ������������ ����� ���������� \n ������ ����������. �����, ��� ��� ��������, ������������� ������ ������� ������������ \n ��������� ������� � ��������� ��� ��������� ����� �� ����� �������. � ��� �� �� �����, � �� \n ������ �������, ������������, ������� ������, �� ������������. �������� ������, \n ���������� �� ������ ������� ����, ������, ��� ������� ���� ������ ������ ��������, ����� \n ������ � ����. ��� ������ ����� �������� ������ ����������. \n �� ������ �� �������� ��������, ������� ������ ���� ����� ��� �������� �������. ��� �� ������ ������ ������ \n  ���� ���������.");
					   newFrame.dispose();
				   }
				   if((session.GetHod()==22)&&(udar=true)) {
					   JOptionPane.showMessageDialog(new JWindow(), "������������ ����������. � ������ ��� ��� �� ���������. �� �������� ����� �� ������ \n ��������������� � ��� ����������. ������ ��� �������� �������� � ���, ��� ���� ��� ������� � \n ����� �����������, ��� �� �� ����� ������� ��� ��������������� �� ��������������� ������ \n ������� � ������������ ����� ������ (������ �� ��-�������� ������ �������� �� ����� ���������).");
					   
				   }
				   if((session.GetHod()==22)&&(jd=true)) {
					   JOptionPane.showMessageDialog(new JWindow(), "������������� ���� ������ ���������� �� ������� ������������ ��������� �����, � ������ \n ��� ������� ������� ����.  ������� ������������� ������ ���������, ������������� ������ \n ���������� ������. \n �� �������� ����� �� ������ ��������������� � ��� ����������. ������ \n ��� �������� �������� � ���, ��� ���� ��� ������� � ����� �����������, ��� �� �� ����� \n ������� ��� ��������������� �� ��������������� ������ ������� � ������������ ����� ������ \n (������ �� ��-�������� ������ �������� �� ����� ���������).");
				   }
			
		   
		  
		 
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
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	}
}
