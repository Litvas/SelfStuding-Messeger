package messageHandler;

import entity.Message;

public interface MessageSender {

    // Get message from method "getMessageFromClient()" and send this to server.
    void sendMessage(Message message);

   }
