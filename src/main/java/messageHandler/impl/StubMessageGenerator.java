package messageHandler.impl;

import entity.Message;
import messageHandler.MessageGenerator;

import java.util.Date;
import java.util.Scanner;

/**
 * Created by as on 11.03.16.
 */
public class StubMessageGenerator implements MessageGenerator {

    // Stub for input message.
    public Message generateMessage() {
                System.out.println("Please enter you message!");
        Message messageFromClient = new Message();
        Scanner scanner = new Scanner(System.in);
        messageFromClient.setContentOfMessage(scanner.nextLine());
        messageFromClient.setDateOfSending(new Date());
   //     scanner.close();
        return messageFromClient;
    }
}
