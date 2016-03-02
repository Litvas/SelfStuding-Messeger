package messageHandler.impl;

import entity.Message;
import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

public class StubSSTest {

    StubMessageHandlerServerSide stubMessageHandlerServerSide = new StubMessageHandlerServerSide();
    Message message = new Message(new Date(), "Unnamed", "ForTest");
    Message message2 = new Message(new Date(), "Unnamed", "ForTest");

    @Test
    public void getMessageFromClient() {
        Assert.assertEquals(message, stubMessageHandlerServerSide.getMessageFromClient(message));
    }

}
