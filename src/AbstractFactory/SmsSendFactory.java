package AbstractFactory;


/**
 * Created by suse on 4/15/14.
 */
public class SmsSendFactory implements Provider{
    @Override
    public Sender produce(){
        return new SmsSender();
    }
}
