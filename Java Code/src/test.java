import java.util.Scanner;

public class test {
    public static String abc = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String wordinput = sc.nextLine();
        wordinput = wordinput.toLowerCase();
        int[] WordArray = new int[wordinput.length()];
        for (int i = 0; i < wordinput.length(); i++) {
            WordArray[i] = abc.indexOf(wordinput.charAt(i));
        }
        for (int i = 0; i < WordArray.length; i++) {
            System.out.print(WordArray[i]+",");
        }

        System.out.println("");
        char[] charArray = new char[WordArray.length];
        for (int i = 0; i < charArray.length; i++) {
           charArray[i] = abc.charAt(WordArray[i]);
        }
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }
    }
}
