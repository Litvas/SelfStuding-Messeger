package messageHandler.impl;

import entity.Message;
import messageHandler.MessageHandlerClientSide;

import java.util.Date;
import java.util.Scanner;

public class StubMessageHandlerClientSide implements MessageHandlerClientSide {

    StubMessageHandlerServerSide stubMessageHandlerServerSide = new StubMessageHandlerServerSide();

    @Override
    public void getMessageFromClient() {
        Scanner scanner = new Scanner(System.in);
        String messageFromClient = scanner.nextLine();
        sendMessageToServer(messageFromClient, "Unnamed");
        scanner.close();
    }

    @Override
    public void sendMessageToServer(String messageFromClient, String nameOfReceiver) {
        Message messageForServer = new Message();
        messageForServer.setDateOfSending(new Date());
        messageForServer.setNameOfReceiver(nameOfReceiver);
        messageForServer.setContentOfMessage(messageFromClient);
        stubMessageHandlerServerSide.getMessageFromClient(messageForServer);
    }
}
