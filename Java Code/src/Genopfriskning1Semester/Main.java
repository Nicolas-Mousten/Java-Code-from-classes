package Genopfriskning1Semester;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Græs græs = new Græs();

        double maxLengthFromUser = scanner.nextDouble();
        scanner.nextLine();
        double currentLengthFromUser = scanner.nextDouble();

        græs.daysToBeCut(currentLengthFromUser,maxLengthFromUser);
    }


}
