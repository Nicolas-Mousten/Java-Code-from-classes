package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        ArrayList<Movies> Movies = fileMovies();
        /*for (int i = 0; i < Movies.size(); i++) {
            System.out.println(Movies.get(i));
        }*/
        int Max = 0;
        String MaxTitle = "";
        for (int i = 0; i < Movies.size(); i++) {
            Movies currentMovie = Movies.get(i);
            int titleLength = currentMovie.getTitle().length();
            if (titleLength>Max){
                MaxTitle = currentMovie.getTitle();
                Max = titleLength;
            }
        }
        System.out.println(Max +"\n"+MaxTitle);
        int count = 0;
        for (int i = 0; i < Movies.size(); i++) {
            Movies currentMovie = Movies.get(i);
            String title = currentMovie.getTitle();
            if(title.contains("Star Trek")){
                count++;
            }
        }
        System.out.println("There are " + count + " Star Trek Movies in the list");
        int totalLength = 0;
        for (int i = 0; i < Movies.size(); i++) {
            Movies currentMovie = Movies.get(i);
            int MovieLength = currentMovie.getLength();
            totalLength = totalLength + MovieLength;
        }
        System.out.println("The average length of all the movies is: "+totalLength/Movies.size());
        int MaxWordCount = 0;
        String MaxWordTitle = "";
        for (int i = 0; i < Movies.size(); i++) {
            Movies currentMovie = Movies.get(i);
            String MovieTitle = currentMovie.getTitle();
            String[] MovieTitleWords = MovieTitle.split(" ");
            int wordcount = MovieTitleWords.length;
            if(wordcount>MaxWordCount){
                MaxWordTitle = currentMovie.getTitle();
                MaxWordCount = wordcount;
            }
        }
        System.out.println(MaxWordTitle + " has the longest title with " +MaxWordCount + " words!");

        int awardsCount = 0;
        for (int i = 0; i < Movies.size(); i++) {
            Movies currentMovie = Movies.get(i);
            String award = currentMovie.getAwards();
            if(award.equalsIgnoreCase("Yes")){
                awardsCount = awardsCount + 1;
            }
        }
        System.out.println("There are "+awardsCount+" movies that has won at least one award!");
    }
    public static ArrayList fileMovies() {
        File movies = new File("Resources/Movies.csv");
        ArrayList<Movies> Movies = new ArrayList<>();
        try {
            Scanner sc = new Scanner(movies);
            int count = 0;
            while(sc.hasNextLine()){
                if(count >= 1) {
                    String line = sc.nextLine();
                    String[] stringsInArray = line.split(";");
                    int year = Integer.parseInt(stringsInArray[0]);
                    int length = Integer.parseInt(stringsInArray[1]);
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
        return Movies;
    }
}
class Movies{
    private int year;
    private int length;
    private String title;
    private String subject;
    private int popularity;
    private String awards;

    public Movies(int year, int length, String title, String subject, int popularity, String awards) {
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
    public int getLength() {
        return this.length;
    }
    public String getAwards(){
        return this.awards;
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