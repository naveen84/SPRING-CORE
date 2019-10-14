package com.naveen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionInjectionMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("collectionspring.xml");
		CollectionInjection collections = (CollectionInjection)ctx.getBean(CollectionInjection.class);
		System.out.println("LIST OF USERS "+collections.getUsers());
		System.out.println("SET OF CUSTOMERS "+collections.getCustomer());
		System.out.println("MAP OF CONTACTS "+collections.getContacts());
		System.out.println("PROPERTIES OF EMAILS "+collections.getEmails());

	}

}
