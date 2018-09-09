package com.reactivestax.test;

import com.reactivestax.configuration.EmailConfiguration;
import com.reactivestax.consumer.MyApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EmailConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);
		
		app.processMessage("Hi Pandiyan", "pandiyan@abc.com");
		
		//close the context
		context.close();
	}

}
