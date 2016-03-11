package messageHandler.impl;

import entity.Message;
import messageHandler.MessageSender;

public class StubMessageSender implements MessageSender {

    StubMessageReciever reciever = new StubMessageReciever();

    @Override
    public void sendMessage(Message message) {
        reciever.getMessageFromClient(message);
    }
}
