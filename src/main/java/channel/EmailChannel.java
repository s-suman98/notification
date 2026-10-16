package channel;

import enums.NotificationType;

public class EmailChannel implements Channel {

private String email;


public EmailChannel (String email) {
	
	if ( email == null || email.isBlank () ) {
		
		throw new IllegalArgumentException ("email is mandatory");
	}
	this.email = email;
}

@Override
public NotificationType getType () {
	return NotificationType.EMAIL;
}
}
