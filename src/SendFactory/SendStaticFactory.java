package SendFactory;

/**
 * Created by suse on 4/15/14.
 */
public class SendStaticFactory {

    public static Sender produceMail(){
        return new MailSender();
    }

    public static Sender produceSMS(){
        return new SMSSender();
    }
}
