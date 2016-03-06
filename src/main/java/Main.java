import messageHandler.impl.StubMessageHandlerClientSide;

/**
 * Created by as on 06.03.16.
 */
public class Main {

public static void main(String[]args){

    StubMessageHandlerClientSide stubMessageHandlerClientSide = new StubMessageHandlerClientSide();
    stubMessageHandlerClientSide.getMessageFromClient();
    }
}
