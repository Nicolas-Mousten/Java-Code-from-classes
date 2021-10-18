package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex3 {
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
        System.out.println("Enter start number then ending number:");
        n = scanner.nextInt();
        scanner.nextLine();
        k = scanner.nextInt();
        scanner.nextLine();
        if(n<k){
            for (int i = n; i < k+1; i++) {
                System.out.println(arraysOfStrings.get(i));
            }
        }else{
            for (int i = n; i >= k; i=i-1) {
                System.out.println(arraysOfStrings.get(i));
            }
        }
    }
}
