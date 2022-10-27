public class Warrior extends Hero {

    public Warrior(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy a){
        a.takeDamage(3);
        System.out.println("Warrior attack enemy");
    }
}


