package Search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class BinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> binaryList = randomIntArray();
        binarySearch(binaryList, 10);

    }


    public static void binarySearch(ArrayList<Integer> binarySearch, int searchNumber){
        int min = 0;
        int mid = binarySearch.size()/2;
        int max = binarySearch.size();


        while(binarySearch.get(mid) != searchNumber){
            if(!binarySearch.contains(searchNumber)){
                System.out.println("-1");
                break;
            }else if(binarySearch.get(mid) == searchNumber){
                System.out.println("Mid");
            }else if(binarySearch.get(mid)>searchNumber){
                min = 0;
                max = mid;
                mid = (min+max)/2;
                System.out.println("middle is greather than search");
            }else if(binarySearch.get(mid)<searchNumber){
                min = mid;
                mid = (min+max)/2;
                System.out.println("middle is less than search");
            }
            System.out.println(min+" "+mid+" "+max);
        }
        if(binarySearch.get(mid) == searchNumber){
            System.out.println(mid);
            int occurrences = Collections.frequency(binarySearch,searchNumber);
            System.out.println("Number of occurences in the database: "+occurrences);
        }
    }


    public static ArrayList<Integer> randomIntArray(){
        Random random = new Random();
        ArrayList<Integer> binaryList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int r1 = random.nextInt(21-1)+1;
            binaryList.add(r1);
        }
        Collections.sort(binaryList);
        System.out.println(binaryList);
        return binaryList;
    }
}
