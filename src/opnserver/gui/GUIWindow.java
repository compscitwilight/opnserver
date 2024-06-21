package opnserver.gui;

import java.awt.FlowLayout;

import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JFrame;

public class GUIWindow {
	public static final int WINDOW_HEIGHT = 600;
	public static final int WINDOW_WIDTH = 600;
	
	private final JFrame WindowFrame = new JFrame("opnserver");
	private final FlowLayout WindowLayout = new FlowLayout();
	
	public GUIWindow() {}
	
	public void show() {
		WindowFrame.setLayout(WindowLayout);
		WindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		WindowFrame.pack();
		WindowFrame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		WindowFrame.setVisible(true);
	}
	
	public void add(JComponent item) {
		this.WindowFrame.add(item);
	}
}
