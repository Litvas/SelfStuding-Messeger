package entity;


import java.util.Date;

public class Message {

    private Date dateOfSending;
    private String nameOfReceiver;
    private String contentOfMessage;

    public Message() {
    }

    public Message(Date dateOfSending, String nameOfReciever, String contentOfMessage) {
        this.dateOfSending = dateOfSending;
        this.nameOfReceiver = nameOfReciever;
        this.contentOfMessage = contentOfMessage;
    }

    public Date getDateOfSending() {
        return dateOfSending;
    }

    public void setDateOfSending(Date dateOfSending) {
        this.dateOfSending = dateOfSending;
    }

    public String getNameOfReceiver() {
        return nameOfReceiver;
    }

    public void setNameOfReceiver(String nameOfReceiver) {
        this.nameOfReceiver = nameOfReceiver;
    }

    public String getContentOfMessage() {
        return contentOfMessage;
    }

    public void setContentOfMessage(String contentOfMessage) {
        this.contentOfMessage = contentOfMessage;
    }

    @Override
    public String toString() {
        return "Message{" +
                "dateOfSending=" + dateOfSending +
                ", nameOfReciever='" + nameOfReceiver + '\'' +
                ", contentOfMessage='" + contentOfMessage + '\'' +
                '}';
    }
}
