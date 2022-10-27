public class Archer extends Hero{
    public Archer(String name) {
        super(name);
    }

    @Override
    public void attackEnemy(Enemy a){
        a.takeDamage(4);
        System.out.println("Archer attack enemy");
    }
}
