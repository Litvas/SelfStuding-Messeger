import entity.Message;
import messageHandler.MessageGenerator;
import messageHandler.impl.MessageSender2opt;
import messageHandler.impl.StubMessageGenerator;

import java.io.IOException;

public class MessageManager {

    public static void main(String[] args) throws IOException {

        MessageGenerator messageGenerator = new StubMessageGenerator();
     //   MessageSender messageSender = new StubMessageSender();
      MessageSender2opt fileMessageSender = new MessageSender2opt();

        Message message = messageGenerator.generateMessage();
        fileMessageSender.sendMessage(message);
    }
}
