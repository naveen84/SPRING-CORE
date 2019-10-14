package com.naveen;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class CollectionInjection {
	
	private List<User> users;
	private Set<Customer> customer;
	private Map<String,String> contacts;
	private Properties emails;
	
	public void setUsers(List<User> users) {
		this.users = users;
	}

	public void setCustomer(Set<Customer> customer) {
		this.customer = customer;
	}

	public void setContacts(Map<String, String> contacts) {
		this.contacts = contacts;
	}

	public void setEmails(Properties emails) {
		this.emails = emails;
	}

	public CollectionInjection(List<User> users, Set<Customer> customer, Map<String, String> contacts,
			Properties emails) {
		super();
		this.users = users;
		this.customer = customer;
		this.contacts = contacts;
		this.emails = emails;
	}

	public CollectionInjection() {
		super();
		System.out.println("DEFAULT CONSTRUCTOR INVOKED");
		
	}

	public List<User> getUsers(){
		System.out.println("SPRING CONTAINER INJECTED DEPENDECY OF TYPE "+users.getClass().getName());
		return users;
	}

	public Set<Customer> getCustomer() {
		System.out.println("SPRING CONTAINER INJECTED DEPENDECY OF TYPE "+customer.getClass().getName());
		return customer;
	}

	public Map<String, String> getContacts() {
		System.out.println("SPRING CONTAINER INJECTED DEPENDECY OF TYPE "+contacts.getClass().getName());
		return contacts;
	}

	public Properties getEmails() {
		System.out.println("SPRING CONTAINER INJECTED DEPENDECY OF TYPE "+emails.getClass().getName());
		return emails;
	}

	@Override
	public String toString() {
		return "CollectionInjection [contacts=" + contacts + ", emails=" + emails + "]";
	}
	
}
