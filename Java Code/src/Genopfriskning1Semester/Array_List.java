package Genopfriskning1Semester;

import java.util.ArrayList;

public class Array_List {
    public static void main(String[] args) {
        Array_List array_list = new Array_List();
        ArrayList<String> testlist = new ArrayList<>();
        testlist.add("Hello");
        testlist.add("New");
        testlist.add("World");
        testlist.add("Kea");
        String search = "Kea";
        System.out.println(array_list.doesArraylistContainString(testlist, search));

    }
    public boolean doesArraylistContainString(ArrayList<String> list, String searchString){
        boolean doesContain = false;
        for (int i = 0; i < list.size(); i++) {
            if(list.contains(searchString)){
                doesContain = true;
            }
        }
        return doesContain;
    }
}
