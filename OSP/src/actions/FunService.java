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
				case 0: JOptionPane.showMessageDialog(new JWindow(), "Сон - это хорошо. Лучше иди поспи."); break;
				case 1: JOptionPane.showMessageDialog(new JWindow(), "Ложки нет."); break;
				case 2: JOptionPane.showMessageDialog(new JWindow(), "Коль решишь явить свою мощь, твое царство падет."); break;
				case 3: JOptionPane.showMessageDialog(new JWindow(), "Чертовски хороший кофе!"); break;
				case 4: JOptionPane.showMessageDialog(new JWindow(), "На самом деле, все это - игра."); break;	
				case 5: JOptionPane.showMessageDialog(new JWindow(), "Не суй пальцы в розетку."); break;	
				case 6: JOptionPane.showMessageDialog(new JWindow(), "Следи за количеством послушников и ресурсов. Будьте внимателен с приростом их показателей."); break;	
				case 7: JOptionPane.showMessageDialog(new JWindow(), "Строй здания с умом! От построенных зданий зависит прирост основных показателей и, в конечном счете, исход игры."); break;	
				case 8: JOptionPane.showMessageDialog(new JWindow(), "У тебя глазки не устали? Прервись на минутку - посмотри в стену."); break;	
				case 9: JOptionPane.showMessageDialog(new JWindow(), "Следи за условием перехода на новый уровень и пытайся его выполнить."); break;	
				case 10: JOptionPane.showMessageDialog(new JWindow(), "Мощь позволяет тебе творить заклинанием."); break;	
				case 11: JOptionPane.showMessageDialog(new JWindow(), "Если нажмешь на мой портрет, получишь полезный совет!"); break;	
				case 12: JOptionPane.showMessageDialog(new JWindow(), "Если тыкнешь на меня сотню раз, то ты молодец."); break;	
				case 13: JOptionPane.showMessageDialog(new JWindow(), "Тебе нравится причинять людям боль?"); break;	
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
