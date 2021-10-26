package Sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class test {
    public static void main(String[] args) {
        ArrayList<Integer> numbersList;
        numbersList = randomIntArray();
        System.out.println(sorterInt(numbersList));
    }
    public static ArrayList<Integer> sorterInt(ArrayList<Integer> numbers){
        ArrayList<Integer> newList = new ArrayList<>();
        int numLen = numbers.size();
        for (int i = 0; i < numLen; i++) {
            int max = 0;
            for (int j = 0; j < numLen; j++) {
                if(max<numbers.get(j)) {
                    max = numbers.get(j);
                }}

            int indexMax = numbers.indexOf(max);
            numbers.remove(indexMax);
            newList.add(max);
        }
        return newList;
    }
    public static ArrayList<Integer> randomIntArray(){
        Random random = new Random();
        ArrayList<Integer> binaryList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int r1 = random.nextInt(11-1)+1;
            binaryList.add(r1);
        }
        return binaryList;
    }
}
