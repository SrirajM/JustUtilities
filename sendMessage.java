package sendMessage;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

public class sendMessage {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ZZ";
  public static final String AUTH_TOKEN = "XX";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    Message message = Message.creator(new PhoneNumber("+919632510270"),
        new PhoneNumber("+12132236086"), 
        "Hello Jaan , I love you !!! There's no one like you!!").create();

    System.out.println(message.getSid());
  }
}
