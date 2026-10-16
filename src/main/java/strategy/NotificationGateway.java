package strategy;

import model.Event;

public interface NotificationGateway {
	
	void send(Event e);
}
