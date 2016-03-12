package messageHandler.impl;

import entity.Message;
import messageHandler.MessageSender;

public class StubMessageSender implements MessageSender {

    public void sendMessage(Message message) {
      getMessageFromClient(message);
    }

    public void getMessageFromClient(Message messageFromClient) {
        writeMessage(messageFromClient);
        printMessage(messageFromClient);
    }

    // This method must be transactional.
    public void writeMessage(Message messageFromClient) {
        System.out.println("Message was written!");
    }

    private void printMessage(Message messageFromClient) {
        System.out.println(messageFromClient.toString());
    }
}
