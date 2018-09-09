package com.reactivestax.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.reactivestax.consumer.MyXMLApplication;

public class ClientXMLApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		MyXMLApplication myXMLApplication = context.getBean(MyXMLApplication.class);

		myXMLApplication.processMessage("Hi Brijesh", "brijesh@reactivestax.com");

		// close the context
		context.close();
	}

}
