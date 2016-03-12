package messageHandler.impl;

import entity.Message;
import messageHandler.MessageSender;

import java.io.IOException;

public class StubMessageSender implements MessageSender {

    public void sendMessage(Message message) throws IOException {
        getMessageFromClient(message);
    }

    private void getMessageFromClient(Message messageFromClient) {
        writeMessage(messageFromClient);
        printMessage(messageFromClient);
    }

    // This method must be transactional.
    private void writeMessage(Message messageFromClient) {
        System.out.println("Message was written!");
    }

    private void printMessage(Message messageFromClient) {
        System.out.println(messageFromClient.toString());
    }
}
