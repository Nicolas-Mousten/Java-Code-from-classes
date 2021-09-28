package Classes;

import Classes.Dog;

public class Dog_creator {
    public static void main(String[] args) {
        Dog buster = new Dog("Golden Retriver", "Buster", 5,20);
        Dog storm = new Dog("Husky","Storm",12,25);
        buster.Woof();
        System.out.println(buster.breed + "\n" +buster.name + "\n" + buster.age +"\n" + buster.weight);
        System.out.println(storm.breed + "\n" +storm.name + "\n" + storm.age +"\n" + storm.weight);
    }
}
