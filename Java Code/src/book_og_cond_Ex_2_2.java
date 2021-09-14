import java.util.Scanner;

public class book_og_cond_Ex_2_2 {
    public static boolean posOrNeg;
    public static boolean PositiveOrNegative(int inputNumber){
        if (inputNumber<0){
            posOrNeg = false;
        }
        else if (inputNumber>=0){
            posOrNeg = true;
        }
    return posOrNeg;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        scanner.nextLine();
        Boolean returnBoolean = PositiveOrNegative(inputNumber);
        System.out.println(returnBoolean);
    }
}
