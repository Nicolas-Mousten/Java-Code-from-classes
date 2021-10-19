package Inheritance;

public class Car {
    int speed;
    int regularPrice;
    String color;
    public Car(int speed, int regularPrice, String color){
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    public void getSalePrice(){
        System.out.println("The regular price for this car is: " + regularPrice);
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", color='" + color + '\'' +
                '}';
    }
}

class Truck extends Car{
    public int weight;
    public Truck(int speed, int regularPrice, String color, int weight){
        super(speed,regularPrice,color);
        this.weight = weight;
    }
    public void getSalePrice() {
        if (weight >= 2000) {
            System.out.println(regularPrice*0.9);
        }else{
            System.out.println(regularPrice*0.8);
        }
    }

    @Override
    public String toString() {
        return "Truck{" +
                "speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}


class Ford extends Car{
    public int year;
    public int manufacturerDiscount;
    public Ford(int speed, int regularPrice, String color, int year, int manufacturerDiscount){
        super(speed,regularPrice,color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }
    public void getSalePrice(){
        if(manufacturerDiscount != 0){
            System.out.println(regularPrice*0.75);
        }else{
            System.out.println(regularPrice);
        }
    }

    @Override
    public String toString() {
        return "Ford{" +
                "speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", manufacturerDiscount=" + manufacturerDiscount +
                '}';
    }
}

class Sedan extends Car{
    public int length;
    public Sedan(int speed, int regularPrice, String color, int length){
        super(speed,regularPrice,color);
        this.length = length;
    }
    public void getSalePrice(){
        if(length >= 20){
            System.out.println(regularPrice*0.95);
        }else{
            System.out.println(regularPrice*0.9);
        }
    }

    @Override
    public String toString() {
        return "Sedan{" +
                "speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", color='" + color + '\'' +
                ", length=" + length +
                '}';
    }
}
class AutoShop{
    public static void main(String[] args) {
        Sedan sedan1 = new Sedan(150,100000, "Black",25);
        Ford ford1 = new Ford(100, 40000, "White",2000, 0);
        Ford ford2 = new Ford(250, 240000, "Blue", 2021, 20);
        Truck truck1 = new Truck(80, 150000, "Yellow",100000);
        Car car1 = new Car(120, 100000, "White");
        sedan1.getSalePrice();
        ford1.getSalePrice();
        ford2.getSalePrice();
        truck1.getSalePrice();
        car1.getSalePrice();


    }
}