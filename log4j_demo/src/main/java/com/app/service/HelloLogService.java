package com.app.service;

import org.apache.log4j.Logger;

public class HelloLogService {
	
	public static Logger log = Logger.getLogger(HelloLogService.class);
	
	
	public void helloLog() {
		log.info("Hello and goodbye from log service helloLog()");
	}

}
