package messageHandler;

public interface MessageHandlerClientSide {

    // Get message from client with help user interface
    public void getMessageFromClient();

    // Get message from method "getMessageFromClient()" and send this to server.
    public void sendMessageToServer(String message, String nameOfReceiver);
}
