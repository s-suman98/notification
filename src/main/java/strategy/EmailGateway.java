package strategy;

import model.Event;

public class EmailGateway implements NotificationGateway {
@Override
public void send (Event e) {
	
	System.out.println ("USING EMAIL:::::" );
	
	
	System.out.println ("Message send to "+e.getRecepient ().getUsername () );
	
	System.out.println ("Message"+ e.toString ());

}
}
