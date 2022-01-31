package NinthNovember;

public class Guardians {
    private String name;
    private int phoneNr;
    private String email;

    public Guardians(String name, int phoneNr, String email) {
        this.name = name;
        this.phoneNr = phoneNr;
        this.email = email;
    }
    public void viewMessages(){
        messages.getMessagesList();
    }
}