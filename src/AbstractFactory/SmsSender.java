package AbstractFactory;

/**
 * Created by suse on 4/15/14.
 */
public class SmsSender implements Sender{
    public void Send(){
        System.out.println("This is a mailsender");
    }
}
