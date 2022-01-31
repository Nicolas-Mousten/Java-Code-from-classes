package ExamTest5;

import java.util.ArrayList;
import java.util.Random;

public class Raflebæger {
    private int antalTerninger;
    private ArrayList<Integer> Terning = new ArrayList<>();


    public Raflebæger(int antalTerninger) {
        this.antalTerninger = antalTerninger;
    }
    public int ryst(){
        Random random = new Random();
        int total = 0;
        for (int i = 0; i < antalTerninger; i++) {
            int rand = random.nextInt(6 - 1) + 1;
            total = total+rand;
            Terning.add(rand);
        }
        return total;
    }
    public void se(){
        for (int i = 0; i < Terning.size(); i++) {
            int num = i+1;
            System.out.println("Terning: "+ num +" har "+Terning.get(i)+" øjne");
        }
    }
}
class Test{
    public static void main(String[] args) {
        Raflebæger rafle = new Raflebæger(4);
        System.out.println(rafle.ryst());
        rafle.se();
    }
}