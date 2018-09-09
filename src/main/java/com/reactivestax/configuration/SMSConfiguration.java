package com.reactivestax.configuration;

import com.reactivestax.services.EmailService;
import com.reactivestax.services.MessageService;
import com.reactivestax.services.SMSService;
import com.reactivestax.services.TwitterService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
//@ComponentScan(value={"com.reactivestax"})
@Profile("smsProfile")
public class SMSConfiguration {
    @Bean
    public MessageService getSMSMessageService(){
        return new SMSService();
    }

}
