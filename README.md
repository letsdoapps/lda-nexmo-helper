LetsDoApps Nexmo Java Helper
============================

Description
-----------

This Nexmo Java Helper loads your purchased US / CA numbers directly from your Nexmo account and handles throttling / load balacing of outbound SMS to respec the sending throughput rates.

Sample usage
------------

Sample code:

    NexmoHelper helper = nexmoHelper = new NexmoHelper(user, pass);
    helper.send("+1XXXXXXXX", "Hello US Crowd !", null); // Will pick one of your US numbers and throttle
    helper.send("+336XXXXXXXX", "Hello FR Crowd !", null); // Will issue a direct send

The third argument is a result callback if you want to perform special things after sending the SMS, for example:

    helper.send("+336XXXXXXXX", "Hello FR Crowd !", new SMSServiceCallback() {
      public void result(String to, boolean result) {
        System.out.println(result == true ? "Sms to " + to + " sent successfully" : "FAIL !!");
      }
    });

Deps
----

These classes depends on:

* Google Gson (Json Library)
* Google libphonenumber
* Our own Http abstraction to be released in lda-commons soon.
