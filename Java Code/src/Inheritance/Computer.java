package Inheritance;

public class Computer {
    String cpu;
    String gpu;
    int storageInGB;
    public Computer(String cpu, String gpu, int storageInGB){
        this.cpu = cpu;
        this.gpu = gpu;
        this.storageInGB = storageInGB;
    }
    public void turnOn(){
        System.out.println("Computer turns on");
    }
    public void turnOff(){
        System.out.println("Computer turns off");
    }
    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", storageInGB=" + storageInGB +
                '}';
    }
}

class Laptop extends Computer{
    public int batteryCap;
    public Laptop(String cpu, String gpu, int storageInGB, int batteryCap){
        super(cpu, gpu, storageInGB);
        this.batteryCap = batteryCap;
    }
    public void batterySavingModeOn(){
        System.out.println("Activating battery saving mode");
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", storageInGB=" + storageInGB +
                ", batteryCap=" + batteryCap +
                '}';
    }
}

class SmartPhone extends Computer{
    public int phoneNumber;
    public SmartPhone(String cpu, String gpu, int storageInGB, int phoneNumber){
        super(cpu, gpu,storageInGB);
        this.phoneNumber = phoneNumber;
    }
    public void callPhoneNumber(){
        System.out.println("Calling random number");
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "cpu='" + cpu + '\'' +
                ", gpu='" + gpu + '\'' +
                ", storageInGB=" + storageInGB +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
