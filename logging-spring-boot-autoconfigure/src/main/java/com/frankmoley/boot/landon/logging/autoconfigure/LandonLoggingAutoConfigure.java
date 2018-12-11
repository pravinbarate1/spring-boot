package com.frankmoley.boot.landon.logging.autoconfigure;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.frankmoley.landon.aop.LoggableAspect;

@Configuration
@ConditionalOnClass(LoggableAspect.class)
@EnableConfigurationProperties(LandonLoggingProperties.class)
public class LandonLoggingAutoConfigure {

	@Autowired
	private LandonLoggingProperties properties;
	
	public LoggableAspect loggableAspect() {
		return new LoggableAspect(properties.getLoggerName());
	}
}
