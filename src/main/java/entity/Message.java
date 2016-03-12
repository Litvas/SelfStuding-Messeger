package entity;


import java.util.Date;

public class Message {

    private Date dateOfSending;
    private String contentOfMessage;

    public Message() {
    }

    public Message(Date dateOfSending, String contentOfMessage) {
        this.dateOfSending = dateOfSending;
        this.contentOfMessage = contentOfMessage;
    }

    public Date getDateOfSending() {
        return dateOfSending;
    }

    public void setDateOfSending(Date dateOfSending) {
        this.dateOfSending = dateOfSending;
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
                ", contentOfMessage='" + contentOfMessage + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Message message = (Message) o;

        if (contentOfMessage != null ? !contentOfMessage.equals(message.contentOfMessage) : message.contentOfMessage != null)
            return false;
        if (dateOfSending != null ? !dateOfSending.equals(message.dateOfSending) : message.dateOfSending != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = dateOfSending != null ? dateOfSending.hashCode() : 0;
        result = 31 * result + (contentOfMessage != null ? contentOfMessage.hashCode() : 0);
        return result;
    }
}
