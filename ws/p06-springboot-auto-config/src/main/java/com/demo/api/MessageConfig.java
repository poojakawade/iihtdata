package com.demo.api;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {

	@ConditionalOnMissingBean(MessageConverter.class)
	@Bean
	public MessageConverter getMessageConverter() {
		return new EnglishConverter();
	}

}
