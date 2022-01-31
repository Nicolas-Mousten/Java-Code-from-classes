package NinthNovember;

import java.util.ArrayList;

public class Admistrator {
    private String name;
    private int phoneNr;
    private String email;
    private ArrayList<Institutions> institutionsList;

    public Admistrator(String name, int phoneNr, String email, ArrayList<Institutions> institutionsList) {
        this.name = name;
        this.phoneNr = phoneNr;
        this.email = email;
        this.institutionsList = institutionsList;
    }

    public Institutions registerInstitution(String name, int phoneNr, String email){
        Institutions institut = new Institutions(name, phoneNr, email);
        return institut;
    }
    public void viewMessages(){
        messages.getMessagesList();
    }
}
