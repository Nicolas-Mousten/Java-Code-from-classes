package ExamTest3;


public class DateAgeCalculator {
    private int yourAge;
    private int dateAge;

    public int lowestAcceptableAge(int yourAge){
        return yourAge/(2+7);
    }

    public static void main(String[] args) {
        DateAgeCalculator date = new DateAgeCalculator();
        System.out.println(date.lowestAcceptableAge(10));
    }
}

