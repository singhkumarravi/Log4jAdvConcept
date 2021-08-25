package com.app.test;

import org.apache.log4j.Logger;

public class TestLog4j {
	private static Logger logs =Logger.getLogger(TestLog4j.class);	
	public static void main(String[] args) {
	logs.debug("Printing the all log4j method............");
	logs.debug("DEBUG");
	logs.info("INFO");
	logs.warn("WARN");
	logs.error("ERRor");
	logs.fatal("FATAL");
	
	}


}
