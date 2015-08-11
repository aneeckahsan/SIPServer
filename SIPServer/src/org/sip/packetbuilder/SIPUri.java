package org.sip.packetbuilder;

public class SIPUri {
	
	String	name;
	String	displayName;
	String	ip;
	String	port;
	
	public SIPUri(String name, String displayName, String ip, String proxy, String port)
	{
		this.name = name;
		this.displayName = displayName;
		this.ip = ip;
		this.port = port;
	}
}
