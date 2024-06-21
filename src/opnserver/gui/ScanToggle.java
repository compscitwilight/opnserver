package opnserver.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import opnserver.Main;

public class ScanToggle {
	public boolean state = false;
	
	private final JPanel MainPanel = new JPanel();
	private final JButton ToggleButton = new JButton("Start Scanning");
	private final JButton CloseButton = new JButton("Close");
	
	public ScanToggle() {
		this.ToggleButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (Main.FileChooser.getSelectedFile() != null)
					toggleState();
				else {
					JDialog NoFileChosenDialog = new JDialog();
					NoFileChosenDialog.setTitle("No output file chosen.");
					NoFileChosenDialog.add(new JLabel("Please select a SQLite file before attempting to start the scan."));
					NoFileChosenDialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				}
			}
		});
		this.MainPanel.add(this.ToggleButton);
		
		this.CloseButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		this.MainPanel.add(this.CloseButton);
	}
	
	public void toggleState() {
		this.state = !this.state;
		ToggleButton.setText((this.state) ? "Stop Scanning" : "Start Scanning");
	}
	
	public JComponent get() {
		return this.MainPanel;
	}
}
