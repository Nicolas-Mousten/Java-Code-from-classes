package ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        ArrayList<String> arrayListOfStrings = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        while(choice.equalsIgnoreCase("no strings attached") != true){
            choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("no strings attached") != true){
                arrayListOfStrings.add(choice);
            }else{
                break;
            }
        }
    }
}
