package ArrayLists;
import java.util.ArrayList;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<String> arraysOfStrings = new ArrayList<String>();
        arraysOfStrings.add("Hello");
        arraysOfStrings.add("Old");
        arraysOfStrings.add("World");
        arraysOfStrings.add("And");
        arraysOfStrings.add("Goodbye");
        for (int i = 4; i >= 0; i = i-1) {
            System.out.println(arraysOfStrings.get(i));
        }
    }
}
