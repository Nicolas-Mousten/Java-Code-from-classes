package Classes;
public class Lamp {
    public static int amountOfLamps = 0;
    boolean powerOn;
    int toggleCounter = 0;
    public Lamp(boolean powerOn, int toggleCounter){
        this.powerOn = powerOn;
        this.toggleCounter = toggleCounter;
        amountOfLamps = amountOfLamps +1;
        System.out.println(amountOfLamps);
    }

    public void toggleLight(){
        if(powerOn == true){
            powerOn = false;
            toggleCounter = toggleCounter +1;
        }else{
            powerOn = true;
            toggleCounter = toggleCounter +1;
        }
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "powerOn=" + powerOn +
                ", toggleCounter=" + toggleCounter +
                '}';
    }
}
class Room{
    public static void main(String[] args) {
        Lamp sengeLampe = new Lamp(true, 0);
        Lamp skrivboardsLampe = new Lamp(false,0);
        System.out.println(sengeLampe);
        sengeLampe.toggleLight();
        System.out.println(sengeLampe);
        System.out.println(skrivboardsLampe);
        skrivboardsLampe.toggleLight();
        System.out.println(skrivboardsLampe);
    }
}