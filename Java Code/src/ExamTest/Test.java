package ExamTest;

public class Test {
    public static void main(String[] args) {
        Zombie zombie1 = new Zombie("zombie",0);
        zombie1.getAttacked();
        System.out.println(zombie1.getHealth());
    }
}
