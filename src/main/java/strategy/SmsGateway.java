package strategy;

import model.Event;

public class SmsGateway implements  NotificationGateway {
@Override
public void send (Event e) {
	
//	throw new RuntimeException ("SMs GAEWAY IS DOWN ");
	
	System.out.println (Thread.currentThread ().getName ()+"USING SMS:::::" );


	System.out.println (Thread.currentThread ().getName ()+"Message send to "+e.getRecepient ().getUsername () );

	System.out.println (Thread.currentThread ().getName ()+"Message"+ e.toString ());

}
}
