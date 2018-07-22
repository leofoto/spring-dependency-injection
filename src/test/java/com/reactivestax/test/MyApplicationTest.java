package com.reactivestax.test;

import com.reactivestax.services.EmailService;
import com.reactivestax.services.SMSService;
import org.junit.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.reactivestax.consumer.MyApplication;
import com.reactivestax.services.MessageService;

@Configuration
@ComponentScan(value="com.reactivestax")
public class MyApplicationTest {
	
	private AnnotationConfigApplicationContext context = null;

//	@Bean
//	public MessageService getMessageService() {
//		return new MessageService(){
//			public boolean sendMessage(String msg, String rec) {
//				System.out.println("Mock Service");
//				return true;
//			}
//		};
//	}

//    @Autowired
//    MessageService messageService;

	@Before
	public void setUp() throws Exception {
		context = new AnnotationConfigApplicationContext(MyApplicationTest.class);
	}
	
	@After
	public void tearDown() throws Exception {
		context.close();
	}

	@Test
	public void test() {
		MyApplication app = context.getBean(MyApplication.class);
        Assert.assertTrue("injected service should be EmailService type",app.getService() instanceof EmailService);
        Assert.assertTrue("emailService call should complete successfully",app.processMessage("Hi Robin", "robin@reactivestax.com"));
//        System.out.println("serviceHashCode = " + app.getService().hashCode());

//        MyApplication newApp = context.getBean(MyApplication.class);
//        Assert.assertTrue("injected service should be EmailService type",newApp.getService() instanceof SMSService);
//        Assert.assertTrue(newApp.processMessage("Hi Robin", "robin@reactivestax.com"));
//        System.out.println("serviceHashCode = " + newApp.getService().hashCode());
    }
}
