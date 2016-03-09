package messageHandler;

import entity.Message;

public interface MessageHandlerClientSide {

    // Get message from client with help user interface
    public void getMessageFromClient();

    // Get message from method "getMessageFromClient()" and send this to server.
    public void sendMessageToServer(Message message);
}
