package messageHandler;

import entity.Message;

public interface MessageHandlerServerSide {

   // Get message from client. Return "true" after message get.
   public Message getMessageFromClient(Message messageFromClient);

   // Write message to storage for history
   public void writeMessage(Message message);
}
