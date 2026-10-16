package org.com;

import channel.Channel;
import channel.EmailChannel;
import channel.PushChannel;
import channel.SmsChannel;
import core.NSystem;
import model.Event;
import model.User;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
public static void main (String[] args) {
	
	
	Channel sms=new SmsChannel ("7488810730");
	
	Channel email=new EmailChannel ("ssumanish666@gmail.com");
	
	Channel push=new PushChannel ("push token");
	
	
	User user= User.builder ().id (1).username ("Anish Suman").channel (sms).build ();
	
	
	Event event=new Event ();
	event.setId (2);
	event.setBody ("your bill is genrated for 1000");
	event.setSubject ("Montlhy bill");
	event.setRecepient (user);
	
	
	
	NSystem system=new NSystem ();
	
	 system.send (event);
	
	
}
}