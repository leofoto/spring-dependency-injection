package com.reactivestax.consumer;

import com.reactivestax.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;

public class MyXMLApplication {
//	@Autowired
	private MessageService service;

	//constructor-based dependency injection
//	public MyXMLApplication(MessageService svc) {
//		this.service = svc;
//	}
	
	//setter-based dependency injection
	public void setService(MessageService svc){
		this.service=svc;
	}

	public boolean processMessage(String msg, String rec) {
		// some magic like validation, logging etc
		return this.service.sendMessage(msg, rec);
	}
}
