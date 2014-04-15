package AbstractFactory;

/**
 * Created by suse on 4/15/14.
 */
public class MailSender implements Sender{
    @Override
    public void Send(){
        System.out.println("This is an SNS Sender");
    }
}
