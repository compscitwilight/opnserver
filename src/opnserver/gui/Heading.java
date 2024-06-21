package opnserver.gui;

import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Heading extends GUIElement {
	private final JPanel HeadingPanel = new JPanel();
	private final JLabel HeadingText = new JLabel("opnserver");
	private final JLabel BriefText = new JLabel("A utility for scanning Minecraft servers.");
	
	public Heading() {
		this.HeadingPanel.add(this.HeadingText);
		this.HeadingPanel.add(this.BriefText);
	}
	
	public JComponent get() {
		return this.HeadingPanel;
	}
}