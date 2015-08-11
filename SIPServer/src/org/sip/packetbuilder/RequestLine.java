package org.sip.packetbuilder;

public class RequestLine {

	private String method;
	private SIPUri sipuri;
	
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public SIPUri getSipuri() {
		return sipuri;
	}
	public void setSipuri(SIPUri sipuri) {
		this.sipuri = sipuri;
	}
	
	
	
}
