package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        ArrayList<String> arrayOfCharacters = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Plz write in a word to pick apart:");
        String word = scanner.nextLine();
        for (int i = 0; i < word.length(); i++) {
            arrayOfCharacters.add(String.valueOf(word.charAt(i)));
        }
        System.out.println(arrayOfCharacters);
    }
}
