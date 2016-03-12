package messageHandler.impl;

import entity.Message;

import java.io.*;
import java.util.Scanner;

public class MessageSender2opt extends StubMessageSender implements Serializable {

    @Override
    public void sendMessage(Message message) throws IOException {
        final String OPTION_TERMINAL = "1";
        final String OPTION_FILE = "2";
        System.out.println("Please choose output source: \n1) Terminal\n2) File");
        Scanner scanner = new Scanner(System.in);
        String choosedOptions = scanner.nextLine();
        if (choosedOptions.equals(OPTION_TERMINAL)) super.sendMessage(message);
        if (choosedOptions.equals(OPTION_FILE)) {
            writeMessage(message);
        }
    }

    private void writeMessage(Message messageFromClient) throws IOException {
        String fileName = "D:\\Different\\Development\\2016-02-28-SelfStuding_Messeger\\output\\" + messageFromClient.hashCode() + ".txt";
        File file = new File(fileName);
        file.createNewFile();
        String result = messageFromClient.getDateOfSending().toString() + "\n" +
                messageFromClient.getContentOfMessage();
        FileWriter fileWriter = new FileWriter(fileName);
        fileWriter.write(result);
        fileWriter.flush();
    }
}
