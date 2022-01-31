package Genopfriskning1Semester;

import java.util.ArrayList;

public class Bog {
    private int isbn;
    private String title;
    private String date;

    public Bog(int isbn, String title, String date) {
        this.isbn = isbn;
        this.title = title;
        this.date = date;
    }

    public int getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getDate() {
        return date;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDate(String date) {
        this.date = date;
    }



    @Override
    public String toString() {
        return "Bog{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
class Biblioteket {
    public ArrayList<Bog> bogStorage = new ArrayList<>();

    public boolean isInList(Bog searchBook){
        boolean isInStorage = false;
        for (int i = 0; i < bogStorage.size(); i++) {
            if(bogStorage.contains(searchBook)){
                isInStorage = true;
            }
        }
        return isInStorage;
    }





    public static void main(String[] args) {
        Biblioteket biblioteket = new Biblioteket();
        Bog bog1 = new Bog(123456789, "Hobbit", "21 September 2021");
        Bog bog2 = new Bog(987654321, "Eragon", "13 September 2006");
        Bog bog3 = new Bog(678905432, "Twilight", "21 december 1966");
        biblioteket.bogStorage.add(bog1);
        biblioteket.bogStorage.add(bog2);
        biblioteket.bogStorage.add(bog3);
        System.out.println(biblioteket.isInList(bog2));
    }
}
