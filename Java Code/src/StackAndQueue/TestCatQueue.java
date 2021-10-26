package StackAndQueue;

public class TestCatQueue {
    public static void main(String[] args) {
        Cat harald = new Cat("Harald",10);
        Cat nicolas = new Cat("Nicolas",12);
        Cat andreas = new Cat("Andreas",14);
        Cat cathrine = new Cat("Cathrine",16);

        CatQueue queue = new CatQueue();
        queue.enqueue(harald);
        queue.enqueue(nicolas);
        queue.enqueue(andreas);
        queue.enqueue(cathrine);
        queue.dequeue(andreas); 
        queue.display();
    }
}
