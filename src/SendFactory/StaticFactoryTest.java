package SendFactory;

/**
 * Created by suse on 4/15/14.
 */
public class StaticFactoryTest {
    public static void main(String[] args) {
        Sender sender = SendStaticFactory.produceMail();
        sender.Send();
    }
}
