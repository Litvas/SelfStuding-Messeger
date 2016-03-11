import entity.Message;
import messageHandler.MessageGenerator;
import messageHandler.MessageSender;
import messageHandler.impl.StubMessageGenerator;
import messageHandler.impl.StubMessageSender;

/**
 * Created by as on 06.03.16.
 */
public class MessageManager {

    public static void main(String[] args) {

        MessageGenerator messageGenerator = new StubMessageGenerator();
        MessageSender messageSender = new StubMessageSender();

        Message message = messageGenerator.generateMessage();
        messageSender.sendMessage(message);
    }
}
