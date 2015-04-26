package actions;

import java.awt.BorderLayout;
import java.awt.FontFormatException;
import java.io.IOException;

import windows.GameWindow;

public class updateFrame extends GameWindow {
	public static void updateFrame() {
		newFrame.remove(top);
        newFrame.remove(left);
        newFrame.remove(right);
        newFrame.remove(bottom);
        newFrame.remove(center);
        newFrame.revalidate();
        newFrame.repaint();
        newFrame.setLayout(new BorderLayout());
        try {
			right = getRightPanel();
		} catch (FontFormatException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		bottom = getBottomPanel();
		try {
			center = getCenterPanel();
		} catch (FontFormatException | IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        try {
			top = getTopPanel();
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        try {
			left = getLeftPanel();
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        newFrame.add(top, BorderLayout.NORTH);
		newFrame.add(right, BorderLayout.EAST);
		newFrame.add(left, BorderLayout.WEST);
		newFrame.add(bottom, BorderLayout.SOUTH);
		newFrame.add(center, BorderLayout.CENTER);
        newFrame.revalidate();
	}
}
