package ExamTest3;

public class Names {
    private String firstName;
    private String middleName;
    private String lastName;
    private boolean twoNames;
    public Names(String fullName){
        String[] names = fullName.split(" ");
        this.firstName = names[0];
        this.lastName = names[1];
        if(names.length == 3) {
            this.middleName = names[1];
            this.lastName = names[2];
        }

    }

    @Override
    public String toString() {

        return "Names{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
