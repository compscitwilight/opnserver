package opnserver.gui;

import java.util.ArrayList;

import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

import opnserver.MCServerScan;

public class TotalScansView {
	public final ArrayList<MCServerScan> Scans = new ArrayList<MCServerScan>();
	private final TableModel Model = new AbstractTableModel() {
		private static final long serialVersionUID = 1L;

		@Override
		public int getRowCount() {
			return Scans.size();
		}

		@Override
		public int getColumnCount() {
			return 2;
		}

		@Override
		public Object getValueAt(int rowIndex, int columnIndex) {
			MCServerScan SelectedScan = (MCServerScan) Scans.toArray()[rowIndex];
			return switch (columnIndex) {
				case 0 -> SelectedScan.host;
				case 1 -> SelectedScan.status;
				default -> SelectedScan.host;
			};
		}
	};
	
	private final JTable ScansTable = new JTable(Model);
	private final JScrollPane TableScrollPane = new JScrollPane(ScansTable);
	private final JPanel TablePanel = new JPanel();
	
	public TotalScansView() {
		TableColumn HostColumn = new TableColumn();
		HostColumn.setHeaderValue("Hostname");
		
		TableColumn StatusColumn = new TableColumn();
		StatusColumn.setHeaderValue("Status");
		
		ScansTable.addColumn(HostColumn);
		ScansTable.addColumn(StatusColumn);
		
		TablePanel.add(TableScrollPane);
	}
	
	public JComponent get() {
		return this.TablePanel;
	}
}
