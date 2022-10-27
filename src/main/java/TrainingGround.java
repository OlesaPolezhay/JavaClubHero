public class TrainingGround {
    public static void main(String[] args) {

        Enemy enemy =new Enemy(20);

        Mage mage = new Mage("mage");
        mage.attackEnemy(enemy);
        System.out.println(enemy.getHealth());

        Archer archer = new Archer("archer");
        archer.attackEnemy(enemy);
        System.out.println(enemy.getHealth());

        Warrior warrior = new Warrior("warrior");
        warrior.attackEnemy(enemy);
        System.out.println(enemy.getHealth());
    }
}
