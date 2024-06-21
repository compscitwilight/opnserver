package opnserver.gui;

import java.io.File;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JFileChooser;

public class DatabaseFileChooser extends GUIElement {
	private final JPanel MainPanel = new JPanel();
	private final JFileChooser FileChooser = new JFileChooser();
	
	public DatabaseFileChooser() {
		this.MainPanel.add(this.FileChooser);
	}
	
	public File getSelectedFile() {
		return this.FileChooser.getSelectedFile();
	}
	
	public JComponent get() {
		return this.MainPanel;
	}
}
