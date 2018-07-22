package com.reactivestax.configuration;

import com.reactivestax.services.SMSService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.reactivestax.services.EmailService;
import com.reactivestax.services.MessageService;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(value={"com.reactivestax"})
public class DIConfiguration {
	@Bean
    @Qualifier("emailService")
	public MessageService getEmailMessageService(){
		return new EmailService();
	}

    @Bean
    @Qualifier("smsService")
    public MessageService getSMSMessageService(){
        return new SMSService();
    }

}
