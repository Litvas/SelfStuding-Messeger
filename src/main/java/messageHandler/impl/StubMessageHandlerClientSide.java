package messageHandler.impl;

import entity.Message;
import messageHandler.MessageHandlerClientSide;

import java.util.Date;
import java.util.Scanner;

public class StubMessageHandlerClientSide implements MessageHandlerClientSide {

    StubMessageHandlerServerSide stubMessageHandlerServerSide = new StubMessageHandlerServerSide();

    @Override
    public void getMessageFromClient() {
        Message message = convertMessage();
        sendMessageToServer(message);
    }

    // Stub for generation message.
    private Message convertMessage() {
        System.out.println("Please enter you message!");
        Message messageFromClient = new Message();
        Scanner scanner = new Scanner(System.in);
        messageFromClient.setContentOfMessage(scanner.nextLine());
        messageFromClient.setDateOfSending(new Date());
        scanner.close();
        return messageFromClient;
    }


    @Override
    public void sendMessageToServer(Message messageFromClient) {
        stubMessageHandlerServerSide.getMessageFromClient(messageFromClient);
    }
}
