package Search;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class LinearSearch {
    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<User> users = new ArrayList<User>();
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<User>();

        User the1 = new User("Nicklas","123");
        User the2 = new User("Victor","125");
        User the3 = new User("Mikkel","jashd");
        User the4 = new User("Laura","safh7");
        User the5 = new User("Ni","safh7");
        User the6 = new User("Nicolas","safh7");
        User the7 = new User("Mousten","safh7");
        User the8 = new User("Ha","safh7");
        User the9 = new User("Nah","safh7");
        User the10 = new User("Øv","safh7");

        users.add(the1);
        users.add(the2);
        users.add(the3);
        users.add(the4);
        users.add(the5);
        users.add(the6);
        users.add(the7);
        users.add(the8);
        users.add(the9);
        users.add(the10);

        findUser();
    }

    public static boolean findUser(){
        System.out.println("Choose the username you want to find:");
        String choice = scanner.nextLine();
        boolean anser = false;
        for (int i = 0; i < users.size(); i++) {
            User person = users.get(i);
            String username = person.getUsername();
            if(choice.equalsIgnoreCase(username)){
                anser = true;
            }else{
                anser = false;
            }
        }
        if(anser == false){
            createNewUser(choice);
        }
        return anser;
    }

    public static void createNewUser(String choice){
        Random random = new Random();
        String rand = "";
        for (int i = 0; i < 4; i++) {
            int r1 = random.nextInt(9-1)+1;
            rand += String.valueOf(r1);
        }
        User newp = new User(choice,rand);
        System.out.println(newp);
        users.add(newp);
    }
}
