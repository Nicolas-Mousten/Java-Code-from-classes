package StackAndQueue;

public class CatQueue implements ArrayCatQueue{
    private int catAmount;
    private Cat[] array = new Cat[0];

    public CatQueue(){
        this.catAmount = 0;
    }
    public Cat[] addOneCat(Cat c, Cat[] array){
        int arrayLen = size();
        Cat[] newArray = new Cat[arrayLen];
        for (int i = 0; i < arrayLen-1; i++) {
            newArray[i] = array[i];
        }
        newArray[arrayLen-1] = c;
        return newArray;
    }
    public Cat[] delOneCat(Cat c, Cat[] array){
        Cat theCat = null;
        Cat[] newArray = new Cat[size()];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] != c){
                theCat = array[i];
                newArray[k] = theCat;
            }else{
                k--;
            }
            k++;
        }
        return newArray;
    }
    @Override
    public void enqueue(Cat c) {
        catAmount++;
        array = addOneCat(c, array);
        System.out.println("One cat added to array");
    }

    @Override
    public Cat dequeue(Cat c) {
        String message = "Cat "+ c+ " dos not exist";
        for (int i = 0; i < size(); i++) {
            if(c == array[i]){
                message = "Cat " + c + " has been removed";
            }
        }
        catAmount--;
        array = delOneCat(c,array);
        System.out.println(message);
        return c;
    }

    @Override
    public boolean isEmpty() {
        boolean empty = false;
        if(catAmount == 0){
            empty = true;
        }else{
            empty = false;
        }
        return empty;
    }

    @Override
    public int size() {
        return catAmount;
    }

    @Override
    public void display() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
