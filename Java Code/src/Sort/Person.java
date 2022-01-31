package Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Run{
    public static void main(String[] args) {
        Person person1 = new Person("Nicolas",1.90,21);
        Person person2 = new Person("Harald",1.50,21);
        Person person3 = new Person("Andreas",2.00,25);
        Person person4 = new Person("Cathrine",1.70,29);
        ArrayList<Person> people = new ArrayList<Person>(
                Arrays.asList(person1,person2,person3,person4)
        );
        System.out.println(people);
        Collections.sort(people);
        System.out.println(people);
    }
}
public class Person implements Comparable<Person>{
    private String name;
    private double height;
    private int age;

    public Person(String name, double height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }
    public String getName(){
        return this.name;
    }
    public double getHeight(){
        return this.height;
    }
    public int getAge(){
        return this.age;
    }
    @Override
    public int compareTo(Person personToCompareWith){
        if(this.age < personToCompareWith.getAge()){
            return -1;
        }
        else if(this.age > personToCompareWith.getAge()){
            return 1;
        }
        else{
            if(this.height < personToCompareWith.getHeight()){
                return -1;
            }
            else if(this.height > personToCompareWith.getHeight()){
                return 1;
            }
            else{
                return 0;
            }
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
