package com.reactivestax.services;

//@Bean
public class SMSService implements MessageService {
	@Override
	public boolean sendMessage(String msg, String rec) {
		System.out.println("SMS Sent to "+rec+ " with Message="+msg);
		return true;
	}
}
