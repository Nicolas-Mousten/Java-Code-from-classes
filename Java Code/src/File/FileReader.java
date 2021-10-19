package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        ArrayList<Movies> = fileMovies();
        System.out.println();
    }
    public static ArrayList fileMovies() {
        File movies = new File("Resources/Movies.csv");
        try {
            Scanner sc = new Scanner(movies);
            ArrayList<Movies> Movies = new ArrayList<>();
            int count = 0;
            while(sc.hasNextLine()){
                if(count >= 1) {
                    String line = sc.nextLine();
                    String[] stringsInArray = line.split(";");
                    int year = Integer.parseInt(stringsInArray[0]);
                    String length = stringsInArray[1];
                    String title = stringsInArray[2];
                    String subject = stringsInArray[3];
                    int popularity = Integer.parseInt(stringsInArray[4]);
                    String awards = stringsInArray[5];
                    Movies currentMovie = new Movies(year, length, title, subject, popularity, awards);
                    Movies.add(currentMovie);
                }else{
                    sc.nextLine();
                }
                count++;
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
class Movies{
    private int year;
    private String length;
    private String title;
    private String subject;
    private int popularity;
    private String awards;

    public Movies(int year, String length, String title, String subject, int popularity, String awards) {
        this.year = year;
        this.length = length;
        this.title = title;
        this.subject = subject;
        this.popularity = popularity;
        this.awards = awards;
    }
    public String getTitle(){
        return this.title;
    }
    @Override
    public String toString() {
        return "Movies{" +
                "year=" + year +
                ", length='" + length + '\'' +
                ", title='" + title + '\'' +
                ", subject='" + subject + '\'' +
                ", popularity=" + popularity +
                ", awards='" + awards + '\'' +
                '}';
    }

}