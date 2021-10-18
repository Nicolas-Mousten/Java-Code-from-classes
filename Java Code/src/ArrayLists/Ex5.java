package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        int n;
        int k;
        ArrayList<String> arraysOfStrings = new ArrayList<String>();
        arraysOfStrings.add("Hello");
        arraysOfStrings.add("Old");
        arraysOfStrings.add("World");
        arraysOfStrings.add("And");
        arraysOfStrings.add("Goodbye");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        scanner.nextLine();
        k = scanner.nextInt();
        scanner.nextLine();

        String indexAtN = arraysOfStrings.get(n);
        String indexAtK = arraysOfStrings.get(k);
        System.out.println(arraysOfStrings);
        arraysOfStrings.set(k,indexAtN);
        arraysOfStrings.set(n,indexAtK);
        System.out.println(arraysOfStrings);
    }
}
