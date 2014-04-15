/**
 * Created by suse on 4/15/14.
 */
public class FactoryTest {
    public static void main(String[] args){
        SendFactory factory= new SendFactory();
        Sender sender=factory.product("sms");
        sender.Send();

    }

}
