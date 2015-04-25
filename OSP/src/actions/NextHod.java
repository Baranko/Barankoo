package actions;

import java.awt.BorderLayout;
import java.awt.FontFormatException;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import windows.GameWindow;

public class NextHod extends GameWindow {
	public static class nextMove implements MouseListener  {

		@Override
		public void mouseClicked(MouseEvent arg0) {
			session.SetPos(session.GetPos() + session.GetPrihodPos());
            if ((session.GetPrihodPos() < 0) && (Math.abs(session.GetPrihodPos()) > session.GetPos()))
            {
                session.SetPos(0);
            }
            session.SetRes(session.GetRes() + session.GetPrihodRes());

            //LvlUp

            if ((session.GetPos() > 30) && (session.GetRes() > 10))

            {

                session.SetLvl(2);

                if ((session.GetPos() > 40) && (session.GetRes() > 20))

                {

                    session.SetLvl(3);

                    if ((session.GetPos() > 50) && (session.GetRes() > 30))

                    {

                        session.SetLvl(4);

                        if ((session.GetPos() > 60) && (session.GetRes() > 40))

                        {

                            session.SetLvl(5);

                        }

                    }

                }
            }
        newFrame.remove(top);
        newFrame.revalidate();
        newFrame.repaint();
        try {
			top = getTopPanel();
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        newFrame.add(top, BorderLayout.NORTH);
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
