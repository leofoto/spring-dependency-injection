package com.reactivestax.consumer;

import com.reactivestax.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.reactivestax.services.MessageService;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@Scope("prototype")
public class MyApplication {

	//field-based dependency injection
	@Autowired
    @Qualifier("emailService")
	private MessageService service;


//	constructor-based dependency injection	
//	@Autowired
//	public MyApplication(MessageService svc){
//		this.service=svc;
//	}
	
//	@Autowired
//	@Qualifier("smsService")
//	public void setService(MessageService svc){
//		this.service=svc;
//	}

	public MessageService getService() {
		return service;
	}

	public boolean processMessage(String msg, String rec){
		//some magic like validation, logging etc
		return getService().sendMessage(msg, rec);
	}
}


//    @PostConstruct
//    public void init(){
//        System.out.println("MyService init method called");
//    }
//
//
//    @PreDestroy
//    public void destory(){
//        System.out.println("MyService destroy method called");
//    }