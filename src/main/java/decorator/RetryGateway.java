package decorator;

import model.Event;
import strategy.NotificationGateway;

public class RetryGateway implements NotificationGateway {

private final int  retryLimit=5;

private NotificationGateway notificationGateway;

public RetryGateway (NotificationGateway notificationGateway){
	this.notificationGateway=notificationGateway;
}


@Override
public void send (Event e) {
	
//	System.out.println (Thread.currentThread ().getName ()+"Retryable send method called..");
	
	int tried = 0;
	
	
	while ( true ) {
		try {
			
			notificationGateway.send (e);
			
			return;
			
		} catch ( IllegalArgumentException ex1 ) {
			
			System.out.println (
					"Not retryable failure: " + ex1.getMessage ()
			);
			throw ex1;
			
		} catch ( Exception ex2 ) {
			
			tried++;
			
			if ( tried >= this.retryLimit ) {
				
				System.out.println (
						"Maximum retry done" + ex2.getMessage ()
				);
				throw ex2;
			}
			
			System.out.println ("retrying.... the time" + tried);
			
			
		}
		
	}
}
}
