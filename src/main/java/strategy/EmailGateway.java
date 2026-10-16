package strategy;

import model.Event;

public class EmailGateway implements NotificationGateway {
@Override
public void send (Event e) {
	
	System.out.println (Thread.currentThread ().getName ()+"USING EMAIL:::::" );
	
	
	System.out.println (Thread.currentThread ().getName ()+"Message send to "+e.getRecepient ().getUsername () );
	
	System.out.println (Thread.currentThread ().getName ()+"Message"+ e.toString ());

}
}
