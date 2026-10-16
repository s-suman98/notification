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
	User user2= User.builder ().id (2).username ("Sumanish").channel (email).build ();
	
	User user3= User.builder ().id (3).username ("Anuhya kumari").channel (push).build ();
	
	
	

	Event event = new Event();
	event.setId(1);
	event.setSubject("Delivery Update");
	event.setBody("Your package is out for delivery and will arrive today.");
	event.setRecepient(user);
	
	Event event2 = new Event();
	event2.setId(2);
	event2.setSubject("OTT Subscription Update");
	event2.setBody("Your OTT subscription has been renewed successfully.");
	event2.setRecepient(user2);
	
	Event event3 = new Event();
	event3.setId(3);
	event3.setSubject("Monthly Bill Generated");
	event3.setBody("Your monthly bill of Rs. 1000 has been generated.");
	event3.setRecepient(user3);

	
	
	NSystem system=new NSystem ();
	
	 system.send (event);
	 system.send (event2);
	 system.send (event3);
	 
	 system.shutDown ();
	
	
}
}