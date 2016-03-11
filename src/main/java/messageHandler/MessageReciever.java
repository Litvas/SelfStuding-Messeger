package messageHandler;

import entity.Message;

public interface MessageReciever {

    // Get message from client. Return "true" after message get.
    void getMessageFromClient(Message messageFromClient);

    // Write message to storage for history
    void writeMessage(Message message);

}
