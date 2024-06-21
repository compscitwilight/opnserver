package opnserver;

import java.net.InetSocketAddress;
import java.net.InetAddress;

import opnserver.gui.*;

public class Main {
	public static final int DEFAULT_PORT = 25565;
	public static final GUIWindow MainWindow = new GUIWindow();
	public static final Heading WindowHeading = new Heading();
	public static final ScanToggle ScanTogglePanel = new ScanToggle();
	public static final TotalScansView TotalScansTable = new TotalScansView();
	public static final DatabaseFileChooser FileChooser = new DatabaseFileChooser();
	
	public static void main(String[] args) {
		MainWindow.add(WindowHeading.get());
		MainWindow.add(TotalScansTable.get());
		MainWindow.add(FileChooser.get());
		MainWindow.add(ScanTogglePanel.get());
		MainWindow.show();
		
		try {
			InetSocketAddress address = new InetSocketAddress(InetAddress.getByName("127.0.0.1"), 25565);
			MCSocket socket = new MCSocket(address);
			boolean isServer = socket.scan();
			System.out.println("Now scanning.");
			System.out.println(isServer);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
