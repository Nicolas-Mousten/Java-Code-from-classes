package Genopfriskning1Semester;

public class Græs {

    private double growthRate = 0.8;

    void daysToBeCut(double currentLength, double maxLength) {

        double grassDaysToCut = (maxLength - currentLength) / growthRate;

        if (currentLength > maxLength) {
            System.out.println("The grass needs to be cut!!");
        } else {
            System.out.println(grassDaysToCut);
        }
    }
}
