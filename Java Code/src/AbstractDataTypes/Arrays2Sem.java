package AbstractDataTypes;

import java.util.Random;

public class Arrays2Sem {
    public static void main(String[] args)
    {
        Random randGen = new Random();

        myArray myArr = new myArray();

        System.out.println(myArr);

        for (int i = 0; i < 13; i++)
        {
            myArr.add(randGen.nextInt(1000));
        }
        System.out.println(myArr);



        for (int i = 0; i < myArr.getElements(); i++)
        {
            System.out.println(myArr.get(i));
        }

    }//end Main

}
