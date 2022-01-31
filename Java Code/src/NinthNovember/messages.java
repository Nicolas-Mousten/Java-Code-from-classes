package NinthNovember;

import java.sql.Time;
import java.util.ArrayList;

public class messages {
    private String subject;
    private String textField;
    private String timeDate;
    private static ArrayList<messages> messagesList;

    public messages(String subject, String textField, String timeDate) {
        this.subject = subject;
        this.textField = textField;
        this.timeDate = timeDate;
        newMessage();
    }
    public void newMessage(){
        messages mes = new messages(this.subject,this.textField,this.timeDate);
        messagesList.add(mes);
    }

    public static ArrayList<messages> getMessagesList() {
        return messagesList;
    }

    @Override
    public String toString() {
        return "messages{" +
                "subject='" + subject + '\'' +
                ", textField='" + textField + '\'' +
                ", timeDate=" + timeDate +
                ", messagesList=" + messagesList +
                '}';
    }
}
