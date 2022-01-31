package File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileTest {
    public static String firstLine;
    public static void main(String[] args) {
        ArrayList<TestClass> arrayListOfNames = new ArrayList<>();
        File test = new File("");
        try{
            Scanner sc = new Scanner(test);
            int count = 0;
            while(sc.hasNextLine()){
                if(count >= 1) {
                    String line = sc.nextLine();
                    String[] arrayOfNames = line.split(";");
                    int id = Integer.parseInt(arrayOfNames[0]);
                    String name = arrayOfNames[1];
                    String lastName = arrayOfNames[2];
                    TestClass current = new TestClass(id, name, lastName);
                    arrayListOfNames.add(current);
                }else {
                    firstLine = sc.nextLine();
                }
                count++;
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        for (int i = 0; i < arrayListOfNames.size(); i++) {
            System.out.println(arrayListOfNames.get(i));
        }

//----------------------------------------Write to file---------------------------------------------------------
        try{
            FileWriter testWriter = new FileWriter(test);
            Scanner scanner  = new Scanner(System.in);
            int id = scanner.nextInt();
            scanner.nextLine();
            String name = scanner.nextLine();
            String lastName = scanner.nextLine();

            TestClass input = new TestClass(id,name,lastName);
            arrayListOfNames.add(input);

            testWriter.write(firstLine+"\n");
            for (int i = 0; i < arrayListOfNames.size(); i++) {
                TestClass temp = arrayListOfNames.get(i);
                int inputId = temp.getId();
                String inputName = temp.getName();
                String inputLastName = temp.getLastName();
                testWriter.write(inputId+";"+inputName+";"+inputLastName+"\n");
            }

            testWriter.close();

        }catch(IOException k){
            System.out.println("Can't write to this file");
        }


    }

}
class TestClass{
    private int id;
    private String name;
    private String lastName;

    public TestClass(int id, String name, String lastName) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getLastName(){
        return this.lastName;
    }
    @Override
    public String toString() {
        return "Person " +id + " [name: " + name + " | LastName: " + lastName + ']';
    }
}
