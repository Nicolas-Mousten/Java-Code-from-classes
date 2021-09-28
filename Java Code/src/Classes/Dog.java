package Classes;

public class Dog {
    public String breed;
    public String name;
    public int age;
    public int weight;

    public Dog(String breed, String name, int age, int weight ) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public void Woof(){
        System.out.println("Woof");
    }
}
