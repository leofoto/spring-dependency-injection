package com.reactivestax.services;

public class SMSService implements MessageService {

	public boolean sendMessage(String msg, String rec) {
		System.out.println("SMS Sent to "+rec+ " with Message="+msg);
		return true;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}
}
