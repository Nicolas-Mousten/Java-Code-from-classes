package Classes;

public class Car {
    String model;
    int price;
    public Car(String model, int price){
        this.model = model;
        this.price = price;
    }
    public void start(){
        System.out.println("Starting engine sound insert here");
    }
    public void stop(){
        System.out.println("Break sound insert here");
    }
    public void move(){
        System.out.println("Moving sound insert here");
    }
}
