package actions;

import java.awt.BorderLayout;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import windows.GameWindow;

public class Stroy extends GameWindow {
	public static class AltPlus implements MouseListener
	{
		@Override
		public void mouseClicked(MouseEvent arg0) {
			if ((session.GetRes()>=3)&&(session.GetCountAll()<=session.GetCountMax()))
			{
				session.SetCountA(session.GetCountA()+1); //Dobavlyaet 1 altar
				session.SetCountAll(session.GetCountAll() + 1); //Pereschet postroek
				session.SetPrihodRes(session.GetPrihodRes() + 2); //Dobavlyaet prihod resursov na 2
				session.SetPrihodPos(session.GetPrihodPos() - 5); //Umenshaet 5 poslushnikov na kazdom hody
				session.SetRes(session.GetRes() - 3); //Zabiraet 3 resur
				updateFrame.updateFrame();
			
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
	
	public static class MagPlus implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			if ((session.GetRes()>=3)&&(session.GetCountAll()<=session.GetCountMax()))
			{
				session.SetCountS(session.GetCountS() + 1); //Dobavlyaet 1 magazin
				session.SetCountAll(session.GetCountAll() + 1); //Pereschet postroek
				session.SetPrihodPos(session.GetPrihodPos() + 10); //Dobavlyaet prihod poslyshnikov na 10
				session.SetPrihodRes(session.GetPrihodRes() - 1); //Umenshaet 1 resurs na kazdom hody
				session.SetRes(session.GetRes() - 3); //Zabiraet 3 resursa
				updateFrame.updateFrame();
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
	
	public static class PamPlus implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent arg0) {
			if ((session.GetRes()>=5)&&(session.GetLvl()>1)&&(session.GetCountAll()<=session.GetCountMax()))
			{
				session.SetCountM(session.GetCountM() + 1); //Dobavlyaet 1 statuja
				session.SetCountAll(session.GetCountAll() + 1); //Pereschet postroek
				session.SetPrihodPos(session.GetPrihodPos() + 5); //Dobavlyaet prihod poslyshnikov na 5
				session.SetPrihodRes(session.GetPrihodRes() - 1); //Umenshaet 1 resurs na kazdom hody
				session.SetPrihodPow(session.GetPrihodPow() + 1); //Dobavlyaet prihod power na 1
				session.SetRes(session.GetRes() - 5); //Zabiraet 5 resursa
				updateFrame.updateFrame();
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
	
	public static class UchPlus implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			if ((session.GetRes()>=6)&&(session.GetLvl()>1)&&(session.GetCountAll()<=session.GetCountMax()))
			{
				session.SetCountSch(session.GetCountSch() + 1); //Dobavlyaet 1 statuja
				session.SetCountAll(session.GetCountAll() + 1);
				session.SetPrihodRes(session.GetPrihodRes() + 5); //Dobavlyaet prihod resursov na 5
				session.SetPrihodPos(session.GetPrihodPos() - 5); //Umenshaet 5 resurs na kazdom hody
				session.SetPrihodPow(session.GetPrihodPow() - 1); //Umenshaet prihod power na 1
				session.SetRes(session.GetRes() - 6); //Zabiraet 6 resursa
				updateFrame.updateFrame();
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
	
	public static class AmfiPlus implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			if ((session.GetRes()>=10)&&(session.GetLvl()>2)&&(session.GetCountAll()<=session.GetCountMax()))
			{
				session.SetCountAmf(session.GetCountAmf() + 1);
				session.SetCountAll(session.GetCountAll() + 1);
				session.SetPrihodRes(session.GetPrihodRes() - 6); 
				session.SetPrihodPos(session.GetPrihodPos() + 11); 
				session.SetPrihodPow(session.GetPrihodPow() + 1); 
				session.SetRes(session.GetRes() - 10); 
				updateFrame.updateFrame();
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
	public static class PagodPlus implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			if ((session.GetRes()>=12)&&(session.GetLvl()>2)&&(session.GetCountAll()<=session.GetCountMax()))
			{
				session.SetCountPag(session.GetCountPag() + 1);
				session.SetCountAll(session.GetCountAll() + 1);
				session.SetPrihodRes(session.GetPrihodRes() + 7); 
				session.SetPrihodPos(session.GetPrihodPos() - 7); 
				session.SetPrihodPow(session.GetPrihodPow() - 2); 
				session.SetRes(session.GetRes() - 12); 
				updateFrame.updateFrame();
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
	public static class CirkPlus implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			if ((session.GetRes()>=13)&&(session.GetLvl()>3)&&(session.GetCountAll()<=session.GetCountMax()))
			{
				session.SetCountCirk(session.GetCountCirk() + 1);
				session.SetCountAll(session.GetCountAll() + 1);
				session.SetPrihodRes(session.GetPrihodRes() - 6); 
				session.SetPrihodPos(session.GetPrihodPos() + 10); 
				session.SetPrihodPow(session.GetPrihodPow() + 3); 
				session.SetRes(session.GetRes() - 13); 
				updateFrame.updateFrame();
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
	public static class FermaPlus implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			if ((session.GetRes()>=15)&&(session.GetLvl()>3)&&(session.GetCountAll()<=session.GetCountMax()))
			{
				session.SetCountFarm(session.GetCountFarm() + 1);
				session.SetCountAll(session.GetCountAll() + 1);
				session.SetPrihodRes(session.GetPrihodRes() + 9); 
				session.SetPrihodPos(session.GetPrihodPos() - 7); 
				session.SetPrihodPow(session.GetPrihodPow() + 1); 
				session.SetRes(session.GetRes() - 15); 
				updateFrame.updateFrame();
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
	
	public static class RadioPlus implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			if ((session.GetRes()>=18)&&(session.GetLvl()>4)&&(session.GetCountAll()<=session.GetCountMax()))
			{
				session.SetCountRadio(session.GetCountRadio() + 1); 
				session.SetCountAll(session.GetCountAll() + 1);
				session.SetPrihodPos(session.GetCountRadio() * session.GetPrihodPos() + session.GetPrihodPos()); 
				session.SetPrihodPow(session.GetPrihodPow() + 5); 
				session.SetRes(session.GetRes() - 18); 
				updateFrame.updateFrame();
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
	
	public static class ZavodPlus implements MouseListener
	{

		@Override
		public void mouseClicked(MouseEvent e) {
			if ((session.GetRes()>=22)&&(session.GetLvl()>4)&&(session.GetCountAll()<=session.GetCountMax()))
			{
				session.SetCountZavod(session.GetCountZavod() + 1); 
				session.SetCountAll(session.GetCountAll() + 1);
				session.SetPrihodRes(0.1 * session.GetCountZavod() * session.GetPrihodRes() + session.GetPrihodRes()); 
				session.SetPrihodPow(session.GetPrihodPow() + 5); 
				session.SetRes(session.GetRes() - 22); 
				updateFrame.updateFrame();
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
