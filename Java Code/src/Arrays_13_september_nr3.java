import java.util.Scanner;

public class Arrays_13_september_nr3 {
    public static String[] ArrayOfNames;

    public static String[] ArrayOfNames(int number, String name){
        String[] arrayOfNames = new String[10];
        arrayOfNames[number] = name;
        return ArrayOfNames;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menu = false;
        while (menu == false) {
            System.out.println("Write in a name");
            String name = scanner.nextLine();
            System.out.println("Choose location in array");
            int number = scanner.nextInt()-1;
            scanner.nextLine();
            ArrayOfNames(number,name);
            System.out.println("Press q to se your array");
            String answer = "";
            if (answer.equals("q")) {
                menu = true;
            }
            for (int i = 0; i < ArrayOfNames.length; i++) {
                System.out.println(ArrayOfNames[i]);
            }
        }

    }
}
