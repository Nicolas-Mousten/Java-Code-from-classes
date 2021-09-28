package Inheritance;

public class Garment {
    int price;
    String name;
    public Garment(String name, int price){
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Garment{" +
                "price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}



class Trousers extends Garment{
    public int length;
    public String color;
    public Trousers(String name, int price, String color, int length){
        super(name, price);
        this.color = color;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Trousers{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", length=" + length +
                ", color='" + color + '\'' +
                '}';
    }
}

class Shirt extends Garment{
    public String size;
    public boolean isTShirt;
    public String color;
    public Shirt(String name, int price, String size, boolean isTShirt, String color){
        super(name, price);
        this.size = size;
        this.isTShirt = isTShirt;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Shirt{" +
                "price=" + price +
                ", name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", isTShirt=" + isTShirt +
                ", color='" + color + '\'' +
                '}';
    }
}
class MakerGarments{
    public static void main(String[] args) {
        Shirt blackTshirt = new Shirt("Darth Vader", 200, "M", true, "Black");
        System.out.println(blackTshirt);
    }}
