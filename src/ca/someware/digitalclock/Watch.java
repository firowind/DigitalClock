package ca.someware.digitalclock;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

public class Watch extends JFrame
{
	/**
	 * v1.0 Initial
	 */
	private static final long serialVersionUID = 1L;
	
	private JPopupMenu jpmRightClick;
	private JMenuItem jmiTest;

	private Display display;

	private boolean mouseIn = false;

	public Watch()
	{
		super();
		init();
		
		new Timer(display);
	}

	private void init()
	{
		
		display = new Display();

		display.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent me) { }

			public void mouseEntered(MouseEvent me) {
				mouseIn = true;
			}

			public void mouseExited(MouseEvent me) {
				mouseIn = false;
			}

			public void mousePressed(MouseEvent me) { }

			public void mouseReleased(MouseEvent me) {
				if (mouseIn && SwingUtilities.isRightMouseButton(me)) {
					jpmRightClick.show(me.getComponent(), me.getX(), me.getY());
				}
			}
		});

		jmiTest = new JMenuItem("Test");
		jpmRightClick = new JPopupMenu();
		jpmRightClick.add(jmiTest);

		this.add(display);


		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.pack();
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		SwingUtilities.updateComponentTreeUI(this);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Watch();
	}
}
