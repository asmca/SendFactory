package SendFactory;

/**
 * Created by suse on 4/15/14.
 */
public class SendMultiFactory {


        public Sender produceMail(){
            return new MailSender();
        }

        public Sender produceSMS(){
        return new SMSSender();
        }

}
