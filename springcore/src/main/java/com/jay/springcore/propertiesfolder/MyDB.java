package com.jay.springcore.propertiesfolder;

public class MyDB {
	private String dbServer;
	private String dbUser;
	private double host;
	
	MyDB(String server, String user, double host) {
		this.dbServer = server;
		this.dbUser = user;
		this.host = host;
	}

	@Override
	public String toString() {
		return "MyDB [dbServer=" + dbServer + ", dbUser=" + dbUser + ", host=" + host + "]";
	}
}
