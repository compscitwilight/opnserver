package opnserver;

public enum MCScanStatus {
	// Indicates a successful scan of a Minecraft server.
	SUCCESS,
	
	// Indicates that the scan was successful, but did not indicate an actual Minecraft server.
	NON_MC,
	
	// Indicates that the scan failed.
	FAILURE
}
