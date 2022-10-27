public class BattleGround {
    public static void main(String[] args) {

        Warrior warrior = new Warrior("warrior");
        Enemy enemy = new Enemy(5);

        while (enemy.isAlive()){
            warrior.attackEnemy(enemy);
        }

        System.out.println("Enemy died");
    }
}
