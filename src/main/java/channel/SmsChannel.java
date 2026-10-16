package channel;

import enums.NotificationType;

public class SmsChannel implements Channel {

private String phoneNumber;

public SmsChannel(String phoneNO){
	
	if(phoneNO==null||phoneNO.isBlank ()){
		
		throw  new IllegalArgumentException ("phone number is required");
	}
	this.phoneNumber=phoneNO;
}
@Override
public NotificationType getType () {
	return NotificationType.SMS;
}
}
