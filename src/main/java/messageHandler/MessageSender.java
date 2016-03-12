package messageHandler;

import entity.Message;

public interface MessageSender {

    // Get message from method "getMessageFromClient()" and send this to server.
    void sendMessage(Message message);

    // Get message from client. Return "true" after message get.
    void getMessageFromClient(Message messageFromClient);

    // Write message to storage for history
    void writeMessage(Message message);

   }
