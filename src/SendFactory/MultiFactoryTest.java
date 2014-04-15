package SendFactory;

/**
 * Created by suse on 4/15/14.
 */
public class MultiFactoryTest {
    public static void main(String[] args){
        SendMultiFactory factory = new SendMultiFactory();
        Sender sender=factory.produceMail();
        sender.Send();
    }
}
