package messageHandler.impl;

import entity.Message;
import messageHandler.MessageHandlerServerSide;

public class StubMessageHandlerServerSide implements MessageHandlerServerSide {

    @Override
    public void getMessageFromClient(Message messageFromClient) {
        writeMessage(messageFromClient);
        printMessage(messageFromClient);
    }

    // This method must be transactional.
    @Override
    public void writeMessage(Message messageFromClient) {
        System.out.println("Message was written!");
    }

    private void printMessage(Message messageFromClient) {
        System.out.println(messageFromClient.toString());
    }
}
