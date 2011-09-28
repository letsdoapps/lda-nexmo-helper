package com.letsdoapps.commons.telephony;

public interface SMSService {

	public void send(String to, String msg, SMSServiceCallback callback);

	public static interface SMSServiceCallback {
		
		public void result(String to, boolean result);

	}

}
