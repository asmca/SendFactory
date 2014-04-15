package SendFactory;

/**
 * Created by suse on 4/15/14.
 */
public class SendFactory {

    public Sender product(String type){
        if ("mail".equals(type)){
            return new MailSender();
        }
        else if ("sms".equals(type)){
            return new SMSSender();
        }
        else{
            System.out.println("Please use a correct type");
            return null;

        }
    }
}
