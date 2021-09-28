import java.util.Scanner;

public class Arrays_13_september_nr3 {
    public static String[] names;
    public static String[] arrayOfNames = {"johannes", "benjamin"};
    public static String[] ArrayOfNames(int number, String name){
        arrayOfNames [number] = name;
        return arrayOfNames;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean menu = true;
        while (menu != false) {
            System.out.println("Write in a name");
            String name = scanner.nextLine();
            System.out.println("Choose location in array");
            int number = scanner.nextInt();
            scanner.nextLine();

            names = ArrayOfNames(number,name);

            System.out.println("Press q to se your array");
            String answer = "";
            System.out.println("or anything to continue");
            answer = scanner.nextLine();
            if (answer.equals("q")) {
                menu = false;
            }

        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
