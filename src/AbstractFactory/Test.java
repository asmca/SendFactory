package AbstractFactory;

/**
 * Created by suse on 4/15/14.
 */
public class Test {
    public static void main(String[] args){
        Provider provider= new MailSendFactory();
        Sender sender=provider.produce();
        sender.Send();
    }
}
