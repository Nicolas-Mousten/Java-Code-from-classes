public class Arrays_13_september_nr2 {
    public static void main(String[] args) {
        boolean[] arrayOfBoolean = {false,true,false,false};
        for (int i = 0; i < arrayOfBoolean.length; i++) {
            System.out.print(arrayOfBoolean[i] + " , ");
        }
        System.out.println("");
        arrayOfBoolean[arrayOfBoolean.length-1] = true;
        for (int i = 0; i < arrayOfBoolean.length; i++) {
            System.out.print(arrayOfBoolean[i] + " , ");
        }
    }
}
