package com.frankmoley.boot.landon.logging.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("landon.logging")
public class LandonLoggingProperties {
	private String loggerName = "LandonAutditLogger";

	public String getLoggerName() {
		return loggerName;
	}

	public void setLoggerName(String loggerName) {
		this.loggerName = loggerName;
	}
}
