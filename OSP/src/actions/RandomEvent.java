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
				s= "Наступила неделя программиста! Один Алтарь бесплатно!"; 
				message(s); 
				session.SetCountA(session.GetCountA() + 1);
				break;
			}
		case 11: 
		{
			s= "Молния убила священника и оставила церковь без хозяина! Как же так! Минус 2 мощи!";
			message(s); 
			session.SetPow(session.GetPow() - 2);
			break;
		}
		case 12: 
		{
			s= "На радиовышке перепутали записи! Вместо вероисповеданий целых 48 часов играли богохульные песни! Минус 5 единицы мощи!";
			message(s); 
			session.SetPow(session.GetPow() - 5);
			break;
		}
		case 13:
		{
			s= "Послушники опровергли факт, что земля круглая! На земле в форме диска можно построить на 1 постройку больше!";
			session.SetCountMax(session.GetCountMax() + 1);
			message(s); 
			break;
		}
		case 14: 
		{
			s= "На МКС астронавты говорят, что видели вас в иллюминатор! А вы красавчик! Плюс 2 единицы силы!";
			session.SetPow(session.GetPow() +2);
			message(s); 
			break;
		}
		case 15: 
		{
			s= "Послушники нарисовали ваш портрет в масштабе 100 к 1! Плюс 3 единицы силы, минус 1 единица припасов!";
			session.SetPow(session.GetPow() + 3);
			session.SetRes(session.GetRes() - 1);
			message(s); 
			break;
		}
		case 16: 
		{
			s= "Кто-то из послушников украл голову от одной из ваших статуй для поклонения вам. Плюс 2 единицы мощи, минус 1 единица припасов!";
			session.SetPow(session.GetPow() +2);
			session.SetRes(session.GetRes() -1);
			message(s); 
			break;
		}
		case 17: 
		{
			s= "Послушники решили, что построить вам алтарь из переработанных материалов -это будет куда экономнее! Плюс 5 единиц припасов, минус 1 единица мощи!";
			message(s); 
			break;
		}
		case 18: 
		{
			s= "Сегодня у вас день рождения! Послушники испекли вам огромный торт!. Плюс 10 единиц мощи, минус 1 единица припасов!";
			session.SetPow(session.GetPow() + 10);
			session.SetRes(session.GetRes() - 1);
			message(s); 
			break;
		}
		case 19:
		{
			s= "Вы проспали извержение вулкана и не смогли спасти свои земли от беды! Минус 5 единиц припасов, минус 10 послушников!";
			session.SetRes(session.GetRes() - 5);
			session.SetPos(session.GetPos() - 10);
			message(s); 
			break;
		}
		case 20: 
		{
			s= "Вы решили еще немного поспать и дали передохнуть послушникам, которые так старательно выполняют ваши прихоти. Плюс 1 единица мощи!";
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
			s= "Атеисты снова говорят, что вы не существуете! В порыве гнева, вы сломали рынок!";
			session.SetCountS(session.GetCountS() + 1);
			message(s); 
			break;
			}
		}
		case 22: 
		{
			s= "Вы осознали тщетность и бытия и затосковали. Минус 1 единица мощи.";
			session.SetPow(session.GetPow() - 1);
			message(s); 
			
			break;
		}
		case 23: 
		{
			s= "Послушники сказали, что любят вас! Плюс 1 единица мощи!";
			session.SetPow(session.GetPow() + 1);
			message(s); 
			
			break;
		}
		case 24: 
		{
			s= "Среди ваших послушников не нашлось дизайнера и вы не смогли пойти на Божественный Хакатон! Минус 5 единиц припасов!";
			session.SetRes(session.GetRes() - 5);
			message(s); 
			
			break;
		}
		case 25: 
		{
			s= "День святого Патрика. Большинство ваших послушников пьянs и не восхищаются вами! Минус 5 единиц мощи!";
			session.SetPow(session.GetPow() - 5);
			message(s); 
			
			break;
		}
		case 26: 
		{
			s= "Детей начали учить лепить ваши статуи из пластилина! Плюс 3 единицы мощи, плюс 1 единица ресурсов!";
			session.SetRes(session.GetRes() + 1);
			session.SetPow(session.GetPow() + 3);
			message(s); 
			
			break;
		}
		case 27: 
		{
			s= "Лунная призма дала силы вашим послушникам! Плюс 10 единиц мощи!";
			session.SetPow(session.GetPow() + 10);
			message(s); 
			
			break;
		}
		case 28: 
		{
			s= "Астрологи объявили неделю Бесполезных сообщений! Это - одно из них!";
			message(s); 
			break;
		}
		case 29:
			s="Вы остановили вращение Земли! Так забавнее. Плюс 3 единицы припасов!";
			message(s);
			break;
		}
	}
	
	public static void message(String s) {
		JOptionPane.showMessageDialog(new JWindow(), s);
		
	}

}
