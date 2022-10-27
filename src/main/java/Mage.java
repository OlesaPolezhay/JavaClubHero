public class Mage extends Hero {

    public Mage(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy a){
        a.takeDamage(2);
        System.out.println("Mage attack enemy");
    }
}
