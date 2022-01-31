package NinthNovember;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Institutions {
    private String name;
    private int phoneNr;
    private String email;

    public Institutions(String name, int phoneNr, String email) {
        this.name = name;
        this.phoneNr = phoneNr;
        this.email = email;
    }
    public messages writeMessage(String sub, String text){
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String currentDateFormatted = currentDate.format(dateFormat);

        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
        String currentTimeFormatted = currentTime.format(timeFormat);

        String dateTime = currentDateFormatted+currentTimeFormatted;

        messages mes = new messages(sub, text, dateTime);
        return mes;
    }
}
