package ExamTest;

abstract class Enemy{
    private int health;
    private String name;
    public Enemy(String name, int health){
        this.health = health;
        this.name = name;
    }
    public int getHealth() {
        return this.health;
    }
    public String getName() {
        return this.name;
    }
    public int getAttacked(){
        return this.health - 1;
    }

    @Override
    public String toString() {
        return "Enemy{" +
                "health=" + health +
                ", name='" + name + '\'' +
                '}';
    }
}
