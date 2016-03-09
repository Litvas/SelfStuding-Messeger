package messageHandler.impl;

import entity.Message;
import org.junit.Test;

import java.util.Date;

public class StubSSTest {

    StubMessageHandlerServerSide stubMessageHandlerServerSide = new StubMessageHandlerServerSide();
    Message message = new Message(new Date(),  "ForTest");
    Message message2 = new Message(new Date(),"ForTest");

    @Test
    public void getMessageFromClient() {
  //      Assert.assertEquals(message, stubMessageHandlerServerSide.getMessageFromClient(message));
    }

}
