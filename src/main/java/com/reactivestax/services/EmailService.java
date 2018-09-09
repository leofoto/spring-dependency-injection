package com.reactivestax.services;

public class EmailService implements MessageService {
	@Override
	public boolean sendMessage(String msg, String rec) {
		System.out.println("Email Sent to "+rec+ " with Message="+msg);
		System.out.println("Extra println from Nagarjun22: Email Sent to "+rec+ " with Message="+msg);
		return true;
	}

}
