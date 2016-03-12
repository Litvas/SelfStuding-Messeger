package messageHandler;

import entity.Message;

import java.io.IOException;

public interface MessageSender {

    // Get message from method "getMessageFromClient()" and send this to server.
    void sendMessage(Message message) throws IOException;

   }
