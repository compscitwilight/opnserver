package opnserver;

import java.net.InetSocketAddress;

public class MCServerScan {
	public InetSocketAddress host;
	public MCScanStatus status;
	
	private Exception exception;
	
	public MCServerScan(InetSocketAddress host, MCScanStatus status) {
		this.host = host;
		this.status = status;
	}
	
	public Exception getException() {
		return this.exception;
	}
	
	public void setException(Exception ex) {
		this.exception = ex;
	}
}