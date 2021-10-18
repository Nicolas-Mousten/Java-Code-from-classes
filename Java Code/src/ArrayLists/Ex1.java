package ArrayLists;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {
        ArrayList<String> arraysOfStrings = new ArrayList<String>();
        for (int i = 0; i < 5; i++) {
            arraysOfStrings.add("Hello");
        }
        System.out.println(arraysOfStrings);
    }
}
